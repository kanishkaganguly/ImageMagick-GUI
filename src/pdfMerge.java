
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kanishka
 */
public class pdfMerge {

    pdfMerge(File[] input_img, File save_path, String save_name) {
        File output_filename = new File(save_path.toString() + "/" + save_name + ".pdf");
        File temp_create = new File(System.getProperty("java.io.tmpdir") + "/imagemagick_gui");
        if (!temp_create.exists()) {
            new File(System.getProperty("java.io.tmpdir") + "/imagemagick_gui").mkdir();

        }

        for (int i = 0; i < input_img.length; i++) {
            String ext = Utils.getExtension(input_img[i].getAbsoluteFile());
            File temp_folder = new File(System.getProperty("java.io.tmpdir") + "/imagemagick_gui/image_" + i + "." + ext);

            Path from = Paths.get(input_img[i].getPath());
            Path to = Paths.get(temp_folder.getPath());
            try {
                Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.out.println(e);
            }

        }
        try {
            String execString = "convert image_*.jpg temp.pdf";
            Runtime run = Runtime.getRuntime();
            Process process = run.exec(new String[]{"/bin/bash", "-c", execString}, null, temp_create);
            process.waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }

        Path from = Paths.get(new File(temp_create + "/temp.pdf").getPath());
        Path to = Paths.get(output_filename.getPath());
        try {
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e);
        }
        if (removeDirectory.removeDirectory(temp_create) == false) {
            System.out.println("ERROR REMOVING TEMP DIRECTORY");
        }
    }
}
