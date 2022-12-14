/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.UUID;
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
    
    public static String communityAdminCommunity;

    public static String getCommunityAdminCommunity() {
        return communityAdminCommunity;
    }

    public static void setCommunityAdminCommunity(String CommunityAdminCommunity) {
        LoginJPanel.communityAdminCommunity = CommunityAdminCommunity;
    }
    
    public static String patientCommunity;

    public static String getPatientCommunity() {
        return patientCommunity;
    }

    public static void setPatientCommunity(String patientCommunity) {
        LoginJPanel.patientCommunity = patientCommunity;
    }
    public static String patientName;

    public static String getPatientName() {
        return patientName;
    }

    public static void setPatientName(String patientName) {
        LoginJPanel.patientName = patientName;
    }
    public static int patientAge;

    public static int getPatientAge() {
        return patientAge;
    }

    public static void setPatientAge(int patientAge) {
        LoginJPanel.patientAge = patientAge;
    }
    public static String doctorName;

    public static String getDoctorName() {
        return doctorName;
    }

    public static void setDoctorName(String doctorName) {
        LoginJPanel.doctorName = doctorName;
    }
    
    public static String hospitalName;

    public static String getHospitalName() {
        return hospitalName;
    }

    public static void setHospitalName(String HospitalName) {
        LoginJPanel.hospitalName = HospitalName;
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

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 900));

        lblUsername.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 255));
        lblUsername.setText("USERNAME");

        txtUsername.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(51, 51, 255));

        lblPassword.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 255));
        lblPassword.setText("PASSWORD");

        jPasswordField1.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(51, 51, 255));

        btnLogin.setBackground(new java.awt.Color(155, 211, 248));
        btnLogin.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/doctor-hospital-icon.png"))); // NOI18N
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
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtUsername))
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
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
                .addContainerGap(644, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField1, lblPassword, lblUsername, txtUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        MainJFrame mainPage = new MainJFrame();
        
        String username = txtUsername.getText();
        String password = jPasswordField1.getText();
        
        System.out.println("====== LOGIN PAGE =========="+username+"===="+password);
        
        if (username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter Username and Password");
            return;   
        }

        for(Person person: Person.personDirectory){
            if((person.getPassword().equals(password))&&person.getUserName().equals(username)){
                System.out.println("== Username and Password Matches for== "+person.getUserType());
                
                if(person.getUserType().equals("system admin")){
                    SystemAdminJFrame systemAdmin = new SystemAdminJFrame();
                    systemAdmin.setVisible(true);                    
                }
                else if(person.getUserType().equals("community admin")){
                    communityAdminCommunity = person.getCommunity();
                    System.out.println("Community Admin Community= "+communityAdminCommunity);
                    CommunityAdminJFrame communityAdmin = new CommunityAdminJFrame();
                    communityAdmin.setVisible(true);
                }
                else if(person.getUserType().equals("hospital admin")){
                    hospitalName = person.getHospitalName();
                    HospitalAdminJFrame hospAdmin = new HospitalAdminJFrame();
                    hospAdmin.setVisible(true); 
                    
                }
                else if(person.getUserType().equals("doctor")){
//                    patientCity = person.getCity();
//                    patientAge = person.getAge();
//                    patientName = person.getName();
                    doctorName = person.getName();
                    DoctorJFrame doctor = new DoctorJFrame();
                    doctor.setVisible(true);
                }
                else if(person.getUserType().equals("patient")){
                    patientCommunity = person.getCommunity();
                    patientAge = person.getAge();
                    patientName = person.getName();
                    System.out.println("Patient Community= "+patientCommunity);
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
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
    
}

