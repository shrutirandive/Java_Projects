/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.HospitalAdmin;
import model.Person;
import static model.Person.personDirectory;

/**
 *
 * @author user
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    Person person = new Person();
    public LoginJPanel() {
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

        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 900));

        lblUsername.setText("USERNAME");

        lblPassword.setText("PASSWORD");

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtUsername))
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblPassword, lblUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnLogin)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField1, lblPassword, lblUsername, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        String username = txtUsername.getText();
        String password = jPasswordField1.getText();

        System.out.println("====== LOGIN PAGE ==========");
        System.out.println("username- "+username);
        System.out.println("password- "+password);

        for(Person person: Person.getPersonDirectory()){
            if((person.getPassword().equals(password))&&person.getUserName().equals(username)){
                System.out.println("== Username and Password Matches for== "+person.getUserType());
                
                if(person.getUserType().equals("system admin")){
                    SystemAdminJFrame systemAdmin = new SystemAdminJFrame();
                    systemAdmin.setVisible(true);
                }
                else if(person.getUserType().equals("community admin")){
                    CommunityAdminJFrame communityAdmin = new CommunityAdminJFrame();
                    communityAdmin.setVisible(true);
                }
                else if(person.getUserType().equals("hospital admin")){
                    HospitalAdminJFrame hospAdmin = new HospitalAdminJFrame();
                    hospAdmin.setVisible(true); 
                }
                else if(person.getUserType().equals("doctor")){
                    DoctorJFrame doctor = new DoctorJFrame();
                    doctor.setVisible(true);
                }
                else if(person.getUserType().equals("patient")){
                    PatientJFrame patient = new PatientJFrame();
                    patient.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                }
            }
//            else{
//                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//            }
    }
        
//        if (username.equals("hospitalAdmin") && password.equals("1234")){
//            System.out.println("== Username and Password Matches ==");
//            HospitalAdminJFrame hospAdmin = new HospitalAdminJFrame();
//            hospAdmin.setVisible(true);
//        }
//        else if (username.equals("communityAdmin") && password.equals("12345")){
//            System.out.println("== Username and Password Matches ==");
//            CommunityAdminJFrame communityAdmin = new CommunityAdminJFrame();
//            communityAdmin.setVisible(true);
//        }
//        else if (username.equals("systemAdmin") && password.equals("123456")){
//            System.out.println("== Username and Password Matches ==");
//            SystemAdminJFrame systemAdmin = new SystemAdminJFrame();
//            systemAdmin.setVisible(true);
//        }

    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}