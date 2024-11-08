
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ACER
 */
public class FramePenghitungKata extends javax.swing.JFrame {

    private void simpanData() {
        // Ambil teks dari jTextAreaInputan
        String teks = jTextAreaInputan.getText().trim();

        // Ambil hasil perhitungan
        String jumlahKata = jLabelKata.getText();
        String jumlahKarakter = jLabelKarakter.getText();
        String jumlahKalimat = jLabelKalimat.getText();
        String jumlahParagraf = jLabelParagraf.getText();

        // Buat string untuk disimpan ke file
        String data = "Teks yang dimasukkan:\n" + teks + "\n\n";
        data += "Jumlah Kata: " + jumlahKata + "\n";
        data += "Jumlah Karakter: " + jumlahKarakter + "\n";
        data += "Jumlah Kalimat: " + jumlahKalimat + "\n";
        data += "Jumlah Paragraf: " + jumlahParagraf + "\n";

        // Gunakan JFileChooser untuk memilih lokasi dan nama file
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Pilih Lokasi untuk Menyimpan File");
        fileChooser.setSelectedFile(new java.io.File("hasil_penghitungan.txt"));

        // Menampilkan dialog simpan
        int result = fileChooser.showSaveDialog(this);

        if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
            // Ambil file yang dipilih
            java.io.File file = fileChooser.getSelectedFile();

            // Menyimpan data ke file
            try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(file))) {
                writer.write(data);
                javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke " + file.getAbsolutePath());
            } catch (java.io.IOException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Proses penyimpanan dibatalkan.");
        }
    }

    private void cariKata() {
        // Ambil kata yang dicari dari text field
        String kataCari = jTextFieldCari.getText().trim();

        if (kataCari.isEmpty()) {
            // Jika kata kosong, tampilkan pesan atau lakukan hal lainnya
            javax.swing.JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari!");
            return;
        }

        // Ambil teks dari jTextAreaInputan
        String teks = jTextAreaInputan.getText();

        // Cari kata dan highlight jika ditemukan
        int index = teks.indexOf(kataCari);

        if (index != -1) {
            try {
                // Sorot kata yang ditemukan
                javax.swing.text.DefaultHighlighter.DefaultHighlightPainter painter
                        = new javax.swing.text.DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.YELLOW);
                javax.swing.text.Highlighter highlighter = jTextAreaInputan.getHighlighter();
                highlighter.removeAllHighlights(); // Hapus highlight sebelumnya
                highlighter.addHighlight(index, index + kataCari.length(), painter); // Tambah highlight untuk kata yang ditemukan
            } catch (javax.swing.text.BadLocationException ex) {
                ex.printStackTrace();
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Kata tidak ditemukan!");
        }
    }

    // Fungsi untuk menghitung kata, karakter, kalimat, dan paragraf.
    private void hitungPenghitungan() {
        // Ambil teks dari jTextAreaInputan
        String teks = jTextAreaInputan.getText().trim();

        // Hitung jumlah kata
        String[] kata = teks.split("\\s+");
        int jumlahKata = (teks.isEmpty()) ? 0 : kata.length;

        // Hitung jumlah karakter
        int jumlahKarakter = teks.length();

        // Hitung jumlah kalimat
        String[] kalimat = teks.split("[.!?]+");
        int jumlahKalimat = (teks.isEmpty()) ? 0 : kalimat.length;

        // Hitung jumlah paragraf
        String[] paragraf = teks.split("\n");
        int jumlahParagraf = paragraf.length;

        // Tampilkan hasil pada JLabel
        jLabelKata.setText(String.valueOf(jumlahKata));
        jLabelKarakter.setText(String.valueOf(jumlahKarakter));
        jLabelKalimat.setText(String.valueOf(jumlahKalimat));
        jLabelParagraf.setText(String.valueOf(jumlahParagraf));
    }

    /**
     * Creates new form FramePenghitungKata
     */
    public FramePenghitungKata() {
        initComponents();

        jTextAreaInputan.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                hitungPenghitungan();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                hitungPenghitungan();

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                hitungPenghitungan();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jButtonHitung = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonCari = new javax.swing.JButton();
        jTextFieldCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelKata = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelKarakter = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelKalimat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelParagraf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInputan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButtonHitung.setText("Hitung");
        jButtonHitung.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButtonHitungStateChanged(evt);
            }
        });
        jButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jButtonHitung, gridBagConstraints);

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jButtonSimpan, gridBagConstraints);

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jButtonCari, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jPanel1.add(jTextFieldCari, gridBagConstraints);

        jLabel1.setText("Jumlah Kata");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabelKata.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabelKata, gridBagConstraints);

        jLabel3.setText("Jumlah Karakter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabelKarakter.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabelKarakter, gridBagConstraints);

        jLabel5.setText("Jumlah Kalimat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabelKalimat.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabelKalimat, gridBagConstraints);

        jLabel7.setText("Jumlah Paragraf");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabelParagraf.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 32, 5, 32);
        jPanel1.add(jLabelParagraf, gridBagConstraints);

        jTextAreaInputan.setColumns(20);
        jTextAreaInputan.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInputan);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHitungStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButtonHitungStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHitungStateChanged

    private void jButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungActionPerformed
        hitungPenghitungan();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHitungActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        simpanData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        cariKata();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCariActionPerformed

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
            java.util.logging.Logger.getLogger(FramePenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePenghitungKata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePenghitungKata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonHitung;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelKalimat;
    private javax.swing.JLabel jLabelKarakter;
    private javax.swing.JLabel jLabelKata;
    private javax.swing.JLabel jLabelParagraf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInputan;
    private javax.swing.JTextField jTextFieldCari;
    // End of variables declaration//GEN-END:variables
}
