/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewUser.java
 *
 * 
 */
package master;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Registration extends javax.swing.JFrame {

    /** Creates new form NewUser */
    public Registration() {
        initComponents();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
       
      
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtmob = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtaddr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 580));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Registration Form");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(150, 10, 290, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(430, 10, 590, 60);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 60, 110, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Address");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 100, 170, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 140, 150, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("UserName");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(30, 270, 110, 30);

        txtname.setMinimumSize(new java.awt.Dimension(40, 17));
        jPanel3.add(txtname);
        txtname.setBounds(160, 60, 160, 30);

        txtgender.setMinimumSize(new java.awt.Dimension(40, 17));
        jPanel3.add(txtgender);
        txtgender.setBounds(160, 140, 160, 30);

        txtmob.setMinimumSize(new java.awt.Dimension(40, 17));
        jPanel3.add(txtmob);
        txtmob.setBounds(160, 230, 160, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(230, 360, 110, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(60, 360, 120, 30);

        txtemail.setMinimumSize(new java.awt.Dimension(40, 17));
        jPanel3.add(txtemail);
        txtemail.setBounds(160, 180, 160, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Email id");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 190, 110, 20);

        txtaddr.setMinimumSize(new java.awt.Dimension(40, 17));
        jPanel3.add(txtaddr);
        txtaddr.setBounds(160, 100, 160, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(" MobileNo");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 230, 110, 30);

        txtusername.setMinimumSize(new java.awt.Dimension(40, 17));
        jPanel3.add(txtusername);
        txtusername.setBounds(160, 270, 160, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 310, 110, 20);
        jPanel3.add(txtpwd);
        txtpwd.setBounds(160, 310, 160, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(130, 20, 380, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(400, 60, 590, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String Name=txtname.getText();
       String address=txtaddr.getText();
       String gender=txtgender.getText();
       String repass=txtpwd.getText();
       String mobile=txtmob.getText();
       String email=txtemail.getText();
       String username=txtusername.getText();
       try {
           if(Name.equals("")||address.equals("")||gender.equals("")||repass.equals("")||mobile.equals("")||email.equals("")||username.equals("")){
               JOptionPane.showMessageDialog(rootPane, "Please Enter All Fields.... ");
           }
           else{
       DbconnSemeval db = new DbconnSemeval();
       Connection con=(Connection) db.conn();
             Statement st2 =(Statement) con.createStatement();
  st2.executeUpdate("insert into register values('"+Name+"','"+address+"','"+gender+"','"+email+"','"+mobile+"','"+username+"','"+repass+"')");
                       JOptionPane.showMessageDialog(rootPane, "User Registered Successfully.... ");
                     Home nu = new Home ();
                nu.setVisible(true);
                this.dispose();
                      
           }               
       }catch(Exception e)
       {
           System.out.println(e);
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtaddr;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtmob;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}