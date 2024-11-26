/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas_pbo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class BuatAkun extends javax.swing.JFrame {

    /**
     * Creates new form BuatAkun
     */
    public BuatAkun() {
        initComponents();
    }
    public void clear() {
        tfUsername.setText("");
        jPassword.setText("");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel1.setText("CREATE NEW ACCOUNT");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfUsername)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnDelete))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
       if (tfUsername.getText().trim().equals("") || jPassword.getPassword().length == 0) {
    JOptionPane.showMessageDialog(null, "Isi username dan password");
} else {
    String username = tfUsername.getText().trim(); // Mengambil teks dari tfUsername
    String pw = new String(jPassword.getPassword()).trim(); // Mengonversi password ke String

    // Validasi panjang password
    if (pw.length() < 8) {
        JOptionPane.showMessageDialog(null, "Password minimal 8 karakter.");
        return;
    }

    // Validasi karakter pada password
    if (!pw.matches("[A-Za-z0-9]+")) {
        JOptionPane.showMessageDialog(null, "Password hanya boleh menggunakan huruf dan angka.");
        return;
    }

    // Membuka EntityManager untuk akses database
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("UAS_PBOPU");
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();

    try {
        // Periksa apakah username sudah terdaftar
        Passwordlogin y = em.find(Passwordlogin.class, username);
        if (y != null) {
            JOptionPane.showMessageDialog(null, "Username sudah terdaftar, gunakan username lain");
            clear(); // Fungsi untuk membersihkan input
            tfUsername.requestFocus();
        } else {
            // Simpan akun baru ke database
            Passwordlogin account = new Passwordlogin();
            account.setUsername(username);
            account.setPassword(pw); // Simpan password yang telah divalidasi
            em.persist(account);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Akun berhasil dibuat");
            clear(); // Bersihkan input setelah sukses

            // Tutup form saat ini dan buka form Login
            this.dispose();
            FrameLogin frame = new FrameLogin();
            frame.setVisible(true);
        }
    } catch (Exception e) {
        em.getTransaction().rollback();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        e.printStackTrace();
    } finally {
        em.close();
        emf.close();
    }
}

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FrameLogin loginFrame = new FrameLogin();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tfUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username harus diisi untuk menghapus akun!");
        } else {
            String username = tfUsername.getText();
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("UAS_PBOPU");
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();
                Passwordlogin user = em.find(Passwordlogin.class, username);
                if (user == null) {
                    JOptionPane.showMessageDialog(null, "Username tidak ditemukan. Tidak ada yang dihapus.");
                } else {
                    // Tambahkan dialog konfirmasi
                    int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus akun ini?",
                            "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        em.remove(user);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Akun berhasil dihapus!");
                        clear();
                    } else {
                        JOptionPane.showMessageDialog(null, "Penghapusan akun dibatalkan.");
                        em.getTransaction().rollback();
                    }
                }
            } catch (Exception e) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
            } finally {
                em.close();
                emf.close();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
 
    }//GEN-LAST:event_btnCreateMouseClicked

    private void jPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMouseClicked
 
    }//GEN-LAST:event_jPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuatAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}