/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmr.garments;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
public class EmployeeDetailsTableFormat extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetailsTableFormat
     */
    public EmployeeDetailsTableFormat(String contact) {
        initComponents();
        createConnection();
        setExtendedState(this.MAXIMIZED_BOTH); 
        showDate();
        showTime();
        pfcontact=contact;
    }
    public void getClearAttendanceDetails(){
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        ta1.setText("");
        i=0;
    }
    public void getClearSalaryDetails()
    {
        tf5.setText("");
        tf6.setText("");
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
    public void showDate()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        cdate="Date : "+s.format(d); 
        currentdate=s.format(d);
    }
    public void showTime()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("hh:mm aa");
        ctime="Time : "+s.format(d);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginform = new javax.swing.JPanel();
        tf1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        socksaddpanel5 = new javax.swing.JPanel();
        socksadd4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        loginform1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jc2 = new com.toedter.calendar.JDateChooser();
        tf6 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jc3 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ch1 = new javax.swing.JCheckBox();
        loginform2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jc1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginform.setBackground(new java.awt.Color(0, 0, 0,120));
        loginform.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 102, 0), new java.awt.Color(153, 153, 153)));
        loginform.setPreferredSize(new java.awt.Dimension(700, 307));
        loginform.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        tf1.setForeground(new java.awt.Color(153, 153, 153));
        tf1.setText("Search by Name");
        tf1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf1FocusLost(evt);
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
        loginform.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 80, 320, 35));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EMP ID", "Name", "Mobile No", "Address", "Age", "D_O_B", "Gender", "Salary", "Aadhar No", "Designation", "Joining Date", "Father Name", "Father Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tb1.setDragEnabled(true);
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
            tb1.getColumnModel().getColumn(0).setPreferredWidth(40);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(1).setPreferredWidth(90);
            tb1.getColumnModel().getColumn(2).setResizable(false);
            tb1.getColumnModel().getColumn(2).setPreferredWidth(80);
            tb1.getColumnModel().getColumn(3).setResizable(false);
            tb1.getColumnModel().getColumn(3).setPreferredWidth(120);
            tb1.getColumnModel().getColumn(4).setResizable(false);
            tb1.getColumnModel().getColumn(4).setPreferredWidth(25);
            tb1.getColumnModel().getColumn(5).setResizable(false);
            tb1.getColumnModel().getColumn(5).setPreferredWidth(75);
            tb1.getColumnModel().getColumn(6).setResizable(false);
            tb1.getColumnModel().getColumn(6).setPreferredWidth(40);
            tb1.getColumnModel().getColumn(7).setResizable(false);
            tb1.getColumnModel().getColumn(7).setPreferredWidth(60);
            tb1.getColumnModel().getColumn(8).setResizable(false);
            tb1.getColumnModel().getColumn(8).setPreferredWidth(110);
            tb1.getColumnModel().getColumn(9).setResizable(false);
            tb1.getColumnModel().getColumn(9).setPreferredWidth(90);
            tb1.getColumnModel().getColumn(10).setResizable(false);
            tb1.getColumnModel().getColumn(10).setPreferredWidth(75);
            tb1.getColumnModel().getColumn(11).setResizable(false);
            tb1.getColumnModel().getColumn(11).setPreferredWidth(90);
            tb1.getColumnModel().getColumn(12).setResizable(false);
            tb1.getColumnModel().getColumn(12).setPreferredWidth(80);
        }

        loginform.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 140, 1230, 127));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Back Image.png")); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        loginform.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 100, 36));

        socksaddpanel5.setBackground(new java.awt.Color(249, 215, 184));
        socksaddpanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        socksaddpanel5.setPreferredSize(new java.awt.Dimension(700, 307));
        socksaddpanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        socksadd4.setBackground(new java.awt.Color(255, 255, 255));
        socksadd4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        socksadd4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        socksadd4.setText("Delete");
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

        loginform.add(socksaddpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 275, 70, 24));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("                                          Employee Details");
        loginform.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 15, 1130, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Employee Details");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 270, 35));

        loginform1.setBackground(new java.awt.Color(0, 0, 0, 0));
        loginform1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 102, 0), new java.awt.Color(153, 153, 153)));
        loginform1.setPreferredSize(new java.awt.Dimension(700, 307));
        loginform1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Emp ID");
        loginform1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 30));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Salary");
        loginform1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("From");
        loginform1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

        jc2.setBackground(new java.awt.Color(249, 215, 184));
        jc2.setDateFormatString("YYYY-MM-dd");
        loginform1.add(jc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, 30));

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
        loginform1.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 30));

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
        tf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf5KeyReleased(evt);
            }
        });
        loginform1.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        ta2.setEditable(false);
        ta2.setColumns(20);
        ta2.setLineWrap(true);
        ta2.setRows(5);
        ta2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jScrollPane3.setViewportView(ta2);

        loginform1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 230, 280));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("to");
        loginform1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 30));

        jc3.setBackground(new java.awt.Color(249, 215, 184));
        jc3.setDateFormatString("YYYY-MM-dd");
        loginform1.add(jc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 30));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Salary Details");
        jLabel19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 35));

        panel3.setBackground(new java.awt.Color(249, 215, 184));
        panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Show");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 28));

        loginform1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, 28));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Add EMP Expenses");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        loginform1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 30));

        ch1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        ch1.setForeground(new java.awt.Color(204, 204, 204));
        ch1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ch1.setOpaque(false);
        ch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch1ActionPerformed(evt);
            }
        });
        loginform1.add(ch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 292, -1, -1));

        loginform.add(loginform1, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 307, 600, 335));

        loginform2.setBackground(new java.awt.Color(0, 0, 0, 0));
        loginform2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 102, 0), new java.awt.Color(153, 153, 153)));
        loginform2.setPreferredSize(new java.awt.Dimension(700, 307));
        loginform2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Mobile");
        loginform2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

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
        loginform2.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, 30));

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
        loginform2.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 180, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Name");
        loginform2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Emp ID");
        loginform2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 30));

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
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf2KeyReleased(evt);
            }
        });
        loginform2.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        panel1.setBackground(new java.awt.Color(249, 215, 184));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Absent");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), new java.awt.Color(204, 204, 255), new java.awt.Color(225, 162, 81), new java.awt.Color(225, 162, 81)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 28));

        loginform2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 100, 28));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Absent");
        loginform2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 30));

        jc1.setBackground(new java.awt.Color(249, 215, 184));
        jc1.setDateFormatString("YYYY-MM-dd");
        loginform2.add(jc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Absent Details");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 270, 35));

        ta1.setEditable(false);
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        ta1.setLineWrap(true);
        ta1.setRows(5);
        ta1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null, null));
        jScrollPane2.setViewportView(ta1);

        loginform2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 230, 280));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("View Extra Details");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        loginform2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 287, 170, 30));

        loginform.add(loginform2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 307, 600, 335));

        getContentPane().add(loginform, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1276, 668));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\ForgetPasswordBackground.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 770));
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int windowcount=0;
Connection con;
String cdate,ctime,currentdate;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        if(windowcount==0)
        {
            try {
                Date d=new SimpleDateFormat("yyyy-MM-dd").parse(currentdate);
                jc1.setDate(d);
            } catch (ParseException ex) {
                Logger.getLogger(EmployeeDetailsTableFormat.class.getName()).log(Level.SEVERE, null, ex);
            }
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
             try
                {
                  while(model.getRowCount()>0)
                  {
                      for(int i=0;i<model.getRowCount();i++)
                      model.removeRow(i);
                  }
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
                 Statement st=con.createStatement();
                 ResultSet rs=st.executeQuery("select * from EmployeeDetails");
                 while(rs.next())
                 {
                     model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(13),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
                 }
                 ResultSet rs1=st.executeQuery("Select max(EID) from EmployeeDetails");
                 while(rs1.next())
                 {
                    eid=rs1.getInt("max(EID)") ;
                 }
                 con.close();
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null,"Record not Stored");
                }
             windowcount++;
        }
        else
        {
            
        }
    }//GEN-LAST:event_formWindowGainedFocus
String pfcontact="";
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        EmployeeFrame lp=new EmployeeFrame(pfcontact);
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void tf1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusGained
        tf1.setText("");
    }//GEN-LAST:event_tf1FocusGained

    private void tf1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf1FocusLost
        String strTemp=tf1.getText();
        tf1.setForeground(new Color(153,153,153,255));
        if(strTemp.equals(""))
        {
            tf1.setText("Search by Name");
        }
        else
        {
            
        }
    }//GEN-LAST:event_tf1FocusLost
String search;
    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed
        tf1.setForeground(Color.black);
        search=tf1.getText();
        if(search.equals(""))
        {
            tf1.setText("");
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
            try
            {
              while(model.getRowCount()>0)
              {
                  for(int i=0;i<model.getRowCount();i++)
                  model.removeRow(i);
              }
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from EmployeeDetails");
             while(rs.next())
             {
                model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(13),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
             }
             con.close();
            }
            catch(Exception e)
            {
             JOptionPane.showMessageDialog(null,"Record not Stored");
            }
            
        }
        else
        { 
         DefaultTableModel model=(DefaultTableModel)tb1.getModel();
         try
            {
              while(model.getRowCount()>0)
              {
                  for(int i=0;i<model.getRowCount();i++)
                  model.removeRow(i);
              }
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from EmployeeDetails where Name like '%"+search+"%'");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(13),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
             }
             con.close();
            }
            catch(Exception e)
            {
             JOptionPane.showMessageDialog(null,"Record not Stored");
            }
        }
    }//GEN-LAST:event_tf1KeyPressed

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
        tf1.setForeground(Color.black);
        search=tf1.getText();
        if(search.equals(""))
        {
            tf1.setText("");
            DefaultTableModel model=(DefaultTableModel)tb1.getModel();
            try
            {
              while(model.getRowCount()>0)
              {
                  for(int i=0;i<model.getRowCount();i++)
                  model.removeRow(i);
              }
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from EmployeeDetails");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(13),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
             }
             con.close();
            }
            catch(Exception e)
            {
             JOptionPane.showMessageDialog(null,"Record not Stored");
            }
            
        }
        else
        { 
         DefaultTableModel model=(DefaultTableModel)tb1.getModel();
         try
            {
              while(model.getRowCount()>0)
              {
                  for(int i=0;i<model.getRowCount();i++)
                  model.removeRow(i);
              }
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery("select * from EmployeeDetails where Name like '%"+search+"%'");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(13),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
             }
             con.close();
            }
            catch(Exception e)
            {
             JOptionPane.showMessageDialog(null,"Record not Stored");
            }
        }
    }//GEN-LAST:event_tf1KeyReleased
int empid=0;
String mobile="";
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        DefaultTableModel model=(DefaultTableModel)tb1.getModel();
        empid=(int) model.getValueAt(tb1.getSelectedRow(),0);
        mobile=model.getValueAt(tb1.getSelectedRow(),2).toString();
        System.out.println(mobile);
        System.out.println(empid);
    }//GEN-LAST:event_tb1MouseClicked

    private void socksadd4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4AncestorAdded

    private void socksadd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseClicked
        EmployeeDeleteVerification c=new EmployeeDeleteVerification(empid,mobile);
        c.setVisible(true);
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

    private void tf4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf4FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4FocusGained

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void tf3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusGained

    }//GEN-LAST:event_tf3FocusGained

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained

    }//GEN-LAST:event_tf2FocusGained

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyPressed

    }//GEN-LAST:event_tf2KeyPressed
int eid=0;
int employeeid=0;
int i=0;
    private void tf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyReleased
    showDate();
    ta1.setText("");
    String empid=tf2.getText();
    ta1.append("\n\n");
    ta1.append("  SNO       Absent Date\n");
    if(empid.equals(""))
    {
        getClearAttendanceDetails();
    }
    else
    {
        employeeid=Integer.parseInt(empid);
        if(employeeid>eid)
        {
            NoEmployeeID n=new NoEmployeeID(employeeid);
            n.setVisible(true);
            tf2.setText("");
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select * from EmployeeDetails where EID="+employeeid+"");
                while(rs.next())
                {
                    tf3.setText(rs.getString("Name"));
                    tf4.setText(rs.getString("Mobile"));
                }
                String datearray[]=currentdate.split("-");
                String tempdate=datearray[0]+"-"+datearray[1]+"-%";
                ResultSet rs1=st.executeQuery("select Date from EmployeeAbsentDetails where EID="+employeeid+" and Date like '"+tempdate+"'");
                while(rs1.next())
                {
                    i++;
                    ta1.append("   "+i+"        "+rs1.getString("Date")+"\n");
                }
            }
            catch(Exception e)
            {
                System.out.println("Not Fetched");
            }
        }
    } 
    }//GEN-LAST:event_tf2KeyReleased

    private void tf6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6FocusGained

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void tf5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5FocusGained

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void tf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5KeyPressed
int salaryemployeeid=0;
int salary=0;
    private void tf5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf5KeyReleased
    showDate();
    String empid=tf5.getText();
    if(empid.equals(""))
    {
        getClearSalaryDetails();
    }
    else
    {
        salaryemployeeid=Integer.parseInt(empid);
        if(salaryemployeeid>eid)
        {
            NoEmployeeID n=new NoEmployeeID(salaryemployeeid);
            n.setVisible(true);
            tf5.setText("");
        }
        else
        {
            try
            {
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select Salary from EmployeeDetails where EID="+salaryemployeeid+"");
                while(rs.next())
                {
                    salary=rs.getInt("Salary");
                    tf6.setText(""+salary);
                }
            }
            catch(Exception e)
            {
                System.out.println("Not Fetched");
            }
        }
    } 
    }//GEN-LAST:event_tf5KeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String userdate=((JTextField)jc1.getDateEditor().getUiComponent()).getText();
        try
        {
            Statement st=con.createStatement();
            st.executeUpdate("insert into EmployeeAbsentDetails values("+employeeid+",'"+userdate+"')");
            i++;
            ta1.append("   "+i+"        "+userdate+"\n");
            AttendanceMarkedSuccess a=new AttendanceMarkedSuccess();
            a.setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println("Not Fetched");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        ta2.setText("");
        Date d=null;
        Date d1=null;
        String name="",contact="";
        String from=((JTextField)jc2.getDateEditor().getUiComponent()).getText();
        String to=((JTextField)jc3.getDateEditor().getUiComponent()).getText();
        try {
            d = new SimpleDateFormat("yyyy-MM-dd").parse(from);
            d1 = new SimpleDateFormat("yyyy-MM-dd").parse(to);
        } catch (ParseException ex) {
            Logger.getLogger(BalanceFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        Calendar c=Calendar.getInstance();
        Calendar c1=Calendar.getInstance();
        try{
            c.setTime(s.parse(from));
            c1.setTime(s.parse(to));
        }catch(Exception e){
        }
        int month1=c.get(Calendar.MONTH);
        int month2=c1.get(Calendar.MONTH);
        int finalmonth=month1-month2;
        if(finalmonth<0)
        {
            finalmonth=finalmonth-(2*finalmonth);
            System.out.println(finalmonth);
        }
        else
        {
            finalmonth=finalmonth;
        }
        for(i=0;i<=12;i++)
        {
            if(finalmonth==i)
            {
                salary=salary*(i+1);
                break;
            }
        }
        int onedaysalary=salary/30;
        int finalsalary=0,expenses=0;
        int absent=0;
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select count(EID) from EmployeeAbsentDetails where EID="+salaryemployeeid+"");
            while(rs.next())
            {
                absent=rs.getInt("count(EID)");
            }
            ResultSet rs1=st.executeQuery("select sum(Amount) from employeeexpenses where EID="+salaryemployeeid+" and Date between '"+from+"' and '"+to+"'");
            while(rs1.next())
            {
                expenses=rs1.getInt("sum(Amount)");
            }
            ResultSet rs2=st.executeQuery("select * from EmployeeDetails where EID="+salaryemployeeid+"");
            while(rs2.next())
            {
                name=rs2.getString("Name");
                contact=rs2.getString("Mobile");
            }
            finalsalary=salary-(onedaysalary*absent)-expenses;
        }
        catch(Exception e)
        {
            
        }  
        ta2.append("                     Payment Statement\n");
        ta2.append("   "+cdate+"  "+ctime+"\n");
        ta2.append("   Employee ID: "+salaryemployeeid+"\n");
        ta2.append("                     RMR GARMENTS\n");
        ta2.append("                   18/5 Sindhi Colony\n");
        ta2.append("                         9826782684\n");
        ta2.append("   - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
        ta2.append("   Name\t"+name+"\n");
        ta2.append("   Contact\t"+contact+"\n");
        ta2.append("   Salary\t"+salary+"\n");
        ta2.append("   - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n"); 
        ta2.append("   Holidays\t"+absent+"\n");
        ta2.append("   Expenses\t"+expenses+"\n");
        ta2.append("   Salary Given\t"+finalsalary+"\n");
        try
        {
            Statement st=con.createStatement();
            if(ch1.isSelected()==true)
            {
                st.executeUpdate("insert into EmployeeSalaryGiven values("+salaryemployeeid+","+salary+",'"+from+"','"+to+"',"+finalsalary+","+expenses+","+absent+",'"+currentdate+"')");
            }
        }
        catch(Exception e)
        {
            System.out.println(cdate);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        EmployeeExpensess e=new EmployeeExpensess();
        e.setVisible(true);
    }//GEN-LAST:event_jLabel22MouseClicked
    
    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        EmployeeExtraDetails e=new EmployeeExtraDetails(pfcontact);
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void ch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch1ActionPerformed

    }//GEN-LAST:event_ch1ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a="";
                new EmployeeDetailsTableFormat(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ch1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JDateChooser jc1;
    private com.toedter.calendar.JDateChooser jc2;
    private com.toedter.calendar.JDateChooser jc3;
    private javax.swing.JLabel l3;
    private javax.swing.JPanel loginform;
    private javax.swing.JPanel loginform1;
    private javax.swing.JPanel loginform2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    private javax.swing.JLabel socksadd4;
    private javax.swing.JPanel socksaddpanel5;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    public static javax.swing.JTable tb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    // End of variables declaration//GEN-END:variables

    static class tb1 {

        public tb1() {
        }
    }
}
