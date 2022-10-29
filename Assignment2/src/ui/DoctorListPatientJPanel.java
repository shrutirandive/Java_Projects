/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Person;

/**
 *
 * @author user
 */
public class DoctorListPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    LoginJPanel loginPanel = new LoginJPanel();
    Person person = new Person();
    Doctor doc = new Doctor();
    public DoctorListPatientJPanel() {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        jLabel1.setText("Book Doctor Appointment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblDoctor.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();

        Doctor selectedDoctor = (Doctor) model.getValueAt(selectedRowIndex, 0);
        System.out.println("Doctor List Patient JPanel   "+selectedDoctor);
             
        doc.patientAddDoctors(selectedDoctor.getName(), selectedDoctor.getGender(), selectedDoctor.getPhysicianType(), selectedDoctor.getHouse(), selectedDoctor.getCity(), selectedDoctor.getHospitalName());
        JOptionPane.showMessageDialog(this, "Appointment booked for this doctor");
        
    }//GEN-LAST:event_tblDoctorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctor;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
        model.setRowCount(0);
        
        for(Doctor doc: Doctor.getDoctorDirectory()){
            if(doc.getCity().equals(loginPanel.getPatientCity())){
//                System.out.println("Patient City= "+loginPanel.getPatientCity());
            Object[] row = new Object[6];
            row[0] = doc;
            row[1] = doc.getGender();
            row[2] = doc.getPhysicianType();
            row[3] = doc.getHouse();
            row[4] = doc.getCity();
            row[5] = doc.getHospitalName();
            model.addRow(row);
            }
            else
            {
                continue;
            }
            
        }
        
    }
}
