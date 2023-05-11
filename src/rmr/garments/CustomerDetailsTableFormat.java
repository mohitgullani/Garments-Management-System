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
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
public class CustomerDetailsTableFormat extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetailsTableFormat
     */
    public CustomerDetailsTableFormat(String contact) {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH); 
        pfcontact=contact;
    }
    public void showDate()
    {
        Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        currentdate=s.format(d);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginform = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jc = new com.toedter.calendar.JDateChooser();
        tf1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        socksaddpanel5 = new javax.swing.JPanel();
        socksadd4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        profittf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        amounttf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        expensestf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        cashtf = new javax.swing.JTextField();
        onlinetf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Expenses");
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 210, 35));

        jc.setDateFormatString("YYYY-MM-dd");
        loginform.add(jc, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 110, 209, 35));

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
        loginform.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 110, 320, 35));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BillNo", "Name", "Mobile No", "Address", "Age", "Amount", "Profit", "Cash", "Online", "Date", "Time", "Mode", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);
        if (tb1.getColumnModel().getColumnCount() > 0) {
            tb1.getColumnModel().getColumn(0).setResizable(false);
            tb1.getColumnModel().getColumn(0).setPreferredWidth(45);
            tb1.getColumnModel().getColumn(1).setResizable(false);
            tb1.getColumnModel().getColumn(1).setPreferredWidth(120);
            tb1.getColumnModel().getColumn(2).setResizable(false);
            tb1.getColumnModel().getColumn(2).setPreferredWidth(90);
            tb1.getColumnModel().getColumn(3).setResizable(false);
            tb1.getColumnModel().getColumn(3).setPreferredWidth(120);
            tb1.getColumnModel().getColumn(4).setResizable(false);
            tb1.getColumnModel().getColumn(4).setPreferredWidth(25);
            tb1.getColumnModel().getColumn(5).setResizable(false);
            tb1.getColumnModel().getColumn(5).setPreferredWidth(50);
            tb1.getColumnModel().getColumn(6).setResizable(false);
            tb1.getColumnModel().getColumn(6).setPreferredWidth(40);
            tb1.getColumnModel().getColumn(7).setResizable(false);
            tb1.getColumnModel().getColumn(7).setPreferredWidth(50);
            tb1.getColumnModel().getColumn(8).setResizable(false);
            tb1.getColumnModel().getColumn(8).setPreferredWidth(50);
            tb1.getColumnModel().getColumn(9).setResizable(false);
            tb1.getColumnModel().getColumn(9).setPreferredWidth(80);
            tb1.getColumnModel().getColumn(10).setResizable(false);
            tb1.getColumnModel().getColumn(10).setPreferredWidth(70);
            tb1.getColumnModel().getColumn(11).setResizable(false);
            tb1.getColumnModel().getColumn(11).setPreferredWidth(90);
            tb1.getColumnModel().getColumn(12).setResizable(false);
            tb1.getColumnModel().getColumn(12).setPreferredWidth(80);
        }

        loginform.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 156, 1000, 352));

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

        loginform.add(socksaddpanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 515, 70, 24));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Profit");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 170, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("                                          Customer Details");
        loginform.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 15, 1130, -1));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SNO", "Amount", "Reason"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb2);
        if (tb2.getColumnModel().getColumnCount() > 0) {
            tb2.getColumnModel().getColumn(0).setResizable(false);
            tb2.getColumnModel().getColumn(0).setPreferredWidth(40);
            tb2.getColumnModel().getColumn(1).setResizable(false);
            tb2.getColumnModel().getColumn(1).setPreferredWidth(80);
            tb2.getColumnModel().getColumn(2).setResizable(false);
            tb2.getColumnModel().getColumn(2).setPreferredWidth(90);
        }

        loginform.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 156, 210, 352));

        profittf.setEditable(false);
        profittf.setBackground(new java.awt.Color(249, 215, 184));
        profittf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        profittf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        profittf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginform.add(profittf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 180, 30));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Amount");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 170, 30));

        amounttf.setEditable(false);
        amounttf.setBackground(new java.awt.Color(249, 215, 184));
        amounttf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        amounttf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amounttf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginform.add(amounttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 180, 30));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total Expenses");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 170, 30));

        expensestf.setEditable(false);
        expensestf.setBackground(new java.awt.Color(249, 215, 184));
        expensestf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        expensestf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expensestf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginform.add(expensestf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 180, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Customer Details");
        jLabel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 270, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\Search-Icon.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        loginform.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 110, 35, 35));
        loginform.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 585, 90, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        loginform.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 545, 50, 80));
        loginform.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 625, 70, 20));
        loginform.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 544, 70, 20));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cash");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 530, 80, 30));

        cashtf.setEditable(false);
        cashtf.setBackground(new java.awt.Color(249, 215, 184));
        cashtf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        cashtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cashtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginform.add(cashtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 180, 30));

        onlinetf.setEditable(false);
        onlinetf.setBackground(new java.awt.Color(249, 215, 184));
        onlinetf.setFont(new java.awt.Font("Cambria Math", 0, 15)); // NOI18N
        onlinetf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        onlinetf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginform.add(onlinetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 610, 180, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Cambria Math", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Online");
        jLabel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        loginform.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 610, 80, 30));

        getContentPane().add(loginform, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1276, 668));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\RMR Garments\\Ritik\\ForgetPasswordBackground.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 770));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Expenses");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198), new java.awt.Color(204, 223, 198)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 210, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String currentdate="",userdate="",pfcontact="";
int windowcount=0;
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        showDate();
        int sno=0,totalamount=0;
        userdate=currentdate;
        if(windowcount==0)
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
                 ResultSet rs=st.executeQuery("select * from customerinfo where Date='"+userdate+"'");
                 while(rs.next())
                 {
                     model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
                     Date d=new SimpleDateFormat("yyyy-MM-dd").parse((String)rs.getString("Date"));
                 }
                 ResultSet rs1=st.executeQuery("select sum(TotalAmount) from customerinfo where Date='"+userdate+"'");
                 while(rs1.next())
                 {
                    amounttf.setText(""+rs1.getInt("sum(TotalAmount)"));
                 }
                 ResultSet rs2=st.executeQuery("select sum(ProfitEarned) from customerinfo where Date='"+userdate+"'");
                 while(rs2.next())
                 {
                    profittf.setText(""+rs2.getInt("sum(ProfitEarned)"));
                 }
                 ResultSet rs3=st.executeQuery("select sum(Amount) from expenses where Date='"+userdate+"'");
                 while(rs3.next())
                 {
                    expensestf.setText(""+rs3.getInt("sum(Amount)"));
                 }
                 ResultSet rs4=st.executeQuery("select sum(Cash) from customerinfo where Date='"+userdate+"'");
                 while(rs4.next())
                 {
                    cashtf.setText(""+rs4.getInt("sum(Cash)"));
                 }
                 ResultSet rs5=st.executeQuery("select sum(Online) from customerinfo where Date='"+userdate+"'");
                 while(rs5.next())
                 {
                    onlinetf.setText(""+rs5.getInt("sum(Online)"));
                 }
                 con.close();
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null,"Record not Stored");
                }
                DefaultTableModel model1=(DefaultTableModel)tb2.getModel();
                try
                   {
                     while(model1.getRowCount()>0)
                     {
                         for(int i=0;i<model1.getRowCount();i++)
                         model1.removeRow(i);
                     }
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from expenses where Date='"+userdate+"'");

                    while(rs.next())
                    {
                        sno++;
                        model1.addRow(new Object[]{sno,rs.getInt(1),rs.getString(2)});
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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        CustomerFrame lp=new CustomerFrame(pfcontact);
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
             ResultSet rs=st.executeQuery("select * from customerinfo where Date='"+userdate+"'");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
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
             ResultSet rs=st.executeQuery("select * from customerinfo where Name like '%"+search+"%' and Date='"+userdate+"'");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
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
             ResultSet rs=st.executeQuery("select * from customerinfo where Date='"+userdate+"'");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
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
             ResultSet rs=st.executeQuery("select * from customerinfo where Name like '%"+search+"%' and Date='"+userdate+"'");
             while(rs.next())
             {
                 model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
             }
             con.close();
            }
            catch(Exception e)
            {
             JOptionPane.showMessageDialog(null,"Record not Stored");
            }
        }
    }//GEN-LAST:event_tf1KeyReleased
int BillNo=0;
    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        DefaultTableModel model=(DefaultTableModel)tb1.getModel();
        BillNo=(int) model.getValueAt(tb1.getSelectedRow(),0);
        System.out.println(BillNo);
    }//GEN-LAST:event_tb1MouseClicked

    private void socksadd4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_socksadd4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_socksadd4AncestorAdded

    private void socksadd4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_socksadd4MouseClicked
        CustomerDeleteVerification c=new CustomerDeleteVerification(BillNo);
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int sno=0;
        userdate=((JTextField)jc.getDateEditor().getUiComponent()).getText();
        showDate();
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
            ResultSet rs=st.executeQuery("select * from customerinfo where Date='"+userdate+"'");
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});
            }
            ResultSet rs1=st.executeQuery("select sum(TotalAmount) from customerinfo where Date='"+userdate+"'");
            while(rs1.next())
            {
                amounttf.setText(""+rs1.getInt("sum(TotalAmount)"));
            }
            ResultSet rs2=st.executeQuery("select sum(ProfitEarned) from customerinfo where Date='"+userdate+"'");
            while(rs2.next())
            {
                profittf.setText(""+rs2.getInt("sum(ProfitEarned)"));
            }
            ResultSet rs3=st.executeQuery("select sum(Amount) from expenses where Date='"+userdate+"'");
            while(rs3.next())
            {
                expensestf.setText(""+rs3.getInt("sum(Amount)"));
            }
            ResultSet rs4=st.executeQuery("select sum(Cash) from customerinfo where Date='"+userdate+"'");
            while(rs4.next())
            {
               cashtf.setText(""+rs4.getInt("sum(Cash)"));
            }
            ResultSet rs5=st.executeQuery("select sum(Online) from customerinfo where Date='"+userdate+"'");
            while(rs5.next())
            {
               onlinetf.setText(""+rs5.getInt("sum(Online)"));
            }
            con.close();
            if(model.getRowCount()>0)
            {

            }
            else
            {
                DateNotFound d=new DateNotFound();
                d.setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Record not Stored");
        }
        DefaultTableModel model1=(DefaultTableModel)tb2.getModel();
        try
        {
            while(model1.getRowCount()>0)
            {
                for(int i=0;i<model1.getRowCount();i++)
                model1.removeRow(i);
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/garmentsshop","root","root");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from expenses where Date='"+userdate+"'");

            while(rs.next())
            {
                sno++;
                model1.addRow(new Object[]{sno,rs.getInt(1),rs.getString(2)});
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Record not Stored");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsTableFormat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String a="";
                new CustomerDetailsTableFormat(a).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounttf;
    private javax.swing.JTextField cashtf;
    private javax.swing.JTextField expensestf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.calendar.JDateChooser jc;
    private javax.swing.JPanel loginform;
    private javax.swing.JTextField onlinetf;
    private javax.swing.JTextField profittf;
    private javax.swing.JLabel socksadd4;
    private javax.swing.JPanel socksaddpanel5;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
