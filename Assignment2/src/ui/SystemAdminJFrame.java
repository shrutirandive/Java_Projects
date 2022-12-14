/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author user
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    public SystemAdminJFrame() {
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

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddDoctors = new javax.swing.JButton();
        btnViewDoctor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAddPatient = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        btnAddHospitalAdmin = new javax.swing.JButton();
        btnViewHospitalAdmin = new javax.swing.JButton();
        btnAddCommunityAdmin = new javax.swing.JButton();
        btnViewCommunityAdmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnAddDoctors.setBackground(new java.awt.Color(155, 211, 248));
        btnAddDoctors.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnAddDoctors.setText("Add Doctors");
        btnAddDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorsActionPerformed(evt);
            }
        });

        btnViewDoctor.setBackground(new java.awt.Color(155, 211, 248));
        btnViewDoctor.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnViewDoctor.setText("View Doctors");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(155, 211, 248));
        btnBack.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddPatient.setBackground(new java.awt.Color(155, 211, 248));
        btnAddPatient.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnAddPatient.setText("Add Patients");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnViewPatient.setBackground(new java.awt.Color(155, 211, 248));
        btnViewPatient.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnViewPatient.setText("View Patients");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnAddHospitalAdmin.setBackground(new java.awt.Color(155, 211, 248));
        btnAddHospitalAdmin.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnAddHospitalAdmin.setText("Add Hospital Admin");
        btnAddHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalAdminActionPerformed(evt);
            }
        });

        btnViewHospitalAdmin.setBackground(new java.awt.Color(155, 211, 248));
        btnViewHospitalAdmin.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnViewHospitalAdmin.setText("View Hospital Admin");
        btnViewHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalAdminActionPerformed(evt);
            }
        });

        btnAddCommunityAdmin.setBackground(new java.awt.Color(155, 211, 248));
        btnAddCommunityAdmin.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnAddCommunityAdmin.setText("Add Community Admin");
        btnAddCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityAdminActionPerformed(evt);
            }
        });

        btnViewCommunityAdmin.setBackground(new java.awt.Color(155, 211, 248));
        btnViewCommunityAdmin.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnViewCommunityAdmin.setText("View Community Admin");
        btnViewCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCommunityAdmin)
                    .addComponent(btnViewCommunityAdmin)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddHospitalAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnViewHospitalAdmin))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnViewDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddDoctors))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnViewPatient, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddPatient))
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCommunityAdmin, btnAddDoctors, btnAddHospitalAdmin, btnAddPatient, btnBack, btnViewCommunityAdmin, btnViewDoctor, btnViewHospitalAdmin, btnViewPatient});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddCommunityAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewCommunityAdmin)
                .addGap(47, 47, 47)
                .addComponent(btnAddHospitalAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewHospitalAdmin)
                .addGap(45, 45, 45)
                .addComponent(btnAddDoctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnAddPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewPatient)
                .addGap(53, 53, 53)
                .addComponent(btnBack)
                .addGap(28, 28, 28))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorsActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel createDoctors = new CreateDoctorJPanel();
        splitPane.setRightComponent(createDoctors);
    }//GEN-LAST:event_btnAddDoctorsActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
        ViewDoctorJPanel viewDoctor = new ViewDoctorJPanel();
        splitPane.setRightComponent(viewDoctor);
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        mainPage.setVisible(true);
        SystemAdminJFrame systemAdmin = new SystemAdminJFrame();
        systemAdmin.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalAdminActionPerformed
        // TODO add your handling code here:
        CreateHospitalAdminJPanel createHospitalAdmin = new CreateHospitalAdminJPanel();
        splitPane.setRightComponent(createHospitalAdmin);
    }//GEN-LAST:event_btnAddHospitalAdminActionPerformed

    private void btnViewHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalAdminActionPerformed
        // TODO add your handling code here:
        ViewHospitalAdminJPanel viewHospitalAdmin = new ViewHospitalAdminJPanel();
        splitPane.setRightComponent(viewHospitalAdmin);
    }//GEN-LAST:event_btnViewHospitalAdminActionPerformed

    private void btnAddCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityAdminActionPerformed
        // TODO add your handling code here:
        CreateCommunityAdminJPanel createCommuntiyAdmin = new CreateCommunityAdminJPanel();
        splitPane.setRightComponent(createCommuntiyAdmin);
    }//GEN-LAST:event_btnAddCommunityAdminActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel createPatient = new CreatePatientJPanel();
        splitPane.setRightComponent(createPatient);
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnViewCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityAdminActionPerformed
        // TODO add your handling code here:
        ViewCommunityAdminJPanel viewCommunityAdmin = new ViewCommunityAdminJPanel();
        splitPane.setRightComponent(viewCommunityAdmin);
    }//GEN-LAST:event_btnViewCommunityAdminActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientJPanel viewPatient = new ViewPatientJPanel();
        splitPane.setRightComponent(viewPatient);
    }//GEN-LAST:event_btnViewPatientActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommunityAdmin;
    private javax.swing.JButton btnAddDoctors;
    private javax.swing.JButton btnAddHospitalAdmin;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewCommunityAdmin;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewHospitalAdmin;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
