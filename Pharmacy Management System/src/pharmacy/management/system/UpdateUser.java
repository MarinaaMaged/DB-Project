/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy.management.system;

import doe.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author N A N A
 */
public class UpdateUser extends javax.swing.JFrame {
    private String mobileNumberPattern="^[0-9]*$";
    /**
     * Creates new form UpdateUser
     */
    public UpdateUser() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboboxUserRole = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtManager = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtZone = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Update User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/square-crossmark-red-button-close-exit-design-vector.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 50, 50));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1110, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 190, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("User Role:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        comboboxUserRole.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        comboboxUserRole.setForeground(new java.awt.Color(0, 0, 51));
        comboboxUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pharmacist" }));
        getContentPane().add(comboboxUserRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 200, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        txtLName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtLName.setForeground(new java.awt.Color(0, 0, 51));
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 200, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText(" Mobile number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        txtMobileNumber.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 200, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("First Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        txtFName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtFName.setForeground(new java.awt.Color(0, 0, 51));
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Middle Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        txtMName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtMName.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(txtMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 200, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("manager ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        txtManager.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtManager.setForeground(new java.awt.Color(0, 0, 51));
        txtManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManagerActionPerformed(evt);
            }
        });
        getContentPane().add(txtManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 200, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Street:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        txtStreet.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtStreet.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(txtStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 200, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Zone:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        txtZone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtZone.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(txtZone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 200, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 460, 90, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1130, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManagerActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String userRole = (String) comboboxUserRole.getSelectedItem();
        String fName=txtFName.getText();
        String mName=txtMName.getText();
        String lName=txtLName.getText();
        String mobileNumber=txtMobileNumber.getText();
        String username=txtUsername.getText();
        String street=txtStreet.getText();
        String zone=txtZone.getText();
        String manager=txtManager.getText();
        if (fName.equals("")) {
            JOptionPane.showMessageDialog(null, "First Name field is required");
        } else if (mName.equals("")) {
            JOptionPane.showMessageDialog(null, "Middle Name field is required");
        } else if (lName.equals("")) {
            JOptionPane.showMessageDialog(null, "Last Name field is required");
        } else if (mobileNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Mobile number field is required");
        } else if (!mobileNumber.matches(mobileNumberPattern) || mobileNumber.length() != 11) {
            JOptionPane.showMessageDialog(null, "Mobile number field is invalid");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required");
        } else if (street.equals("")) {
            JOptionPane.showMessageDialog(null, "Street field is required");
        } else if (zone.equals("")) {
            JOptionPane.showMessageDialog(null, "Zone field is required");
        } else if (manager.equals("")) {
            JOptionPane.showMessageDialog(null, "Manager ID field is required");
        }else{
            try{
               Connection con=ConnectionProvider.getCon();
               //First_Name,Middle_Name,Last_Name,mobileNumber,username,password,Street,Zone,salary
               PreparedStatement ps=con.prepareStatement("update user set userRole=?,First_Name=?,Middle_Name=?,Last_Name=?,mobileNumber=?,Street=?,Zone=?,salary=? where username=?");
               ps.setString(1, userRole);
               ps.setString(2, fName);
               ps.setString(3, mName);
               ps.setString(4, lName);
               ps.setString(5, mobileNumber);
               ps.setString(6, street);
               ps.setString(7, zone);
               ps.setString(8, manager);
               ps.setString(9, username);
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "User Updated Successfuly");
                setVisible(false);
                new UpdateUser().setVisible(true);
               
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int checkUserExist=0;
        String username=txtUsername.getText();
        if(username.equals("")){
            JOptionPane.showMessageDialog(null, "Username field is required");
        }else{
            try{
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select *from user where username='"+username+"'");
                while(rs.next()){
                    txtUsername.setEditable(false);
                    checkUserExist=1;
                    txtFName.setText(rs.getString("First_Name"));
                    txtMName.setText(rs.getString("Middle_Name"));
                    txtLName.setText(rs.getString("Last_Name"));
                    txtMobileNumber.setText(rs.getString("mobileNumber"));
                    txtStreet.setText(rs.getString("Street"));
                    txtZone.setText(rs.getString("Zone"));
                    txtManager.setText(rs.getString("manager_ID"));
                if(rs.getString("userRole").equals("Admin")){
                    comboboxUserRole.removeAllItems();
                    comboboxUserRole.addItem("Admin");
                    comboboxUserRole.addItem("Pharmacist");
                    
                }else{
                    comboboxUserRole.removeAllItems();
                    comboboxUserRole.addItem("Pharmacist");
                    comboboxUserRole.addItem("Admin");
                    
                }
                
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }if(checkUserExist==0){
            JOptionPane.showMessageDialog(null, "Username doesn't exist");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboboxUserRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZone;
    // End of variables declaration//GEN-END:variables
}
