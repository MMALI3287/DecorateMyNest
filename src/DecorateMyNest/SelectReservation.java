/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DecorateMyNest;

import java.awt.Window;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Musaddique Ali
 */
public class SelectReservation extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form AdminViewPanel
     */
    public SelectReservation() {
        initComponents();
        setRecordsToTable();
    }

    private void setRecordsToTable() {
        try {
            Welcome.jdbc.preparedStatement = Welcome.jdbc.connection
                    .prepareStatement("SELECT * FROM Reservations;");
            Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
            model = (DefaultTableModel) reservationTable.getModel();
            model.setRowCount(0);
            while (Welcome.jdbc.resultSet.next()) {
                int reservationID = Welcome.jdbc.resultSet.getInt("ReservationID");
                int clientID = Welcome.jdbc.resultSet.getInt("ClientID");
                int catalogueID = Welcome.jdbc.resultSet.getInt("CatalogueID");
                Date reservationDate = Welcome.jdbc.resultSet.getDate("ReservationDate");

                model.addRow(new Object[] { reservationID, clientID, catalogueID, reservationDate });
            }
            reservationTable.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        List<String> columnNamesList = Welcome.jdbc.getColumns("Reservations");

        jComboBoxselectcolumn.removeAllItems();

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        for (String columnName : columnNamesList) {
            comboBoxModel.addElement(columnName);
        }

        jComboBoxselectcolumn.setModel(comboBoxModel);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxselectcolumn = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        okbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        searchbylabel = new javax.swing.JLabel();
        adminSelect = new javax.swing.JButton();

        jComboBoxselectcolumn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxselectcolumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        okbtn.setBackground(new java.awt.Color(153, 255, 153));
        okbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        okbtn.setText("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReservationID", "ClientID", "CatalogueID", "ReservationDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reservationTable);

        searchbylabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchbylabel.setText("Search By");

        adminSelect.setBackground(new java.awt.Color(153, 255, 153));
        adminSelect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adminSelect.setText("Select");
        adminSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(540, 540, 540))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxselectcolumn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adminSelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_adminSelectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = reservationTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        Welcome.jdbc.reservationID = (int) reservationTable.getValueAt(selectedRowIndex, 0);

        setVisible(false);
        Window w = SwingUtilities.getWindowAncestor(this);
        w.setVisible(false);
    }// GEN-LAST:event_adminSelectActionPerformed

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
        {
            String selectedColumn = (String) jComboBoxselectcolumn.getSelectedItem();
            String searchTerm = jTextField1.getText();

            try {
                String query = "SELECT * FROM Reservations WHERE " + selectedColumn + " LIKE ?";
                Welcome.jdbc.preparedStatement = Welcome.jdbc.connection.prepareStatement(query);
                Welcome.jdbc.preparedStatement.setString(1, "%" + searchTerm + "%");

                Welcome.jdbc.resultSet = Welcome.jdbc.preparedStatement.executeQuery();
                model.setRowCount(0); // Clear existing data

                while (Welcome.jdbc.resultSet.next()) {
                    int reservationID = Welcome.jdbc.resultSet.getInt("ReservationID");
                    int clientID = Welcome.jdbc.resultSet.getInt("ClientID");
                    int catalogueID = Welcome.jdbc.resultSet.getInt("CatalogueID");
                    Date reservationDate = Welcome.jdbc.resultSet.getDate("ReservationDate");

                    model.addRow(new Object[] { reservationID, clientID, catalogueID, reservationDate });
                }

                // Update the table model with search results
                reservationTable.setModel(model);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

    }// GEN-LAST:event_okbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminSelect;
    private javax.swing.JComboBox<String> jComboBoxselectcolumn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton okbtn;
    private javax.swing.JTable reservationTable;
    private javax.swing.JLabel searchbylabel;
    // End of variables declaration//GEN-END:variables
}