/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first.software;

import static first.software.Login.da;
import static first.software.Reserve_Page.Final_Recipt_Number;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author And
 */
public class vendor extends javax.swing.JFrame {

    /**
     * Creates new form vendor
     */
    public vendor() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        beef = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        rice = new javax.swing.JTextField();
        potato = new javax.swing.JTextField();
        masala = new javax.swing.JTextField();
        oil = new javax.swing.JTextField();
        chiken = new javax.swing.JTextField();
        beef_p = new javax.swing.JTextField();
        chiken_p = new javax.swing.JTextField();
        oil_p = new javax.swing.JTextField();
        masala_p = new javax.swing.JTextField();
        potato_p = new javax.swing.JTextField();
        rice_p = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Vendor Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel2.setText("Rice");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 99, -1, -1));

        jLabel3.setText("Potato");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 131, -1, -1));

        jLabel4.setText("Masale");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 163, -1, -1));

        jLabel5.setText("Oil");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 195, -1, -1));

        jLabel6.setText("Chicken");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 227, -1, -1));

        jLabel7.setText("Beef");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 259, -1, -1));

        beef.setText("0");
        getContentPane().add(beef, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 130, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 90, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 110, 20));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 130, -1));

        rice.setText("0");
        getContentPane().add(rice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, -1));

        potato.setText("0");
        getContentPane().add(potato, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 130, -1));

        masala.setText("0");
        getContentPane().add(masala, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, -1));

        oil.setText("0");
        getContentPane().add(oil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 130, -1));

        chiken.setText("0");
        chiken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chikenActionPerformed(evt);
            }
        });
        getContentPane().add(chiken, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 130, -1));

        beef_p.setText("0");
        getContentPane().add(beef_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 80, -1));

        chiken_p.setText("0");
        getContentPane().add(chiken_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 80, -1));

        oil_p.setText("0");
        getContentPane().add(oil_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 80, -1));

        masala_p.setText("0");
        getContentPane().add(masala_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, -1));

        potato_p.setText("0");
        getContentPane().add(potato_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 80, -1));

        rice_p.setText("0");
        getContentPane().add(rice_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 40, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Quantity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 60, 30));

        jButton1.setText("Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 100, 30));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, 30));

        jMenu1.setText("File                   ");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Back");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Log Out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        this.hide();
        new Reserve_Page().show();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        this.hide();
        new Login().show();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        
         // Quantity
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con =
            DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=owaise;username=admin;password=admin");         

          

            String q = "insert into vendor values ('"+da+"','"+name.getText()+"','"+rice.getText()+"','"+potato.getText()+"'"
                    + ",'"+masala.getText()+"','"+oil.getText()+"','"+chiken.getText()+"','"+beef.getText()+"')" ;

            Statement st = con.createStatement();
            st.execute(q);

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }

        //Quantity
        
        

        
                 // Quantity
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con =
            DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=owaise;username=admin;password=admin");         

          

            String q1 = "insert into vendor_price values ('"+da+"','"+name.getText()+"','"+rice_p.getText()+"','"+potato_p.getText()+"',"
                    + "'"+masala_p.getText()+"','"+oil_p.getText()+"','"+chiken_p.getText()+"','"+beef_p.getText()+"')" ;

            Statement st = con.createStatement();
            st.execute(q1);

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }

        //Quantity
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chikenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chikenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chikenActionPerformed

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
            java.util.logging.Logger.getLogger(vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beef;
    private javax.swing.JTextField beef_p;
    private javax.swing.JTextField chiken;
    private javax.swing.JTextField chiken_p;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField masala;
    private javax.swing.JTextField masala_p;
    private javax.swing.JTextField name;
    private javax.swing.JTextField oil;
    private javax.swing.JTextField oil_p;
    private javax.swing.JTextField potato;
    private javax.swing.JTextField potato_p;
    private javax.swing.JTextField rice;
    private javax.swing.JTextField rice_p;
    // End of variables declaration//GEN-END:variables
}