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
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class WholeSaleFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public WholeSaleFrame(String contact) {
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
    public void clearAllItems()
    {
        try{
            Statement st=con.createStatement();
            ResultSet rs11=st.executeQuery("Select BillNo from customerinfo");
            while(rs11.next())
            {
                billno=rs11.getInt("BillNo");
            }
            billno++;
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
        count=0;
        namecount=0;
        mobilecount=0;
        addresscount=0;
        agecount=0;
        code1.setSelectedIndex(0);
        code2.setSelectedIndex(0);
        code3.setSelectedIndex(0);
        code4.setSelectedIndex(0);
        code5.setSelectedIndex(0);
        code6.setSelectedIndex(0);
        code7.setSelectedIndex(0);
        code8.setSelectedIndex(0);
        code9.setSelectedIndex(0);
        sockscombo.setSelectedIndex(0);
        size1.setSelectedIndex(0);
        size2.setSelectedIndex(0);
        size3.setSelectedIndex(0);
        size4.setSelectedIndex(0);
        size5.setSelectedIndex(0);
        size6.setSelectedIndex(0);
        size7.setSelectedIndex(0);
        size8.setSelectedIndex(0);
        size9.setSelectedIndex(0);
        mrp1.setText("MRP");
        mrp2.setText("MRP");
        mrp3.setText("MRP");
        mrp4.setText("MRP");
        mrp5.setText("MRP");
        mrp6.setText("MRP");
        mrp7.setText("MRP");
        mrp8.setText("MRP");
        mrp9.setText("MRP");
        qty1.setText("QTY");
        qty2.setText("QTY");
        qty3.setText("QTY");
        qty4.setText("QTY");
        qty5.setText("QTY");
        qty6.setText("QTY");
        qty7.setText("QTY");
        qty8.setText("QTY");
        qty9.setText("QTY");
        socksqtytf.setText("QTY");
        socksmrptf.setText("MRP");
        name.setText("");
        mobile.setText("");
        address.setText("");
        age.setText("");
        onlinetf.setText("");
        cashtf.setText("");
        pmethod.setSelectedIndex(0);
        receipt.setText("");
        receipt.append("                           Payment Statement\n");
        receipt.append("     "+cdate+"            "+ctime+"\n");
        receipt.append("     Bill No: "+billno+"\n");
        receipt.append("\tRMR GARMENTS\n");
        receipt.append("                            18/5 Sindhi Colony\n");
        receipt.append("                                  9826782684\n");
        receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");    
        receipt.append("     Name\t");
        try{
            con.rollback();
            con.commit();
        }catch(Exception e){
            System.out.println("Error");
        }
        items=0;
        total=0;
        cp=0;
    }
    public void showDate()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        cdate="Date : "+s.format(d);
        purchasedate=s.format(d);
        currentdate.setText(cdate);
    }
    public void showTime()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("hh:mm aa");
        purchasetime=s.format(d);
        ctime="Time : "+s.format(d);
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
        retailpanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        size5 = new javax.swing.JComboBox<>();
        code5 = new javax.swing.JComboBox<>();
        mrp5 = new javax.swing.JTextField();
        qty5 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        code6 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        size6 = new javax.swing.JComboBox<>();
        mrp6 = new javax.swing.JTextField();
        qty6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        size7 = new javax.swing.JComboBox<>();
        mrp7 = new javax.swing.JTextField();
        qty7 = new javax.swing.JTextField();
        code7 = new javax.swing.JComboBox<>();
        jsaddpanel = new javax.swing.JPanel();
        add5 = new javax.swing.JLabel();
        tsaddpanel = new javax.swing.JPanel();
        add6 = new javax.swing.JLabel();
        banaddpanel = new javax.swing.JPanel();
        add9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        code8 = new javax.swing.JComboBox<>();
        size8 = new javax.swing.JComboBox<>();
        mrp8 = new javax.swing.JTextField();
        qty8 = new javax.swing.JTextField();
        banaddpanel2 = new javax.swing.JPanel();
        add7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        size9 = new javax.swing.JComboBox<>();
        mrp9 = new javax.swing.JTextField();
        qty9 = new javax.swing.JTextField();
        banaddpanel3 = new javax.swing.JPanel();
        add8 = new javax.swing.JLabel();
        code9 = new javax.swing.JComboBox<>();
        retailpanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        size1 = new javax.swing.JComboBox<>();
        code1 = new javax.swing.JComboBox<>();
        mrp1 = new javax.swing.JTextField();
        qty1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        code2 = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        size2 = new javax.swing.JComboBox<>();
        mrp2 = new javax.swing.JTextField();
        qty2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        size3 = new javax.swing.JComboBox<>();
        mrp3 = new javax.swing.JTextField();
        qty3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        code3 = new javax.swing.JComboBox<>();
        jsaddpanel1 = new javax.swing.JPanel();
        add1 = new javax.swing.JLabel();
        tsaddpanel1 = new javax.swing.JPanel();
        add2 = new javax.swing.JLabel();
        sockscombo = new javax.swing.JComboBox<>();
        socksqtytf = new javax.swing.JTextField();
        socksmrptf = new javax.swing.JTextField();
        banaddpanel1 = new javax.swing.JPanel();
        add3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        socksaddpanel2 = new javax.swing.JPanel();
        socksadd1 = new javax.swing.JLabel();
        code4 = new javax.swing.JComboBox<>();
        size4 = new javax.swing.JComboBox<>();
        mrp4 = new javax.swing.JTextField();
        qty4 = new javax.swing.JTextField();
        banaddpanel4 = new javax.swing.JPanel();
        add4 = new javax.swing.JLabel();
        retailpanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date5 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        date7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        socksaddpanel5 = new javax.swing.JPanel();
        socksadd4 = new javax.swing.JLabel();
        socksaddpanel4 = new javax.swing.JPanel();
        socksadd3 = new javax.swing.JLabel();
        socksaddpanel3 = new javax.swing.JPanel();
        socksadd2 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        currentdate = new javax.swing.JLabel();
        date8 = new javax.swing.JLabel();
        pmethod = new javax.swing.JComboBox<>();
        date9 = new javax.swing.JLabel();
        cashtf = new javax.swing.JTextField();
        date10 = new javax.swing.JLabel();
        onlinetf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7MouseClicked(evt);
            }
        });
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

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 350, 768));

        retailpanel1.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel1.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Half Sleeves Shirts");
        retailpanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, -1));

        size5.setBackground(new java.awt.Color(249, 215, 184));
        size5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        size5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size5ActionPerformed(evt);
            }
        });
        retailpanel1.add(size5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, 30));

        code5.setBackground(new java.awt.Color(249, 215, 184));
        code5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code5ActionPerformed(evt);
            }
        });
        retailpanel1.add(code5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        mrp5.setEditable(false);
        mrp5.setBackground(new java.awt.Color(249, 215, 184));
        mrp5.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp5.setText("MRP");
        mrp5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrp5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mrp5FocusGained(evt);
            }
        });
        mrp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrp5ActionPerformed(evt);
            }
        });
        retailpanel1.add(mrp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 58, 30));

        qty5.setBackground(new java.awt.Color(249, 215, 184));
        qty5.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty5.setText("QTY");
        qty5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty5FocusGained(evt);
            }
        });
        qty5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty5KeyTyped(evt);
            }
        });
        retailpanel1.add(qty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, 58, 30));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 395, 10));

        code6.setBackground(new java.awt.Color(249, 215, 184));
        code6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code6ActionPerformed(evt);
            }
        });
        retailpanel1.add(code6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 30));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 395, 10));

        size6.setBackground(new java.awt.Color(249, 215, 184));
        size6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        size6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size6ActionPerformed(evt);
            }
        });
        retailpanel1.add(size6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 90, 30));

        mrp6.setEditable(false);
        mrp6.setBackground(new java.awt.Color(249, 215, 184));
        mrp6.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp6.setText("MRP");
        mrp6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retailpanel1.add(mrp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 58, 30));

        qty6.setBackground(new java.awt.Color(249, 215, 184));
        qty6.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty6.setText("QTY");
        qty6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty6FocusGained(evt);
            }
        });
        qty6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty6ActionPerformed(evt);
            }
        });
        qty6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty6KeyTyped(evt);
            }
        });
        retailpanel1.add(qty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 220, 58, 30));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Full Sleeves Shirts");
        retailpanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, -1));

        size7.setBackground(new java.awt.Color(249, 215, 184));
        size7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        size7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size7ActionPerformed(evt);
            }
        });
        retailpanel1.add(size7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 90, 30));

        mrp7.setEditable(false);
        mrp7.setBackground(new java.awt.Color(249, 215, 184));
        mrp7.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp7.setText("MRP");
        mrp7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retailpanel1.add(mrp7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 58, 30));

        qty7.setBackground(new java.awt.Color(249, 215, 184));
        qty7.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty7.setText("QTY");
        qty7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty7FocusGained(evt);
            }
        });
        qty7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty7ActionPerformed(evt);
            }
        });
        qty7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty7KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty7KeyTyped(evt);
            }
        });
        retailpanel1.add(qty7, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 370, 58, 30));

        code7.setBackground(new java.awt.Color(249, 215, 184));
        code7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code7ActionPerformed(evt);
            }
        });
        retailpanel1.add(code7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 30));

        jsaddpanel.setBackground(new java.awt.Color(249, 215, 184));
        jsaddpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        jsaddpanel.setPreferredSize(new java.awt.Dimension(700, 307));
        jsaddpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add5.setBackground(new java.awt.Color(255, 255, 255));
        add5.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add5.setText("Add to Cart");
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
        jsaddpanel.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel1.add(jsaddpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 110, 100, 25));

        tsaddpanel.setBackground(new java.awt.Color(249, 215, 184));
        tsaddpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        tsaddpanel.setPreferredSize(new java.awt.Dimension(700, 307));
        tsaddpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add6.setBackground(new java.awt.Color(255, 255, 255));
        add6.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add6.setText("Add to Cart");
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
        tsaddpanel.add(add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel1.add(tsaddpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 260, 100, 25));

        banaddpanel.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add9.setBackground(new java.awt.Color(255, 255, 255));
        add9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add9.setText("Add to Cart");
        add9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add9AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add9MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add9MouseReleased(evt);
            }
        });
        add9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add9KeyPressed(evt);
            }
        });
        banaddpanel.add(add9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel1.add(banaddpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 710, 100, 25));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 395, 10));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Half T-Shirts");
        retailpanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 400, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Full T-Shirts");
        retailpanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 400, -1));

        code8.setBackground(new java.awt.Color(249, 215, 184));
        code8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code8ActionPerformed(evt);
            }
        });
        retailpanel1.add(code8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 160, 30));

        size8.setBackground(new java.awt.Color(249, 215, 184));
        size8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        size8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size8ActionPerformed(evt);
            }
        });
        retailpanel1.add(size8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 90, 30));

        mrp8.setEditable(false);
        mrp8.setBackground(new java.awt.Color(249, 215, 184));
        mrp8.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp8.setText("MRP");
        mrp8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retailpanel1.add(mrp8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 58, 30));

        qty8.setBackground(new java.awt.Color(249, 215, 184));
        qty8.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty8.setText("QTY");
        qty8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty8FocusGained(evt);
            }
        });
        qty8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty8ActionPerformed(evt);
            }
        });
        qty8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty8KeyTyped(evt);
            }
        });
        retailpanel1.add(qty8, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 520, 58, 30));

        banaddpanel2.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel2.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add7.setBackground(new java.awt.Color(255, 255, 255));
        add7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add7.setText("Add to Cart");
        add7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add7MouseReleased(evt);
            }
        });
        add7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add7KeyPressed(evt);
            }
        });
        banaddpanel2.add(add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel1.add(banaddpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 410, 100, 25));

        jSeparator8.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 395, 10));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Seasonal");
        retailpanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 400, -1));

        size9.setBackground(new java.awt.Color(249, 215, 184));
        size9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        size9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                size9ItemStateChanged(evt);
            }
        });
        size9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size9ActionPerformed(evt);
            }
        });
        retailpanel1.add(size9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 90, 30));

        mrp9.setEditable(false);
        mrp9.setBackground(new java.awt.Color(249, 215, 184));
        mrp9.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp9.setText("MRP");
        mrp9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retailpanel1.add(mrp9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 58, 30));

        qty9.setBackground(new java.awt.Color(249, 215, 184));
        qty9.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty9.setText("QTY");
        qty9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty9FocusGained(evt);
            }
        });
        qty9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty9ActionPerformed(evt);
            }
        });
        qty9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty9KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty9KeyTyped(evt);
            }
        });
        retailpanel1.add(qty9, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 670, 58, 30));

        banaddpanel3.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel3.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add8.setBackground(new java.awt.Color(255, 255, 255));
        add8.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add8.setText("Add to Cart");
        add8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add8MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add8MouseReleased(evt);
            }
        });
        add8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add8KeyPressed(evt);
            }
        });
        banaddpanel3.add(add8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel1.add(banaddpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 560, 100, 25));

        code9.setBackground(new java.awt.Color(249, 215, 184));
        code9.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code9ActionPerformed(evt);
            }
        });
        retailpanel1.add(code9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 160, 30));

        getContentPane().add(retailpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 10, 415, 750));

        retailpanel4.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jeans");
        retailpanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, -1));

        size1.setBackground(new java.awt.Color(249, 215, 184));
        size1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
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
        retailpanel4.add(size1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, 30));

        code1.setBackground(new java.awt.Color(249, 215, 184));
        code1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                code1ItemStateChanged(evt);
            }
        });
        code1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code1ActionPerformed(evt);
            }
        });
        retailpanel4.add(code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        mrp1.setEditable(false);
        mrp1.setBackground(new java.awt.Color(249, 215, 184));
        mrp1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp1.setText("MRP");
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
        retailpanel4.add(mrp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 58, 30));

        qty1.setBackground(new java.awt.Color(249, 215, 184));
        qty1.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty1.setText("QTY");
        qty1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty1FocusGained(evt);
            }
        });
        qty1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty1KeyTyped(evt);
            }
        });
        retailpanel4.add(qty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 70, 58, 30));

        jSeparator5.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 395, 10));

        code2.setBackground(new java.awt.Color(249, 215, 184));
        code2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code2ActionPerformed(evt);
            }
        });
        retailpanel4.add(code2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 30));

        jSeparator6.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 395, 10));

        size2.setBackground(new java.awt.Color(249, 215, 184));
        size2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size" }));
        size2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                size2ItemStateChanged(evt);
            }
        });
        size2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size2ActionPerformed(evt);
            }
        });
        retailpanel4.add(size2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 90, 30));

        mrp2.setEditable(false);
        mrp2.setBackground(new java.awt.Color(249, 215, 184));
        mrp2.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp2.setText("MRP");
        mrp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrp2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mrp2FocusGained(evt);
            }
        });
        retailpanel4.add(mrp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 58, 30));

        qty2.setBackground(new java.awt.Color(249, 215, 184));
        qty2.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty2.setText("QTY");
        qty2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty2FocusGained(evt);
            }
        });
        qty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty2ActionPerformed(evt);
            }
        });
        qty2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty2KeyTyped(evt);
            }
        });
        retailpanel4.add(qty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 220, 58, 30));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Trouser");
        retailpanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 400, -1));

        size3.setBackground(new java.awt.Color(249, 215, 184));
        size3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size", "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        retailpanel4.add(size3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 90, 30));

        mrp3.setEditable(false);
        mrp3.setBackground(new java.awt.Color(249, 215, 184));
        mrp3.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp3.setText("MRP");
        mrp3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrp3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mrp3FocusGained(evt);
            }
        });
        retailpanel4.add(mrp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 58, 30));

        qty3.setBackground(new java.awt.Color(249, 215, 184));
        qty3.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty3.setText("QTY");
        qty3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty3FocusGained(evt);
            }
        });
        qty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty3ActionPerformed(evt);
            }
        });
        qty3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty3KeyTyped(evt);
            }
        });
        retailpanel4.add(qty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 370, 58, 30));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lower");
        retailpanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 400, -1));

        code3.setBackground(new java.awt.Color(249, 215, 184));
        code3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));
        code3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code3ActionPerformed(evt);
            }
        });
        retailpanel4.add(code3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 30));

        jsaddpanel1.setBackground(new java.awt.Color(249, 215, 184));
        jsaddpanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        jsaddpanel1.setPreferredSize(new java.awt.Dimension(700, 307));
        jsaddpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.setBackground(new java.awt.Color(255, 255, 255));
        add1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add1.setText("Add to Cart");
        add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add1MouseReleased(evt);
            }
        });
        add1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add1KeyPressed(evt);
            }
        });
        jsaddpanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel4.add(jsaddpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 110, 100, 25));

        tsaddpanel1.setBackground(new java.awt.Color(249, 215, 184));
        tsaddpanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        tsaddpanel1.setPreferredSize(new java.awt.Dimension(700, 307));
        tsaddpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add2.setBackground(new java.awt.Color(255, 255, 255));
        add2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add2.setText("Add to Cart");
        add2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                add2MouseReleased(evt);
            }
        });
        add2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add2KeyPressed(evt);
            }
        });
        tsaddpanel1.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel4.add(tsaddpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 260, 100, 25));

        sockscombo.setBackground(new java.awt.Color(249, 215, 184));
        sockscombo.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        sockscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Socks" }));
        sockscombo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        sockscombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sockscombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sockscomboActionPerformed(evt);
            }
        });
        sockscombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sockscomboKeyPressed(evt);
            }
        });
        retailpanel4.add(sockscombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 260, 30));

        socksqtytf.setBackground(new java.awt.Color(249, 215, 184));
        socksqtytf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        socksqtytf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        socksqtytf.setText("QTY");
        socksqtytf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socksqtytf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                socksqtytfFocusGained(evt);
            }
        });
        socksqtytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socksqtytfActionPerformed(evt);
            }
        });
        socksqtytf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                socksqtytfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                socksqtytfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                socksqtytfKeyTyped(evt);
            }
        });
        retailpanel4.add(socksqtytf, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 460, 58, 30));

        socksmrptf.setEditable(false);
        socksmrptf.setBackground(new java.awt.Color(249, 215, 184));
        socksmrptf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        socksmrptf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        socksmrptf.setText("MRP");
        socksmrptf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        socksmrptf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                socksmrptfFocusGained(evt);
            }
        });
        retailpanel4.add(socksmrptf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 58, 30));

        banaddpanel1.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel1.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add3.setBackground(new java.awt.Color(255, 255, 255));
        add3.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add3.setText("Add to Cart");
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
        banaddpanel1.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel4.add(banaddpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 410, 100, 25));

        jSeparator7.setBackground(new java.awt.Color(153, 153, 255));
        retailpanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 395, 10));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Under Garments");
        retailpanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 400, -1));

        socksaddpanel2.setBackground(new java.awt.Color(249, 215, 184));
        socksaddpanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        socksaddpanel2.setPreferredSize(new java.awt.Dimension(700, 307));
        socksaddpanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socksadd1.setBackground(new java.awt.Color(255, 255, 255));
        socksadd1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        socksadd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd1.setText("Add to Cart");
        socksadd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socksadd1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                socksadd1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        socksadd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socksadd1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                socksadd1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                socksadd1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                socksadd1MouseReleased(evt);
            }
        });
        socksadd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                socksadd1KeyPressed(evt);
            }
        });
        socksaddpanel2.add(socksadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel4.add(socksaddpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 500, 100, 25));

        code4.setBackground(new java.awt.Color(249, 215, 184));
        code4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        code4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Code" }));
        code4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        code4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        code4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code4ActionPerformed(evt);
            }
        });
        retailpanel4.add(code4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 160, 30));

        size4.setBackground(new java.awt.Color(249, 215, 184));
        size4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        size4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Size", "Item 1", "Item 2", "Item 3", "Item 4" }));
        size4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        size4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        size4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                size4ItemStateChanged(evt);
            }
        });
        size4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size4ActionPerformed(evt);
            }
        });
        retailpanel4.add(size4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 90, 30));

        mrp4.setEditable(false);
        mrp4.setBackground(new java.awt.Color(249, 215, 184));
        mrp4.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mrp4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mrp4.setText("MRP");
        mrp4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrp4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mrp4FocusGained(evt);
            }
        });
        retailpanel4.add(mrp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 58, 30));

        qty4.setBackground(new java.awt.Color(249, 215, 184));
        qty4.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        qty4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty4.setText("QTY");
        qty4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        qty4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qty4FocusGained(evt);
            }
        });
        qty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty4ActionPerformed(evt);
            }
        });
        qty4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qty4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qty4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qty4KeyTyped(evt);
            }
        });
        retailpanel4.add(qty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 620, 58, 30));

        banaddpanel4.setBackground(new java.awt.Color(249, 215, 184));
        banaddpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        banaddpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        banaddpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add4.setBackground(new java.awt.Color(255, 255, 255));
        add4.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add4.setText("Add to Cart");
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
        banaddpanel4.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        retailpanel4.add(banaddpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 660, 100, 25));

        getContentPane().add(retailpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 415, 750));

        retailpanel3.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel3.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receipt.setEditable(false);
        receipt.setColumns(20);
        receipt.setLineWrap(true);
        receipt.setRows(5);
        receipt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jScrollPane1.setViewportView(receipt);

        retailpanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, 390));

        date.setBackground(new java.awt.Color(204, 204, 204));
        date.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setText("Age");
        date.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, 22));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Customer Details");
        retailpanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 410, -1));

        date3.setBackground(new java.awt.Color(204, 204, 204));
        date3.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        date3.setForeground(new java.awt.Color(204, 204, 204));
        date3.setText("Mobile");
        date3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 22));

        date5.setBackground(new java.awt.Color(204, 204, 204));
        date5.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        date5.setForeground(new java.awt.Color(204, 204, 204));
        date5.setText("Address");
        date5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 22));

        age.setBackground(new java.awt.Color(249, 215, 184));
        age.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        age.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        age.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFocusLost(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });
        retailpanel3.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 22));

        mobile.setBackground(new java.awt.Color(249, 215, 184));
        mobile.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        mobile.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mobile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileFocusLost(evt);
            }
        });
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        retailpanel3.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 230, 22));

        address.setBackground(new java.awt.Color(249, 215, 184));
        address.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });
        retailpanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 230, 22));

        date7.setBackground(new java.awt.Color(204, 204, 204));
        date7.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        date7.setForeground(new java.awt.Color(204, 204, 204));
        date7.setText("Cash");
        date7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 670, 70, 30));

        name.setBackground(new java.awt.Color(249, 215, 184));
        name.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        retailpanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, 22));

        socksaddpanel5.setBackground(new java.awt.Color(249, 215, 184));
        socksaddpanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        socksaddpanel5.setPreferredSize(new java.awt.Dimension(700, 307));
        socksaddpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socksadd4.setBackground(new java.awt.Color(255, 255, 255));
        socksadd4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd4.setText("Receipt");
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
        });
        socksaddpanel5.add(socksadd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        retailpanel3.add(socksaddpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 120, 30));

        socksaddpanel4.setBackground(new java.awt.Color(249, 215, 184));
        socksaddpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        socksaddpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        socksaddpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socksadd3.setBackground(new java.awt.Color(255, 255, 255));
        socksadd3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd3.setText("Total");
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
        socksaddpanel4.add(socksadd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        retailpanel3.add(socksaddpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 710, 100, 30));

        socksaddpanel3.setBackground(new java.awt.Color(249, 215, 184));
        socksaddpanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        socksaddpanel3.setPreferredSize(new java.awt.Dimension(700, 307));
        socksaddpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socksadd2.setBackground(new java.awt.Color(255, 255, 255));
        socksadd2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd2.setText("Clear");
        socksadd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        socksadd2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                socksadd2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        socksadd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                socksadd2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                socksadd2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                socksadd2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                socksadd2MouseReleased(evt);
            }
        });
        socksadd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                socksadd2KeyPressed(evt);
            }
        });
        socksaddpanel3.add(socksadd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 87, 30));

        retailpanel3.add(socksaddpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 87, 30));

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        currentdate.setBackground(new java.awt.Color(204, 204, 204));
        currentdate.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        currentdate.setForeground(new java.awt.Color(204, 204, 204));
        panel2.add(currentdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 20));

        retailpanel3.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 160, 20));

        date8.setBackground(new java.awt.Color(204, 204, 204));
        date8.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        date8.setForeground(new java.awt.Color(204, 204, 204));
        date8.setText("Name");
        date8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, 22));

        pmethod.setBackground(new java.awt.Color(249, 215, 184));
        pmethod.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        pmethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cash", "Online", "Cash+Online" }));
        pmethod.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(187, 120, 52), new java.awt.Color(0, 0, 0)));
        pmethod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pmethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmethodActionPerformed(evt);
            }
        });
        retailpanel3.add(pmethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 130, 30));

        date9.setBackground(new java.awt.Color(204, 204, 204));
        date9.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        date9.setForeground(new java.awt.Color(204, 204, 204));
        date9.setText("Payment Method");
        date9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date9, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 630, 190, 30));

        cashtf.setBackground(new java.awt.Color(249, 215, 184));
        cashtf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        cashtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cashtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cashtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cashtfFocusGained(evt);
            }
        });
        cashtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashtfActionPerformed(evt);
            }
        });
        cashtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cashtfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashtfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashtfKeyTyped(evt);
            }
        });
        retailpanel3.add(cashtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 70, 30));

        date10.setBackground(new java.awt.Color(204, 204, 204));
        date10.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        date10.setForeground(new java.awt.Color(204, 204, 204));
        date10.setText("Online");
        date10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), null, null));
        retailpanel3.add(date10, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 670, 70, 30));

        onlinetf.setBackground(new java.awt.Color(249, 215, 184));
        onlinetf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        onlinetf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        onlinetf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onlinetf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                onlinetfFocusGained(evt);
            }
        });
        onlinetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlinetfActionPerformed(evt);
            }
        });
        onlinetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                onlinetfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                onlinetfKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onlinetfKeyTyped(evt);
            }
        });
        retailpanel3.add(onlinetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 670, 83, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Expenses");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        retailpanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 605, 90, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Discount");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        retailpanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 605, 90, -1));

        getContentPane().add(retailpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 425, 750));

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\ForgetPasswordBackground.png")); // NOI18N
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String cdate,ctime,purchasedate,purchasetime,pfcontact="";
Connection con;
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
int info=0,billno=0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        wholesalelogo.setBorder(b);
        profilelogo.setBorder(null);
        
        receipt.setEditable(false);
        
        showDate();
        showTime();
        //Filling the Code ComboBox of Jeans
       if(info==0)
       {
            try
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/GarmentsShop","root","root");
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("Select distinct(Code) from jeans");
            while(rs1.next())
            {
                code1.addItem(rs1.getString("Code"));
            }
            ResultSet rs2=st.executeQuery("Select distinct(Code) from trouser");
            while(rs2.next())
            {
                code2.addItem(rs2.getString("Code"));
            }
            ResultSet rs3=st.executeQuery("Select distinct(Item) from undergarments");
            while(rs3.next())
            {
                code3.addItem(rs3.getString("Item"));
            }
            ResultSet rs4=st.executeQuery("Select distinct(Item) from socks");
            while(rs4.next())
            {
                sockscombo.addItem(rs4.getString("Item"));
            }
            ResultSet rs5=st.executeQuery("Select distinct(Code) from halfsleeveshirt");
            while(rs5.next())
            {
                code5.addItem(rs5.getString("Code"));
            }
            ResultSet rs6=st.executeQuery("Select distinct(Code) from Fullsleeveshirt");
            while(rs6.next())
            {
                code6.addItem(rs6.getString("Code"));
            }
            ResultSet rs7=st.executeQuery("Select distinct(Code) from lowers");
            while(rs7.next())
            {
                code4.addItem(rs7.getString("Code"));
            }
            ResultSet rs8=st.executeQuery("Select distinct(Code) from halfsleevetshirt");
            while(rs8.next())
            {
                code7.addItem(rs8.getString("Code"));
            }
            ResultSet rs9=st.executeQuery("Select distinct(Code) from fullsleevetshirt");
            while(rs9.next())
            {
                code8.addItem(rs9.getString("Code"));
            }
            ResultSet rs10=st.executeQuery("Select distinct(Item) from seasonal");
            while(rs10.next())
            {
                code9.addItem(rs10.getString("Item"));
            }
            ResultSet rs11=st.executeQuery("Select BillNo from customerinfo");
            while(rs11.next())
            {
                billno=rs11.getInt("BillNo");
            }
            billno++;
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
        receipt.append("                           Payment Statement\n");
        receipt.append("     "+cdate+"            "+ctime+"\n");
        receipt.append("     Bill No: "+billno+"\n");
        receipt.append("\tRMR GARMENTS\n");
        receipt.append("                            18/5 Sindhi Colony\n");
        receipt.append("                                  9826782684\n");
        receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        receipt.append("     Name\t");
        info++;
       }
       else
       {
           
       }

        
    }//GEN-LAST:event_formWindowGainedFocus
int count=0;
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
String halfshirtsize,halfshirtcode;
int halfshirtmrp,halfshirtcost;
    private void size5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size5ActionPerformed
halfshirtsize=(String)size5.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from halfsleeveshirt where Code='"+halfshirtcode+"'");
 while(rs.next())
 {
     halfshirtmrp=rs.getInt("MRP");
     halfshirtcost=rs.getInt("CP");
 }
 mrp5.setText(""+halfshirtmrp);
 qty5.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size5ActionPerformed

    private void code5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code5ActionPerformed
        String size;
        halfshirtcode=code5.getSelectedItem().toString();
        size5.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from halfsleeveshirtsize where Code='"+halfshirtcode+"' and Quantity>0");
            size5.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size5.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code5ActionPerformed

    private void mrp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp5ActionPerformed

    private void qty6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty6ActionPerformed
String fullshirtcode,fullshirtsize;
int fullshirtmrp,fullshirtcost;
    private void code6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code6ActionPerformed
        String size;
        fullshirtcode=code6.getSelectedItem().toString();
        size6.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from fullsleeveshirtsize where Code='"+fullshirtcode+"' and Quantity>0");
            size6.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size6.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code6ActionPerformed

    private void size6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size6ActionPerformed
fullshirtsize=(String)size6.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from fullsleeveshirt where Code='"+fullshirtcode+"'");
 while(rs.next())
 {
     fullshirtmrp=rs.getInt("MRP");
     fullshirtcost=rs.getInt("CP");
 }
 mrp6.setText(""+fullshirtmrp);
 qty6.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size6ActionPerformed

    private void qty7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty7ActionPerformed

    private void size7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size7ActionPerformed
halftshirtsize=(String)size7.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from halfsleevetshirt where Code='"+halftshirtcode+"'");
 while(rs.next())
 {
     halftshirtmrp=rs.getInt("MRP");
     halftshirtcost=rs.getInt("CP");
 }
 mrp7.setText(""+halftshirtmrp);
 qty7.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size7ActionPerformed

    private void add9AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add9AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add9AncestorAdded

    private void add9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add9MouseClicked
        if(seasonalsize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp9.getText());
        String item=(String)code9.getSelectedItem();
        String size=(String)size9.getSelectedItem();
        str=qty9.getText();
        if(str.equals(""))
        {
            qty9.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from seasonalsize where Item='"+item+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*seasonalmrp;
                total=total+amount;
                items=items+qty;
                seasonalcost=seasonalcost*qty;
                cp=cp+seasonalcost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"x"+seasonalitem+"     "+seasonalmrp+"       "+seasonalsize+"        "+amount+"\n");
                count++;
                tablename="seasonal"+"/";
                codename=seasonalitem+"/";
                mrpname=mrp+"/";
                sizename=seasonalsize+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"x"+seasonalitem+"     "+seasonalmrp+"       "+seasonalsize+"        "+amount+"\n");
                tablename=tablename+"seasonal"+"/";
                codename=codename+seasonalitem+"/";
                sizename=sizename+seasonalsize+"/";
                mrpname=mrpname+mrp+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update seasonal set Quantity=Quantity-"+qty+" where Item='"+seasonalitem+"'");
                    st.executeUpdate("update seasonalsize set Quantity=Quantity-"+qty+" where Item='"+seasonalitem+"' and size='"+seasonalsize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code9.setSelectedIndex(0);
                size9.setSelectedIndex(0);
                mrp9.setText("MRP");
                qty9.setText("QTY");
            }
        } 
        }
    }//GEN-LAST:event_add9MouseClicked

    private void add9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add9MouseEntered

    private void add9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add9MousePressed
        Border b=BorderFactory.createSoftBevelBorder(1, new Color(225,162,81,255), new Color(225,162,81,255),Color.BLACK,Color.BLACK);
        jsaddpanel.setBorder(b);
    }//GEN-LAST:event_add9MousePressed
        
    private void add9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add9MouseReleased
        Border b=BorderFactory.createSoftBevelBorder(1, Color.BLACK, Color.BLACK,new Color(225,162,81,255),new Color(225,162,81,255));
        jsaddpanel.setBorder(b);
    }//GEN-LAST:event_add9MouseReleased

    private void add9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add9KeyPressed
String halftshirtcode,halftshirtsize;
int halftshirtmrp,halftshirtcost;
    private void code7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code7ActionPerformed
        String size;
        halftshirtcode=code7.getSelectedItem().toString();
        size7.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from halfsleevetshirtsize where Code='"+halftshirtcode+"' and Quantity>0");
            size7.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size7.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code7ActionPerformed

    private void add6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add6AncestorAdded

    private void add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add6MouseClicked
        if(fullshirtsize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp6.getText());
        String code=(String)code6.getSelectedItem();
        String size=(String)size6.getSelectedItem();
        str=qty6.getText();
        if(str.equals(""))
        {
            qty6.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from fullsleeveshirtsize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*fullshirtmrp;
                total=total+amount;
                fullshirtcost=fullshirtcost*qty;
                items=items+qty;
                cp=cp+fullshirtcost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"xFull Shirt              "+fullshirtmrp+"       "+fullshirtsize+"          "+amount+"\n");
                count++;
                tablename="fullsleeveshirt"+"/";
                codename=fullshirtcode+"/";
                mrpname=mrp+"/";
                sizename=fullshirtsize+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"xFull Shirt              "+fullshirtmrp+"       "+fullshirtsize+"          "+amount+"\n");
                tablename=tablename+"fullsleeveshirt"+"/";
                codename=codename+fullshirtcode+"/";
                mrpname=mrpname+mrp+"/";
                sizename=sizename+fullshirtsize+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update fullsleeveshirt set Quantity=Quantity-"+qty+" where Code='"+fullshirtcode+"'");
                    st.executeUpdate("update fullsleeveshirtsize set Quantity=Quantity-"+qty+" where Code='"+fullshirtcode+"' and size='"+fullshirtsize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code5.setSelectedIndex(0);
                size5.setSelectedIndex(0);
                mrp5.setText("MRP");
                qty5.setText("QTY");
            }
        } 
        }
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

    private void add5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add5AncestorAdded

    private void add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add5MouseClicked
        if(halfshirtsize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp5.getText());
        String code=(String)code5.getSelectedItem();
        String size=(String)size5.getSelectedItem();
        str=qty5.getText();
        if(str.equals(""))
        {
            qty5.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from halfsleeveshirtsize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*halfshirtmrp;
                total=total+amount;
                items=items+qty;
                halfshirtcost=halfshirtcost*qty;
                cp=cp+halfshirtcost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"xHalf Shirt              "+halfshirtmrp+"       "+halfshirtsize+"        "+amount+"\n");
                count++;
                tablename="halfsleeveshirt"+"/";
                codename=halfshirtcode+"/";
                mrpname=mrp+"/";
                sizename=halfshirtsize+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"xHalf Shirt              "+halfshirtmrp+"       "+halfshirtsize+"        "+amount+"\n");
                tablename=tablename+"halfsleeveshirt"+"/";
                codename=codename+halfshirtcode+"/";
                mrpname=mrpname+mrp+"/";
                sizename=sizename+halfshirtsize+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update halfsleeveshirt set Quantity=Quantity-"+qty+" where Code='"+halfshirtcode+"'");
                    st.executeUpdate("update halfsleeveshirtsize set Quantity=Quantity-"+qty+" where Code='"+halfshirtcode+"' and size='"+halfshirtsize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code5.setSelectedIndex(0);
                size5.setSelectedIndex(0);
                mrp5.setText("MRP");
                qty5.setText("QTY");  
            }
        }
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
int cp=0;
    private void size1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size1ActionPerformed
jeanssize=(String)size1.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from jeans where Code='"+jeanscode+"'");
 while(rs.next())
 {
     jeansmrp=rs.getInt("MRP");
     jeanscost=rs.getInt("CP");
 }
 mrp1.setText(""+jeansmrp);
 qty1.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size1ActionPerformed
String jeanscode,jeanssize;
int jeansmrp,jeanscost;
    private void code1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code1ActionPerformed
        String size;
        jeanscode=code1.getSelectedItem().toString();
        size1.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from jeanssize where Code='"+jeanscode+"' and Quantity>0");
            size1.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size1.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code1ActionPerformed

    private void mrp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp1ActionPerformed
String trousercode,trousersize;
int trousermrp,trousercost;
    private void code2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code2ActionPerformed
        String size;
        trousercode=code2.getSelectedItem().toString();
        size2.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from trousersize where Code='"+trousercode+"' and Quantity>0");
            size2.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size2.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code2ActionPerformed

    private void size2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size2ActionPerformed
trousersize=(String)size2.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from trouser where Code='"+trousercode+"'");
 while(rs.next())
 {
     trousermrp=rs.getInt("MRP");
     trousercost=rs.getInt("CP");
 }
 mrp2.setText(""+trousermrp);
 qty2.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size2ActionPerformed

    private void qty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty2ActionPerformed
String uditem,udsize;
int udmrp,udcost;
    private void size3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size3ActionPerformed
udsize=(String)size3.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from undergarmentssize where size='"+udsize+"' and Item='"+uditem+"'");
 while(rs.next())
 {
     udmrp=rs.getInt("MRP");
     udcost=rs.getInt("CP");
 }
 mrp3.setText(""+udmrp);
 qty3.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size3ActionPerformed

    private void qty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty3ActionPerformed

    private void code3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code3ActionPerformed
        String size;
        uditem=code3.getSelectedItem().toString();
        size3.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(size) from undergarmentssize where Item='"+uditem+"'");
            size3.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size3.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }        
    }//GEN-LAST:event_code3ActionPerformed

    private void add1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add1AncestorAdded

    }//GEN-LAST:event_add1AncestorAdded
int total=0,items=0;
String tablename="",codename="",sizename="",qtyname="",mrpname="";
    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
        if(jeanssize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp1.getText());
        String code=(String)code1.getSelectedItem();
        String size=(String)size1.getSelectedItem();
        str=qty1.getText();
        if(str.equals(""))
        {
            qty1.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from jeanssize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
        int amount=qty*jeansmrp;
        total=total+amount;
        items=items+qty;
        jeanscost=jeanscost*qty;
        cp=cp+jeanscost;
        if(count==0)
        {
        receipt.append("     ItemName\t          MRP     Size     Amount\n");
        receipt.append("     "+qty+"xJeans\t          "+jeansmrp+"       "+jeanssize+"        "+amount+"\n");
        count++;
        tablename="jeans"+"/";
        codename=jeanscode+"/";
        mrpname=mrp+"/";
        sizename=jeanssize+"/";
        qtyname=qty+"/";
        }
        else
        {
        receipt.append("     "+qty+"xJeans\t          "+jeansmrp+"       "+jeanssize+"        "+amount+"\n");
        tablename=tablename+"jeans"+"/";
        codename=codename+jeanscode+"/";
        sizename=sizename+jeanssize+"/";
        mrpname=mrpname+mrp+"/";
        qtyname=qtyname+qty+"/";
        }
        try{
            Statement st=con.createStatement();
            st.executeUpdate("update jeans set Quantity=Quantity-"+qty+" where Code='"+jeanscode+"'");
            st.executeUpdate("update jeanssize set Quantity=Quantity-"+qty+" where Code='"+jeanscode+"' and size='"+jeanssize+"'");
        }catch(Exception e){
            System.out.println("Error");
        }
            
        code1.setSelectedIndex(0);
        size1.setSelectedIndex(0);
        mrp1.setText("MRP");
        qty1.setText("QTY");
            }
        }  
        }
    }//GEN-LAST:event_add1MouseClicked

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add1MouseEntered

    private void add1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add1MousePressed

    private void add1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add1MouseReleased

    private void add1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add1KeyPressed

    private void add2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add2AncestorAdded

    private void add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseClicked
        if(trousersize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp2.getText());
        String code=(String)code2.getSelectedItem();
        String size=(String)size2.getSelectedItem();
        str=qty2.getText();
        if(str.equals(""))
        {
            qty2.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from trousersize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*trousermrp;
                total=total+amount;
                trousercost=trousercost*qty;
                items=items+qty;
                cp=cp+trousercost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"xTrouser\t          "+trousermrp+"       "+trousersize+"        "+amount+"\n");
                count++;
                tablename="trouser"+"/";
                codename=trousercode+"/";
                sizename=trousersize+"/";
                mrpname=mrp+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"xTrouser\t          "+trousermrp+"       "+trousersize+"        "+amount+"\n");
                tablename=tablename+"trouser"+"/";
                codename=codename+trousercode+"/";
                sizename=sizename+trousersize+"/";
                mrpname=mrpname+mrp+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update trouser set Quantity=Quantity-"+qty+" where Code='"+trousercode+"'");
                    st.executeUpdate("update trousersize set Quantity=Quantity-"+qty+" where Code='"+trousercode+"' and size='"+trousersize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code2.setSelectedIndex(0);
                size2.setSelectedIndex(0);
                mrp2.setText("MRP");
                qty2.setText("QTY"); 
            }
        }  
        }
    }//GEN-LAST:event_add2MouseClicked

    private void add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add2MouseEntered

    private void add2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add2MousePressed

    private void add2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add2MouseReleased

    private void add2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add2KeyPressed

    }//GEN-LAST:event_add2KeyPressed
String socksitem;
int socksmrp,sockscost;
    private void sockscomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sockscomboActionPerformed
        socksitem=sockscombo.getSelectedItem().toString();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from socks where Item='"+socksitem+"'");
            while(rs.next())
            {
                socksmrp=rs.getInt("MRP");
                sockscost=rs.getInt("CP");
            }
            socksmrptf.setText(""+socksmrp);
            socksqtytf.setText("1");
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }        
    }//GEN-LAST:event_sockscomboActionPerformed

    private void socksqtytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socksqtytfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksqtytfActionPerformed

    private void add3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add3AncestorAdded

    private void add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add3MouseClicked
        if(udsize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp3.getText());
        String item=(String)code3.getSelectedItem();
        String size=(String)size3.getSelectedItem();
        str=qty3.getText();
        if(str.equals(""))
        {
            qty3.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from undergarmentssize where Item='"+item+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*udmrp;
                total=total+amount;
                items=items+qty;
                udcost=udcost*qty;
                cp=cp+udcost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"x"+uditem+"\t          "+udmrp+"       "+udsize+"        "+amount+"\n");
                count++;
                tablename="undergarments"+"/";
                codename=uditem+"/";
                sizename=udsize+"/";
                mrpname=mrp+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"x"+uditem+"\t          "+udmrp+"       "+udsize+"        "+amount+"\n");
                tablename=tablename+"undergarments"+"/";
                codename=codename+uditem+"/";
                mrpname=mrpname+mrp+"/";
                sizename=sizename+udsize+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update undergarments set Quantity=Quantity-"+qty+" where Item='"+uditem+"'");
                    st.executeUpdate("update undergarmentssize set Quantity=Quantity-"+qty+" where Item='"+uditem+"' and size='"+udsize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code3.setSelectedIndex(0);
                size3.setSelectedIndex(0);
                mrp3.setText("MRP");
                qty3.setText("QTY");
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
String fulltshirtcode,fulltshirtsize;
int fulltshirtmrp,fulltshirtcost;
    private void code8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code8ActionPerformed
        String size;
        fulltshirtcode=code8.getSelectedItem().toString();
        size8.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from fullsleevetshirtsize where Code='"+fulltshirtcode+"' and Quantity>0");
            size8.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size8.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code8ActionPerformed

    private void size8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size8ActionPerformed
fulltshirtsize=(String)size8.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from fullsleevetshirt where Code='"+fulltshirtcode+"'");
 while(rs.next())
 {
     fulltshirtmrp=rs.getInt("MRP");
     fulltshirtcost=rs.getInt("CP");
 }
 mrp8.setText(""+fulltshirtmrp);
 qty8.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size8ActionPerformed

    private void qty8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty8ActionPerformed

    private void add7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add7AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add7AncestorAdded

    private void add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add7MouseClicked
        if(halftshirtsize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp7.getText());
        String code=(String)code7.getSelectedItem();
        String size=(String)size7.getSelectedItem();
        str=qty7.getText();
        if(str.equals(""))
        {
            qty7.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from halfsleevetshirtsize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*halftshirtmrp;
                total=total+amount;
                items=items+qty;
                halftshirtcost=halftshirtcost*qty;
                cp=cp+halftshirtcost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"xHalf T-Shirt          "+halftshirtmrp+"       "+halftshirtsize+"          "+amount+"\n");
                count++;
                tablename="halfsleevetshirt"+"/";
                codename=halftshirtcode+"/";
                sizename=halftshirtsize+"/";
                mrpname=mrp+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"xHalf T-Shirt          "+halftshirtmrp+"       "+halftshirtsize+"          "+amount+"\n");
                tablename=tablename+"halfsleevetshirt"+"/";
                codename=codename+halftshirtcode+"/";
                sizename=sizename+halftshirtsize+"/";
                mrpname=mrpname+mrp+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update halfsleevetshirt set Quantity=Quantity-"+qty+" where Code='"+halftshirtcode+"'");
                    st.executeUpdate("update halfsleevetshirtsize set Quantity=Quantity-"+qty+" where Code='"+halftshirtcode+"' and size='"+halftshirtsize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code7.setSelectedIndex(0);
                size7.setSelectedIndex(0);
                mrp7.setText("MRP");
                qty7.setText("QTY");
            }
        } 
        }
    }//GEN-LAST:event_add7MouseClicked

    private void add7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add7MouseEntered

    private void add7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add7MousePressed

    private void add7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add7MouseReleased

    private void add7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add7KeyPressed
String seasonalitem,seasonalsize;
int seasonalmrp,seasonalcost;
    private void code9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code9ActionPerformed
        String size;
        seasonalitem=code9.getSelectedItem().toString();
        size9.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from seasonalsize where Item='"+seasonalitem+"' and Quantity>0");
            size9.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size9.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code9ActionPerformed

    private void size9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size9ActionPerformed
seasonalsize=(String)size9.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from seasonalsize where Item='"+seasonalitem+"' and size='"+seasonalsize+"'");
 while(rs.next())
 {
     seasonalmrp=rs.getInt("MRP");
     seasonalcost=rs.getInt("CP");
 }
 mrp9.setText(""+seasonalmrp);
 qty9.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size9ActionPerformed

    private void qty9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty9ActionPerformed

    private void add8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add8AncestorAdded

    private void add8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add8MouseClicked
        if(fulltshirtsize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp8.getText());
        String code=(String)code8.getSelectedItem();
        String size=(String)size8.getSelectedItem();
        str=qty8.getText();
        if(str.equals(""))
        {
            qty8.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from fullsleevetshirtsize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*fulltshirtmrp;
                total=total+amount;
                items=items+qty;
                fulltshirtcost=fulltshirtcost*qty;
                cp=cp+fulltshirtcost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"xFull T-Shirt          "+fulltshirtmrp+"       "+fulltshirtsize+"          "+amount+"\n");
                count++;
                tablename="fullsleevetshirt"+"/";
                codename=fulltshirtcode+"/";
                mrpname=mrp+"/";
                sizename=fulltshirtsize+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"xFull T-Shirt          "+fulltshirtmrp+"       "+fulltshirtsize+"          "+amount+"\n");
                tablename=tablename+"fullsleevetshirt"+"/";
                codename=codename+fulltshirtcode+"/";
                sizename=sizename+fulltshirtsize+"/";
                mrpname=mrpname+mrp+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update fullsleevetshirt set Quantity=Quantity-"+qty+" where Code='"+fulltshirtcode+"'");
                    st.executeUpdate("update fullsleevetshirtsize set Quantity=Quantity-"+qty+" where Code='"+fulltshirtcode+"' and size='"+fulltshirtsize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code8.setSelectedIndex(0);
                size8.setSelectedIndex(0);
                mrp8.setText("MRP");
                qty8.setText("QTY");
            }
        } 
        }
    }//GEN-LAST:event_add8MouseClicked

    private void add8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add8MouseEntered

    private void add8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add8MousePressed

    private void add8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_add8MouseReleased

    private void add8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add8KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add8KeyPressed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void code1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_code1ItemStateChanged


    }//GEN-LAST:event_code1ItemStateChanged

    private void size1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size1ItemStateChanged
        jeanssize=(String)size1.getSelectedItem();
    }//GEN-LAST:event_size1ItemStateChanged
String cname;   
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        cname=name.getText();
        if(cname.equals(""))
        {
            name.setText("");
        }
        else
        {
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[7]=contentarr[7].replace(contentarr[7],"     Name\t"+cname);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_nameKeyPressed

    private void socksadd1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd1AncestorAdded

    private void socksadd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd1MouseClicked
        int availableqty = 0;
        String item=(String)sockscombo.getSelectedItem();
        int mrp=Integer.parseInt(socksmrptf.getText());
        str=socksqtytf.getText();
        if(str.equals(""))
        {
            socksqtytf.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from socks where Item='"+item+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailSocksError r1=new RetailSocksError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*socksmrp;
                total=total+amount;
                items=items+qty;
                sockscost=sockscost*qty;
                cp=cp+sockscost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"x"+socksitem+"          "+socksmrp+"            -         "+amount+"\n");
                count++;
                tablename="socks"+"/";
                mrpname=mrp+"/";
                codename=socksitem+"/";
                sizename="NA"+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"x"+socksitem+"          "+socksmrp+"            -         "+amount+"\n");
                tablename=tablename+"socks"+"/";
                codename=codename+socksitem+"/";
                sizename=sizename+"NA"+"/";
                qtyname=qtyname+qty+"/";
                mrpname=mrpname+mrp+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update socks set Quantity=Quantity-"+qty+" where Item='"+socksitem+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                sockscombo.setSelectedIndex(0);
                socksmrptf.setText("MRP");
                socksqtytf.setText("QTY");
            }
        }         
    }//GEN-LAST:event_socksadd1MouseClicked

    private void socksadd1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd1MouseEntered

    private void socksadd1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd1MousePressed

    private void socksadd1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd1MouseReleased

    private void socksadd1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd1KeyPressed

    private void socksadd2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd2AncestorAdded

    private void socksadd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd2MouseClicked
        clearAllItems();
        try{
            con.rollback();
            con.commit();
        }catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_socksadd2MouseClicked

    private void socksadd2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd2MouseEntered

    private void socksadd2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd2MousePressed

    private void socksadd2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd2MouseReleased

    private void socksadd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd2KeyPressed

    private void socksadd3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3AncestorAdded
int profit,data=0,discount=0;
    private void socksadd3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd3MouseClicked
        showDate();
        showTime();
        if(data==0)
        {
        String content=receipt.getText();
        String contentarr[]=content.split("\n");
        contentarr[1]=contentarr[1].replace(contentarr[1],"     "+cdate+"            "+ctime);      
        receipt.setText("");
        for(int i=0;i<contentarr.length;i++)
        {
            receipt.append(contentarr[i]);
            receipt.append("\n");
        }
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from discount");
            while(rs.next())
            {
                discount=rs.getInt("WholeSaleDiscount");
            }
        }
        catch(Exception e)
        {
            
        }
        receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");  
        receipt.append("     Total Items\t\t         "+items+"\n");
        receipt.append("     Total\t\t         "+total+"/-\n\n");
        receipt.append("     Discount                                              -"+((total*5)/100+(total*discount)/100)+"\n");
        receipt.append("     SGST                                                     "+(total*5)/200+"\n");
        receipt.append("     CGST                                                     "+(total*5)/200+"\n");  
        total=total-(total*discount)/100;
        receipt.append("     Amount to be paid                              "+total+"\n");
        receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
        profit=total-cp;
        data++;
        }
        else{
            
        }
        System.out.println(tablename);
        System.out.println(codename);
        System.out.println(sizename);
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
int namecount=0,mobilecount=0,addresscount=0,agecount=0;
    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
       cname=name.getText();
       if(namecount==0)
       {
        receipt.append("     Mobile\t");
        namecount++;
       }
       else
       {
           
       }
    }//GEN-LAST:event_nameFocusLost

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

    }//GEN-LAST:event_nameKeyTyped
String cmobile,caddress;
int cage;
    private void mobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFocusLost
        cmobile=mobile.getText();
        if(mobilecount==0)
        {
            receipt.append("     Address\t");
            mobilecount++;
        }
        else
        {
            
        }
    }//GEN-LAST:event_mobileFocusLost

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        caddress=address.getText();
        if(addresscount==0)
        {
            receipt.append("     Age\t");
            addresscount++;
        }
        else
        {
            
        }
    }//GEN-LAST:event_addressFocusLost

    private void ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusLost
        cage=Integer.parseInt(age.getText());
        if(agecount==0)
        {
        receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        agecount++;
        }
        else{
            
        }
    }//GEN-LAST:event_ageFocusLost

    private void size2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size2ItemStateChanged
        trousersize=(String)size2.getSelectedItem();
    }//GEN-LAST:event_size2ItemStateChanged

    private void size3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size3ItemStateChanged
udsize=(String)size3.getSelectedItem();

    }//GEN-LAST:event_size3ItemStateChanged

    private void mrp1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp1FocusGained

    }//GEN-LAST:event_mrp1FocusGained

    private void qty1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty1FocusGained
        qty1.setText("");
    }//GEN-LAST:event_qty1FocusGained

    private void mrp2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp2FocusGained

    }//GEN-LAST:event_mrp2FocusGained

    private void mrp3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp3FocusGained

    }//GEN-LAST:event_mrp3FocusGained

    private void socksmrptfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_socksmrptfFocusGained

    }//GEN-LAST:event_socksmrptfFocusGained

    private void mrp5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp5FocusGained

    }//GEN-LAST:event_mrp5FocusGained

    private void qty2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty2FocusGained
        qty2.setText("");
    }//GEN-LAST:event_qty2FocusGained

    private void qty3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty3FocusGained
        qty3.setText("");
    }//GEN-LAST:event_qty3FocusGained

    private void socksqtytfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_socksqtytfFocusGained
        socksqtytf.setText("");
    }//GEN-LAST:event_socksqtytfFocusGained

    private void qty5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty5FocusGained
        qty5.setText("");
    }//GEN-LAST:event_qty5FocusGained
String lowercode,lowersize;
int lowermrp,lowercost;
    private void code4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code4ActionPerformed
        String size;
        lowercode=code4.getSelectedItem().toString();
        size4.removeAllItems();
         try
            {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select distinct(Size) from lowerssize where Code='"+lowercode+"' and Quantity>0");
            size4.addItem("Size");
            while(rs.next())
            {
                size=rs.getString("Size");
                size4.addItem(size);
            }
           }
           catch(Exception e)
           {
            JOptionPane.showMessageDialog(null,"Record not Stored");
           }
    }//GEN-LAST:event_code4ActionPerformed

    private void size4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_size4ItemStateChanged

    private void size4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size4ActionPerformed
lowersize=(String)size4.getSelectedItem();
try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("Select * from lowers where Code='"+lowercode+"'");
 while(rs.next())
 {
     lowermrp=rs.getInt("MRP");
     lowercost=rs.getInt("CP");
 }
 mrp4.setText(""+lowermrp);
 qty4.setText("1");
}
catch(Exception e)
{
 JOptionPane.showMessageDialog(null,"Record not Stored");
}
    }//GEN-LAST:event_size4ActionPerformed

    private void mrp4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mrp4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mrp4FocusGained

    private void qty4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty4FocusGained
        qty4.setText("");
    }//GEN-LAST:event_qty4FocusGained

    private void qty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty4ActionPerformed

    private void add4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_add4AncestorAdded

    private void add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add4MouseClicked
        if(lowersize.equals("Size"))
        {
            SelectSize s=new SelectSize();
            s.setVisible(true);
        }
        else
        {
        int availableqty = 0;
        int mrp=Integer.parseInt(mrp4.getText());
        String code=(String)code4.getSelectedItem();
        String size=(String)size4.getSelectedItem();
        str=qty4.getText();
        if(str.equals(""))
        {
            qty4.setText("");
        }
        else
        {
            int qty=Integer.parseInt(str);
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select Quantity from lowerssize where Code='"+code+"' and Size='"+size+"'");
            while(rs.next())
            {
                availableqty=rs.getInt("Quantity");
            }
            }catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            if(qty<=10)
            {
                 WholeSaleQuantityError r=new WholeSaleQuantityError();
                 r.setVisible(true); 
            }
            else if(qty>availableqty)
            {
                RetailDatabaseQuantityError r1=new RetailDatabaseQuantityError(availableqty);
                r1.setVisible(true);
            }
            else
            {
                int amount=qty*lowermrp;
                total=total+amount;
                items=items+qty;
                lowercost=lowercost*qty;
                cp=cp+lowercost;
                if(count==0)
                {
                receipt.append("     ItemName\t          MRP     Size     Amount\n");
                receipt.append("     "+qty+"xLower\t          "+lowermrp+"       "+lowersize+"        "+amount+"\n");
                count++;
                tablename="lowers"+"/";
                codename=lowercode+"/";
                sizename=lowersize+"/";
                mrpname=mrp+"/";
                qtyname=qty+"/";
                }
                else
                {
                receipt.append("     "+qty+"xLower\t          "+lowermrp+"       "+lowersize+"        "+amount+"\n");
                tablename=tablename+"lowers"+"/";
                codename=codename+lowercode+"/";
                sizename=sizename+lowersize+"/";
                mrpname=mrpname+mrp+"/";
                qtyname=qtyname+qty+"/";
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("update lowers set Quantity=Quantity-"+qty+" where Code='"+lowercode+"'");
                    st.executeUpdate("update lowerssize set Quantity=Quantity-"+qty+" where Code='"+lowercode+"' and size='"+lowersize+"'");
                }catch(Exception e){
                    System.out.println("Error");
                }
                code4.setSelectedIndex(0);
                size4.setSelectedIndex(0);
                mrp4.setText("MRP");
                qty4.setText("QTY");
            }
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

    private void size9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_size9ItemStateChanged

    }//GEN-LAST:event_size9ItemStateChanged

    private void socksadd4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4KeyPressed

    private void socksadd4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4MouseReleased

    private void socksadd4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4MousePressed

    private void socksadd4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4MouseEntered
int online,receiptcount=0;
    private void socksadd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseClicked
        if(method.equals("Select"))
        {
            SelectPaymentMethod s=new SelectPaymentMethod();
            s.setVisible(true);
        }
        else
        {
            if(receiptcount==0)
                {
                cash=Integer.parseInt(cashtf.getText());
                online=Integer.parseInt(onlinetf.getText());
                if(method.equals("Cash"))
                {
                receipt.append("     Cash \t\t         "+cash+"/-\n");
                }
                else if(method.equals("Online"))
                {
                receipt.append("     Online\t\t         "+online+"/-\n");    
                }
                else if(method.equals("Cash+Online"))
                {
                receipt.append("     Cash \t\t         "+cash+"/-\n");
                receipt.append("     Online\t\t         "+online+"/-\n");    
                }
                receipt.append("\n\n\n                         Have a Good Day...!!\n");
                }
                else{

                }
                try{
                    con.commit();
                }catch(Exception e){
                    System.out.println("Error");
                }
                try{
                    Statement st=con.createStatement();
                    st.executeUpdate("insert into example values('Mohittt',20)");
                    System.out.println(mrpname);
                    st.executeUpdate("insert into customerinfo values("+billno+",'"+cname+"','"+cmobile+"','"+caddress+"',"+cage+","+total+","+profit+","+cash+","+online+",'"+purchasedate+"','"+purchasetime+"','"+method+"','WholeSale')");
                    st.executeUpdate("insert into customerpurchases values("+billno+",'"+codename+"','"+sizename+"','"+tablename+"','"+qtyname+"','"+mrpname+"')");
                    con.commit();
                }catch(Exception e)
                {
                    System.out.println("Not inserted");
                }
        }
    }//GEN-LAST:event_socksadd4MouseClicked

    private void socksadd4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4AncestorAdded
String method="Select";
    private void pmethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmethodActionPerformed
        method=(String)pmethod.getSelectedItem();
        if(method.equals("Cash"))
        {
            cashtf.setText(""+total);
            onlinetf.setText("0");
            cashtf.setEditable(false);
            onlinetf.setEditable(false);
        }
        else if(method.equals("Online"))
        {
            cashtf.setText("0");
            onlinetf.setText(""+total);
            cashtf.setEditable(false);
            onlinetf.setEditable(false);
        }
        else if(method.equals("Cash+Online"))
        {
            cashtf.setText(""+total/2);
            onlinetf.setText(""+total/2);
            cashtf.setEditable(true);
            onlinetf.setEditable(true);
        }
        else
        {
            SelectPaymentMethod s=new SelectPaymentMethod();
            s.setVisible(true);
        }
    }//GEN-LAST:event_pmethodActionPerformed

    private void cashtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cashtfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cashtfFocusGained

    private void cashtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashtfActionPerformed

    private void onlinetfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_onlinetfFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_onlinetfFocusGained

    private void onlinetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlinetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onlinetfActionPerformed
int cash,temptotal;
String str;
    private void cashtfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashtfKeyTyped
        str=cashtf.getText();
        if(str.equals(""))
        {
            cashtf.setText("");
            onlinetf.setText(""+total);
        }
        else
        {
        cash=Integer.parseInt(str);
        temptotal=total-cash;
        onlinetf.setText(""+temptotal);    
        }
    }//GEN-LAST:event_cashtfKeyTyped

    private void cashtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashtfKeyPressed
        str=cashtf.getText();
        if(str.equals(""))
        {
            cashtf.setText("");
            onlinetf.setText(""+total);
        }
        else
        {
        cash=Integer.parseInt(str);
        temptotal=total-cash;
        onlinetf.setText(""+temptotal);    
        }  
    }//GEN-LAST:event_cashtfKeyPressed

    private void socksadd3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksadd3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd3KeyReleased

    private void cashtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashtfKeyReleased
        str=cashtf.getText();
        if(str.equals(""))
        {
            cashtf.setText("");
            onlinetf.setText(""+total);
        }
        else
        {
        cash=Integer.parseInt(str);
        temptotal=total-cash;
        onlinetf.setText(""+temptotal);    
        }  
    }//GEN-LAST:event_cashtfKeyReleased

    private void onlinetfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onlinetfKeyPressed
        str=onlinetf.getText();
        if(str.equals(""))
        {
            onlinetf.setText("");
            cashtf.setText(""+total);
        }
        else
        {
        online=Integer.parseInt(str);
        temptotal=total-online;
        cashtf.setText(""+temptotal);    
        }
    }//GEN-LAST:event_onlinetfKeyPressed

    private void onlinetfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onlinetfKeyReleased
        str=onlinetf.getText();
        if(str.equals(""))
        {
            onlinetf.setText("");
            cashtf.setText(""+total);
        }
        else
        {
        online=Integer.parseInt(str);
        temptotal=total-online;
        cashtf.setText(""+temptotal);    
        }
    }//GEN-LAST:event_onlinetfKeyReleased

    private void onlinetfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onlinetfKeyTyped
        str=onlinetf.getText();
        if(str.equals(""))
        {
            onlinetf.setText("");
            cashtf.setText(""+total);
        }
        else
        {
        online=Integer.parseInt(str);
        temptotal=total-online;
        cashtf.setText(""+temptotal);    
        }
    }//GEN-LAST:event_onlinetfKeyTyped

    private void qty1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty1KeyPressed
    }//GEN-LAST:event_qty1KeyPressed

    private void qty1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty1KeyReleased

    }//GEN-LAST:event_qty1KeyReleased

    private void qty1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty1KeyTyped

    }//GEN-LAST:event_qty1KeyTyped

    private void qty2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty2KeyPressed

    }//GEN-LAST:event_qty2KeyPressed

    private void qty2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty2KeyReleased

    }//GEN-LAST:event_qty2KeyReleased

    private void qty2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty2KeyTyped

    }//GEN-LAST:event_qty2KeyTyped

    private void qty4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty4KeyPressed

    }//GEN-LAST:event_qty4KeyPressed

    private void qty4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty4KeyReleased

    }//GEN-LAST:event_qty4KeyReleased

    private void qty4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty4KeyTyped

    }//GEN-LAST:event_qty4KeyTyped

    private void qty6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty6FocusGained
    qty6.setText("");
    }//GEN-LAST:event_qty6FocusGained

    private void qty7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty7FocusGained
    qty7.setText("");
    }//GEN-LAST:event_qty7FocusGained

    private void qty8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty8FocusGained
    qty8.setText("");
    }//GEN-LAST:event_qty8FocusGained

    private void qty9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qty9FocusGained
    qty9.setText("");
    }//GEN-LAST:event_qty9FocusGained

    private void qty5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty5KeyPressed
 
    }//GEN-LAST:event_qty5KeyPressed

    private void qty5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty5KeyReleased

    }//GEN-LAST:event_qty5KeyReleased

    private void qty5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty5KeyTyped

    }//GEN-LAST:event_qty5KeyTyped

    private void qty6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty6KeyPressed

    }//GEN-LAST:event_qty6KeyPressed

    private void qty6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty6KeyReleased

    }//GEN-LAST:event_qty6KeyReleased

    private void qty6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty6KeyTyped
 
    }//GEN-LAST:event_qty6KeyTyped

    private void qty7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty7KeyPressed

    }//GEN-LAST:event_qty7KeyPressed

    private void qty7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty7KeyReleased

    }//GEN-LAST:event_qty7KeyReleased

    private void qty7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty7KeyTyped

    }//GEN-LAST:event_qty7KeyTyped

    private void qty8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty8KeyPressed

    }//GEN-LAST:event_qty8KeyPressed

    private void qty8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty8KeyReleased

    }//GEN-LAST:event_qty8KeyReleased

    private void qty8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty8KeyTyped

    }//GEN-LAST:event_qty8KeyTyped

    private void qty9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty9KeyPressed

    }//GEN-LAST:event_qty9KeyPressed

    private void qty9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty9KeyReleased

    }//GEN-LAST:event_qty9KeyReleased

    private void qty9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty9KeyTyped

    }//GEN-LAST:event_qty9KeyTyped

    private void qty3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty3KeyPressed

    }//GEN-LAST:event_qty3KeyPressed

    private void qty3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty3KeyReleased

    }//GEN-LAST:event_qty3KeyReleased

    private void qty3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qty3KeyTyped

    }//GEN-LAST:event_qty3KeyTyped

    private void sockscomboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sockscomboKeyPressed

    }//GEN-LAST:event_sockscomboKeyPressed

    private void socksqtytfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksqtytfKeyPressed

    }//GEN-LAST:event_socksqtytfKeyPressed

    private void socksqtytfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksqtytfKeyReleased

    }//GEN-LAST:event_socksqtytfKeyReleased

    private void socksqtytfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socksqtytfKeyTyped

    }//GEN-LAST:event_socksqtytfKeyTyped

    private void mobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyPressed
        cmobile=mobile.getText();
        if(cmobile.equals(""))
        {
            mobile.setText("");
        }
        else
        {
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[8]=contentarr[8].replace(contentarr[8],"     Mobile\t"+cmobile);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_mobileKeyPressed

    private void mobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyReleased
        cmobile=mobile.getText();
        if(cmobile.equals(""))
        {
            mobile.setText("");
        }
        else
        {
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[8]=contentarr[8].replace(contentarr[8],"     Mobile\t"+cmobile);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_mobileKeyReleased

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped

    }//GEN-LAST:event_mobileKeyTyped

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Expensess e=new Expensess();
        e.setBounds(0, 0, 0, 0);
        e.setVisible(true);
        Thread th=new Thread(){
            @Override
            public void run(){
                try{
                    for(int i=310;i<834;i++)
                    {
                        Thread.sleep(1);
                        e.setBounds(i,310,317,400);
                    }
                }
                catch(Exception e)
                {
                    System.out.println("Error");
                }
            }
        };th.start();

    }//GEN-LAST:event_jLabel13MouseClicked

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        cname=name.getText();
        if(cname.equals(""))
        {
            name.setText("");
        }
        else
        {
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[7]=contentarr[7].replace(contentarr[7],"     Name\t"+cname);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_nameKeyReleased

    private void addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyPressed
        caddress=address.getText();
        if(caddress.equals(""))
        {
            address.setText("");
        }
        else
        {
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[9]=contentarr[9].replace(contentarr[9],"     Address\t"+caddress);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_addressKeyPressed

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased
        caddress=address.getText();
        if(caddress.equals(""))
        {
            address.setText("");
        }
        else
        {
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[9]=contentarr[9].replace(contentarr[9],"     Address\t"+caddress);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_addressKeyReleased

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        String sage=age.getText();
        if(sage.equals(""))
        {
            age.setText("");
        }
        else
        {
            cage=Integer.parseInt(age.getText());
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[10]=contentarr[10].replace(contentarr[10],"     Age\t"+cage);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_ageKeyPressed

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        String sage=age.getText();
        if(sage.equals(""))
        {
            age.setText("");
        }
        else
        {
            cage=Integer.parseInt(age.getText());
            showDate();
            showTime();
            String content=receipt.getText();
            String contentarr[]=content.split("\n");
            contentarr[10]=contentarr[10].replace(contentarr[10],"     Age\t"+cage);      
            receipt.setText("");
            for(int i=0;i<contentarr.length;i++)
            {
                receipt.append(contentarr[i]);
                receipt.append("\n");
            }
        }
    }//GEN-LAST:event_ageKeyReleased

    private void profilelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilelogoMouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        wholesalelogo.setBorder(null);
        ProfilePage b1=new ProfilePage(pfcontact);
        b1.setVisible(true);
    }//GEN-LAST:event_profilelogoMouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        wholesalelogo.setBorder(null);
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

    private void p7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseClicked
        ProfilePage b=new ProfilePage(pfcontact);
        b.setVisible(true);
    }//GEN-LAST:event_p7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LogoutPage lp=new LogoutPage();
        lp.setVisible(true);
        LogoutSuccess l=new LogoutSuccess();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        DiscountFrame d=new DiscountFrame();
        d.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(WholeSaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WholeSaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WholeSaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WholeSaleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new WholeSaleFrame(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IconBar;
    private javax.swing.JLabel Toggle;
    private javax.swing.JLabel add1;
    private javax.swing.JLabel add2;
    private javax.swing.JLabel add3;
    private javax.swing.JLabel add4;
    private javax.swing.JLabel add5;
    private javax.swing.JLabel add6;
    private javax.swing.JLabel add7;
    private javax.swing.JLabel add8;
    private javax.swing.JLabel add9;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JLabel balancelogo;
    private javax.swing.JPanel banaddpanel;
    private javax.swing.JPanel banaddpanel1;
    private javax.swing.JPanel banaddpanel2;
    private javax.swing.JPanel banaddpanel3;
    private javax.swing.JPanel banaddpanel4;
    private javax.swing.JLabel bgimage;
    private javax.swing.JTextField cashtf;
    private javax.swing.JComboBox<String> code1;
    private javax.swing.JComboBox<String> code2;
    private javax.swing.JComboBox<String> code3;
    private javax.swing.JComboBox<String> code4;
    private javax.swing.JComboBox<String> code5;
    private javax.swing.JComboBox<String> code6;
    private javax.swing.JComboBox<String> code7;
    private javax.swing.JComboBox<String> code8;
    private javax.swing.JComboBox<String> code9;
    private javax.swing.JLabel currentdate;
    private javax.swing.JLabel customerlogo;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date10;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date5;
    private javax.swing.JLabel date7;
    private javax.swing.JLabel date8;
    private javax.swing.JLabel date9;
    private javax.swing.JLabel employeelogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel jsaddpanel;
    private javax.swing.JPanel jsaddpanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField mrp1;
    private javax.swing.JTextField mrp2;
    private javax.swing.JTextField mrp3;
    private javax.swing.JTextField mrp4;
    private javax.swing.JTextField mrp5;
    private javax.swing.JTextField mrp6;
    private javax.swing.JTextField mrp7;
    private javax.swing.JTextField mrp8;
    private javax.swing.JTextField mrp9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField onlinetf;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private java.awt.Panel panel2;
    private javax.swing.JComboBox<String> pmethod;
    private javax.swing.JLabel profilelogo;
    private javax.swing.JTextField qty1;
    private javax.swing.JTextField qty2;
    private javax.swing.JTextField qty3;
    private javax.swing.JTextField qty4;
    private javax.swing.JTextField qty5;
    private javax.swing.JTextField qty6;
    private javax.swing.JTextField qty7;
    private javax.swing.JTextField qty8;
    private javax.swing.JTextField qty9;
    private javax.swing.JTextArea receipt;
    private javax.swing.JLabel retaillogo;
    private javax.swing.JPanel retailpanel1;
    private javax.swing.JPanel retailpanel3;
    private javax.swing.JPanel retailpanel4;
    private javax.swing.JComboBox<String> size1;
    private javax.swing.JComboBox<String> size2;
    private javax.swing.JComboBox<String> size3;
    private javax.swing.JComboBox<String> size4;
    private javax.swing.JComboBox<String> size5;
    private javax.swing.JComboBox<String> size6;
    private javax.swing.JComboBox<String> size7;
    private javax.swing.JComboBox<String> size8;
    private javax.swing.JComboBox<String> size9;
    private javax.swing.JLabel socksadd1;
    private javax.swing.JLabel socksadd2;
    private javax.swing.JLabel socksadd3;
    private javax.swing.JLabel socksadd4;
    private javax.swing.JPanel socksaddpanel2;
    private javax.swing.JPanel socksaddpanel3;
    private javax.swing.JPanel socksaddpanel4;
    private javax.swing.JPanel socksaddpanel5;
    private javax.swing.JComboBox<String> sockscombo;
    private javax.swing.JTextField socksmrptf;
    private javax.swing.JTextField socksqtytf;
    private javax.swing.JLabel stocklogo;
    private javax.swing.JPanel tsaddpanel;
    private javax.swing.JPanel tsaddpanel1;
    private javax.swing.JLabel wholesalelogo;
    // End of variables declaration//GEN-END:variables
}
