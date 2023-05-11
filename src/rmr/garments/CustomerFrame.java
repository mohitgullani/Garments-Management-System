
package rmr.garments;

import java.awt.Color;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Statement;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class CustomerFrame extends javax.swing.JFrame {


    public CustomerFrame(String contact) {
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
    public void getClearCustomerDetails()
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
    public void getClearCustomerModificationDetails()
    {
        tf41.setText("");
        tf42.setText("");
        tf43.setText("");
        tf44.setText("");
        tf45.setText("");
    }
    public void getCustomerModificationDetails()
    {
        String strBill=tf41.getText();
        if(strBill.equals(""))
        {
            getClearCustomerModificationDetails();
        }
        else
        {
            BillNo=Integer.parseInt(strBill);
            if(BillNo<=bill)
            {
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from customerinfo where BillNo="+BillNo+"");
            while(rs.next())
            {
                tf42.setText(rs.getString("Name"));
                tf43.setText(rs.getString("Mobile"));
                tf44.setText(rs.getString("Address"));
                tf45.setText(""+rs.getInt("Age"));
            }
            }
            catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            }
            else
            {
                getClearCustomerModificationDetails();
                BillNotPresent b=new BillNotPresent(BillNo);
                b.setVisible(true);
            }
        } 
    }
    public void getCustomerInformation()
    {
        String strBill=tf1.getText();
        if(strBill.equals(""))
        {
            getClearCustomerDetails();
        }
        else
        {
            BillNo=Integer.parseInt(strBill);
            if(BillNo<=bill)
            {
            try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from customerinfo where BillNo="+BillNo+"");
            while(rs.next())
            {
                tf2.setText(rs.getString("Name"));
                tf3.setText(rs.getString("Mobile"));
                tf4.setText(rs.getString("Address"));
                tf5.setText(""+rs.getInt("Age"));
                tf6.setText(""+rs.getInt("TotalAmount"));
                tf7.setText(""+rs.getInt("ProfitEarned"));
                tf8.setText(""+rs.getInt("Cash"));
                tf9.setText(""+rs.getInt("Online"));
                tf10.setText(""+rs.getString("Date"));
                tf11.setText(""+rs.getString("Time"));
                tf12.setText(""+rs.getString("Payment_Method"));
                tf13.setText(""+rs.getString("Customer_Category"));
            }
            }
            catch(Exception e)
            {
                System.out.println("Not inserted");
            }
            }
            else
            {
                getClearCustomerDetails();
                BillNotPresent b=new BillNotPresent(BillNo);
                b.setVisible(true);
            }
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
        retailpanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf41 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tf42 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tf43 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tf44 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf45 = new javax.swing.JTextField();
        socksaddpanel5 = new javax.swing.JPanel();
        socksadd4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        receipt1 = new javax.swing.JTextArea();
        retailpanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf21 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        retailpanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        tf11 = new javax.swing.JTextField();
        tf12 = new javax.swing.JTextField();
        tf13 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        ch1 = new javax.swing.JCheckBox();
        tf7 = new javax.swing.JPasswordField();
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

        retailpanel7.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel7.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer Modification");
        retailpanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, -1));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Bill No");
        retailpanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 30));

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
        tf41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf41KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf41KeyReleased(evt);
            }
        });
        retailpanel7.add(tf41, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 70, 240, 30));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Name");
        retailpanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

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
        retailpanel7.add(tf42, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 120, 240, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Mobile");
        retailpanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 30));

        tf43.setBackground(new java.awt.Color(249, 215, 184));
        tf43.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf43.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf43.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf43FocusGained(evt);
            }
        });
        tf43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf43ActionPerformed(evt);
            }
        });
        retailpanel7.add(tf43, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 170, 240, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Address");
        retailpanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 30));

        tf44.setBackground(new java.awt.Color(249, 215, 184));
        tf44.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf44.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf44.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf44FocusGained(evt);
            }
        });
        tf44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf44ActionPerformed(evt);
            }
        });
        retailpanel7.add(tf44, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 220, 240, 30));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Age");
        retailpanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 30));

        tf45.setBackground(new java.awt.Color(249, 215, 184));
        tf45.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf45.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf45.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf45FocusGained(evt);
            }
        });
        tf45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf45ActionPerformed(evt);
            }
        });
        retailpanel7.add(tf45, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 270, 240, 30));

        socksaddpanel5.setBackground(new java.awt.Color(249, 215, 184));
        socksaddpanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        socksaddpanel5.setPreferredSize(new java.awt.Dimension(700, 307));
        socksaddpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socksadd4.setBackground(new java.awt.Color(255, 255, 255));
        socksadd4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd4.setText("Update");
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
        socksaddpanel5.add(socksadd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 25));

        retailpanel7.add(socksaddpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 310, 70, 25));

        receipt1.setEditable(false);
        receipt1.setColumns(20);
        receipt1.setLineWrap(true);
        receipt1.setRows(5);
        receipt1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jScrollPane3.setViewportView(receipt1);

        retailpanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 350, 260, 360));

        getContentPane().add(retailpanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 440, 750));

        retailpanel5.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel5.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Previous Bills");
        retailpanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, -1));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Bill No");
        retailpanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 75, 80, 25));

        tf21.setBackground(new java.awt.Color(249, 215, 184));
        tf21.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf21.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf21FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf21FocusLost(evt);
            }
        });
        tf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf21ActionPerformed(evt);
            }
        });
        tf21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf21KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf21KeyReleased(evt);
            }
        });
        retailpanel5.add(tf21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 180, 30));

        receipt.setEditable(false);
        receipt.setColumns(20);
        receipt.setLineWrap(true);
        receipt.setRows(5);
        receipt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jScrollPane1.setViewportView(receipt);

        retailpanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 260, 570));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Cambria Math", 0, 22)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 255));
        jLabel29.setText("Bill Modification");
        jLabel29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        retailpanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, -1, -1));

        getContentPane().add(retailpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 10, 320, 750));

        retailpanel4.setBackground(new java.awt.Color(0, 0, 0,70));
        retailpanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        retailpanel4.setPreferredSize(new java.awt.Dimension(700, 307));
        retailpanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Customer Details");
        retailpanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 390, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Bill No");
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
        jLabel14.setText("Total ");
        retailpanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, 30));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Profit");
        retailpanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Cash");
        retailpanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 90, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Online");
        retailpanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 90, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Date");
        retailpanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 90, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Time");
        retailpanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 90, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Mode");
        retailpanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 80, 30));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Category");
        retailpanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 100, 30));

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
        retailpanel4.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 70, 240, 30));

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
        retailpanel4.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 170, 240, 30));

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
        retailpanel4.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 220, 240, 30));

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
        retailpanel4.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 270, 240, 30));

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
        retailpanel4.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 320, 240, 30));

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
        retailpanel4.add(tf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 420, 240, 30));

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
        retailpanel4.add(tf9, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 470, 240, 30));

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
        retailpanel4.add(tf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 520, 240, 30));

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
        retailpanel4.add(tf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 570, 240, 30));

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
        retailpanel4.add(tf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 620, 240, 30));

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
        retailpanel4.add(tf13, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 670, 240, 30));

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
        retailpanel4.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 120, 240, 30));

        ch1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        ch1.setForeground(new java.awt.Color(204, 204, 204));
        ch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ch1.setOpaque(false);
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });
        retailpanel4.add(ch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 373, -1, -1));

        tf7.setBackground(new java.awt.Color(249, 215, 184));
        tf7.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        retailpanel4.add(tf7, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 370, 215, 30));

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

        getContentPane().add(retailpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 10, 435, 750));

        bgimage.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\ForgetPasswordBackground.png")); // NOI18N
        getContentPane().add(bgimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection con;
String cdate,ctime,pfcontact="";
    private void ToggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToggleMouseClicked
        openMenu();
    }//GEN-LAST:event_ToggleMouseClicked
int BillNo=0;
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
int bill=0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        customerlogo.setBorder(b);
        profilelogo.setBorder(null);
        try{
        Statement st=con.createStatement();
        ResultSet rs11=st.executeQuery("Select BillNo from customerinfo");
            while(rs11.next())
            {
                bill=rs11.getInt("BillNo");
            }
        }
        catch(Exception e)
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

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained

    }//GEN-LAST:event_tf2FocusGained

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained

    }//GEN-LAST:event_tf1FocusGained

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

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

    private void tf6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6FocusGained

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

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

    private void tf13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf13FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf13FocusGained

    private void tf13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf13ActionPerformed

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        getCustomerInformation();
    }//GEN-LAST:event_tf1KeyPressed

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
        getCustomerInformation();       
    }//GEN-LAST:event_tf1KeyReleased

    private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed
        if(ch1.isSelected())
        {
            tf7.setEchoChar((char)0);
        }
        else
        {
            tf7.setEchoChar('*');
        }
    }//GEN-LAST:event_ch1ActionPerformed

    private void tf21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf21FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21FocusGained

    private void tf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21ActionPerformed
String name="",mobile="",address="";
    private void tf21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf21KeyPressed
        String code="",size="",tablename="",quantity="",mrp="";
        String method="";
        int age=0,totalamount=0,items=0,cash=0,online=0;
        receipt.setText("");
        String strBill=tf21.getText();
        if(strBill.equals(""))
        {
            receipt.setText("");
        }
        else
        {
            BillNo=Integer.parseInt(strBill);
            if(BillNo<=bill)
            {
                try
                {
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from customerinfo where BillNo="+BillNo+"");
                    while(rs.next())
                    {
                        cdate=rs.getString("Date");
                        ctime=rs.getString("Time");
                        name=rs.getString("Name");
                        address=rs.getString("Address");
                        mobile=rs.getString("Mobile");
                        age=rs.getInt("Age");
                        totalamount=rs.getInt("TotalAmount");
                        cash=rs.getInt("Cash");
                        online=rs.getInt("Online");
                        method=rs.getString("Payment_Method");
                    }
                    cdate="Date : "+cdate;
                    ctime="Time : "+ctime;
                    receipt.append("                           Payment Statement\n");
                    receipt.append("     "+cdate+"            "+ctime+"\n");
                    receipt.append("     Bill No: "+BillNo+"\n");
                    receipt.append("\tRMR GARMENTS\n");
                    receipt.append("                            18/5 Sindhi Colony\n");
                    receipt.append("                                  9826782684\n");
                    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    receipt.append("     Name\t"+name+"\n");
                    receipt.append("     Mobile\t"+mobile+"\n");
                    receipt.append("     Address\t"+address+"\n");
                    receipt.append("     Age\t"+age+"\n");
                    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    receipt.append("     ItemName\t          MRP     Size     Amount\n");
                    ResultSet rs1=st.executeQuery("select * from customerpurchases where BillNo='"+BillNo+"'");
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
                    int count=0;
                    for(int i=0;i<=codearray.length;i++)
                    {
                        int temp=Integer.parseInt(mrparray[i])*Integer.parseInt(quantityarray[i]);
                        if(tablearray[i].equals("undergarments"))
                        {
                            System.out.println("Hello");
                            receipt.append("     "+quantityarray[i]+"x"+codearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");
                        }
                        else if(tablearray[i].equals("socks"))
                        {
                          receipt.append("     "+quantityarray[i]+"x"+codearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");  
                        }
                        else if(tablearray[i].equals("halfsleeveshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xHalf Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("fullsleeveshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xFull Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("halfsleevetshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xHalf T-Shirt          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("fullsleevetshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xFull T-Shirt          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("fullsleeveshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xFull Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("lowers"))
                        {
                           receipt.append("     "+quantityarray[i]+"xLower\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else
                        {
                         receipt.append("     "+quantityarray[i]+"x"+tablearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");   
                        }
                        count++;
                        if(count==codearray.length)
                        {
                            break;
                        }
                    }
                    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
                    for(int i=0;i<quantityarray.length;i++)
                    {
                        items=items+Integer.parseInt(quantityarray[i]);
                    }
                    receipt.append("     Total Items\t\t         "+items+"\n");
                    receipt.append("     Total\t\t         "+totalamount+"/-\n\n");
                    if(method.equals("Cash"))
                    {
                        receipt.append("     Cash \t\t         "+cash+"/-\n");
                    }
                    else if(method.equals("Online"))
                    {
                        receipt.append("     Online\t\t         "+online+"/-\n");
                    }
                    else
                    {
                    receipt.append("     Cash \t\t         "+cash+"/-\n");
                    receipt.append("     Online\t\t         "+online+"/-\n");    
                    }
                    receipt.append("\n\n\n                         Have a Good Day...!!\n");
                }
                catch(Exception e)
                {
                    System.out.println("Not inserted");
                }
            }
            else
            {
                receipt.setText("");
                tf21.setText("");
                BillNotPresent b=new BillNotPresent(BillNo);
                b.setVisible(true);
            }
        }
    }//GEN-LAST:event_tf21KeyPressed

    private void tf21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf21KeyReleased
        String code="",size="",tablename="",quantity="",mrp="";
        String method="";
        int age=0,totalamount=0,items=0,cash=0,online=0;
        receipt.setText("");
        String strBill=tf21.getText();
        if(strBill.equals(""))
        {
            receipt.setText("");
        }
        else
        {
            BillNo=Integer.parseInt(strBill);
            if(BillNo<=bill)
            {
                try
                {
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from customerinfo where BillNo="+BillNo+"");
                    while(rs.next())
                    {
                        cdate=rs.getString("Date");
                        ctime=rs.getString("Time");
                        name=rs.getString("Name");
                        address=rs.getString("Address");
                        mobile=rs.getString("Mobile");
                        age=rs.getInt("Age");
                        totalamount=rs.getInt("TotalAmount");
                        cash=rs.getInt("Cash");
                        online=rs.getInt("Online");
                        method=rs.getString("Payment_Method");
                    }
                    cdate="Date : "+cdate;
                    ctime="Time : "+ctime;
                    receipt.append("                           Payment Statement\n");
                    receipt.append("     "+cdate+"            "+ctime+"\n");
                    receipt.append("     Bill No: "+BillNo+"\n");
                    receipt.append("\tRMR GARMENTS\n");
                    receipt.append("                            18/5 Sindhi Colony\n");
                    receipt.append("                                  9826782684\n");
                    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    receipt.append("     Name\t"+name+"\n");
                    receipt.append("     Mobile\t"+mobile+"\n");
                    receipt.append("     Address\t"+address+"\n");
                    receipt.append("     Age\t"+age+"\n");
                    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
                    receipt.append("     ItemName\t          MRP     Size     Amount\n");
                    ResultSet rs1=st.executeQuery("select * from customerpurchases where BillNo='"+BillNo+"'");
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
                    int count=0;
                    for(int i=0;i<=codearray.length;i++)
                    {
                        int temp=Integer.parseInt(mrparray[i])*Integer.parseInt(quantityarray[i]);
                        if(tablearray[i].equals("undergarments"))
                        {
                            System.out.println("Hello");
                            receipt.append("     "+quantityarray[i]+"x"+codearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");
                        }
                        else if(tablearray[i].equals("socks"))
                        {
                          receipt.append("     "+quantityarray[i]+"x"+codearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");  
                        }
                        else if(tablearray[i].equals("halfsleeveshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xHalf Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("fullsleeveshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xFull Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("halfsleevetshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xHalf T-Shirt          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("fullsleevetshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xFull T-Shirt          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("fullsleeveshirt"))
                        {
                           receipt.append("     "+quantityarray[i]+"xFull Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else if(tablearray[i].equals("lowers"))
                        {
                           receipt.append("     "+quantityarray[i]+"xLower\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
                        }
                        else
                        {
                         receipt.append("     "+quantityarray[i]+"x"+tablearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");   
                        }
                        count++;
                        if(count==codearray.length)
                        {
                            break;
                        }
                    }
                    receipt.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
                    for(int i=0;i<quantityarray.length;i++)
                    {
                        items=items+Integer.parseInt(quantityarray[i]);
                    }
                    receipt.append("     Total Items\t\t         "+items+"\n");
                    receipt.append("     Total\t\t         "+totalamount+"/-\n\n");
                    if(method.equals("Cash"))
                    {
                        receipt.append("     Cash \t\t         "+cash+"/-\n");
                    }
                    else if(method.equals("Online"))
                    {
                        receipt.append("     Online\t\t         "+online+"/-\n");
                    }
                    else
                    {
                    receipt.append("     Cash \t\t         "+cash+"/-\n");
                    receipt.append("     Online\t\t         "+online+"/-\n");    
                    }
                    receipt.append("\n\n\n                         Have a Good Day...!!\n");
                }
                catch(Exception e)
                {
                    System.out.println("Not inserted");
                }
            }
            else
            {
                receipt.setText("");
                tf21.setText("");
                BillNotPresent b=new BillNotPresent(BillNo);
                b.setVisible(true);
            }
        }
    }//GEN-LAST:event_tf21KeyReleased

    private void tf21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf21FocusLost

    }//GEN-LAST:event_tf21FocusLost

    private void tf41FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf41FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf41FocusGained

    private void tf41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf41ActionPerformed

    private void tf41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf41KeyPressed
    getCustomerModificationDetails();
    }//GEN-LAST:event_tf41KeyPressed

    private void tf41KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf41KeyReleased
    getCustomerModificationDetails();
    }//GEN-LAST:event_tf41KeyReleased

    private void tf42FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf42FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf42FocusGained

    private void tf42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf42ActionPerformed

    private void tf43FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf43FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf43FocusGained

    private void tf43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf43ActionPerformed

    private void tf44FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf44FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf44FocusGained

    private void tf44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf44ActionPerformed

    private void tf45FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf45FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf45FocusGained

    private void tf45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf45ActionPerformed

    private void socksadd4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4AncestorAdded

    private void socksadd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseClicked
receipt1.setText("");
String name=tf42.getText();
String mobile=tf43.getText();
String address=tf44.getText();
String code="",size="",tablename="",quantity="",mrp="";
String method="";
int age=0,totalamount=0,items=0,cash=0,online=0;
age=Integer.parseInt(tf45.getText());
try
{
    Statement st=con.createStatement();
    st.executeUpdate("update customerinfo set Name='"+name+"',mobile='"+mobile+"',address='"+address+"',age="+age+" where BillNo="+BillNo+"");
    getClearCustomerModificationDetails();
    CustomerUpdationSuccess c=new CustomerUpdationSuccess();
    c.setVisible(true);
}
catch(Exception e)
{
    
}
        

if(BillNo<=bill)
{
    try
    {
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from customerinfo where BillNo="+BillNo+"");
        while(rs.next())
        {
            cdate=rs.getString("Date");
            ctime=rs.getString("Time");
            name=rs.getString("Name");
            address=rs.getString("Address");
            mobile=rs.getString("Mobile");
            age=rs.getInt("Age");
            totalamount=rs.getInt("TotalAmount");
            cash=rs.getInt("Cash");
            online=rs.getInt("Online");
            method=rs.getString("Payment_Method");
        }
        cdate="Date : "+cdate;
        ctime="Time : "+ctime;
        receipt1.append("                           Payment Statement\n");
        receipt1.append("     "+cdate+"            "+ctime+"\n");
        receipt1.append("     Bill No: "+BillNo+"\n");
        receipt1.append("\tRMR GARMENTS\n");
        receipt1.append("                            18/5 Sindhi Colony\n");
        receipt1.append("                                  9826782684\n");
        receipt1.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        receipt1.append("     Name\t"+name+"\n");
        receipt1.append("     Mobile\t"+mobile+"\n");
        receipt1.append("     Address\t"+address+"\n");
        receipt1.append("     Age\t"+age+"\n");
        receipt1.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n");
        receipt1.append("     ItemName\t          MRP     Size     Amount\n");
        ResultSet rs1=st.executeQuery("select * from customerpurchases where BillNo='"+BillNo+"'");
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
        int count=0;
        for(int i=0;i<=codearray.length;i++)
        {
            int temp=Integer.parseInt(mrparray[i])*Integer.parseInt(quantityarray[i]);
            if(tablearray[i].equals("undergarments"))
            {
                receipt1.append("     "+quantityarray[i]+"x"+codearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");
            }
            else if(tablearray[i].equals("socks"))
            {
              receipt1.append("     "+quantityarray[i]+"x"+codearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");  
            }
            else if(tablearray[i].equals("halfsleeveshirt"))
            {
               receipt1.append("     "+quantityarray[i]+"xHalf Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
            }
            else if(tablearray[i].equals("fullsleeveshirt"))
            {
               receipt1.append("     "+quantityarray[i]+"xFull Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
            }
            else if(tablearray[i].equals("halfsleevetshirt"))
            {
               receipt1.append("     "+quantityarray[i]+"xHalf T-Shirt          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
            }
            else if(tablearray[i].equals("fullsleevetshirt"))
            {
               receipt1.append("     "+quantityarray[i]+"xFull T-Shirt          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
            }
            else if(tablearray[i].equals("fullsleeveshirt"))
            {
               receipt1.append("     "+quantityarray[i]+"xFull Shirt\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
            }
            else if(tablearray[i].equals("lowers"))
            {
               receipt1.append("     "+quantityarray[i]+"xLower\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");    
            }
            else
            {
             receipt1.append("     "+quantityarray[i]+"x"+tablearray[i]+"\t          "+mrparray[i]+"         "+sizearray[i]+"       "+temp+"\n");   
            }
            count++;
            if(count==codearray.length)
            {
                break;
            }
        }
        receipt1.append("     - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
        for(int i=0;i<quantityarray.length;i++)
        {
            items=items+Integer.parseInt(quantityarray[i]);
        }
        receipt1.append("     Total Items\t\t         "+items+"\n");
        receipt1.append("     Total\t\t         "+totalamount+"/-\n\n");
        if(method.equals("Cash"))
        {
            receipt1.append("     Cash \t\t         "+cash+"/-\n");
        }
        else if(method.equals("Online"))
        {
            receipt1.append("     Online\t\t         "+online+"/-\n");
        }
        else
        {
        receipt1.append("     Cash \t\t         "+cash+"/-\n");
        receipt1.append("     Online\t\t         "+online+"/-\n");    
        }
        receipt.append("\n\n\n                         Have a Good Day...!!\n");
    }
    catch(Exception e)
    {
        System.out.println("Not inserted");
    }
    }
    else
    {
        receipt1.setText("");
        BillNotPresent b=new BillNotPresent(BillNo);
        b.setVisible(true);
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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        CustomerDetailsTableFormat f=new CustomerDetailsTableFormat(pfcontact);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        BillModification b=new BillModification(BillNo,pfcontact);
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void profilelogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilelogoMouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        customerlogo.setBorder(null);
        ProfilePage b1=new ProfilePage(pfcontact);
        b1.setVisible(true);
    }//GEN-LAST:event_profilelogoMouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        Border b=BorderFactory.createBevelBorder(1, new Color(204,204,255,255), new Color(225,162,81,255));
        profilelogo.setBorder(b);
        customerlogo.setBorder(null);
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
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CustomerFrame(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IconBar;
    private javax.swing.JLabel Toggle;
    private javax.swing.JLabel balancelogo;
    private javax.swing.JLabel bgimage;
    private javax.swing.JCheckBox ch1;
    private javax.swing.JLabel customerlogo;
    private javax.swing.JLabel employeelogo;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
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
    private javax.swing.JTextArea receipt;
    private javax.swing.JTextArea receipt1;
    private javax.swing.JLabel retaillogo;
    private javax.swing.JPanel retailpanel4;
    private javax.swing.JPanel retailpanel5;
    private javax.swing.JPanel retailpanel7;
    private javax.swing.JLabel socksadd4;
    private javax.swing.JPanel socksaddpanel5;
    private javax.swing.JLabel stocklogo;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf13;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf21;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf41;
    private javax.swing.JTextField tf42;
    private javax.swing.JTextField tf43;
    private javax.swing.JTextField tf44;
    private javax.swing.JTextField tf45;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JPasswordField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JLabel wholesalelogo;
    // End of variables declaration//GEN-END:variables
}
