/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmr.garments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmr.garments.StockFrame;

/**
 *
 * @author HP
 */
public class CodeDeleteVerification extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDeleteVerification
     */
    public CodeDeleteVerification(String tname,String tcode) {
        initComponents();
        createConnection();
        dtablename=tname;
        code=tcode;
    }
    public void createConnection()
    {
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GarmentsShop","root","root");
            con.setAutoCommit(false);
            }
        catch(Exception e)
        {
            
        }
    }
    public void removeCode()
    {
            StockFrame.code4.removeAllItems();
            StockFrame.code4.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select code from "+dtablename+"");
            while(rs.next())
            {
                StockFrame.code4.addItem(rs.getString("code"));
            }
            }catch(Exception e){
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Do you really want to delete this Code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        l2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("No");
        l2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 130, -1));

        l3.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("Yes");
        l3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Wrong1.gif")); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), new java.awt.Color(0, 102, 102), null, null));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 317));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int xx,yy;
String dtablename="",code="";
    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx,y-yy);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered

    }//GEN-LAST:event_l2MouseEntered
Connection con;
int count=0;
    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        if(dtablename.equals("socks"))
        {
            try
            {
                Statement st=con.createStatement();
                st.executeUpdate("delete from "+dtablename+" where Item='"+code+"'");
                con.commit();
                StockFrame.code4.removeAllItems();
                StockFrame.code4.addItem("Select Code");
                ResultSet rs=st.executeQuery("Select Item from socks");
                while(rs.next())
                {
                    StockFrame.code4.addItem(rs.getString("Item"));
                }
                StockFrame.code4.setSelectedIndex(0);
                StockFrame.cp4.setText("");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(dtablename.equals("undergarments"))
        {
            try
            {
                Statement st=con.createStatement();
                st.executeUpdate("delete from "+dtablename+" where Item='"+code+"'");
                con.commit();
                StockFrame.code4.removeAllItems();
                StockFrame.code4.addItem("Select Code");
                ResultSet rs=st.executeQuery("Select Item from "+dtablename+"");
                while(rs.next())
                {
                    StockFrame.code4.addItem(rs.getString("Item"));
                }
                StockFrame.code4.setSelectedIndex(0);
                StockFrame.cp4.setText("");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(dtablename.equals("seasonal"))
        {
            try
            {
                Statement st=con.createStatement();
                st.executeUpdate("delete from "+dtablename+" where Item='"+code+"'");
                con.commit();
                StockFrame.code4.removeAllItems();
                StockFrame.code4.addItem("Select Code");
                ResultSet rs=st.executeQuery("Select Item from "+dtablename+"");
                while(rs.next())
                {
                    StockFrame.code4.addItem(rs.getString("Item"));
                }
                StockFrame.code4.setSelectedIndex(0);
                StockFrame.cp4.setText("");
            }
            catch(Exception e)
            {
                
            }
        }        
        else
        {
            try
            {
                Statement st=con.createStatement();
                st.executeUpdate("delete from "+dtablename+" where Code='"+code+"'");
                con.commit();
                StockFrame.code4.removeAllItems();
                StockFrame.code4.addItem("Select Code");
                ResultSet rs=st.executeQuery("Select Code from "+dtablename+"");
                while(rs.next())
                {
                    StockFrame.code4.addItem(rs.getString("Code"));
                }
                StockFrame.code4.setSelectedIndex(0);
                StockFrame.cp4.setText("");
            }
            catch(Exception e)
            {
                
            }            
        }
        this.dispose();
        CodeRemovedSuccess c=new CodeRemovedSuccess();
        c.setVisible(true);     
    }//GEN-LAST:event_l3MouseClicked

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_l3MouseEntered

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
            java.util.logging.Logger.getLogger(CodeDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CodeDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CodeDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CodeDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String  a="",b="";
                new CodeDeleteVerification(a,b).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    // End of variables declaration//GEN-END:variables
}
