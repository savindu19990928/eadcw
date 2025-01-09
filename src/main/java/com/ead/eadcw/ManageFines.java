/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ead.eadcw;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManageFines extends javax.swing.JFrame {

    /**
     * Creates new form ManageMember
     */
    public ManageFines() {
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

        jLabel1 = new javax.swing.JLabel();
        fineIDText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reasonText = new javax.swing.JTextField();
        amountText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        issueedDateText = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        paidDateText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pCheckBox = new javax.swing.JCheckBox();
        borrowIDText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setTitle("Manage Borrowing");
        setResizable(false);

        jLabel1.setText("Fine ID");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Reason");

        jLabel3.setText("Amount");

        jLabel4.setText("Date Issued");

        issueedDateText.setEditable(false);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        paidDateText.setEditable(false);

        jLabel5.setText("Date Paid");

        pCheckBox.setText("Paid");

        jLabel6.setText("Borrow ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(issueedDateText)
                    .addComponent(reasonText)
                    .addComponent(fineIDText)
                    .addComponent(amountText)
                    .addComponent(paidDateText)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addComponent(borrowIDText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBtn))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fineIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrowIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(addBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(reasonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(deleteBtn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(issueedDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paidDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addComponent(pCheckBox)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            int fineID = Integer.parseInt(this.fineIDText.getText());
            try (Connection conn = Eadcw.getConnection()) {
                String sql = "SELECT * FROM Fines WHERE FineID = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, fineID);

                    try (ResultSet rs = stmt.executeQuery()) {
                        if (rs.next()) {
                            // Extract details
                            String reason = rs.getString("Reason");
                            String borrowID = rs.getInt("BorrowID") + "";
                            String amount = rs.getBigDecimal("FineAmount") + "";
                            String issueedDate = rs.getDate("DateIssued").toString();
                            Date paidDateObject = rs.getDate("DatePaid");

                            String paidDate = null;

                            if (paidDateObject != null) {
                                paidDate = paidDateObject.toString();
                            }

                            this.borrowIDText.setText(borrowID + "");
                            this.reasonText.setText(reason);
                            this.issueedDateText.setText(issueedDate);
                            this.amountText.setText(amount);
                            this.paidDateText.setText(paidDate);

                            if (paidDate != null) {
                                this.pCheckBox.setSelected(true);
                            } else {
                                this.pCheckBox.setSelected(false);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Fine ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Fine ID must be an integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            // Retrieve details from text fields
            String reason = this.reasonText.getText();
            String borrowID = this.borrowIDText.getText();
            String amount = this.amountText.getText();

            // Check if any required fields are empty
            if (reason.isEmpty() || amount.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try (Connection conn = Eadcw.getConnection()) {
                    // SQL query to insert
                    String sql = "INSERT INTO Fines (Reason, BorrowID, FineAmount) VALUES (?, ?, ?)";
                    try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                        // Set the values for the prepared statement
                        stmt.setString(1, reason);
                        stmt.setInt(2, Integer.parseInt(borrowID));
                        stmt.setBigDecimal(3, new BigDecimal(amount));

                        // Execute the insert
                        int rowsAffected = stmt.executeUpdate();
                        if (rowsAffected > 0) {
                            // Retrieve the generated fineID
                            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                                if (generatedKeys.next()) {
                                    int fineID = generatedKeys.getInt(1);
                                    this.fineIDText.setText(fineID + "");
                                    JOptionPane.showMessageDialog(null, "Details added successfully! Fine ID: " + fineID, "Success", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to add details.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while adding the fine.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            int fineID = Integer.parseInt(this.fineIDText.getText());
            // Check if the fineID is valid (not zero or negative)
            if (fineID <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid Fine ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Proceed with deleting the book from the database
            try (Connection conn = Eadcw.getConnection()) {
                // SQL query to delete a book by fineID
                String sql = "DELETE FROM Fines WHERE FineID = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, fineID);

                    // Execute the delete operation
                    int rowsAffected = stmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Fine with ID " + fineID + " deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No entry found with the given Fine ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Fine ID must be an integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while deleting the fine.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            int fineID = Integer.parseInt(this.fineIDText.getText());
            String borrowID = this.borrowIDText.getText();
            String reason = this.reasonText.getText();
            String amount = this.amountText.getText();
            boolean isPaid = this.pCheckBox.isSelected();
            if (fineID <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid fine ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate if the required fields are filled
            if (reason.isEmpty() || amount.isEmpty() || borrowID.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Proceed with updating the book details in the database
            try (Connection conn = Eadcw.getConnection()) {
                // SQL query to update book details
                String sql = "UPDATE Fines SET Reason = ?, BorrowID = ?, FineAmount = ?, DatePaid = ? WHERE BorrowID = ?";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    // Set the values for the prepared statement
                    stmt.setString(1, reason);
                    stmt.setInt(2, Integer.parseInt(borrowID));
                    stmt.setBigDecimal(3, new BigDecimal(amount));

                    if (isPaid) {
                        LocalDate cDate = LocalDate.now();
                        Date sqlDate = Date.valueOf(cDate);
                        stmt.setDate(4, sqlDate);
                    } else {
                        stmt.setDate(4, null);
                    }

                    stmt.setInt(5, fineID);

                    // Execute the update operation
                    int rowsAffected = stmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Fine details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No fine found with the given Fine ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Fine ID must be an integer.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while updating the borrowing.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amountText;
    private javax.swing.JTextField borrowIDText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fineIDText;
    private javax.swing.JTextField issueedDateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox pCheckBox;
    private javax.swing.JTextField paidDateText;
    private javax.swing.JTextField reasonText;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
