/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmr.garments;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class EmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public EmployeeFrame(String contact) {
        initComponents(); 
        setExtendedState(this.MAXIMIZED_BOTH); 
        menu.setVisible(false);
        createConnection();
        pfcontact=contact;
    }
    public void createConnection()
    {
        try
            {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GarmentsShop","root","root");
            }
        catch(Exception e)
        {
            
        }
    }
    public void getClearAddEmployeeDetails()
    {
        tf31.setText("");
        tf32.setText("");
        tf33.setText("");
        tf34.setText("");
        tf35.setText("");
        jc1.setDate(null);
        jc2.setDate(null);
        gender1.setSelectedIndex(0);
        tf36.setText("");
        tf38.setText("");
        tf39.setText("");
        tf41.setText("");
        tf42.setText("");
    }
    public void getClearEmployeeModificationDetails()
    {
        tf14.setText("");  
        tf15.setText("");  
        tf16.setText("");  
        tf17.setText("");  
        tf18.setText("");  
        jc3.setDate(null);  
        gender2.setSelectedIndex(0);
        tf21.setText("");  
        tf22.setText("");  
        tf23.setText("");  
        jc4.setDate(null) ;
        tf25.setText("");  
        tf26.setText("");  
        
    }
    public void getClearIconBorder()
    {
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        retaillogo.setBorder(b);
        wholesalelogo.setBorder(b);
        customerlogo.setBorder(b);
        stocklogo.setBorder(b);
        employeelogo.setBorder(b);
        balancelogo.setBorder(b);
    }
    public void getClearPanelBorder()
    {
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p1.setBorder(b);
        p2.setBorder(b);
        p3.setBorder(b);
        p4.setBorder(b);
        p5.setBorder(b);
        p6.setBorder(b);
    }
    public void getClearEmployeeDetails()
    {
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf6.setText("");
        tf7.setText("");
        tf8.setText("");
        tf9.setText("");
        tf10.setText("");
        tf11.setText("");
        tf12.setText("");
        tf13.setText("");
        
    }
    public void openMenu()
    {
        Thread th=new Thread(){
            @Override
            public void run(){
                Toggle.setVisible(false);
                menu.setVisible(true);
                try{
                    for(int i=0;i<305;i++)
                    {
                        Thread.sleep(1);
                        menu.setSize(i,768);
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
            }
        };th.start();
    }
    
    public void closeMenu()
    {
        Thread th=new Thread(){
            @Override
            public void run(){
                try{
                    for(int i=305;i>=0;i--)
                    {
                        Thread.sleep(1);
                        menu.setSize(i,768);
                    }
                Toggle.setVisible(true);
                menu.setVisible(false);
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
            }
        };th.start();
        p1.setBackground(new Color(187,120,52,255));
        p2.setBackground(new Color(187,120,52,255));
        p3.setBackground(new Color(187,120,52,255));
        p4.setBackground(new Color(187,120,52,255));
        p5.setBackground(new Color(187,120,52,255));
        p6.setBackground(new Color(187,120,52,255));  
    }
    public void getClear()
    {
        p1.setBackground(new Color(187,120,52,255));
        p2.setBackground(new Color(187,120,52,255));
        p3.setBackground(new Color(187,120,52,255));
        p4.setBackground(new Color(187,120,52,255));
        p5.setBackground(new Color(187,120,52,255));
        p6.setBackground(new Color(187,120,52,255));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IconBar = new javax.swing.JPanel();
        Toggle = new javax.swing.JLabel();
        retaillogo = new javax.swing.JLabel();
        wholesalelogo = new javax.swing.JLabel();
        customerlogo = new javax.swing.JLabel();
        employeelogo = new javax.swing.JLabel();
        balancelogo = new javax.swing.JLabel();
        stocklogo = new javax.swing.JLabel();
        profilelogo = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        l4 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        l5 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        l6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        l7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        retailpanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        tf14 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf15 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tf16 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        tf17 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        tf18 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        tf21 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tf22 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        tf23 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tf25 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        tf26 = new javax.swing.JTextField();
        jc3 = new com.toedter.calendar.JDateChooser();
        jc4 = new com.toedter.calendar.JDateChooser();
        banaddpanel2 = new javax.swing.JPanel();
        add4 = new javax.swing.JLabel();
        gender2 = new javax.swing.JComboBox<>();
        retailpanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        tf32 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf31 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf33 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf34 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf35 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tf38 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tf39 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf41 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf42 = new javax.swing.JTextField();
        gender1 = new javax.swing.JComboBox<>();
        banaddpanel1 = new javax.swing.JPanel();
        add3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jc1 = new com.toedter.calendar.JDateChooser();
        tf36 = new javax.swing.JTextField();
        jc2 = new com.toedter.calendar.JDateChooser();
        retailpanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf11 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf12 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        tf13 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconBar.setBackground(new java.awt.Color(187, 120, 52));
        IconBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Toggle.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Toggle.png")); // NOI18N
        Toggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Toggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToggleMouseClicked(evt);
            }
        });
        IconBar.add(Toggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 30, 40, 40));

        retaillogo.setBackground(new java.awt.Color(102, 102, 102));
        retaillogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        retaillogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Retail.png")); // NOI18N
        retaillogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retaillogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retaillogoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retaillogoMouseEntered(evt);
            }
        });
        IconBar.add(retaillogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, 47));

        wholesalelogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wholesalelogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Wholesale.png")); // NOI18N
        wholesalelogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wholesalelogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wholesalelogoMouseClicked(evt);
            }
        });
        IconBar.add(wholesalelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, 47));

        customerlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerlogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Customer Management.png")); // NOI18N
        customerlogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerlogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerlogoMouseClicked(evt);
            }
        });
        IconBar.add(customerlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 47));

        employeelogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeelogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Employee Management.png")); // NOI18N
        employeelogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeelogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeelogoMouseClicked(evt);
            }
        });
        IconBar.add(employeelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 50, 50));

        balancelogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balancelogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Balance Analysis.png")); // NOI18N
        balancelogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        balancelogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balancelogoMouseClicked(evt);
            }
        });
        IconBar.add(balancelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 50, 47));

        stocklogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stocklogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Stock Management.png")); // NOI18N
        stocklogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stocklogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocklogoMouseClicked(evt);
            }
        });
        IconBar.add(stocklogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 47));

        profilelogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilelogo.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\profile.png")); // NOI18N
        profilelogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilelogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilelogoMouseClicked(evt);
            }
        });
        IconBar.add(profilelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 50, 47));

        getContentPane().add(IconBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 768));

        menu.setBackground(new java.awt.Color(187, 120, 52));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMouseExited(evt);
            }
        });
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(187, 120, 52));
        p1.setForeground(new java.awt.Color(204, 204, 204));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setBackground(new java.awt.Color(67, 48, 44));
        l1.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l1.setText("Retail");
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
        });
        p1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 47));

        menu.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 47));

        p2.setBackground(new java.awt.Color(187, 120, 52));
        p2.setForeground(new java.awt.Color(204, 204, 204));
        p2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l2.setBackground(new java.awt.Color(204, 204, 204));
        l2.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l2.setText("Wholesale");
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
        });
        p2.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 47));

        menu.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, 47));

        p3.setBackground(new java.awt.Color(187, 120, 52));
        p3.setForeground(new java.awt.Color(204, 204, 204));
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l3.setBackground(new java.awt.Color(204, 204, 204));
        l3.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l3.setText("Customer Management");
        l3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l3MouseExited(evt);
            }
        });
        p3.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 47));

        menu.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, 47));

        p4.setBackground(new java.awt.Color(187, 120, 52));
        p4.setForeground(new java.awt.Color(204, 204, 204));
        p4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l4.setBackground(new java.awt.Color(204, 204, 204));
        l4.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l4.setText("Employee Management");
        l4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l4MouseExited(evt);
            }
        });
        p4.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 47));

        menu.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 280, 47));

        p5.setBackground(new java.awt.Color(187, 120, 52));
        p5.setForeground(new java.awt.Color(204, 204, 204));
        p5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l5.setBackground(new java.awt.Color(204, 204, 204));
        l5.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l5.setText("Stock Management");
        l5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l5MouseExited(evt);
            }
        });
        p5.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 47));

        menu.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 280, 47));

        p6.setBackground(new java.awt.Color(187, 120, 52));
        p6.setForeground(new java.awt.Color(204, 204, 204));
        p6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l6.setBackground(new java.awt.Color(204, 204, 204));
        l6.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l6.setText("Balance Analysis");
        l6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l6MouseExited(evt);
            }
        });
        p6.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 47));

        menu.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 280, 47));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Cross.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 30, 40));

        p7.setBackground(new java.awt.Color(187, 120, 52));
        p7.setForeground(new java.awt.Color(204, 204, 204));
        p7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l7.setBackground(new java.awt.Color(204, 204, 204));
        l7.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        l7.setText("User Profile");
        l7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l7MouseExited(evt);
            }
        });
        p7.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 47));

        menu.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 280, 47));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Webp.net-resizeimage.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 130, 50));

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 305, 768));

        retailpanel5.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel5.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Employee Details Modification");
        retailpanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Emp ID");
        retailpanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        tf14.setBackground(new java.awt.Color(249, 215, 184));
        tf14.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf14FocusGained(evt);
            }
        });
        tf14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf14ActionPerformed(evt);
            }
        });
        tf14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf14KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf14KeyReleased(evt);
            }
        });
        retailpanel5.add(tf14, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 70, 180, 30));

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Name");
        retailpanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        tf15.setBackground(new java.awt.Color(249, 215, 184));
        tf15.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf15FocusGained(evt);
            }
        });
        tf15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf15ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf15, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 120, 180, 30));

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Mobile");
        retailpanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        tf16.setBackground(new java.awt.Color(249, 215, 184));
        tf16.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf16FocusGained(evt);
            }
        });
        tf16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf16ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf16, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 170, 180, 30));

        jLabel40.setBackground(new java.awt.Color(204, 204, 204));
        jLabel40.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Address");
        retailpanel5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        tf17.setBackground(new java.awt.Color(249, 215, 184));
        tf17.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf17.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf17FocusGained(evt);
            }
        });
        tf17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf17ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf17, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 220, 180, 30));

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Age");
        retailpanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 30));

        tf18.setBackground(new java.awt.Color(249, 215, 184));
        tf18.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf18.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf18FocusGained(evt);
            }
        });
        tf18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf18ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf18, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 270, 180, 30));

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("D.O.B");
        retailpanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, 30));

        jLabel43.setBackground(new java.awt.Color(204, 204, 204));
        jLabel43.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("Gender");
        retailpanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        jLabel44.setBackground(new java.awt.Color(204, 204, 204));
        jLabel44.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Salary");
        retailpanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 30));

        tf21.setBackground(new java.awt.Color(249, 215, 184));
        tf21.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf21.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf21FocusGained(evt);
            }
        });
        tf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf21ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf21, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 420, 180, 30));

        jLabel45.setBackground(new java.awt.Color(204, 204, 204));
        jLabel45.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Aadhar No.");
        retailpanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 30));

        tf22.setBackground(new java.awt.Color(249, 215, 184));
        tf22.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf22.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf22FocusGained(evt);
            }
        });
        tf22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf22ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf22, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 470, 180, 30));

        jLabel46.setBackground(new java.awt.Color(204, 204, 204));
        jLabel46.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Designation");
        retailpanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 130, 30));

        tf23.setBackground(new java.awt.Color(249, 215, 184));
        tf23.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf23.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf23FocusGained(evt);
            }
        });
        tf23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf23ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf23, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 520, 180, 30));

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Joining Date");
        retailpanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 150, 30));

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Father's Name");
        retailpanel5.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 150, 30));

        tf25.setBackground(new java.awt.Color(249, 215, 184));
        tf25.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf25.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf25FocusGained(evt);
            }
        });
        tf25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf25ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf25, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 620, 180, 30));

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(204, 204, 204));
        jLabel49.setText("Father's Mobile");
        retailpanel5.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 170, 30));

        tf26.setBackground(new java.awt.Color(249, 215, 184));
        tf26.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf26.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf26FocusGained(evt);
            }
        });
        tf26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf26ActionPerformed(evt);
            }
        });
        retailpanel5.add(tf26, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 670, 180, 30));

        jc3.setBackground(new java.awt.Color(249, 215, 184));
        jc3.setDateFormatString("YYYY-MM-dd");
        retailpanel5.add(jc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 320, 180, 30));

        jc4.setBackground(new java.awt.Color(249, 215, 184));
        jc4.setDateFormatString("YYYY-MM-dd");
        retailpanel5.add(jc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 570, 180, 30));

        banaddpanel2.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel2.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add4.setBackground(new java.awt.Color(255, 255, 255));
        add4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add4.setText("Update");
        add4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add4MouseReleased(evt);
            }
        });
        add4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add4KeyPressed(evt);
            }
        });
        banaddpanel2.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 25));

        retailpanel5.add(banaddpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 713, 80, 25));

        gender2.setBackground(new java.awt.Color(249, 215, 184));
        gender2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        gender2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        gender2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        gender2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gender2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gender2ItemStateChanged(evt);
            }
        });
        gender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender2ActionPerformed(evt);
            }
        });
        retailpanel5.add(gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 370, 180, 30));

        getContentPane().add(retailpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 10, 405, 750));

        retailpanel6.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel6.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Add Employee");
        retailpanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        tf32.setBackground(new java.awt.Color(249, 215, 184));
        tf32.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf32.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf32.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf32FocusGained(evt);
            }
        });
        tf32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf32ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf32, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 120, 180, 30));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Emp ID");
        retailpanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Name");
        retailpanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        tf31.setEditable(false);
        tf31.setBackground(new java.awt.Color(249, 215, 184));
        tf31.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf31.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf31.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf31FocusGained(evt);
            }
        });
        tf31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf31ActionPerformed(evt);
            }
        });
        tf31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf31KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf31KeyReleased(evt);
            }
        });
        retailpanel6.add(tf31, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 70, 180, 30));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Mobile");
        retailpanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        tf33.setBackground(new java.awt.Color(249, 215, 184));
        tf33.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf33.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf33FocusGained(evt);
            }
        });
        tf33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf33ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf33, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 170, 180, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Address");
        retailpanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        tf34.setBackground(new java.awt.Color(249, 215, 184));
        tf34.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf34.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf34.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf34FocusGained(evt);
            }
        });
        tf34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf34ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf34, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 220, 180, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Age");
        retailpanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 30));

        tf35.setBackground(new java.awt.Color(249, 215, 184));
        tf35.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf35.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf35.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf35FocusGained(evt);
            }
        });
        tf35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf35ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf35, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 270, 180, 30));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Gender");
        retailpanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Salary");
        retailpanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 30));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Aadhar No.");
        retailpanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 30));

        tf38.setBackground(new java.awt.Color(249, 215, 184));
        tf38.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf38.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf38.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf38FocusGained(evt);
            }
        });
        tf38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf38ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf38, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 470, 180, 30));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Designation");
        retailpanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 130, 30));

        tf39.setBackground(new java.awt.Color(249, 215, 184));
        tf39.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf39.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf39.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf39FocusGained(evt);
            }
        });
        tf39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf39ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf39, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 520, 180, 30));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Joining Date");
        retailpanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 150, 30));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Father's Name");
        retailpanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 150, 30));

        tf41.setBackground(new java.awt.Color(249, 215, 184));
        tf41.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf41.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf41.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf41FocusGained(evt);
            }
        });
        tf41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf41ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf41, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 620, 180, 30));

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Father's Mobile");
        retailpanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 170, 30));

        tf42.setBackground(new java.awt.Color(249, 215, 184));
        tf42.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf42.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf42.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf42FocusGained(evt);
            }
        });
        tf42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf42ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf42, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 670, 180, 30));

        gender1.setBackground(new java.awt.Color(249, 215, 184));
        gender1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        gender1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        gender1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gender1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gender1ItemStateChanged(evt);
            }
        });
        gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender1ActionPerformed(evt);
            }
        });
        retailpanel6.add(gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 370, 180, 30));

        banaddpanel1.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel1.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add3.setBackground(new java.awt.Color(255, 255, 255));
        add3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add3.setText("Add");
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add3MouseReleased(evt);
            }
        });
        add3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add3KeyPressed(evt);
            }
        });
        banaddpanel1.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 25));

        retailpanel6.add(banaddpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 713, 80, 25));

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("D.O.B");
        retailpanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, 30));

        jc1.setBackground(new java.awt.Color(249, 215, 184));
        jc1.setDateFormatString("YYYY-MM-dd");
        retailpanel6.add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 320, 180, 30));

        tf36.setBackground(new java.awt.Color(249, 215, 184));
        tf36.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf36.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf36.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf36FocusGained(evt);
            }
        });
        tf36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf36ActionPerformed(evt);
            }
        });
        retailpanel6.add(tf36, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 420, 180, 30));

        jc2.setBackground(new java.awt.Color(249, 215, 184));
        jc2.setDateFormatString("YYYY-MM-dd");
        retailpanel6.add(jc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 570, 180, 30));

        getContentPane().add(retailpanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 10, 410, 750));

        retailpanel4.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Employee Details");
        retailpanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Emp ID");
        retailpanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Name");
        retailpanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Mobile");
        retailpanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Address");
        retailpanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Age");
        retailpanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 30));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Gender");
        retailpanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Aadhar No.");
        retailpanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Designation");
        retailpanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 130, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Joining Date");
        retailpanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 150, 30));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Salary");
        retailpanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 30));

        tf1.setBackground(new java.awt.Color(249, 215, 184));
        tf1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
        });
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf1KeyReleased(evt);
            }
        });
        retailpanel4.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 70, 180, 30));

        tf2.setEditable(false);
        tf2.setBackground(new java.awt.Color(249, 215, 184));
        tf2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
        });
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 120, 180, 30));

        tf3.setEditable(false);
        tf3.setBackground(new java.awt.Color(249, 215, 184));
        tf3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf3FocusGained(evt);
            }
        });
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 170, 180, 30));

        tf4.setEditable(false);
        tf4.setBackground(new java.awt.Color(249, 215, 184));
        tf4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf4FocusGained(evt);
            }
        });
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 220, 180, 30));

        tf5.setEditable(false);
        tf5.setBackground(new java.awt.Color(249, 215, 184));
        tf5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf5FocusGained(evt);
            }
        });
        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 270, 180, 30));

        tf8.setEditable(false);
        tf8.setBackground(new java.awt.Color(249, 215, 184));
        tf8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf8FocusGained(evt);
            }
        });
        tf8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf8ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 470, 180, 30));

        tf9.setEditable(false);
        tf9.setBackground(new java.awt.Color(249, 215, 184));
        tf9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf9FocusGained(evt);
            }
        });
        tf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf9ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 520, 180, 30));

        tf10.setEditable(false);
        tf10.setBackground(new java.awt.Color(249, 215, 184));
        tf10.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf10FocusGained(evt);
            }
        });
        tf10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf10ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 570, 180, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Father's Name");
        retailpanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 150, 30));

        tf11.setEditable(false);
        tf11.setBackground(new java.awt.Color(249, 215, 184));
        tf11.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf11FocusGained(evt);
            }
        });
        tf11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf11ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 620, 180, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Father's Mobile");
        retailpanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 170, 30));

        tf12.setEditable(false);
        tf12.setBackground(new java.awt.Color(249, 215, 184));
        tf12.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf12FocusGained(evt);
            }
        });
        tf12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf12ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 670, 180, 30));

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("D.O.B");
        retailpanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, 30));

        tf6.setEditable(false);
        tf6.setBackground(new java.awt.Color(249, 215, 184));
        tf6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf6FocusGained(evt);
            }
        });
        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 320, 180, 30));

        tf13.setEditable(false);
        tf13.setBackground(new java.awt.Color(249, 215, 184));
        tf13.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf13FocusGained(evt);
            }
        });
        tf13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf13ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf13, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 420, 180, 30));

        tf7.setEditable(false);
        tf7.setBackground(new java.awt.Color(249, 215, 184));
        tf7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf7FocusGained(evt);
            }
        });
        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });
        retailpanel4.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 370, 180, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Show Details in Table Format");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        retailpanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 710, -1, -1));

        getContentPane().add(retailpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 10, 410, 750));

        bgimage.setBackground(new java.awt.Color(0, 0, 0,170));
        bgimage.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\ForgetPasswordBackground.png")); // NOI18N
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection con;
String pfcontact="";
    private void ToggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToggleMouseClicked
        openMenu();
    }//GEN-LAST:event_ToggleMouseClicked

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        getClear();
        p1.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p1.setBorder(b);
    }//GEN-LAST:event_l1MouseEntered

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        getClear();
        p2.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p2.setBorder(b);
    }//GEN-LAST:event_l2MouseEntered

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        getClear();
        p3.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p3.setBorder(b);
    }//GEN-LAST:event_l3MouseEntered

    private void l4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseEntered
        getClear();
        p4.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p4.setBorder(b);
    }//GEN-LAST:event_l4MouseEntered

    private void l5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseEntered
        getClear();
        p5.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p5.setBorder(b);
    }//GEN-LAST:event_l5MouseEntered

    private void l6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseEntered
        getClear();
        p6.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p6.setBorder(b);
    }//GEN-LAST:event_l6MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        p1.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p1.setBorder(b);
    }//GEN-LAST:event_l1MouseExited

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
        p2.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p2.setBorder(b);
    }//GEN-LAST:event_l2MouseExited

    private void l3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseExited
        p3.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p3.setBorder(b);
    }//GEN-LAST:event_l3MouseExited

    private void l4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseExited
        p4.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p4.setBorder(b);
    }//GEN-LAST:event_l4MouseExited

    private void l5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseExited
        p5.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p5.setBorder(b);
    }//GEN-LAST:event_l5MouseExited

    private void l6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseExited
        p6.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p6.setBorder(b);
    }//GEN-LAST:event_l6MouseExited

    private void retaillogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retaillogoMouseClicked

        RetailFrame r=new RetailFrame(pfcontact);
        r.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_retaillogoMouseClicked

    private void wholesalelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wholesalelogoMouseClicked
        WholeSaleFrame w=new WholeSaleFrame(pfcontact);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_wholesalelogoMouseClicked

    private void customerlogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerlogoMouseClicked
        CustomerFrame c=new CustomerFrame(pfcontact);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerlogoMouseClicked

    private void employeelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeelogoMouseClicked
        getClear();
        p4.setBackground(new Color(225,162,81,255));
        EmployeeFrame e=new EmployeeFrame(pfcontact);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_employeelogoMouseClicked

    private void stocklogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocklogoMouseClicked
        StockFrame s=new StockFrame(pfcontact);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stocklogoMouseClicked

    private void balancelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balancelogoMouseClicked
        BalanceFrame b=new BalanceFrame(pfcontact);
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_balancelogoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        closeMenu();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void retaillogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retaillogoMouseEntered
       
    }//GEN-LAST:event_retaillogoMouseEntered

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        EmployeeFrame r=new EmployeeFrame(pfcontact);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l1MouseClicked
int eid=0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        employeelogo.setBorder(b);
        profilelogo.setBorder(null);
        
        try
        {
           Statement st=con.createStatement();
           ResultSet rs1=st.executeQuery("Select max(EID) from EmployeeDetails");
           while(rs1.next())
           {
               eid=rs1.getInt("max(EID)");
           }
           eid++;
        }catch(Exception e)
        {
            System.out.println("Error");
        }
        tf31.setText(""+eid);
    }//GEN-LAST:event_formWindowGainedFocus

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        WholeSaleFrame w=new WholeSaleFrame(pfcontact);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        CustomerFrame c=new CustomerFrame(pfcontact);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        EmployeeFrame e=new EmployeeFrame(pfcontact);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        StockFrame s=new StockFrame(pfcontact);
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        BalanceFrame b=new BalanceFrame(pfcontact);
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l6MouseClicked

    private void menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseExited

    }//GEN-LAST:event_menuMouseExited

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked

    }//GEN-LAST:event_menuMouseClicked

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained

    }//GEN-LAST:event_tf1FocusGained

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed
int employeeid;
    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
String empid=tf1.getText();
    if(empid.equals(""))
    {
        getClearEmployeeDetails();
    }
    else
    {
        employeeid=Integer.parseInt(empid);
        if(employeeid>(eid-1))
        {
            NoEmployeeID n=new NoEmployeeID(employeeid);
            n.setVisible(true);
            tf1.setText("");
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from EmployeeDetails where EID="+employeeid+"");
                while(rs.next())
                {
                    tf2.setText(rs.getString("Name"));
                    tf3.setText(rs.getString("Mobile"));
                    tf4.setText(rs.getString("Address"));
                    tf5.setText(""+rs.getInt("Age"));
                    tf6.setText(rs.getString("D_O_B"));
                    tf7.setText(rs.getString("Gender"));
                    tf13.setText(""+rs.getInt("Salary"));
                    tf8.setText(rs.getString("Aadhar_No"));
                    tf9.setText(rs.getString("Designation"));
                    tf10.setText(rs.getString("Joining_Date"));
                    tf11.setText(rs.getString("Father_Name"));
                    tf12.setText(rs.getString("Father_Mobile"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Not Fetched");
            }
        }
    }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
    String empid=tf1.getText();
    if(empid.equals(""))
    {
        getClearEmployeeDetails();
    }
    else
    {
        employeeid=Integer.parseInt(empid);
        if(employeeid>(eid-1))
        {
            NoEmployeeID n=new NoEmployeeID(employeeid);
            n.setVisible(true);
            tf1.setText("");
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from EmployeeDetails where EID="+employeeid+"");
                while(rs.next())
                {
                    tf2.setText(rs.getString("Name"));
                    tf3.setText(rs.getString("Mobile"));
                    tf4.setText(rs.getString("Address"));
                    tf5.setText(""+rs.getInt("Age"));
                    tf6.setText(rs.getString("D_O_B"));
                    tf7.setText(rs.getString("Gender"));
                    tf13.setText(""+rs.getInt("Salary"));
                    tf8.setText(rs.getString("Aadhar_No"));
                    tf9.setText(rs.getString("Designation"));
                    tf10.setText(rs.getString("Joining_Date"));
                    tf11.setText(rs.getString("Father_Name"));
                    tf12.setText(rs.getString("Father_Mobile"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Not Fetched");
            }
        }
    }
    }//GEN-LAST:event_tf1KeyReleased

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained

    }//GEN-LAST:event_tf2FocusGained

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3FocusGained

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4FocusGained

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void tf5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5FocusGained

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void tf8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8FocusGained

    private void tf8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf8ActionPerformed

    private void tf9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9FocusGained

    private void tf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9ActionPerformed

    private void tf10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf10FocusGained

    private void tf10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf10ActionPerformed

    private void tf11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf11FocusGained

    private void tf11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf11ActionPerformed

    private void tf12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf12FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf12FocusGained

    private void tf12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf12ActionPerformed

    private void tf32FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf32FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf32FocusGained

    private void tf32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf32ActionPerformed

    private void tf31FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf31FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf31FocusGained

    private void tf31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf31ActionPerformed

    private void tf31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf31KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf31KeyPressed

    private void tf31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf31KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tf31KeyReleased

    private void tf33FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf33FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf33FocusGained

    private void tf33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf33ActionPerformed

    private void tf34FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf34FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf34FocusGained

    private void tf34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf34ActionPerformed

    private void tf35FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf35FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf35FocusGained

    private void tf35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf35ActionPerformed

    private void tf38FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf38FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf38FocusGained

    private void tf38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf38ActionPerformed

    private void tf39FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf39FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf39FocusGained

    private void tf39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf39ActionPerformed

    private void tf41FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf41FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf41FocusGained

    private void tf41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf41ActionPerformed

    private void tf42FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf42FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf42FocusGained

    private void tf42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf42ActionPerformed

    private void gender1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gender1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_gender1ItemStateChanged

    private void gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender1ActionPerformed

    private void add3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add3AncestorAdded

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        String name=tf32.getText();
        String mobile=tf33.getText();
        String address=tf34.getText();
        int age=Integer.parseInt(tf35.getText());
        String dob=((JTextField)jc1.getDateEditor().getUiComponent()).getText();
        String gender=gender1.getSelectedItem().toString();
        int salary=Integer.parseInt(tf36.getText());
        String aadharno=tf38.getText();
        String designation=tf39.getText();
        String joindate=((JTextField)jc2.getDateEditor().getUiComponent()).getText();
        String fname=tf41.getText();
        String fmobile=tf42.getText();
        
        if(gender.equals("Select Gender"))
        {
            SelectGender s=new SelectGender();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                st.executeUpdate("insert into EmployeeDetails values("+eid+",'"+name+"','"+mobile+"','"+address+"',"+age+",'"+gender+"',"+salary+",'"+aadharno+"','"+designation+"','"+joindate+"','"+fname+"','"+fmobile+"','"+dob+"')");
                st.executeUpdate("insert into login values('"+name+"','"+mobile+"','"+mobile+"','"+name+"',0)");
                getClearAddEmployeeDetails();
                tf31.setText(""+eid);
                EmployeeAddedSuccess e=new EmployeeAddedSuccess();
                e.setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_add3MouseClicked

    private void add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add3MouseEntered

    private void add3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add3MousePressed

    private void add3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add3MouseReleased

    private void add3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add3KeyPressed

    private void tf6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6FocusGained

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void tf13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf13FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf13FocusGained

    private void tf13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf13ActionPerformed

    private void tf36FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf36FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf36FocusGained

    private void tf36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf36ActionPerformed

    private void tf7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7FocusGained

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf7ActionPerformed

    private void tf14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf14FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf14FocusGained

    private void tf14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf14ActionPerformed

    private void tf14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf14KeyPressed
    String empid=tf14.getText();
    if(empid.equals(""))
    {
        getClearEmployeeModificationDetails();
    }
    else
    {
        employeeid=Integer.parseInt(empid);
        if(employeeid>(eid-1))
        {
            NoEmployeeID n=new NoEmployeeID(employeeid);
            n.setVisible(true);
            tf14.setText("");
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from EmployeeDetails where EID="+employeeid+"");
                while(rs.next())
                {
                    tf15.setText(rs.getString("Name"));
                    tf16.setText(rs.getString("Mobile"));
                    tf17.setText(rs.getString("Address"));
                    tf18.setText(""+rs.getInt("Age"));
                    Date d=new SimpleDateFormat("yyyy-MM-dd").parse((String)rs.getString("D_O_B"));
                    jc3.setDate(d);
                    String gender=rs.getString("Gender");
                    if(gender.equals("Male"))
                    {
                        gender2.setSelectedIndex(1);
                    }
                    else
                    {
                        gender2.setSelectedIndex(2);
                    }
                    tf21.setText(""+rs.getInt("Salary"));
                    tf22.setText(rs.getString("Aadhar_No"));
                    tf23.setText(rs.getString("Designation"));
                    Date d1=new SimpleDateFormat("yyyy-MM-dd").parse((String)rs.getString("Joining_Date"));
                    jc4.setDate(d1);
                    tf25.setText(rs.getString("Father_Name"));
                    tf26.setText(rs.getString("Father_Mobile"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Not Fetched");
            }
        }   
    }
    }//GEN-LAST:event_tf14KeyPressed

    private void tf14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf14KeyReleased
    String empid=tf14.getText();
    if(empid.equals(""))
    {
        getClearEmployeeModificationDetails();
    }
    else
    {
        employeeid=Integer.parseInt(empid);
        if(employeeid>(eid-1))
        {
            NoEmployeeID n=new NoEmployeeID(employeeid);
            n.setVisible(true);
            tf14.setText("");
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from EmployeeDetails where EID="+employeeid+"");
                while(rs.next())
                {
                    tf15.setText(rs.getString("Name"));
                    tf16.setText(rs.getString("Mobile"));
                    tf17.setText(rs.getString("Address"));
                    tf18.setText(""+rs.getInt("Age"));
                    Date d=new SimpleDateFormat("yyyy-MM-dd").parse((String)rs.getString("D_O_B"));
                    jc3.setDate(d);
                    String gender=rs.getString("Gender");
                    if(gender.equals("Male"))
                    {
                        gender2.setSelectedIndex(1);
                    }
                    else
                    {
                        gender2.setSelectedIndex(2);
                    }
                    tf21.setText(""+rs.getInt("Salary"));
                    tf22.setText(rs.getString("Aadhar_No"));
                    tf23.setText(rs.getString("Designation"));
                    Date d1=new SimpleDateFormat("yyyy-MM-dd").parse((String)rs.getString("Joining_Date"));
                    jc4.setDate(d1);
                    tf25.setText(rs.getString("Father_Name"));
                    tf26.setText(rs.getString("Father_Mobile"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Not Fetched");
            }
        }   
    }
    }//GEN-LAST:event_tf14KeyReleased

    private void tf15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf15FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf15FocusGained

    private void tf15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf15ActionPerformed

    private void tf16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf16FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf16FocusGained

    private void tf16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf16ActionPerformed

    private void tf17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf17FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf17FocusGained

    private void tf17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf17ActionPerformed

    private void tf18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf18FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf18FocusGained

    private void tf18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf18ActionPerformed

    private void tf21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf21FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21FocusGained

    private void tf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21ActionPerformed

    private void tf22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf22FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf22FocusGained

    private void tf22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf22ActionPerformed

    private void tf23FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf23FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf23FocusGained

    private void tf23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf23ActionPerformed

    private void tf25FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf25FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf25FocusGained

    private void tf25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf25ActionPerformed

    private void tf26FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf26FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf26FocusGained

    private void tf26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf26ActionPerformed

    private void add4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add4AncestorAdded

    private void add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseClicked
        String name=tf15.getText();
        String mobile=tf16.getText();
        String address=tf17.getText();
        int age=Integer.parseInt(tf18.getText());
        String dob=((JTextField)jc3.getDateEditor().getUiComponent()).getText();
        String gender=gender2.getSelectedItem().toString();
        int salary=Integer.parseInt(tf21.getText());
        String aadharno=tf22.getText();
        String designation=tf23.getText();
        String joindate=((JTextField)jc4.getDateEditor().getUiComponent()).getText();
        String fname=tf25.getText();
        String fmobile=tf26.getText();
        if(gender.equals("Select Gender"))
        {
            SelectGender s=new SelectGender();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                st.executeUpdate("update EmployeeDetails set Name='"+name+"',Mobile='"+mobile+"',Address='"+address+"',Age="+age+",Gender='"+gender+"',Salary="+salary+",Aadhar_No='"+aadharno+"',Designation='"+designation+"',Joining_Date='"+joindate+"',Father_Name='"+fname+"',Father_Mobile='"+fmobile+"',D_O_B='"+dob+"' where EID="+employeeid+"");
                getClearEmployeeModificationDetails();
                EmployeeUpdatedSuccess e=new EmployeeUpdatedSuccess();
                e.setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_add4MouseClicked

    private void add4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add4MouseEntered

    private void add4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add4MousePressed

    private void add4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add4MouseReleased

    private void add4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add4KeyPressed

    private void gender2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gender2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_gender2ItemStateChanged

    private void gender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        EmployeeDetailsTableFormat f=new EmployeeDetailsTableFormat(pfcontact);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void profilelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilelogoMouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        employeelogo.setBorder(null);
        ProfilePage b1=new ProfilePage(pfcontact);
        b1.setVisible(true);
    }//GEN-LAST:event_profilelogoMouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        employeelogo.setBorder(null);
        ProfilePage b1=new ProfilePage(pfcontact);
        b1.setVisible(true);
    }//GEN-LAST:event_l7MouseClicked

    private void l7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseEntered
        getClear();
        p7.setBackground(new Color(225,162,81,255));
        getClearPanelBorder();
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        p7.setBorder(b);
    }//GEN-LAST:event_l7MouseEntered

    private void l7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseExited
        p7.setBackground(new Color(187,120,52,255));
        Border b=BorderFactory.createLineBorder(new Color(187,120,52,255), 1);
        p7.setBorder(b);
    }//GEN-LAST:event_l7MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LogoutPage lp=new LogoutPage();
        lp.setVisible(true);
        LogoutSuccess l=new LogoutSuccess();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a="";
                new EmployeeFrame(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IconBar;
    private javax.swing.JLabel Toggle;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JLabel balancelogo;
    private javax.swing.JPanel banaddpanel1;
    private javax.swing.JPanel banaddpanel2;
    private javax.swing.JLabel bgimage;
    private javax.swing.JLabel customerlogo;
    private javax.swing.JLabel employeelogo;
    private javax.swing.JComboBox<String> gender1;
    private javax.swing.JComboBox<String> gender2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jc1;
    private com.toedter.calendar.JDateChooser jc2;
    private com.toedter.calendar.JDateChooser jc3;
    private com.toedter.calendar.JDateChooser jc4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JLabel profilelogo;
    private javax.swing.JLabel retaillogo;
    private javax.swing.JPanel retailpanel4;
    private javax.swing.JPanel retailpanel5;
    private javax.swing.JPanel retailpanel6;
    private javax.swing.JLabel stocklogo;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf14;
    private javax.swing.JTextField tf15;
    private javax.swing.JTextField tf16;
    private javax.swing.JTextField tf17;
    private javax.swing.JTextField tf18;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf22;
    private javax.swing.JTextField tf23;
    private javax.swing.JTextField tf25;
    private javax.swing.JTextField tf26;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf31;
    private javax.swing.JTextField tf32;
    private javax.swing.JTextField tf33;
    private javax.swing.JTextField tf34;
    private javax.swing.JTextField tf35;
    private javax.swing.JTextField tf36;
    private javax.swing.JTextField tf38;
    private javax.swing.JTextField tf39;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf41;
    private javax.swing.JTextField tf42;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JLabel wholesalelogo;
    // End of variables declaration//GEN-END:variables
}
