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

/**
 *
 * @author HP
 */
public class CustomerDeleteVerification extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDeleteVerification
     */
    public CustomerDeleteVerification(int Bill) {
        initComponents();
        BillNo=Bill;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel2.setText("Do you really want to delete Customer");
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
int xx,yy,BillNo=0;
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
        String code="",size="",tablename="",quantity="",mrp="";
        String name="",mobile="",address="",method="";
        int age=0,totalamount=0,items=0,cash=0,online=0,i;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GarmentsShop","root","root");
                Statement st=con.createStatement();
                ResultSet rs1=st.executeQuery("select * from customerpurchases where BillNo="+BillNo+"");
                    while(rs1.next())
                    {
                        code=rs1.getString("Code");
                        size=rs1.getString("Size");
                        tablename=rs1.getString("TableName");
                        quantity=rs1.getString("Quantity");
                        mrp=rs1.getString("MRP");
                    }
                String codearray[]=code.split("/");
                String sizearray[]=size.split("/");
                String tablearray[]=tablename.split("/");
                String quantityarray[]=quantity.split("/");
                String mrparray[]=mrp.split("/");
                System.out.println(mrparray[0]);
                for(i=0;i<codearray.length;i++)
                {
                    if(tablearray[i].equals("socks"))
                    {
                        int tempqty=Integer.parseInt(quantityarray[i]);
                        System.out.println(tempqty);
                        System.out.println(codearray[0]);
                        st.executeUpdate("update "+tablearray[i]+" set Quantity=Quantity+"+tempqty+" where Item='"+codearray[i]+"'");
                        System.out.println("Success");
                    }
                    else if(tablearray[i].equals("Seasonal"))
                    {
                        int tempqty=Integer.parseInt(quantityarray[i]);
                        st.executeUpdate("update "+tablearray[i]+" set Quantity=Quantity+"+tempqty+" where Item='"+codearray[i]+"'");
                        st.executeUpdate("update "+tablearray[i]+"size set Quantity=Quantity+"+tempqty+" where Item='"+codearray[i]+"' and size='"+sizearray[i]+"'");
                    }
                    else if(tablearray[i].equals("undergarments"))
                    {
                        int tempqty=Integer.parseInt(quantityarray[i]);
                        st.executeUpdate("update "+tablearray[i]+" set Quantity=Quantity+"+tempqty+" where Item='"+codearray[i]+"'");
                        st.executeUpdate("update "+tablearray[i]+"size set Quantity=Quantity+"+tempqty+" where Item='"+codearray[i]+"' and size='"+sizearray[i]+"'");
                    }
                    else
                    {
                        int tempqty=Integer.parseInt(quantityarray[i]);
                        System.out.println("Shirt");
                        System.out.println(codearray[i]);
                        st.executeUpdate("update "+tablearray[i]+" set Quantity=Quantity+"+tempqty+" where Code='"+codearray[i]+"'");
                        st.executeUpdate("update "+tablearray[i]+"size set Quantity=Quantity+"+tempqty+" where Code='"+codearray[i]+"' and Size='"+sizearray[i]+"'");
                    }
                    count++;
                    if(count==codearray.length)
                    {
                        break;
                    }
                    System.out.println("Hello");
                }
                System.out.println("Success");
                System.out.println(code);
                System.out.println(tablename);
                ResultSet rs2=st.executeQuery("select * from customerinfo where BillNo="+BillNo+"");
                while(rs2.next())
                {
                    st.executeUpdate("insert into deletedcustomerinfo values("+rs2.getInt("BillNo")+",'"+rs2.getString("Name")+"','"+rs2.getString("Mobile")+"','"+rs2.getString("Address")+"',"+rs2.getInt("Age")+","+rs2.getInt("TotalAmount")+","+rs2.getInt("ProfitEarned")+","+rs2.getInt("Cash")+","+rs2.getInt("Online")+",'"+rs2.getString("Date")+"','"+rs2.getString("Time")+"','"+rs2.getString("Payment_Method")+"','"+rs2.getString("Customer_Category")+"')");                                                                                                                                  
                    break;
                }
                System.out.println(code);
                System.out.println(tablename);
                ResultSet rs3=st.executeQuery("select * from customerpurchases where BillNo="+BillNo+"");
                while(rs3.next())
                {
                    st.executeUpdate("insert into deletedcustomerpurchases values("+rs3.getInt("BillNo")+",'"+rs3.getString("Code")+"','"+rs3.getString("Size")+"','"+rs3.getString("TableName")+"','"+rs3.getString("Quantity")+"','"+rs3.getString("MRP")+"')");
                    break;
                }
                st.executeUpdate("delete from Customerinfo where BillNo="+BillNo+"");
                CustomerDeletedSuccessfully c=new CustomerDeletedSuccessfully();
                c.setVisible(true);
                this.dispose();
            }
            catch(Exception e)
            {
          
            }
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
            java.util.logging.Logger.getLogger(CustomerDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDeleteVerification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int a=0;
                new CustomerDeleteVerification(a).setVisible(true);
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