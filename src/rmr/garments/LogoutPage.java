
package rmr.garments;

import java.awt.Image;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioStream;


public class LogoutPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LogoutPage() {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginform = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pw1 = new javax.swing.JPasswordField();
        ch1 = new javax.swing.JCheckBox();
        l2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginform.setBackground(new java.awt.Color(0, 0, 0,170));
        loginform.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 102, 0), new java.awt.Color(153, 153, 153)));
        loginform.setPreferredSize(new java.awt.Dimension(700, 307));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Login");

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("UserName");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");

        pw1.setBackground(new java.awt.Color(204, 223, 198));
        pw1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        pw1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 223, 198), 7));

        ch1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        ch1.setForeground(new java.awt.Color(204, 204, 204));
        ch1.setText("Show Password");
        ch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ch1.setOpaque(false);
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });

        l2.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("Login");
        l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setText("Forget Password..?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        tf1.setBackground(new java.awt.Color(204, 223, 198));
        tf1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        tf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 223, 198), 7));

        javax.swing.GroupLayout loginformLayout = new javax.swing.GroupLayout(loginform);
        loginform.setLayout(loginformLayout);
        loginformLayout.setHorizontalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginformLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginformLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(309, 309, 309)
                        .addComponent(ch1))
                    .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addGroup(loginformLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(167, 167, 167)
                            .addComponent(jLabel2))
                        .addComponent(pw1)
                        .addComponent(tf1)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        loginformLayout.setVerticalGroup(
            loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginformLayout.createSequentialGroup()
                .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginformLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3))
                    .addGroup(loginformLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pw1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(loginform, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 680, -1));

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Login Background.png")); // NOI18N
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed
        if(ch1.isSelected())
        {
            pw1.setEchoChar((char)0);
        }
        else
        {
            pw1.setEchoChar('*');
        }
    }//GEN-LAST:event_ch1ActionPerformed
String muname,mpword,contact;
int post;
    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
String uname,pword;
        uname=tf1.getText();
        pword=pw1.getText();
        uname=uname.toLowerCase();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GarmentsShop","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from login where username='"+uname+"'");
            while(rs.next())
            {
                muname=(rs.getString("username"));
                muname=muname.toLowerCase();
                mpword=(rs.getString("password"));
                contact=rs.getString("Contact");
                post=rs.getInt("Post");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something went Wrong");
        }

        if((uname.equals(muname))&&(pword.equals(mpword)))
        {
            if(post==1)
            {
                RetailFrame r=new RetailFrame(contact);
                r.setVisible(true);
            }
            else
            {
                UserRetailFrame u=new UserRetailFrame(contact);
                u.setVisible(true);
            }
            this.dispose();
        }
        else
        {
            Loginerror l=new Loginerror();
            l.setVisible(true);
            tf1.setText("");
            pw1.setText("");
        }

    }//GEN-LAST:event_l2MouseClicked

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered

    }//GEN-LAST:event_l2MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ForgetPassword f=new ForgetPassword();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(LogoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogoutPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage;
    private javax.swing.JCheckBox ch1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l2;
    private javax.swing.JPanel loginform;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}