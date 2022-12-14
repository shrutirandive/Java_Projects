/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.List;
import model.Patient;
import static model.Patient.patientDirectory;
import model.Person;
import static model.Person.personDirectory;

/**
 *
 * @author user
 */
public class PatientJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientJFrame
     */
    public PatientJFrame() {
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
        btnDoctorList = new javax.swing.JButton();
        btnDoctorBooked = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnEncounterHistory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 371));

        btnDoctorList.setBackground(new java.awt.Color(155, 211, 248));
        btnDoctorList.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnDoctorList.setText("Doctor List");
        btnDoctorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorListActionPerformed(evt);
            }
        });

        btnDoctorBooked.setBackground(new java.awt.Color(155, 211, 248));
        btnDoctorBooked.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnDoctorBooked.setText("Doctor Booked");
        btnDoctorBooked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorBookedActionPerformed(evt);
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

        btnEncounterHistory.setBackground(new java.awt.Color(155, 211, 248));
        btnEncounterHistory.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnEncounterHistory.setText("Encounter History");
        btnEncounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoctorList, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncounterHistory)
                    .addComponent(btnDoctorBooked, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnDoctorBooked, btnDoctorList, btnEncounterHistory});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnDoctorList)
                .addGap(50, 50, 50)
                .addComponent(btnDoctorBooked)
                .addGap(50, 50, 50)
                .addComponent(btnEncounterHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(17, 17, 17))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnDoctorBooked, btnDoctorList, btnEncounterHistory});

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setText("Patient");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitle)
                .addGap(0, 343, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorBookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorBookedActionPerformed
        // TODO add your handling code here:
        DoctorBookedJPanel doctorBooked = new DoctorBookedJPanel();
        splitPane.setRightComponent(doctorBooked);
        
    }//GEN-LAST:event_btnDoctorBookedActionPerformed

    private void btnDoctorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorListActionPerformed
        // TODO add your handling code here:
        DoctorListPatientJPanel doctorList = new DoctorListPatientJPanel();
        splitPane.setRightComponent(doctorList);
    }//GEN-LAST:event_btnDoctorListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        mainPage.setVisible(true);
        PatientJFrame patient = new PatientJFrame();
        patient.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEncounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterHistoryActionPerformed
        // TODO add your handling code here:
        EncounterHistoryJPanel encounterHistory = new EncounterHistoryJPanel();
        splitPane.setRightComponent(encounterHistory);
    }//GEN-LAST:event_btnEncounterHistoryActionPerformed
    
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
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoctorBooked;
    private javax.swing.JButton btnDoctorList;
    private javax.swing.JButton btnEncounterHistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
