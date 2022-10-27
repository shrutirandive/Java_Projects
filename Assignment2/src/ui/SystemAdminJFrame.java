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

        btnAddDoctors.setText("Add Doctors");
        btnAddDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorsActionPerformed(evt);
            }
        });

        btnViewDoctor.setText("View Doctors");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddPatient.setText("Add Patients");

        btnViewPatient.setText("View Patients");

        btnAddHospitalAdmin.setText("Add Hospital Admin");
        btnAddHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalAdminActionPerformed(evt);
            }
        });

        btnViewHospitalAdmin.setText("View Hospital Admin");
        btnViewHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalAdminActionPerformed(evt);
            }
        });

        btnAddCommunityAdmin.setText("Add Community Admin");
        btnAddCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommunityAdminActionPerformed(evt);
            }
        });

        btnViewCommunityAdmin.setText("View Community Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewDoctor)
                    .addComponent(btnBack)
                    .addComponent(btnAddPatient)
                    .addComponent(btnViewPatient)
                    .addComponent(btnAddHospitalAdmin)
                    .addComponent(btnAddDoctors)
                    .addComponent(btnViewHospitalAdmin)
                    .addComponent(btnAddCommunityAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnViewCommunityAdmin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnAddDoctors)
                .addGap(18, 18, 18)
                .addComponent(btnViewDoctor)
                .addGap(18, 18, 18)
                .addComponent(btnAddPatient)
                .addGap(18, 18, 18)
                .addComponent(btnViewPatient)
                .addGap(18, 18, 18)
                .addComponent(btnAddHospitalAdmin)
                .addGap(29, 29, 29)
                .addComponent(btnViewHospitalAdmin)
                .addGap(33, 33, 33)
                .addComponent(btnAddCommunityAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnViewCommunityAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(31, 31, 31))
        );

        splitPane.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
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
    }//GEN-LAST:event_btnViewHospitalAdminActionPerformed

    private void btnAddCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommunityAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCommunityAdminActionPerformed

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