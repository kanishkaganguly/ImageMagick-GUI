
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kanishka
 */
public class main extends javax.swing.JFrame {

    JFileChooser fc;
    File[] input_img = null;
    File output_loc = null;
    File save_path = null;
    int curr_img = 0;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading_lbl = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        input_panel = new javax.swing.JPanel();
        input_shower = new javax.swing.JLabel();
        input_control = new javax.swing.JPanel();
        select_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        filename_lbl = new javax.swing.JLabel();
        filename_out = new javax.swing.JLabel();
        output_control = new javax.swing.JPanel();
        savePath_btn = new javax.swing.JButton();
        save_out = new javax.swing.JTextArea();
        conversion_panel = new javax.swing.JPanel();
        outputFileType = new javax.swing.JComboBox();
        convert_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        to_lbl = new javax.swing.JLabel();
        pdf_filename = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prev_btn = new javax.swing.JButton();
        next_btn = new javax.swing.JButton();
        count_lbl = new javax.swing.JLabel();
        img_count = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ImageMagick GUI");
        setResizable(false);

        heading_lbl.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        heading_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading_lbl.setText("ImageMagick GUI");

        input_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Image"));

        input_shower.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input_control.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        select_btn.setText("Select Image(s)");
        select_btn.setToolTipText("Multiple Images Allowed");
        select_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                select_btnMouseClicked(evt);
            }
        });

        clear_btn.setText("Clear Image(s)");
        clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_btnMouseClicked(evt);
            }
        });

        filename_lbl.setText("File Name");

        filename_out.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filename_out.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout input_controlLayout = new javax.swing.GroupLayout(input_control);
        input_control.setLayout(input_controlLayout);
        input_controlLayout.setHorizontalGroup(
            input_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, input_controlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(input_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filename_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(input_controlLayout.createSequentialGroup()
                        .addComponent(filename_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(select_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        input_controlLayout.setVerticalGroup(
            input_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_controlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_btn)
                .addGap(18, 18, 18)
                .addComponent(clear_btn)
                .addGap(18, 18, 18)
                .addComponent(filename_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filename_out, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        output_control.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        savePath_btn.setText("Set Conversion Path");
        savePath_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savePath_btnMouseClicked(evt);
            }
        });

        save_out.setColumns(20);
        save_out.setRows(5);
        save_out.setWrapStyleWord(true);

        javax.swing.GroupLayout output_controlLayout = new javax.swing.GroupLayout(output_control);
        output_control.setLayout(output_controlLayout);
        output_controlLayout.setHorizontalGroup(
            output_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(output_controlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(output_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savePath_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_out, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        output_controlLayout.setVerticalGroup(
            output_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(output_controlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savePath_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save_out, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        conversion_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Conversion Options"));

        outputFileType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JPG", "PNG", "GIF", "BMP", "Individual PDFs", "Merge to PDF" }));
        outputFileType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                outputFileTypeItemStateChanged(evt);
            }
        });

        convert_btn.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        convert_btn.setText("Convert");
        convert_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convert_btnMouseClicked(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_btnMouseClicked(evt);
            }
        });

        to_lbl.setText("To:");

        pdf_filename.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pdf_filename.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Set Filename:");

        javax.swing.GroupLayout conversion_panelLayout = new javax.swing.GroupLayout(conversion_panel);
        conversion_panel.setLayout(conversion_panelLayout);
        conversion_panelLayout.setHorizontalGroup(
            conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversion_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conversion_panelLayout.createSequentialGroup()
                        .addComponent(to_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(conversion_panelLayout.createSequentialGroup()
                        .addGroup(conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conversion_panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(convert_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(conversion_panelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pdf_filename, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(outputFileType, javax.swing.GroupLayout.Alignment.TRAILING, 0, 152, Short.MAX_VALUE))
                    .addComponent(exit_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        conversion_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {convert_btn, exit_btn});

        conversion_panelLayout.setVerticalGroup(
            conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversion_panelLayout.createSequentialGroup()
                .addGroup(conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputFileType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf_filename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conversion_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_btn)
                    .addComponent(convert_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        prev_btn.setText("PREVIOUS");
        prev_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prev_btnMouseClicked(evt);
            }
        });

        next_btn.setText("NEXT");
        next_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next_btnMouseClicked(evt);
            }
        });

        count_lbl.setText("Total Images");

        img_count.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        img_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_count.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout input_panelLayout = new javax.swing.GroupLayout(input_panel);
        input_panel.setLayout(input_panelLayout);
        input_panelLayout.setHorizontalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_shower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conversion_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(input_panelLayout.createSequentialGroup()
                                .addComponent(count_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(img_count, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(input_panelLayout.createSequentialGroup()
                                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(input_panelLayout.createSequentialGroup()
                                        .addComponent(prev_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                        .addComponent(next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addComponent(output_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );

        input_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {next_btn, prev_btn});

        input_panelLayout.setVerticalGroup(
            input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_panelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(img_count, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(count_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(next_btn)
                            .addComponent(prev_btn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(input_shower, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(input_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conversion_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(input_panelLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(output_control, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(heading_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void select_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_select_btnMouseClicked
        curr_img = 0;
        fc = new JFileChooser();
        fc.setApproveButtonText("Choose Image");
        fc.setDialogTitle("Choose Input Image");
        fc.setFileFilter(new file_filter());
        fc.setMultiSelectionEnabled(true);
        fc.setCurrentDirectory(new File("/media/ext_TV/Images"));
        fc.showOpenDialog(this);
        input_img = fc.getSelectedFiles();
        if (input_img.length >= 1) {
            filename_out.setText(input_img[0].getName());
            try {
                BufferedImage img = ImageIO.read(input_img[0]);
                Image img_scaled = img.getScaledInstance(input_shower.getWidth(), input_shower.getHeight(), Image.SCALE_SMOOTH);
                input_shower.setIcon(new ImageIcon(img_scaled));
            } catch (Exception e) {
                System.out.println(e);
            }
            img_count.setText("" + input_img.length);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select At Least 1 Image", "No Image Selected", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_select_btnMouseClicked

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseClicked
        input_img = null;
        input_shower.setIcon(null);
        filename_out.setText("");
        img_count.setText("0");
        curr_img = 0;
        save_out.setText("");
        fc.setAcceptAllFileFilterUsed(true);
        fc = null;
    }//GEN-LAST:event_clear_btnMouseClicked

    private void savePath_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePath_btnMouseClicked
        save_out.setBackground(null);
        save_out.setEditable(false);
        save_out.setBorder(null);
        save_out.setLineWrap(true);
        save_out.setWrapStyleWord(true);
        save_out.setFocusable(false);
        save_out.setOpaque(false);
        save_out.setFont(UIManager.getFont("Label.font"));
        fc.setCurrentDirectory(new File("/media/ext_TV/Images/Test Outputs/"));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setApproveButtonText("Save Here");
        fc.setDialogTitle("Save Here");
        fc.setMultiSelectionEnabled(false);
        fc.showOpenDialog(this);
        output_loc = fc.getSelectedFile();
        save_out.setText(output_loc.getPath());
        save_path = new File(output_loc.getPath());
    }//GEN-LAST:event_savePath_btnMouseClicked

    private void exit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_btnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_btnMouseClicked

    private void next_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next_btnMouseClicked
        curr_img = (curr_img + 1) % (input_img.length - 1);
        filename_out.setText(input_img[curr_img].getName());
        try {
            BufferedImage img = ImageIO.read(input_img[curr_img]);
            Image img_scaled = img.getScaledInstance(input_shower.getWidth(), input_shower.getHeight(), Image.SCALE_SMOOTH);
            input_shower.setIcon(new ImageIcon(img_scaled));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_next_btnMouseClicked

    private void prev_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prev_btnMouseClicked
        curr_img = (curr_img - 1) % (input_img.length);
        filename_out.setText(input_img[curr_img].getName());
        try {
            BufferedImage img = ImageIO.read(input_img[curr_img]);
            Image img_scaled = img.getScaledInstance(input_shower.getWidth(), input_shower.getHeight(), Image.SCALE_SMOOTH);
            input_shower.setIcon(new ImageIcon(img_scaled));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_prev_btnMouseClicked

    private void convert_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convert_btnMouseClicked
        if (input_img.length < 1 || input_img.equals(null)) {
            JOptionPane.showMessageDialog(null, "Please Select At Least 1 Image", "No Image Selected", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (save_out.getText() == null || "".equals(save_out.getText())) {
            JOptionPane.showMessageDialog(null, "Please Select Output Location", "No Output Location", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            switch (outputFileType.getSelectedItem().toString()) {
                case "JPG": {
                    for (int x = 0; x < input_img.length; x++) {
                        curr_img = x;
                        File output_filename = new File(save_path.toString() + "/" + input_img[curr_img].getName().substring(0, input_img[curr_img].getName().length() - 4) + "_converted.jpg");
                        String execString = "convert " + "\'" + input_img[curr_img].getAbsolutePath() + "\'" + " " + "\'" + output_filename.getName() + "\'";
                        System.out.println(save_path);
                        System.out.println(execString);
                        Runtime run = Runtime.getRuntime();
                        Process process = run.exec(new String[]{"/bin/bash", "-c", execString}, null, save_path);
                        process.waitFor();
                    }
                    break;

                }
                case "PNG": {
                    for (int x = 0; x < input_img.length; x++) {
                        curr_img = x;
                        File output_filename = new File(save_path.toString() + "/" + input_img[curr_img].getName().substring(0, input_img[curr_img].getName().length() - 4) + "_converted.png");
                        String execString = "convert " + "\'" + input_img[curr_img].getAbsolutePath() + "\'" + " " + "\'" + output_filename.getName() + "\'";
                        System.out.println(save_path);
                        System.out.println(execString);
                        Runtime run = Runtime.getRuntime();
                        Process process = run.exec(new String[]{"/bin/bash", "-c", execString}, null, save_path);
                        process.waitFor();
                    }
                    break;
                }
                case "GIF": {
                    for (int x = 0; x < input_img.length; x++) {
                        curr_img = x;
                        File output_filename = new File(save_path.toString() + "/" + input_img[curr_img].getName().substring(0, input_img[curr_img].getName().length() - 4) + "_converted.gif");
                        String execString = "convert " + "\'" + input_img[curr_img].getAbsolutePath() + "\'" + " " + "\'" + output_filename.getName() + "\'";
                        System.out.println(save_path);
                        System.out.println(execString);
                        Runtime run = Runtime.getRuntime();
                        Process process = run.exec(new String[]{"/bin/bash", "-c", execString}, null, save_path);
                        process.waitFor();
                    }
                    break;
                }
                case "BMP": {
                    for (int x = 0; x < input_img.length; x++) {
                        curr_img = x;
                        File output_filename = new File(save_path.toString() + "/" + input_img[curr_img].getName().substring(0, input_img[curr_img].getName().length() - 4) + "_converted.bmp");
                        String execString = "convert " + "\'" + input_img[curr_img].getAbsolutePath() + "\'" + " " + "\'" + output_filename.getName() + "\'";
                        System.out.println(save_path);
                        System.out.println(execString);
                        Runtime run = Runtime.getRuntime();
                        Process process = run.exec(new String[]{"/bin/bash", "-c", execString}, null, save_path);
                        process.waitFor();
                        break;
                    }
                }

                case "Individual PDFs": {
                    for (int x = 0; x < input_img.length; x++) {
                        curr_img = x;
                        File output_filename = new File(save_path.toString() + "/" + input_img[curr_img].getName().substring(0, input_img[curr_img].getName().length() - 4) + "_converted.pdf");
                        String execString = "convert " + "\'" + input_img[curr_img].getAbsolutePath() + "\'" + " " + "\'" + output_filename.getName() + "\'";
                        System.out.println(save_path);
                        System.out.println(execString);
                        Runtime run = Runtime.getRuntime();
                        Process process = run.exec(new String[]{"/bin/bash", "-c", execString}, null, save_path);
                        process.waitFor();
                    }
                    break;
                }
                case "Merge to PDF": {
                    if (!"".equals(pdf_filename.getText()) || pdf_filename.getText() != null) {
                        new pdfMerge(input_img, save_path, pdf_filename.getText());
                    }
                    break;
                }
                default:
                    return;
            }

            JOptionPane.showMessageDialog(null, "Conversions Completed Successfully", "Conversion Complete", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_convert_btnMouseClicked

    private void outputFileTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_outputFileTypeItemStateChanged
        if (outputFileType.getSelectedItem().equals("Merge to PDF")) {
            pdf_filename.setEnabled(true);
        } else {
            pdf_filename.setEnabled(false);
        }
    }//GEN-LAST:event_outputFileTypeItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_btn;
    private javax.swing.JPanel conversion_panel;
    private javax.swing.JButton convert_btn;
    private javax.swing.JLabel count_lbl;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel filename_lbl;
    private javax.swing.JLabel filename_out;
    private javax.swing.JLabel heading_lbl;
    private javax.swing.JLabel img_count;
    private javax.swing.JPanel input_control;
    private javax.swing.JPanel input_panel;
    private javax.swing.JLabel input_shower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next_btn;
    private javax.swing.JComboBox outputFileType;
    private javax.swing.JPanel output_control;
    private javax.swing.JTextField pdf_filename;
    private javax.swing.JButton prev_btn;
    private javax.swing.JButton savePath_btn;
    private javax.swing.JTextArea save_out;
    private javax.swing.JButton select_btn;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel to_lbl;
    // End of variables declaration//GEN-END:variables
}
