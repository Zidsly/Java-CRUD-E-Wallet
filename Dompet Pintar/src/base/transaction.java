/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.SwingConstants;

/**
 *
 * @author Zids
 */
public class transaction extends javax.swing.JFrame {
    private String strUsername;
    String loginUsn;
    public int addBalance;
    

    public String getLoginUsn() {
        return loginUsn;
    }

    public void setLoginUsn(String loginUsn) {
        this.loginUsn = loginUsn;
        
    }

    /**
     * Creates new form transaction
     */
    public transaction() {
        initComponents();
        this.strUsername = strUsername;
        System.out.println("Username : " + loginUsn);
        
       
    }
    
    
       public void hapuslayar(){
        txtAddBalance.setText("");
        }
       
     void userDash(){
         /*
        dashboard dashboardFrame = new dashboard();
        if (getStrUsername() != null) {
                        dashboardFrame.setLoginUsn2(getStrUsername()); // Set the value of loginUsn
        }
                        
                        dashboardFrame.setVisible(true);
        */
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTransfer = new javax.swing.JTextField();
        txtAddBalance = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnAddBalance = new javax.swing.JButton();
        outputSaldo = new javax.swing.JTextField();
        transaksi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTransfer.setBackground(new java.awt.Color(0,0,0,0));
        txtTransfer.setBorder(null);
        txtTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransferActionPerformed(evt);
            }
        });
        getContentPane().add(txtTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 210, 50));

        txtAddBalance.setBackground(new java.awt.Color(0,0,0,0));
        txtAddBalance.setBorder(null);
        txtAddBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 210, 50));

        jButton1.setBackground(new java.awt.Color(0,0,0,0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 250, 40));

        btnTransfer.setBackground(new java.awt.Color(0,0,0,0));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 110, 60));

        jButton3.setBackground(new java.awt.Color(0,0,0,0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 250, 50));

        jButton4.setBackground(new java.awt.Color(0,0,0,0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 250, 40));

        jButton5.setBackground(new java.awt.Color(0,0,0,0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 250, 40));

        jButton8.setBackground(new java.awt.Color(0,0,0,0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 60, 50));

        jButton6.setBackground(new java.awt.Color(0,0,0,0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 250, 50));

        btnAddBalance.setBackground(new java.awt.Color(0,0,0,0));
        btnAddBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 110, 50));

        outputSaldo.setBackground(new java.awt.Color(0,0,0,0));
        outputSaldo.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        outputSaldo.setForeground(new java.awt.Color(255, 255, 255));
        outputSaldo.setBorder(null);
        outputSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(outputSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 400, 70));

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UiComponent/transaksi.png"))); // NOI18N
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil");
        transaksi.setVisible(false);
        this.dispose();
        new dashboard().setVisible(true);
        /*
        dashboard dashboardFrame = new dashboard();
        if (getStrUsername() != null) {
                        dashboardFrame.setLoginUsn2(getStrUsername()); // Set the value of loginUsn
        }
                        
                        dashboardFrame.setVisible(true);
        */
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil");
        transaksi.setVisible(false);
        this.dispose();
        new topUp().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil");
        transaksi.setVisible(false);
        this.dispose();
        new history().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil");
        transaksi.setVisible(false);
        this.dispose();
        new account().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil");
        transaksi.setVisible(false);
        this.dispose();
        new loginPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil");
        transaksi.setVisible(false);
        this.dispose();
        new dashboard().setVisible(true);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnAddBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBalanceActionPerformed
        try {
        if (txtAddBalance.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "saldo yang ditambahkan 0", "Pesan", JOptionPane.ERROR_MESSAGE);
            hapuslayar();
            System.out.println("1" + loginUsn);
        } else {              
            addBalance = Integer.parseInt(txtAddBalance.getText());
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbakun", "root", "")) {
            String insertSql = "UPDATE tbldata SET balance = ? WHERE username = ?";           
            //"INSERT INTO seats2 (seat_num, is_booked) VALUES ('" + seatnum_txtfield.getText() + "', true)"
            PreparedStatement insertStatement = con.prepareStatement(insertSql);
            insertStatement.setString(2, loginUsn);
            insertStatement.setInt(1, addBalance);
            int rowsAffected = insertStatement.executeUpdate();
            outputSaldo.setHorizontalAlignment(SwingConstants.CENTER);
            outputSaldo.setText(String.valueOf(addBalance));
            

            System.out.println("Rows affected: " + rowsAffected);
            JOptionPane.showMessageDialog(null, "Saldo berhasil ditambahkan, transaksi berhasil");
            insertStatement.close();
        } catch (SQLException e) {
            // Handle exceptions appropriately
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred: " + e.getMessage());
        }

            }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "saldo tidak berhasil ditambahkan", "Pesan",
                JOptionPane.WARNING_MESSAGE);
        System.out.println(e);
        hapuslayar();
    }
    }//GEN-LAST:event_btnAddBalanceActionPerformed

    private void txtAddBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddBalanceActionPerformed

    }//GEN-LAST:event_txtAddBalanceActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        try {
        if (txtTransfer.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "saldo yang ditransfer 0", "Pesan", JOptionPane.ERROR_MESSAGE);
            hapuslayar();
            System.out.println("1" + loginUsn);
        } else {              
            //addBalance2 = Integer.parseInt(txtTransfer.getText());
            int addBalance2 = Integer.parseInt(txtTransfer.getText());
            System.out.println("saldo sebelumnya : " + addBalance);
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dbakun", "root", "")) {
            String insertSql = "UPDATE tbldata SET balance = ? WHERE username = ?";    
            int balanceUpdate = addBalance - addBalance2;
            //"INSERT INTO seats2 (seat_num, is_booked) VALUES ('" + seatnum_txtfield.getText() + "', true)"
            PreparedStatement insertStatement = con.prepareStatement(insertSql);
            insertStatement.setString(2, loginUsn);
            insertStatement.setInt(1, balanceUpdate);
            int rowsAffected = insertStatement.executeUpdate();
            outputSaldo.setHorizontalAlignment(SwingConstants.CENTER);
            outputSaldo.setText(String.valueOf(balanceUpdate));
            System.out.println("saldo sekarang : " + balanceUpdate);
            System.out.println(addBalance - addBalance2);
            

            System.out.println("Rows affected: " + rowsAffected);
            JOptionPane.showMessageDialog(null, "Saldo berhasil ditambahkan, transaksi berhasil");
            insertStatement.close();
        } catch (SQLException e) {
            // Handle exceptions appropriately
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred: " + e.getMessage());
        }

            }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "saldo tidak berhasil ditambahkan", "Pesan",
                JOptionPane.WARNING_MESSAGE);
        System.out.println(e);
        hapuslayar();
    }
    }//GEN-LAST:event_btnTransferActionPerformed

    private void outputSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputSaldoActionPerformed
        int addBalance = Integer.parseInt(txtAddBalance.getText());
        int addBalance2 = Integer.parseInt(txtTransfer.getText());
        System.out.println(addBalance);   
        
        //System.out.println(addBalance2);
        
    }//GEN-LAST:event_outputSaldoActionPerformed

    private void txtTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransferActionPerformed

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
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                transaction trans = new transaction();
                trans.setVisible(true);
                loginPage login = new loginPage();
                String loginUsn = login.getStrUsername();
                System.out.println("Username test: " + loginUsn);
                trans.setLoginUsn(loginUsn);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBalance;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JTextField outputSaldo;
    private javax.swing.JLabel transaksi;
    private javax.swing.JTextField txtAddBalance;
    private javax.swing.JTextField txtTransfer;
    // End of variables declaration//GEN-END:variables
}
