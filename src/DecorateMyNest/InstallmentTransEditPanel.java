/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

/**
 *
 * @author Musaddique Ali
 */
public class InstallmentTransEditPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewPanel
     */
    public InstallmentTransEditPanel() {
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

        fnamelabel = new javax.swing.JLabel();
        firstnametxtfield = new javax.swing.JTextField();
        lnamelabel = new javax.swing.JLabel();
        lastnametxtfield = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        emaillabel = new javax.swing.JLabel();
        phonelabel = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        addresslabel = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        insertbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        insertbtn1 = new javax.swing.JButton();
        deletebtn1 = new javax.swing.JButton();
        deletebtn2 = new javax.swing.JButton();
        deletebtn3 = new javax.swing.JButton();
        addresslabel1 = new javax.swing.JLabel();
        addresstxt1 = new javax.swing.JTextField();
        addresslabel2 = new javax.swing.JLabel();
        addresstxt2 = new javax.swing.JTextField();
        addresslabel3 = new javax.swing.JLabel();
        addresstxt3 = new javax.swing.JTextField();

        fnamelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fnamelabel.setText("First Name");

        lnamelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lnamelabel.setText("Lastr Name");

        emaillabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emaillabel.setText("Email");

        phonelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phonelabel.setText("Phone");

        addresslabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addresslabel.setText("Address");

        insertbtn.setBackground(new java.awt.Color(163, 239, 89));
        insertbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insertbtn.setText("MaterialTransaction");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(243, 239, 13));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updatebtn.setText("Update");

        clearbtn.setBackground(new java.awt.Color(243, 239, 13));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearbtn.setText("Clear");

        deletebtn.setBackground(new java.awt.Color(163, 239, 89));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn.setText("SalaryTransaction");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        insertbtn1.setBackground(new java.awt.Color(243, 239, 13));
        insertbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        insertbtn1.setText("Insert");

        deletebtn1.setBackground(new java.awt.Color(243, 239, 13));
        deletebtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn1.setText("Delete");

        deletebtn2.setBackground(new java.awt.Color(163, 239, 89));
        deletebtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn2.setText("InstallmentTransaction");
        deletebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn2ActionPerformed(evt);
            }
        });

        deletebtn3.setBackground(new java.awt.Color(163, 239, 89));
        deletebtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn3.setText("ReservationTransaction");
        deletebtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn3ActionPerformed(evt);
            }
        });

        addresslabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addresslabel1.setText("Installment No");

        addresslabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addresslabel2.setText("Project ID");

        addresslabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addresslabel3.setText("Installment Due");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(emaillabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(phonelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(addresslabel, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(addresslabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(addresslabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(addresslabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstnametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastnametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addresstxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(deletebtn2)
                        .addGap(54, 54, 54)
                        .addComponent(deletebtn3)
                        .addGap(33, 33, 33)
                        .addComponent(deletebtn)
                        .addGap(32, 32, 32)
                        .addComponent(insertbtn)))
                .addContainerGap(594, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnametxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void deletebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtn2ActionPerformed

    private void deletebtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslabel;
    private javax.swing.JLabel addresslabel1;
    private javax.swing.JLabel addresslabel2;
    private javax.swing.JLabel addresslabel3;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField addresstxt1;
    private javax.swing.JTextField addresstxt2;
    private javax.swing.JTextField addresstxt3;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JButton deletebtn2;
    private javax.swing.JButton deletebtn3;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField firstnametxtfield;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JButton insertbtn;
    private javax.swing.JButton insertbtn1;
    private javax.swing.JTextField lastnametxtfield;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}