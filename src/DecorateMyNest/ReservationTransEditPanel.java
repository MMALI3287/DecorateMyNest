/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

import java.awt.Dialog;
import java.sql.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Musaddique Ali
 */
public class ReservationTransEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewPanel
     */
    public ReservationTransEditPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        clearbtn = new javax.swing.JButton();
        insertbtn1 = new javax.swing.JButton();
        addresslabel1 = new javax.swing.JLabel();
        reservationID = new javax.swing.JTextField();
        lnamelabel = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        emaillabel = new javax.swing.JLabel();
        phonelabel = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        fnamelabel = new javax.swing.JLabel();
        select_table = new javax.swing.JButton();
        adminID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        Month = new javax.swing.JTextField();
        selectAdmin = new javax.swing.JButton();
        selectReservation = new javax.swing.JButton();
        updatebtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 102));

        clearbtn.setBackground(new java.awt.Color(255, 249, 242));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        insertbtn1.setBackground(new java.awt.Color(255, 249, 242));
        insertbtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertbtn1.setText("Insert");
        insertbtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        insertbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtn1ActionPerformed(evt);
            }
        });

        addresslabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addresslabel1.setText("Reservation ID");

        reservationID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reservationID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lnamelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lnamelabel.setText("Transaction Date");

        amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        emaillabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emaillabel.setText("Amount");

        phonelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phonelabel.setText("Description");

        description.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fnamelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fnamelabel.setText("AdminID");

        select_table.setBackground(new java.awt.Color(255, 249, 242));
        select_table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        select_table.setText("Select Reservation Transaction");
        select_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        adminID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setText("/");

        Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });

        Year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Year.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Month.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        selectAdmin.setBackground(new java.awt.Color(255, 249, 242));
        selectAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectAdmin.setText("Select");
        selectAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        selectAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAdminActionPerformed(evt);
            }
        });

        selectReservation.setBackground(new java.awt.Color(255, 249, 242));
        selectReservation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectReservation.setText("Select");
        selectReservation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        selectReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectReservationActionPerformed(evt);
            }
        });

        updatebtn1.setBackground(new java.awt.Color(255, 249, 242));
        updatebtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatebtn1.setText("Update");
        updatebtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\reserveid.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\information.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\money.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\calendar.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\admin.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addresslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(insertbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(select_table, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(updatebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(reservationID, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(906, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addresslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reservationID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(select_table, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updatebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(307, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectAdminActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectAdminActionPerformed
        // TODO add your handling code here:
        JDialog selectDialog = new JDialog(new JFrame(), "Select Admin ID", Dialog.ModalityType.APPLICATION_MODAL);
        selectDialog.add(new SelectAdmin());
        selectDialog.setSize(1230, 850);
        selectDialog.setVisible(true);
        adminID.setText(Welcome.jdbc.adminID + "");
        Welcome.jdbc.adminID = -1;
    }// GEN-LAST:event_selectAdminActionPerformed

    private void selectReservationActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selectReservationActionPerformed
        // TODO add your handling code here:
        JDialog selectDialog = new JDialog(new JFrame(), "Select Reservation ID",
                Dialog.ModalityType.APPLICATION_MODAL);
        selectDialog.add(new SelectReservation());
        selectDialog.setSize(1230, 850);
        selectDialog.setVisible(true);
        reservationID.setText(Welcome.jdbc.reservationID + "");
        Welcome.jdbc.reservationID = -1;
    }// GEN-LAST:event_selectReservationActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        adminID.setText("");
        Date.setText("");
        Month.setText("");
        Year.setText("");
        amount.setText("");
        description.setText("");
        reservationID.setText("");
    }// GEN-LAST:event_clearbtnActionPerformed

    private void insertbtn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertbtn1ActionPerformed
        if (adminID.getText().equals("") || Date.getText().equals("") || Month.getText().equals("")
                || Year.getText().equals("") || amount.getText().equals("")
                || description.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill-up all fields");
            return;
        }
        try {
            Welcome.jdbc.financialTransInsert(Integer.parseInt(adminID.getText()),
                    new Date(Integer.parseInt(Year.getText()) - 1900, Integer.parseInt(Month.getText()) - 1,
                            Integer.parseInt(Date.getText())),
                    Double.parseDouble(amount.getText()), description.getText());
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        if (reservationID.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Fill-up all fields");
            return;
        }
        try {
            int highestTransactionID = Welcome.jdbc.getHighestTransactionID();

            Welcome.jdbc.reservationTransactionInsert(highestTransactionID,
                    Integer.parseInt(reservationID.getText()));
            JOptionPane.showMessageDialog(this, "Inserted Successfully");
            // Clear your input fields related to ReservationTransaction here
            adminID.setText("");
            Date.setText("");
            Month.setText("");
            Year.setText("");
            amount.setText("");
            description.setText("");
            reservationID.setText("");
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

    }// GEN-LAST:event_insertbtn1ActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_DateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel addresslabel1;
    private javax.swing.JTextField adminID;
    private javax.swing.JTextField amount;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField description;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JButton insertbtn1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JTextField reservationID;
    private javax.swing.JButton selectAdmin;
    private javax.swing.JButton selectReservation;
    private javax.swing.JButton select_table;
    private javax.swing.JButton updatebtn1;
    // End of variables declaration//GEN-END:variables
}
