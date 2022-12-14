/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import static model.Doctor.doctorInHospitalDirectory;

/**
 *
 * @author user
 */
public class DoctorsInHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctorsJPanel
     */
    Doctor doc = new Doctor();
    LoginJPanel loginPanel = new LoginJPanel();
    
    public DoctorsInHospitalJPanel() {
        initComponents();
//        populateTableDoctorList();
        populateTable();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddDoctors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblAddDoctors.setForeground(new java.awt.Color(51, 51, 255));
        tblAddDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "PhysicianType", "House", "City", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAddDoctors.setToolTipText("");
        tblAddDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddDoctorsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAddDoctors);

        jLabel1.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Doctor in this Hospital");
        jLabel1.setToolTipText("");

        btnDelete.setFont(new java.awt.Font("Centaur", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close-2-icon.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnDelete)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblAddDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddDoctorsMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblAddDoctorsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAddDoctors.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblAddDoctors.getModel();

        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
        System.out.println(selectedDoctor);
        
        doctorInHospitalDirectory.remove(selectedDoctor);
        JOptionPane.showMessageDialog(this, "Doctor deleted from this hospital");
    }//GEN-LAST:event_btnDeleteActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAddDoctors;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblAddDoctors.getModel();
        model.setRowCount(0);
        
        for(Doctor doc: Doctor.getDoctorInHospitalDirectory()){
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getGender();
            row[2] = doc.getPhysicianType();
            row[3] = doc.getHouse();
            row[4] = doc.getCity();
            row[5] = doc.getHospitalName();
            model.addRow(row);
        }  
 
    }
//    
//    private void populateTableDoctorList() {
//        DefaultTableModel model = (DefaultTableModel) tblAddDoctors.getModel();
//        model.setRowCount(0);
//        
//        for(Doctor docHosp: Doctor.getDoctorDirectory()){
//            if(docHosp.getHospitalName().equals(loginPanel.getHospitalName())){
//                Object[] row = new Object[6];
//                row[0] = docHosp;
//                row[1] = docHosp.getGender();
//                row[2] = docHosp.getPhysicianType();
//                row[3] = docHosp.getHouse();
//                row[4] = docHosp.getCity();
//                row[5] = docHosp.getHospitalName();
//                model.addRow(row);
//            }
//        
//    }
//}
}
