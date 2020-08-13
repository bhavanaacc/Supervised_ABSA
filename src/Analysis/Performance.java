/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Analysis;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author sunsoft
 */
public class Performance extends javax.swing.JFrame {

     
    public Performance() {
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

        jPanel1 = new javax.swing.JPanel();
        AccuracyBtn = new javax.swing.JButton();
        AccuracyBtn1 = new javax.swing.JButton();
        AccuracyBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AccuracyBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccuracyBtn.setText("Graphs -(SemEval)");
        AccuracyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccuracyBtnActionPerformed(evt);
            }
        });

        AccuracyBtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccuracyBtn1.setText("Graphs- (Drug)");
        AccuracyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccuracyBtn1ActionPerformed(evt);
            }
        });

        AccuracyBtn2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AccuracyBtn2.setText("Graphs- (Yelp)");
        AccuracyBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccuracyBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AccuracyBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccuracyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccuracyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(AccuracyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(AccuracyBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(AccuracyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccuracyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccuracyBtnActionPerformed
        try {
            Accuracy1 gr1 = new Accuracy1("Classification Accuracy of system");
            gr1.pack();
            RefineryUtilities.centerFrameOnScreen(gr1);
            gr1.setVisible(true);
            gr1.setLocation(0, 100);
        } catch (Exception ex) {
             
        }  
 
    }//GEN-LAST:event_AccuracyBtnActionPerformed

    private void AccuracyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccuracyBtn1ActionPerformed
        // TODO add your handling code here:
        try {
            Accuracy3 gr1 = new Accuracy3("Classification Accuracy of system");
            gr1.pack();
            RefineryUtilities.centerFrameOnScreen(gr1);
            gr1.setVisible(true);
            gr1.setLocation(0, 100);
        } catch (Exception ex) {
             
        } 
    }//GEN-LAST:event_AccuracyBtn1ActionPerformed

    private void AccuracyBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccuracyBtn2ActionPerformed
 try {
            Accuracy2 gr1 = new Accuracy2("Classification Accuracy of system");
            gr1.pack();
            RefineryUtilities.centerFrameOnScreen(gr1);
            gr1.setVisible(true);
            gr1.setLocation(0, 100);
        } catch (Exception ex) {
             
        }         // TODO add your handling code here:
    }//GEN-LAST:event_AccuracyBtn2ActionPerformed

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
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Performance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Performance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccuracyBtn;
    private javax.swing.JButton AccuracyBtn1;
    private javax.swing.JButton AccuracyBtn2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
