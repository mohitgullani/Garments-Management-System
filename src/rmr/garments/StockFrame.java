/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmr.garments;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class StockFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public StockFrame(String contact) {
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
            con.setAutoCommit(false);
            }
        catch(Exception e)
        {
            
        }
    }
    public void showDate()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        cdate=s.format(d);
    }
    public void getCode()
    {
            code2.removeAllItems();
            code2.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select code from "+utablename+"");
            while(rs.next())
            {
                code2.addItem(rs.getString("code"));
            }
            }catch(Exception e){
            }
    }
    public void getRemoveCode()
    {
            code3.removeAllItems();
            code3.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select code from "+rtablename+"");
            while(rs.next())
            {
                code3.addItem(rs.getString("code"));
            }
            }catch(Exception e){
            }
    }
    public void removeCode()
    {
            code4.removeAllItems();
            code4.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select code from "+dtablename+"");
            while(rs.next())
            {
                code4.addItem(rs.getString("code"));
            }
            }catch(Exception e){
            }
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
        jLabel10 = new javax.swing.JLabel();
        aitem1 = new javax.swing.JComboBox<>();
        asize1 = new javax.swing.JComboBox<>();
        aqty1 = new javax.swing.JTextField();
        aitem2 = new javax.swing.JComboBox<>();
        asize2 = new javax.swing.JComboBox<>();
        aqty2 = new javax.swing.JTextField();
        aitem3 = new javax.swing.JComboBox<>();
        asize3 = new javax.swing.JComboBox<>();
        aqty3 = new javax.swing.JTextField();
        aitem6 = new javax.swing.JComboBox<>();
        asize6 = new javax.swing.JComboBox<>();
        aqty6 = new javax.swing.JTextField();
        aitem7 = new javax.swing.JComboBox<>();
        asize7 = new javax.swing.JComboBox<>();
        aqty7 = new javax.swing.JTextField();
        aitem8 = new javax.swing.JComboBox<>();
        asize8 = new javax.swing.JComboBox<>();
        aqty8 = new javax.swing.JTextField();
        aitem10 = new javax.swing.JComboBox<>();
        aqty10 = new javax.swing.JTextField();
        aitem9 = new javax.swing.JComboBox<>();
        asize9 = new javax.swing.JComboBox<>();
        aqty9 = new javax.swing.JTextField();
        asize4 = new javax.swing.JComboBox<>();
        aqty4 = new javax.swing.JTextField();
        aitem4 = new javax.swing.JComboBox<>();
        aqty5 = new javax.swing.JTextField();
        asize5 = new javax.swing.JComboBox<>();
        aitem5 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        item4 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        code4 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        cp4 = new javax.swing.JTextField();
        banaddpanel4 = new javax.swing.JPanel();
        add6 = new javax.swing.JLabel();
        retailpanel6 = new javax.swing.JPanel();
        item3 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        size3 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        banaddpanel3 = new javax.swing.JPanel();
        add5 = new javax.swing.JLabel();
        code3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        dqty3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        uqty3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jc2 = new com.toedter.calendar.JDateChooser();
        retailpanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        item1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        code1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mrp1 = new javax.swing.JTextField();
        cp1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        banaddpanel1 = new javax.swing.JPanel();
        add3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        item2 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        code2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        dqty2 = new javax.swing.JTextField();
        uqty2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mrp2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cp2 = new javax.swing.JTextField();
        banaddpanel2 = new javax.swing.JPanel();
        add4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        size1 = new javax.swing.JComboBox<>();
        jc1 = new com.toedter.calendar.JDateChooser();
        jLabel34 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        loc1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
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

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Available Products");
        retailpanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        aitem1.setBackground(new java.awt.Color(249, 215, 184));
        aitem1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jeans" }));
        aitem1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem1ItemStateChanged(evt);
            }
        });
        aitem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem1ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, -1));

        asize1.setBackground(new java.awt.Color(249, 215, 184));
        asize1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize1ItemStateChanged(evt);
            }
        });
        asize1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize1ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 80, -1));

        aqty1.setEditable(false);
        aqty1.setBackground(new java.awt.Color(249, 215, 184));
        aqty1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty1FocusGained(evt);
            }
        });
        aqty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty1ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 60, 30));

        aitem2.setBackground(new java.awt.Color(249, 215, 184));
        aitem2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trouser" }));
        aitem2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem2ItemStateChanged(evt);
            }
        });
        aitem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem2ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, 170, -1));

        asize2.setBackground(new java.awt.Color(249, 215, 184));
        asize2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize2ItemStateChanged(evt);
            }
        });
        asize2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize2ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 115, 80, -1));

        aqty2.setEditable(false);
        aqty2.setBackground(new java.awt.Color(249, 215, 184));
        aqty2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty2FocusGained(evt);
            }
        });
        aqty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty2ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 115, 60, 30));

        aitem3.setBackground(new java.awt.Color(249, 215, 184));
        aitem3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Half Sleeve Shirts" }));
        aitem3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem3ItemStateChanged(evt);
            }
        });
        aitem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem3ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, -1));

        asize3.setBackground(new java.awt.Color(249, 215, 184));
        asize3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize3ItemStateChanged(evt);
            }
        });
        asize3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize3ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 80, -1));

        aqty3.setEditable(false);
        aqty3.setBackground(new java.awt.Color(249, 215, 184));
        aqty3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty3FocusGained(evt);
            }
        });
        aqty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty3ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 60, 30));

        aitem6.setBackground(new java.awt.Color(249, 215, 184));
        aitem6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full T-Shirts" }));
        aitem6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem6ItemStateChanged(evt);
            }
        });
        aitem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem6ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 170, -1));

        asize6.setBackground(new java.awt.Color(249, 215, 184));
        asize6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize6ItemStateChanged(evt);
            }
        });
        asize6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize6ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 80, -1));

        aqty6.setEditable(false);
        aqty6.setBackground(new java.awt.Color(249, 215, 184));
        aqty6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty6FocusGained(evt);
            }
        });
        aqty6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty6ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 295, 60, 30));

        aitem7.setBackground(new java.awt.Color(249, 215, 184));
        aitem7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lowers" }));
        aitem7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem7ItemStateChanged(evt);
            }
        });
        aitem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem7ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 170, -1));

        asize7.setBackground(new java.awt.Color(249, 215, 184));
        asize7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize7ItemStateChanged(evt);
            }
        });
        asize7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize7ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, -1));

        aqty7.setEditable(false);
        aqty7.setBackground(new java.awt.Color(249, 215, 184));
        aqty7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty7FocusGained(evt);
            }
        });
        aqty7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty7ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, 30));

        aitem8.setBackground(new java.awt.Color(249, 215, 184));
        aitem8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Under Garments" }));
        aitem8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem8ItemStateChanged(evt);
            }
        });
        aitem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem8ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 385, 170, -1));

        asize8.setBackground(new java.awt.Color(249, 215, 184));
        asize8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize8ItemStateChanged(evt);
            }
        });
        asize8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize8ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 385, 80, -1));

        aqty8.setEditable(false);
        aqty8.setBackground(new java.awt.Color(249, 215, 184));
        aqty8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty8FocusGained(evt);
            }
        });
        aqty8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty8ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 385, 60, 30));

        aitem10.setBackground(new java.awt.Color(249, 215, 184));
        aitem10.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socks" }));
        aitem10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem10ItemStateChanged(evt);
            }
        });
        aitem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem10ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 475, 270, -1));

        aqty10.setEditable(false);
        aqty10.setBackground(new java.awt.Color(249, 215, 184));
        aqty10.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty10FocusGained(evt);
            }
        });
        aqty10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty10ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 475, 60, 30));

        aitem9.setBackground(new java.awt.Color(249, 215, 184));
        aitem9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seasonal" }));
        aitem9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem9ItemStateChanged(evt);
            }
        });
        aitem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem9ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 170, -1));

        asize9.setBackground(new java.awt.Color(249, 215, 184));
        asize9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize9ItemStateChanged(evt);
            }
        });
        asize9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize9ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 80, -1));

        aqty9.setEditable(false);
        aqty9.setBackground(new java.awt.Color(249, 215, 184));
        aqty9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty9FocusGained(evt);
            }
        });
        aqty9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty9ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 60, 30));

        asize4.setBackground(new java.awt.Color(249, 215, 184));
        asize4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize4ItemStateChanged(evt);
            }
        });
        asize4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize4ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 205, 80, 30));

        aqty4.setEditable(false);
        aqty4.setBackground(new java.awt.Color(249, 215, 184));
        aqty4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty4FocusGained(evt);
            }
        });
        aqty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty4ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 205, 60, 30));

        aitem4.setBackground(new java.awt.Color(249, 215, 184));
        aitem4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full Sleeve Shirts" }));
        aitem4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem4ItemStateChanged(evt);
            }
        });
        aitem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem4ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 170, -1));

        aqty5.setEditable(false);
        aqty5.setBackground(new java.awt.Color(249, 215, 184));
        aqty5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aqty5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        aqty5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aqty5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aqty5FocusGained(evt);
            }
        });
        aqty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aqty5ActionPerformed(evt);
            }
        });
        retailpanel5.add(aqty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 60, 30));

        asize5.setBackground(new java.awt.Color(249, 215, 184));
        asize5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        asize5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        asize5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        asize5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asize5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asize5ItemStateChanged(evt);
            }
        });
        asize5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asize5ActionPerformed(evt);
            }
        });
        retailpanel5.add(asize5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 80, 30));

        aitem5.setBackground(new java.awt.Color(249, 215, 184));
        aitem5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        aitem5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Half T-Shirts" }));
        aitem5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        aitem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aitem5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                aitem5ItemStateChanged(evt);
            }
        });
        aitem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aitem5ActionPerformed(evt);
            }
        });
        retailpanel5.add(aitem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, -1));

        jLabel37.setBackground(new java.awt.Color(204, 204, 204));
        jLabel37.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("Item");
        retailpanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 90, 30));

        item4.setBackground(new java.awt.Color(249, 215, 184));
        item4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        item4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Jeans", "Trouser", "Half Sleeves Shirt", "Full Sleeves Shirt", "Half T-Shirts", "Full T-Shirts", "Socks", "Under Garments", "Lowers", "Seasonal" }));
        item4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        item4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item4ItemStateChanged(evt);
            }
        });
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });
        retailpanel5.add(item4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 180, -1));

        jLabel38.setBackground(new java.awt.Color(204, 204, 204));
        jLabel38.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Code");
        retailpanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 90, 30));

        code4.setBackground(new java.awt.Color(249, 215, 184));
        code4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Code" }));
        code4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                code4ItemStateChanged(evt);
            }
        });
        code4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code4ActionPerformed(evt);
            }
        });
        retailpanel5.add(code4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 180, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Remove Code");
        retailpanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 390, -1));
        retailpanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 355, 10));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Cost Price");
        retailpanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 130, 30));

        cp4.setEditable(false);
        cp4.setBackground(new java.awt.Color(249, 215, 184));
        cp4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        cp4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cp4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cp4FocusGained(evt);
            }
        });
        cp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp4ActionPerformed(evt);
            }
        });
        retailpanel5.add(cp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, 180, 30));

        banaddpanel4.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add6.setBackground(new java.awt.Color(255, 255, 255));
        add6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add6.setText("Remove");
        add6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add6MouseReleased(evt);
            }
        });
        add6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add6KeyPressed(evt);
            }
        });
        banaddpanel4.add(add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 25));

        retailpanel5.add(banaddpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, 80, 25));

        getContentPane().add(retailpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 10, 410, 750));

        retailpanel6.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel6.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item3.setBackground(new java.awt.Color(249, 215, 184));
        item3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        item3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Jeans", "Trouser", "Half Sleeves Shirt", "Full Sleeves Shirt", "Half T-Shirts", "Full T-Shirts", "Socks", "Under Garments", "Lowers", "Seasonal" }));
        item3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        item3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item3ItemStateChanged(evt);
            }
        });
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        retailpanel6.add(item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 30));

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Code");
        retailpanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, 90, 30));

        size3.setBackground(new java.awt.Color(249, 215, 184));
        size3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size" }));
        size3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                size3ItemStateChanged(evt);
            }
        });
        size3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size3ActionPerformed(evt);
            }
        });
        retailpanel6.add(size3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 30));

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Size");
        retailpanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 90, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Quantity");
        retailpanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 205, 90, 30));

        banaddpanel3.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel3.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add5.setBackground(new java.awt.Color(255, 255, 255));
        add5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        add5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add5.setText("Remove");
        add5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add5MouseReleased(evt);
            }
        });
        add5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add5KeyPressed(evt);
            }
        });
        banaddpanel3.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 25));

        retailpanel6.add(banaddpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 245, 80, 25));

        code3.setBackground(new java.awt.Color(249, 215, 184));
        code3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Code" }));
        code3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                code3ItemStateChanged(evt);
            }
        });
        code3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code3ActionPerformed(evt);
            }
        });
        retailpanel6.add(code3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 115, 180, 30));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Remove Stock");
        retailpanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        dqty3.setEditable(false);
        dqty3.setBackground(new java.awt.Color(249, 215, 184));
        dqty3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        dqty3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dqty3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dqty3FocusGained(evt);
            }
        });
        dqty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqty3ActionPerformed(evt);
            }
        });
        retailpanel6.add(dqty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 205, 70, 30));

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("__");
        retailpanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 30, 20));

        uqty3.setBackground(new java.awt.Color(249, 215, 184));
        uqty3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        uqty3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uqty3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uqty3FocusGained(evt);
            }
        });
        uqty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uqty3ActionPerformed(evt);
            }
        });
        retailpanel6.add(uqty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 205, 70, 30));
        retailpanel6.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 285, 360, 10));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Purchasing Details");
        retailpanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 390, -1));

        jLabel39.setBackground(new java.awt.Color(204, 204, 204));
        jLabel39.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("Item");
        retailpanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 70, 90, 30));

        jLabel40.setBackground(new java.awt.Color(204, 204, 204));
        jLabel40.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("Date");
        retailpanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 330, 80, 35));
        jLabel40.getAccessibleContext().setAccessibleName("");

        receipt.setEditable(false);
        receipt.setColumns(20);
        receipt.setLineWrap(true);
        receipt.setRows(5);
        receipt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jScrollPane1.setViewportView(receipt);

        retailpanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 270, 350));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Search-Icon.png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        retailpanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jc2.setDateFormatString("YYYY-MM-dd");
        retailpanel6.add(jc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 209, 35));

        getContentPane().add(retailpanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 10, 405, 750));

        retailpanel4.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update Stock");
        retailpanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 385, 390, -1));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("+");
        retailpanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 565, 17, 30));

        item1.setBackground(new java.awt.Color(249, 215, 184));
        item1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        item1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Jeans", "Trouser", "Half Sleeves Shirt", "Full Sleeves Shirt", "Half T-Shirts", "Full T-Shirts", "Socks", "Under Garments", "Lowers", "Seasonal" }));
        item1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        item1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item1ItemStateChanged(evt);
            }
        });
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });
        retailpanel4.add(item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 160, 180, 30));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Date");
        retailpanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));

        code1.setBackground(new java.awt.Color(249, 215, 184));
        code1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        code1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        code1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                code1FocusGained(evt);
            }
        });
        code1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code1ActionPerformed(evt);
            }
        });
        retailpanel4.add(code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 205, 180, 30));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("MRP");
        retailpanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 30));

        mrp1.setBackground(new java.awt.Color(249, 215, 184));
        mrp1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        mrp1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mrp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mrp1FocusGained(evt);
            }
        });
        mrp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrp1ActionPerformed(evt);
            }
        });
        retailpanel4.add(mrp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 250, 180, 30));

        cp1.setBackground(new java.awt.Color(249, 215, 184));
        cp1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        cp1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cp1FocusGained(evt);
            }
        });
        cp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp1ActionPerformed(evt);
            }
        });
        retailpanel4.add(cp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 295, 180, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Cost Price");
        retailpanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 295, 130, 30));

        banaddpanel1.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel1.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add3.setBackground(new java.awt.Color(255, 255, 255));
        add3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add3.setText("Update");
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
        banaddpanel1.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 80, -1));

        retailpanel4.add(banaddpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 695, 80, 25));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Add New Code");
        retailpanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 370, -1));
        retailpanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 375, 355, 10));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Item");
        retailpanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 90, 30));

        item2.setBackground(new java.awt.Color(249, 215, 184));
        item2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        item2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Jeans", "Trouser", "Half Sleeves Shirt", "Full Sleeves Shirt", "Half T-Shirts", "Full T-Shirts", "Socks", "Under Garments", "Lowers", "Seasonal" }));
        item2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        item2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                item2ItemStateChanged(evt);
            }
        });
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });
        retailpanel4.add(item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 180, 30));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Code");
        retailpanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 475, 90, 30));

        code2.setBackground(new java.awt.Color(249, 215, 184));
        code2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Code" }));
        code2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                code2ItemStateChanged(evt);
            }
        });
        code2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code2ActionPerformed(evt);
            }
        });
        retailpanel4.add(code2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 475, 180, 30));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Quantity");
        retailpanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 565, 90, 30));

        dqty2.setEditable(false);
        dqty2.setBackground(new java.awt.Color(249, 215, 184));
        dqty2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        dqty2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dqty2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dqty2FocusGained(evt);
            }
        });
        dqty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dqty2ActionPerformed(evt);
            }
        });
        retailpanel4.add(dqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 565, 70, 30));

        uqty2.setBackground(new java.awt.Color(249, 215, 184));
        uqty2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        uqty2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uqty2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uqty2FocusGained(evt);
            }
        });
        uqty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uqty2ActionPerformed(evt);
            }
        });
        retailpanel4.add(uqty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 565, 70, 30));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Location");
        retailpanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("MRP");
        retailpanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 90, 30));

        mrp2.setBackground(new java.awt.Color(249, 215, 184));
        mrp2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        mrp2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mrp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrp2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mrp2FocusGained(evt);
            }
        });
        mrp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrp2ActionPerformed(evt);
            }
        });
        retailpanel4.add(mrp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 180, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Cost Price");
        retailpanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 655, 130, 30));

        cp2.setBackground(new java.awt.Color(249, 215, 184));
        cp2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        cp2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cp2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cp2FocusGained(evt);
            }
        });
        cp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cp2ActionPerformed(evt);
            }
        });
        retailpanel4.add(cp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 655, 180, 30));

        banaddpanel2.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel2.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add4.setBackground(new java.awt.Color(255, 255, 255));
        add4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add4.setText("Add");
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
        banaddpanel2.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 80, -1));

        retailpanel4.add(banaddpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 335, 80, 25));

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Size");
        retailpanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 90, 30));

        size1.setBackground(new java.awt.Color(249, 215, 184));
        size1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size" }));
        size1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                size1ItemStateChanged(evt);
            }
        });
        size1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size1ActionPerformed(evt);
            }
        });
        retailpanel4.add(size1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 180, 30));

        jc1.setBackground(new java.awt.Color(249, 215, 184));
        jc1.setDateFormatString("YYYY-MM-dd");
        retailpanel4.add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, 30));

        jLabel34.setBackground(new java.awt.Color(204, 204, 204));
        jLabel34.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Item");
        retailpanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Code");
        retailpanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 205, 90, 30));

        loc1.setBackground(new java.awt.Color(249, 215, 184));
        loc1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        loc1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loc1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loc1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loc1FocusGained(evt);
            }
        });
        loc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loc1ActionPerformed(evt);
            }
        });
        retailpanel4.add(loc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 180, 30));
        retailpanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, 370, 10));
        retailpanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 371, 10));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        retailpanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 21, 20, 90));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        retailpanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, 20, 90));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("View Extra Details");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        retailpanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 700, -1, 24));

        getContentPane().add(retailpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 10, 410, 750));

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\ForgetPasswordBackground.png")); // NOI18N
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection con;
String cdate="",pfcontact="";
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
        RetailFrame r1=new RetailFrame(pfcontact);
        r1.setVisible(true);
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
        RetailFrame r=new RetailFrame(pfcontact);
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l1MouseClicked
int windowcount=0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        stocklogo.setBorder(b);
        profilelogo.setBorder(null);
        if(windowcount==0)
        {
            try
            { 
                Statement st=con.createStatement();
                ResultSet rs1=st.executeQuery("select distinct(Code) from jeans");
                while(rs1.next())
                {
                    aitem1.addItem(rs1.getString("Code"));
                }
                ResultSet rs2=st.executeQuery("select distinct(Code) from Trouser");
                while(rs2.next())
                {
                    aitem2.addItem(rs2.getString("Code"));
                }
                ResultSet rs3=st.executeQuery("select distinct(Code) from halfsleeveshirt");
                while(rs3.next())
                {
                    aitem3.addItem(rs3.getString("Code"));
                }
                ResultSet rs4=st.executeQuery("select distinct(Code) from fullsleeveshirt");
                while(rs4.next())
                {
                    aitem4.addItem(rs4.getString("Code"));
                }
                ResultSet rs5=st.executeQuery("select distinct(Code) from halfsleevetshirt");
                while(rs5.next())
                {
                    aitem5.addItem(rs5.getString("Code"));
                }
                ResultSet rs6=st.executeQuery("select distinct(Code) from fullsleevetshirt");
                while(rs6.next())
                {
                    aitem6.addItem(rs6.getString("Code"));
                }
                ResultSet rs7=st.executeQuery("select distinct(Code) from lowers");
                while(rs7.next())
                {
                    aitem7.addItem(rs7.getString("Code"));
                }
                ResultSet rs8=st.executeQuery("select distinct(Item) from undergarments");
                while(rs8.next())
                {
                    aitem8.addItem(rs8.getString("Item"));
                }
                ResultSet rs9=st.executeQuery("select distinct(Item) from socks");
                while(rs9.next())
                {
                    aitem10.addItem(rs9.getString("Item"));
                }
                ResultSet rs10=st.executeQuery("select distinct(Item) from seasonal");
                while(rs10.next())
                {
                    aitem9.addItem(rs10.getString("Item"));
                }
                ResultSet rs11=st.executeQuery("select Date from purchasingdetails where");
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
            windowcount++;
        }
        else
        {
            
        }
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
String tablename="";
int count=0;
    private void item1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item1ItemStateChanged
        String item=item1.getSelectedItem().toString();
        if(item.equals("Select Item"))
        {
            tablename="";
            SelectValidItem s=new SelectValidItem(); 
            s.setVisible(true);
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Jeans"))
        {
            tablename="jeans";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Trouser"))
        {
            tablename="trouser";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Half Sleeves Shirt"))
        {
            tablename="halfsleeveshirt";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Full Sleeves Shirt"))
        {
            tablename="fullsleeveshirt";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Half T-Shirts"))
        {
            tablename="halfsleevetshirt";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Full T-Shirts"))
        {
            tablename="fullsleevetshirt";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Socks"))
        {
            tablename="socks";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Under Garments"))
        {
            tablename="undergarments";
            mrp1.setText("Not Required");
            mrp1.setEditable(false);
            cp1.setText("Not Required");
            cp1.setEditable(false);
        }
        else if(item.equals("Lowers"))
        {
            tablename="lowers";
            mrp1.setText("");
            mrp1.setEditable(true);
            cp1.setText("");
            cp1.setEditable(true);
        }
        else if(item.equals("Seasonal"))
        {
            tablename="seasonal";
            mrp1.setText("Not Required");
            mrp1.setEditable(false);
            cp1.setText("Not Required");
            cp1.setEditable(false);
        }
    }//GEN-LAST:event_item1ItemStateChanged

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
        
    }//GEN-LAST:event_item1ActionPerformed

    private void code1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_code1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_code1FocusGained

    private void code1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code1ActionPerformed

    private void mrp1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp1FocusGained

    private void mrp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp1ActionPerformed

    private void cp1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cp1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cp1FocusGained

    private void cp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp1ActionPerformed

    private void add3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add3AncestorAdded

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        String size="",item="",code="",checksize="";
        int qty,mrp,cp;
        int mqty=Integer.parseInt(dqty2.getText());
        int userqty=Integer.parseInt(uqty2.getText());
        item=item2.getSelectedItem().toString();
        code=code2.getSelectedItem().toString();
        size=size1.getSelectedItem().toString();
        mrp=Integer.parseInt(mrp2.getText());
        cp=Integer.parseInt(cp2.getText());
        String location=loc1.getText();
        String userdate=((JTextField)jc1.getDateEditor().getUiComponent()).getText();
        if((userdate.equals(""))||(location.equals("")))
        {
            SelectDateLocation s=new SelectDateLocation();
            s.setVisible(true);
        }
        else
        {
            if(item.equals("Select Item"))
            {
                SelectValidItem s=new SelectValidItem();
                s.setVisible(true);
            }
            else
            {
                if((utablename.equals("undergarments"))||utablename.equals("seasonal"))
                {
                try
                {
                        Statement st=con.createStatement();
                        int x=st.executeUpdate("Update "+utablename+"size set Quantity=Quantity+"+userqty+" where Item='"+code+"' and size='"+size+"'");
                        if(x==1)
                        {

                        }
                        else
                        {
                            st.executeUpdate("insert into "+utablename+"size values('"+size+"',"+mrp+","+userqty+","+cp+",'"+code+"')");
                        }
                        st.executeUpdate("insert into purchasingdetails values('"+userdate+"','"+item+"','"+code+"','"+size+"','"+userqty+"',"+mrp+","+cp+",'"+location+"')");
                        st.executeUpdate("update "+utablename+" set Quantity=Quantity+"+userqty+" where Item='"+code+"'");
                    con.commit();
                    StockAddedSuccess s=new StockAddedSuccess();
                    s.setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                } 
                }
                else if(utablename.equals("socks"))
                {
                try
                {
                        Statement st=con.createStatement();
                        st.executeUpdate("Update "+utablename+" set Quantity=Quantity+"+userqty+" where Item='"+code+"'");
                        st.executeUpdate("insert into purchasingdetails values('"+userdate+"','"+item+"','"+code+"','NA','"+userqty+"',"+mrp+","+cp+",'"+location+"')");
                        con.commit();
                        StockAddedSuccess s=new StockAddedSuccess();
                        s.setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                } 
                }
                else
                {
                try
                {
                    System.out.println(utablename);
                    System.out.println(size);
                    System.out.println(code);
                    Statement st=con.createStatement();
                    int x=st.executeUpdate("Update "+utablename+"size set Quantity=Quantity+"+userqty+" where Code='"+code+"' and Size='"+size+"'");
                    if(x==1)
                    {

                    }
                    else
                    {
                        st.executeUpdate("insert into "+utablename+"size values('"+size+"',"+userqty+",'"+code+"')");
                    }
                    st.executeUpdate("insert into purchasingdetails values('"+userdate+"','"+item+"','"+code+"','"+size+"','"+userqty+"',"+mrp+","+cp+",'"+location+"')");
                    st.executeUpdate("update "+utablename+" set Quantity=Quantity+"+userqty+" where Code='"+code+"'");
                    con.commit();
                    StockAddedSuccess s=new StockAddedSuccess();
                    s.setVisible(true);
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
                }

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

    private void item2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_item2ItemStateChanged
String utablename="";
    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        String item=item2.getSelectedItem().toString();
        if(item.equals("Select Item"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            utablename="";
            SelectValidItem s=new SelectValidItem(); 
            s.setVisible(true);
        }
        else if(item.equals("Jeans"))
        {
           size1.removeAllItems();
           size1.addItem("Select Size");
            for(int i=28;i<=44;i=i+2)
            {
                size1.addItem(""+i);
            }
            utablename="jeans";
            getCode();
        }
        else if(item.equals("Trouser"))
        {
           size1.removeAllItems();
           size1.addItem("Select Size");
            for(int i=28;i<=44;i=i+2)
            {
                size1.addItem(""+i);
            }
            utablename="trouser";
            getCode();
        }
        else if(item.equals("Half Sleeves Shirt"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            size1.addItem("S");
            size1.addItem("M");
            size1.addItem("L");
            size1.addItem("XL");
            size1.addItem("2XL");
            size1.addItem("3XL");
            size1.addItem("4XL");
            size1.addItem("5XL");
            size1.addItem("6XL");
            utablename="halfsleeveshirt";
            getCode();
        }
        else if(item.equals("Full Sleeves Shirt"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            size1.addItem("S");
            size1.addItem("M");
            size1.addItem("L");
            size1.addItem("XL");
            size1.addItem("2XL");
            size1.addItem("3XL");
            size1.addItem("4XL");
            size1.addItem("5XL");
            size1.addItem("6XL");
            utablename="fullsleeveshirt";
            getCode();
        }
        else if(item.equals("Half T-Shirts"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            size1.addItem("S");
            size1.addItem("M");
            size1.addItem("L");
            size1.addItem("XL");
            size1.addItem("2XL");
            size1.addItem("3XL");
            size1.addItem("4XL");
            size1.addItem("5XL");
            size1.addItem("6XL");
            utablename="halfsleevetshirt";
            getCode();
        }
        else if(item.equals("Full T-Shirts"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            size1.addItem("S");
            size1.addItem("M");
            size1.addItem("L");
            size1.addItem("XL");
            size1.addItem("2XL");
            size1.addItem("3XL");
            size1.addItem("4XL");
            size1.addItem("5XL");
            size1.addItem("6XL");
            utablename="fullsleevetshirt";
            getCode();
        }
        else if(item.equals("Socks"))
        {
            size1.removeAllItems();
            size1.addItem("Not Available");
            utablename="socks";
            code2.removeAllItems();
            code2.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+utablename+"");
            while(rs.next())
            {
                code2.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
        else if(item.equals("Under Garments"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            for(int i=75;i<=120;i+=5)
            {
                size1.addItem(""+i);
            }
            utablename="undergarments";
            code2.removeAllItems();
            code2.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+utablename+"");
            while(rs.next())
            {
                code2.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
        else if(item.equals("Lowers"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            size1.addItem("S");
            size1.addItem("M");
            size1.addItem("L");
            size1.addItem("XL");
            size1.addItem("2XL");
            size1.addItem("3XL");
            size1.addItem("4XL");
            size1.addItem("5XL");
            size1.addItem("6XL");
            utablename="lowers";
            getCode();
        }
        else if(item.equals("Seasonal"))
        {
            size1.removeAllItems();
            size1.addItem("Select Size");
            size1.addItem("S");
            size1.addItem("M");
            size1.addItem("L");
            size1.addItem("XL");
            size1.addItem("2XL");
            size1.addItem("3XL");
            size1.addItem("4XL");
            size1.addItem("5XL");
            size1.addItem("6XL");
            utablename="seasonal";
            code2.removeAllItems();
            code2.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+utablename+"");
            while(rs.next())
            {
                code2.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_item2ActionPerformed

    private void code2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_code2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_code2ItemStateChanged

    private void code2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code2ActionPerformed
    if(utablename.equals("socks"))
    {
        try
       {
        String code=code2.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+utablename+" where Item='"+code+"'");
            while(rs1.next())
            {
                mrp2.setText(""+rs1.getInt("MRP"));
                cp2.setText(""+rs1.getInt("CP"));
                dqty2.setText(""+rs1.getInt("Quantity"));
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }        
    }
        else
    {
        try
       {
        String code=code2.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+utablename+" where Code='"+code+"'");
            while(rs1.next())
            {
                mrp2.setText(""+rs1.getInt("MRP"));
                cp2.setText(""+rs1.getInt("CP"));
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }
       }
    }//GEN-LAST:event_code2ActionPerformed

    private void dqty2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dqty2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dqty2FocusGained

    private void dqty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dqty2ActionPerformed

    private void uqty2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uqty2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_uqty2FocusGained

    private void uqty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uqty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uqty2ActionPerformed

    private void mrp2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp2FocusGained

    private void mrp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp2ActionPerformed

    private void cp2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cp2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cp2FocusGained

    private void cp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp2ActionPerformed

    private void add4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add4AncestorAdded

    private void add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseClicked
        showDate();
        String size="",item="",code="";
        int qty=0,mrp,cp;
        item=item1.getSelectedItem().toString();
        code=code1.getText();
        mrp=Integer.parseInt(mrp1.getText());
        cp=Integer.parseInt(cp1.getText());
        String location=loc1.getText();
        String userdate=((JTextField)jc1.getDateEditor().getUiComponent()).getText();
        if((userdate.equals(""))||(location.equals("")))
        {
            SelectDateLocation s=new SelectDateLocation();
            s.setVisible(true);
        }
        else
        {
            try
            {
                if((tablename.equals("undergarments"))||(tablename.equals("seasonal")))
                {

                    Statement st=con.createStatement();
                    st.executeUpdate("insert into "+tablename+" values('"+code+"',"+qty+")"); 
                    con.commit();
                }
                else if(tablename.equals("socks"))
                {
                    Statement st=con.createStatement();
                    st.executeUpdate("insert into "+tablename+" values('"+code+"',"+mrp+","+cp+","+qty+")");  
                    con.commit(); 
                }
                else
                {
                    Statement st=con.createStatement();
                    st.executeUpdate("insert into "+tablename+" values('"+code+"',"+mrp+","+qty+","+cp+")");
                    con.commit();
                }
                StockAddedSuccess s=new StockAddedSuccess();
                s.setVisible(true);
            }
            catch(Exception e)
            {
                CodeAlreadyPresent c=new CodeAlreadyPresent();
                c.setVisible(true);
            }
            code1.setText("");
            cp1.setText("");
            mrp1.setText("");
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

    private void size1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size1ItemStateChanged

    }//GEN-LAST:event_size1ItemStateChanged

    private void size1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size1ActionPerformed
      int qty=0,mrp=0,cp=0;
      uqty2.setText("");
      if((utablename.equals("undergarments"))||utablename.equals("seasonal"))
      {
        try
       {
        String size=size1.getSelectedItem().toString();
        String code=code2.getSelectedItem().toString();
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from "+utablename+"size where size='"+size+"' and Item='"+code+"'");
        while(rs.next())
        {
            qty=rs.getInt("Quantity");
            mrp=rs.getInt("MRP");
            cp=rs.getInt("CP");
        }
        }catch(Exception e){
            System.out.println("Size not Present");
        }
            dqty2.setText(""+qty);
            mrp2.setText(""+mrp);
            cp2.setText(""+cp);
       }
       catch(Exception e)
       {
           
       }  
      }
      else
      {
        try
       {
        String size=size1.getSelectedItem().toString();
        String code=code2.getSelectedItem().toString();
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select Quantity from "+utablename+"size where Size='"+size+"' and Code='"+code+"'");
        while(rs.next())
        {
            qty=rs.getInt("Quantity");
        }
        ResultSet rs1=st.executeQuery("select * from "+utablename+" where Code='"+code+"'");
        while(rs1.next())
        {
            mrp=rs1.getInt("MRP");
            cp=rs1.getInt("CP");
        }
        }catch(Exception e){
            System.out.println("Size not Present");
        }
            dqty2.setText(""+qty);
            mrp2.setText(""+mrp);
            cp2.setText(""+cp);
       }
       catch(Exception e)
       {
           
       }
      }
    }//GEN-LAST:event_size1ActionPerformed

    private void item3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_item3ItemStateChanged
String rtablename="";
    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        String item=item3.getSelectedItem().toString();
        if(item.equals("Select Item"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            rtablename="";
            SelectValidItem s=new SelectValidItem(); 
            s.setVisible(true);
        }
        else if(item.equals("Jeans"))
        {
           size3.removeAllItems();
           size3.addItem("Select Size");
            for(int i=28;i<=44;i=i+2)
            {
                size3.addItem(""+i);
            }
            rtablename="jeans";
            getRemoveCode();
        }
        else if(item.equals("Trouser"))
        {
           size3.removeAllItems();
           size3.addItem("Select Size");
            for(int i=28;i<=44;i=i+2)
            {
                size3.addItem(""+i);
            }
            rtablename="trouser";
            getRemoveCode();
        }
        else if(item.equals("Half Sleeves Shirt"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            size3.addItem("S");
            size3.addItem("M");
            size3.addItem("L");
            size3.addItem("XL");
            size3.addItem("2XL");
            size3.addItem("3XL");
            size3.addItem("4XL");
            size3.addItem("5XL");
            size3.addItem("6XL");
            rtablename="halfsleeveshirt";
            getRemoveCode();
        }
        else if(item.equals("Full Sleeves Shirt"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            size3.addItem("S");
            size3.addItem("M");
            size3.addItem("L");
            size3.addItem("XL");
            size3.addItem("2XL");
            size3.addItem("3XL");
            size3.addItem("4XL");
            size3.addItem("5XL");
            size3.addItem("6XL");
            rtablename="fullsleeveshirt";
            getRemoveCode();
        }
        else if(item.equals("Half T-Shirts"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            size3.addItem("S");
            size3.addItem("M");
            size3.addItem("L");
            size3.addItem("XL");
            size3.addItem("2XL");
            size3.addItem("3XL");
            size3.addItem("4XL");
            size3.addItem("5XL");
            size3.addItem("6XL");
            rtablename="halfsleevetshirt";
            getRemoveCode();
        }
        else if(item.equals("Full T-Shirts"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            size3.addItem("S");
            size3.addItem("M");
            size3.addItem("L");
            size3.addItem("XL");
            size3.addItem("2XL");
            size3.addItem("3XL");
            size3.addItem("4XL");
            size3.addItem("5XL");
            size3.addItem("6XL");
            rtablename="fullsleevetshirt";
            getRemoveCode();
        }
        else if(item.equals("Socks"))
        {
            size3.removeAllItems();
            size3.addItem("Not Available");
            rtablename="socks";
            code3.removeAllItems();
            code3.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+rtablename+"");
            while(rs.next())
            {
                code3.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
        else if(item.equals("Under Garments"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            for(int i=75;i<=120;i+=5)
            {
                size3.addItem(""+i);
            }
            rtablename="undergarments";
            code3.removeAllItems();
            code3.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+rtablename+"");
            while(rs.next())
            {
                code3.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
        else if(item.equals("Lowers"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            size3.addItem("S");
            size3.addItem("M");
            size3.addItem("L");
            size3.addItem("XL");
            size3.addItem("2XL");
            size3.addItem("3XL");
            size3.addItem("4XL");
            size3.addItem("5XL");
            size3.addItem("6XL");
            rtablename="lowers";
            getRemoveCode();
        }
        else if(item.equals("Seasonal"))
        {
            size3.removeAllItems();
            size3.addItem("Select Size");
            size3.addItem("S");
            size3.addItem("M");
            size3.addItem("L");
            size3.addItem("XL");
            size3.addItem("2XL");
            size3.addItem("3XL");
            size3.addItem("4XL");
            size3.addItem("5XL");
            size3.addItem("6XL");
            rtablename="seasonal";
            code3.removeAllItems();
            code3.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+rtablename+"");
            while(rs.next())
            {
                code3.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_item3ActionPerformed

    private void size3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_size3ItemStateChanged

    private void size3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size3ActionPerformed
      int qty=0;
      uqty3.setText("");
      if((rtablename.equals("undergarments"))||rtablename.equals("seasonal"))
      {
        try
       {
        String size=size3.getSelectedItem().toString();
        String code=code3.getSelectedItem().toString();
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from "+rtablename+"size where size='"+size+"' and Item='"+code+"'");
        while(rs.next())
        {
            qty=rs.getInt("Quantity");
        }
        }catch(Exception e){
            System.out.println("Size not Present");
        }
        dqty3.setText(""+qty);
       }
       catch(Exception e)
       {
           
       }  
      }
      else
      {
        try
       {
        String size=size3.getSelectedItem().toString();
        String code=code3.getSelectedItem().toString();
        try{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select Quantity from "+rtablename+"size where Size='"+size+"' and Code='"+code+"'");
        while(rs.next())
        {
            qty=rs.getInt("Quantity");
        }
        ResultSet rs1=st.executeQuery("select * from "+rtablename+" where Code='"+code+"'");
        while(rs1.next())
        {

        }
        }catch(Exception e){
            System.out.println("Size not Present");
        }
            dqty3.setText(""+qty);
       }
       catch(Exception e)
       {
           
       }
      }
    }//GEN-LAST:event_size3ActionPerformed

    private void add5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add5AncestorAdded

    private void add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MouseClicked
        String size="",item="",code="";
        int mqty=Integer.parseInt(dqty3.getText());
        int userqty=Integer.parseInt(uqty3.getText());
        item=item3.getSelectedItem().toString();
        code=code3.getSelectedItem().toString();
        size=size3.getSelectedItem().toString();
        if(mqty>userqty)
        {
        if((rtablename.equals("undergarments"))||rtablename.equals("seasonal"))
        {
        try
        {
            Statement st=con.createStatement();
            int x=st.executeUpdate("Update "+rtablename+"size set Quantity=Quantity-"+userqty+" where Item='"+code+"' and size='"+size+"'");
            st.executeUpdate("update "+rtablename+" set Quantity=Quantity-"+userqty+" where Item='"+code+"'");
            con.commit();
            StockRemovedSuccess s=new StockRemovedSuccess();
            s.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        } 
        }
        else if(rtablename.equals("socks"))
        {
        try
        {
            Statement st=con.createStatement();
            st.executeUpdate("Update "+rtablename+" set Quantity=Quantity-"+userqty+" where Item='"+code+"'");
            con.commit();
            StockRemovedSuccess s=new StockRemovedSuccess();
            s.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        } 
        }
        else
        {
        try
        {
            Statement st=con.createStatement();
            int x=st.executeUpdate("Update "+rtablename+"size set Quantity=Quantity-"+userqty+" where Code='"+code+"' and Size='"+size+"'");
            st.executeUpdate("update "+rtablename+" set Quantity=Quantity-"+userqty+" where Code='"+code+"'");
            con.commit();
            StockRemovedSuccess s=new StockRemovedSuccess();
            s.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        }
        dqty3.setText("");
        uqty3.setText("");
        }
        else
        {
            EnterValidQuantity e=new EnterValidQuantity();
            e.setVisible(true);
        }
    }//GEN-LAST:event_add5MouseClicked

    private void add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add5MouseEntered

    private void add5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add5MousePressed

    private void add5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add5MouseReleased

    private void add5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add5KeyPressed

    private void code3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_code3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_code3ItemStateChanged

    private void code3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code3ActionPerformed
    if(rtablename.equals("socks"))
    {
        try
       {
        String code=code3.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+rtablename+" where Item='"+code+"'");
            while(rs1.next())
            {
                dqty3.setText(""+rs1.getInt("Quantity"));
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }        
    }
        else
    {
        try
       {
        String code=code3.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+rtablename+" where Code='"+code+"'");
            while(rs1.next())
            {
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }
       }
    }//GEN-LAST:event_code3ActionPerformed

    private void aitem1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem1ItemStateChanged

    private void aitem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem1ActionPerformed
        String code=aitem1.getSelectedItem().toString();
        asize1.removeAllItems();
        asize1.addItem("Size");
        aqty1.setText("");
        if(code.equals("Jeans"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(Size) from jeanssize where Code='"+code+"'");
                while(rs.next())
                {
                    asize1.addItem(rs.getString("Size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem1ActionPerformed

    private void asize1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize1ItemStateChanged

    private void asize1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize1ActionPerformed
        try
        {
            String code=aitem1.getSelectedItem().toString();
            String size=asize1.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from jeanssize where Code='"+code+"' and Size='"+size+"'");          
                while(rs.next())
                {
                    aqty1.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize1ActionPerformed

    private void aqty1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty1FocusGained

    private void aqty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty1ActionPerformed

    private void aqty2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty2FocusGained

    private void aqty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty2ActionPerformed

    private void asize2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize2ItemStateChanged

    private void asize2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize2ActionPerformed
        try
        {
            String code=aitem2.getSelectedItem().toString();
            String size=asize2.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from trousersize where Code='"+code+"' and Size='"+size+"'");          
                while(rs.next())
                {
                    aqty2.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize2ActionPerformed

    private void aitem2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem2ItemStateChanged

    private void aitem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem2ActionPerformed
        String code=aitem2.getSelectedItem().toString();
        asize2.removeAllItems();
        asize2.addItem("Size");
        aqty2.setText("");
        if(code.equals("Trouser"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(Size) from trousersize where Code='"+code+"'");
                while(rs.next())
                {
                    asize2.addItem(rs.getString("Size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem2ActionPerformed

    private void aitem3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem3ItemStateChanged

    private void aitem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem3ActionPerformed
        String code=aitem3.getSelectedItem().toString();
        asize3.removeAllItems();
        asize3.addItem("Size");
        aqty3.setText("");
        if(code.equals("Half Sleeve Shirts"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from halfsleeveshirtsize where Code='"+code+"'");
                while(rs.next())
                {
                    asize3.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem3ActionPerformed

    private void asize3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize3ItemStateChanged

    private void asize3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize3ActionPerformed
        try
        {
            String code=aitem3.getSelectedItem().toString();
            String size=asize3.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from halfsleeveshirtsize where Code='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty3.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize3ActionPerformed

    private void aqty3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty3FocusGained

    private void aqty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty3ActionPerformed

    private void aqty6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty6FocusGained

    private void aqty6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty6ActionPerformed

    private void asize6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize6ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize6ItemStateChanged

    private void asize6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize6ActionPerformed
        try
        {
            String code=aitem6.getSelectedItem().toString();
            String size=asize6.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from fullsleevetshirtsize where Code='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty6.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize6ActionPerformed

    private void aitem6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem6ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem6ItemStateChanged

    private void aitem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem6ActionPerformed
        String code=aitem6.getSelectedItem().toString();
        asize6.removeAllItems();
        asize6.addItem("Size");
        aqty6.setText("");
        if(code.equals("Full T-Shirts"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from fullsleevetshirtsize where Code='"+code+"'");
                while(rs.next())
                {
                    asize6.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem6ActionPerformed

    private void aitem7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem7ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem7ItemStateChanged

    private void aitem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem7ActionPerformed
        String code=aitem7.getSelectedItem().toString();
        asize7.removeAllItems();
        asize7.addItem("Size");
        aqty7.setText("");
        if(code.equals("Lowers"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from lowerssize where Code='"+code+"'");
                while(rs.next())
                {
                    asize7.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem7ActionPerformed

    private void asize7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize7ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize7ItemStateChanged

    private void asize7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize7ActionPerformed
        try
        {
            String code=aitem7.getSelectedItem().toString();
            String size=asize7.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from lowerssize where Code='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty7.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize7ActionPerformed

    private void aqty7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty7FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty7FocusGained

    private void aqty7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty7ActionPerformed

    private void aitem8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem8ItemStateChanged

    private void aitem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem8ActionPerformed
        String code=aitem8.getSelectedItem().toString();
        asize8.removeAllItems();
        asize8.addItem("Size");
        aqty8.setText("");
        if(code.equals("Under Garments"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from undergarmentssize where Item='"+code+"'");
                while(rs.next())
                {
                    asize8.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem8ActionPerformed

    private void asize8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize8ItemStateChanged

    private void asize8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize8ActionPerformed
        try
        {
            String code=aitem8.getSelectedItem().toString();
            String size=asize8.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from undergarmentssize where Item='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty8.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize8ActionPerformed

    private void aqty8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty8FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty8FocusGained

    private void aqty8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty8ActionPerformed

    private void aitem10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem10ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem10ItemStateChanged

    private void aitem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem10ActionPerformed
        String code=aitem10.getSelectedItem().toString();
        aqty10.setText("");
        if(code.equals("Socks"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from socks where Item='"+code+"'");
                while(rs.next())
                {
                    aqty10.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem10ActionPerformed

    private void aqty10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty10FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty10FocusGained

    private void aqty10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty10ActionPerformed

    private void aitem9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem9ItemStateChanged

    private void aitem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem9ActionPerformed
        String code=aitem9.getSelectedItem().toString();
        asize9.removeAllItems();
        asize9.addItem("Size");
        aqty9.setText("");
        if(code.equals("Seasonal"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from seasonalsize where Item='"+code+"'");
                while(rs.next())
                {
                    asize9.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem9ActionPerformed

    private void asize9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize9ItemStateChanged

    private void asize9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize9ActionPerformed
        try
        {
            String code=aitem9.getSelectedItem().toString();
            String size=asize9.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from seasonalsize where Item='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty9.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize9ActionPerformed

    private void aqty9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty9FocusGained

    private void aqty9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty9ActionPerformed

    private void dqty3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dqty3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dqty3FocusGained

    private void dqty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dqty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dqty3ActionPerformed

    private void uqty3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uqty3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_uqty3FocusGained

    private void uqty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uqty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uqty3ActionPerformed

    private void item4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_item4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_item4ItemStateChanged
String dtablename="";
    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        String item=item4.getSelectedItem().toString();
        if(item.equals("Select Item"))
        {
            dtablename="";
            SelectValidItem s=new SelectValidItem(); 
            s.setVisible(true);
        }
        else if(item.equals("Jeans"))
        {
            dtablename="jeans";
            removeCode();
        }
        else if(item.equals("Trouser"))
        {
            dtablename="trouser";
            removeCode();
        }
        else if(item.equals("Half Sleeves Shirt"))
        {
            dtablename="halfsleeveshirt";
            removeCode();
        }
        else if(item.equals("Full Sleeves Shirt"))
        {
            dtablename="fullsleeveshirt";
            removeCode();
        }
        else if(item.equals("Half T-Shirts"))
        {
            dtablename="halfsleevetshirt";
            removeCode();
        }
        else if(item.equals("Full T-Shirts"))
        {
            dtablename="fullsleevetshirt";
            removeCode();
        }
        else if(item.equals("Socks"))
        {
            dtablename="socks";
            code4.removeAllItems();
            code4.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+dtablename+"");
            while(rs.next())
            {
                code4.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
        else if(item.equals("Under Garments"))
        {
            dtablename="undergarments";
            code4.removeAllItems();
            code4.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+dtablename+"");
            while(rs.next())
            {
                code4.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
        else if(item.equals("Lowers"))
        {
            dtablename="lowers";
            removeCode();
        }
        else if(item.equals("Seasonal"))
        {
            dtablename="seasonal";
            code4.removeAllItems();
            code4.addItem("Select Code");
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Item from "+dtablename+"");
            while(rs.next())
            {
                code4.addItem(rs.getString("Item"));
            }
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_item4ActionPerformed

    private void code4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_code4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_code4ItemStateChanged

    private void code4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code4ActionPerformed
    if(dtablename.equals("socks"))
    {
        try
       {
            String code=code4.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+dtablename+" where Item='"+code+"'");
            while(rs1.next())
            {
                cp4.setText(""+rs1.getInt("CP"));
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }        
    }
    else if(dtablename.equals("undergarments"))
    {
        try
        {
            String code=code4.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+dtablename+" where Item='"+code+"'");
            while(rs1.next())
            {
                cp4.setText("Not Required");
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }        
    }
    else if(dtablename.equals("seasonal"))
    {
        try
        {
            String code=code4.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+dtablename+"size where Item='"+code+"'");
            while(rs1.next())
            {
                cp4.setText(""+rs1.getInt("CP"));
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }        
    }    
    else
    {
        try
        {
            String code=code4.getSelectedItem().toString();
            try{
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from "+dtablename+" where Code='"+code+"'");
            while(rs1.next())
            {
                cp4.setText(""+rs1.getInt("CP"));               
            }
            }catch(Exception e){
                System.out.println("Size not Present");
            }
           }
           catch(Exception e)
           {

           }
       }
    }//GEN-LAST:event_code4ActionPerformed

    private void cp4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cp4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cp4FocusGained

    private void cp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cp4ActionPerformed

    private void add6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add6AncestorAdded

    private void add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MouseClicked
        String code=code4.getSelectedItem().toString();
        CodeDeleteVerification c=new CodeDeleteVerification(dtablename,code);
        c.setVisible(true);
    }//GEN-LAST:event_add6MouseClicked

    private void add6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add6MouseEntered

    private void add6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add6MousePressed

    private void add6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add6MouseReleased

    private void add6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add6KeyPressed

    private void aitem4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem4ItemStateChanged

    private void aitem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem4ActionPerformed
        String code=aitem4.getSelectedItem().toString();
        asize4.removeAllItems();
        asize4.addItem("Size");
        aqty4.setText("");
        if(code.equals("Full Sleeve Shirts"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from fullsleeveshirtsize where Code='"+code+"'");
                while(rs.next())
                {
                    asize4.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem4ActionPerformed

    private void asize4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize4ItemStateChanged

    private void asize4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize4ActionPerformed
        try
        {
            String code=aitem4.getSelectedItem().toString();
            String size=asize4.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from fullsleeveshirtsize where Code='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty4.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize4ActionPerformed

    private void aqty4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty4FocusGained

    private void aqty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty4ActionPerformed

    private void aitem5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_aitem5ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aitem5ItemStateChanged

    private void aitem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aitem5ActionPerformed
        String code=aitem5.getSelectedItem().toString();
        asize5.removeAllItems();
        asize5.addItem("Size");
        aqty5.setText("");
        if(code.equals("Half T-Shirts"))
        {
            SelectValidCode s=new SelectValidCode();
            s.setVisible(true);
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select distinct(size) from halfsleevetshirtsize where Code='"+code+"'");
                while(rs.next())
                {
                    asize5.addItem(rs.getString("size"));
                }
            }
            catch(Exception e)
            {
                System.out.println("Error");
            }
        }
    }//GEN-LAST:event_aitem5ActionPerformed

    private void asize5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asize5ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_asize5ItemStateChanged

    private void asize5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asize5ActionPerformed
        try
        {
            String code=aitem5.getSelectedItem().toString();
            String size=asize5.getSelectedItem().toString();
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Quantity from halfsleevetshirtsize where Code='"+code+"' and size='"+size+"'");          
                while(rs.next())
                {
                    aqty5.setText(""+rs.getInt("Quantity"));
                }
            }
            catch(Exception e)
            {
                
            }
        }
        catch(Exception e)
        {
       }
    }//GEN-LAST:event_asize5ActionPerformed

    private void aqty5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aqty5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty5FocusGained

    private void aqty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aqty5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aqty5ActionPerformed

    private void loc1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loc1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_loc1FocusGained

    private void loc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loc1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    int sum=0,item=0;    
    receipt.setText("");
    String userdate=((JTextField)jc2.getDateEditor().getUiComponent()).getText();
    String location="";
    receipt.append("\n");
    receipt.append("                           Purchasing Details\n\n");
    try
    {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select Location from purchasingdetails where Date='"+userdate+"'");
        while(rs.next())
        {
            location=rs.getString("Location");
        }
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
    receipt.append("     "+userdate+"                    Location - "+location+"\n\n");
    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
    receipt.append("     ItemName\t           Size      Price     Amount\n");
    try
    {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from purchasingdetails where Date='"+userdate+"'");
        while(rs.next())
        {
            sum=sum+(rs.getInt("Quantity")*rs.getInt("CP"));
            item=item+rs.getInt("Quantity");
            receipt.append("     "+rs.getInt("Quantity")+" x "+rs.getString("Item")+"\t            "+rs.getString("Size")+"         "+rs.getInt("CP")+"      "+rs.getInt("Quantity")*rs.getInt("CP")+"\n");
        }
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n");
    receipt.append("     Total Items\t\t         "+item+"\n\n");
    receipt.append("     Total\t\t         "+sum+"/-\n\n");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        StockExtraDetailsTableFormat f=new StockExtraDetailsTableFormat(pfcontact);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void profilelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilelogoMouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        stocklogo.setBorder(null);
        ProfilePage b1=new ProfilePage(pfcontact);
        b1.setVisible(true);
    }//GEN-LAST:event_profilelogoMouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        stocklogo.setBorder(null);
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
            java.util.logging.Logger.getLogger(StockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new StockFrame(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IconBar;
    private javax.swing.JLabel Toggle;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JLabel add5;
    private javax.swing.JLabel add6;
    private javax.swing.JComboBox<String> aitem1;
    private javax.swing.JComboBox<String> aitem10;
    private javax.swing.JComboBox<String> aitem2;
    private javax.swing.JComboBox<String> aitem3;
    private javax.swing.JComboBox<String> aitem4;
    private javax.swing.JComboBox<String> aitem5;
    private javax.swing.JComboBox<String> aitem6;
    private javax.swing.JComboBox<String> aitem7;
    private javax.swing.JComboBox<String> aitem8;
    private javax.swing.JComboBox<String> aitem9;
    private javax.swing.JTextField aqty1;
    private javax.swing.JTextField aqty10;
    private javax.swing.JTextField aqty2;
    private javax.swing.JTextField aqty3;
    private javax.swing.JTextField aqty4;
    private javax.swing.JTextField aqty5;
    private javax.swing.JTextField aqty6;
    private javax.swing.JTextField aqty7;
    private javax.swing.JTextField aqty8;
    private javax.swing.JTextField aqty9;
    private javax.swing.JComboBox<String> asize1;
    private javax.swing.JComboBox<String> asize2;
    private javax.swing.JComboBox<String> asize3;
    private javax.swing.JComboBox<String> asize4;
    private javax.swing.JComboBox<String> asize5;
    private javax.swing.JComboBox<String> asize6;
    private javax.swing.JComboBox<String> asize7;
    private javax.swing.JComboBox<String> asize8;
    private javax.swing.JComboBox<String> asize9;
    private javax.swing.JLabel balancelogo;
    private javax.swing.JPanel banaddpanel1;
    private javax.swing.JPanel banaddpanel2;
    private javax.swing.JPanel banaddpanel3;
    private javax.swing.JPanel banaddpanel4;
    private javax.swing.JLabel bgimage;
    private javax.swing.JTextField code1;
    private javax.swing.JComboBox<String> code2;
    private javax.swing.JComboBox<String> code3;
    public static javax.swing.JComboBox<String> code4;
    private javax.swing.JTextField cp1;
    private javax.swing.JTextField cp2;
    public static javax.swing.JTextField cp4;
    private javax.swing.JLabel customerlogo;
    private javax.swing.JTextField dqty2;
    private javax.swing.JTextField dqty3;
    private javax.swing.JLabel employeelogo;
    private javax.swing.JComboBox<String> item1;
    private javax.swing.JComboBox<String> item2;
    private javax.swing.JComboBox<String> item3;
    private javax.swing.JComboBox<String> item4;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private com.toedter.calendar.JDateChooser jc1;
    private com.toedter.calendar.JDateChooser jc2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JTextField loc1;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField mrp1;
    private javax.swing.JTextField mrp2;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JLabel profilelogo;
    private javax.swing.JTextArea receipt;
    private javax.swing.JLabel retaillogo;
    private javax.swing.JPanel retailpanel4;
    private javax.swing.JPanel retailpanel5;
    private javax.swing.JPanel retailpanel6;
    private javax.swing.JComboBox<String> size1;
    private javax.swing.JComboBox<String> size3;
    private javax.swing.JLabel stocklogo;
    private javax.swing.JTextField uqty2;
    private javax.swing.JTextField uqty3;
    private javax.swing.JLabel wholesalelogo;
    // End of variables declaration//GEN-END:variables
}
