/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmr.garments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class DiscountFrame extends javax.swing.JFrame {

    /**
     * Creates new form DiscountFrame
     */
    public DiscountFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        socksadd4 = new javax.swing.JLabel();
        socksadd3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(252, 146));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(252, 172));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Set Discount ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, 240, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Discount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 70, 90, 30));

        tf1.setBackground(new java.awt.Color(249, 215, 184));
        tf1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, 30));

        socksadd4.setBackground(new java.awt.Color(255, 255, 255));
        socksadd4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd4.setText("Set");
        socksadd4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socksadd4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socksadd4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                socksadd4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        socksadd4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socksadd4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                socksadd4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                socksadd4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                socksadd4MouseReleased(evt);
            }
        });
        socksadd4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                socksadd4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                socksadd4KeyReleased(evt);
            }
        });
        jPanel1.add(socksadd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        socksadd3.setBackground(new java.awt.Color(255, 255, 255));
        socksadd3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd3.setText("Close");
        socksadd3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socksadd3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socksadd3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                socksadd3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        socksadd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socksadd3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                socksadd3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                socksadd3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                socksadd3MouseReleased(evt);
            }
        });
        socksadd3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                socksadd3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                socksadd3KeyReleased(evt);
            }
        });
        jPanel1.add(socksadd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 172));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void socksadd4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4AncestorAdded

    private void socksadd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseClicked
        int discount=Integer.parseInt(tf1.getText());
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
            Statement st=con.createStatement();
            st.executeUpdate("update discount set WholeSaleDiscount="+discount+"");
            DiscountAddedSuccess d=new DiscountAddedSuccess();
            d.setVisible(true);
            this.dispose();
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }


    }//GEN-LAST:event_socksadd4MouseClicked

    private void socksadd4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4MouseEntered

    private void socksadd4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4MousePressed

    private void socksadd4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4MouseReleased

    private void socksadd4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4KeyPressed

    private void socksadd4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4KeyReleased

    private void socksadd3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3AncestorAdded

    private void socksadd3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd3MouseClicked
        this.dispose();
    }//GEN-LAST:event_socksadd3MouseClicked

    private void socksadd3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3MouseEntered

    private void socksadd3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3MousePressed

    private void socksadd3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3MouseReleased

    private void socksadd3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3KeyPressed

    private void socksadd3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3KeyReleased

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from discount");
            while(rs.next())
            {
                tf1.setText(""+rs.getInt("WholeSaleDiscount"));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(DiscountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiscountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiscountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiscountFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiscountFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel socksadd3;
    private javax.swing.JLabel socksadd4;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
