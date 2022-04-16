import java.awt.Cursor;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    Connection con ;
    ResultSet rs;
    PreparedStatement pst;
    Statement stm;
    
    public Registration() {
        initComponents();
        con = database.db();
        RpassField1.setEchoChar( (char) 0);
        RpassField2.setEchoChar( (char) 0);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RfirstName = new javax.swing.JTextField();
        RlastName = new javax.swing.JTextField();
        RemailId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        RphoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RbackButton = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        RconfirmButton = new javax.swing.JButton();
        Rusername = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        RaccountNumber = new javax.swing.JTextField();
        RdepositAmount = new javax.swing.JTextField();
        RpassField1 = new javax.swing.JPasswordField();
        RpassField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RadharNumber = new javax.swing.JTextField();
        RpanNumber = new javax.swing.JTextField();
        RconfirmButton1 = new javax.swing.JButton();
        RbackButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 82, 240), 5));
        jPanel1.setDoubleBuffered(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration_new.gif"))); // NOI18N

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Registration");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration_icon.png"))); // NOI18N

        RfirstName.setForeground(new java.awt.Color(120, 120, 120));
        RfirstName.setText(" First Name");
        RfirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true)
        );
        RfirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RfirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RfirstNameFocusLost(evt);
            }
        });
        RfirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfirstNameActionPerformed(evt);
            }
        });
        RfirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RfirstNameKeyPressed(evt);
            }
        });

        RlastName.setForeground(new java.awt.Color(120, 120, 120));
        RlastName.setText(" Last Name");
        RlastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RlastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RlastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RlastNameFocusLost(evt);
            }
        });
        RlastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RlastNameActionPerformed(evt);
            }
        });
        RlastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RlastNameKeyPressed(evt);
            }
        });

        RemailId.setForeground(new java.awt.Color(120, 120, 120));
        RemailId.setText(" Email Id");
        RemailId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RemailId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RemailIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RemailIdFocusLost(evt);
            }
        });
        RemailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemailIdActionPerformed(evt);
            }
        });
        RemailId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RemailIdKeyPressed(evt);
            }
        });

        jLabel4.setText(" Gender :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        RphoneNumber.setForeground(new java.awt.Color(120, 120, 120));
        RphoneNumber.setText(" Phone Number");
        RphoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RphoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RphoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RphoneNumberFocusLost(evt);
            }
        });
        RphoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RphoneNumberActionPerformed(evt);
            }
        });
        RphoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RphoneNumberKeyPressed(evt);
            }
        });

        jLabel5.setText(" Date Of Birth :");

        RbackButton.setBackground(new java.awt.Color(176, 82, 240));
        RbackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RbackButton.setText("Cancel");
        RbackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RbackButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RbackButtonMouseExited(evt);
            }
        });
        RbackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbackButtonActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        RconfirmButton.setBackground(new java.awt.Color(176, 82, 240));
        RconfirmButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RconfirmButton.setText("Next");
        RconfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RconfirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RconfirmButtonMouseExited(evt);
            }
        });
        RconfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RconfirmButtonActionPerformed(evt);
            }
        });

        Rusername.setForeground(new java.awt.Color(120, 120, 120));
        Rusername.setText(" Username");
        Rusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RfirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(RbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RconfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RemailId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RlastName)
                    .addComponent(RphoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Rusername))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addComponent(Rusername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RfirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemailId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(RphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RconfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jLayeredPane1.add(jPanel2, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        RaccountNumber.setForeground(new java.awt.Color(120, 120, 120));
        RaccountNumber.setText(" Account Number");
        RaccountNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RaccountNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RaccountNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RaccountNumberFocusLost(evt);
            }
        });
        RaccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RaccountNumberMouseClicked(evt);
            }
        });
        RaccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaccountNumberActionPerformed(evt);
            }
        });
        RaccountNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RaccountNumberKeyPressed(evt);
            }
        });

        RdepositAmount.setForeground(new java.awt.Color(120, 120, 120));
        RdepositAmount.setText(" Deposit Amount");
        RdepositAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RdepositAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RdepositAmountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RdepositAmountFocusLost(evt);
            }
        });
        RdepositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdepositAmountActionPerformed(evt);
            }
        });
        RdepositAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RdepositAmountKeyPressed(evt);
            }
        });

        RpassField1.setForeground(new java.awt.Color(120, 120, 120));
        RpassField1.setText(" Password");
        RpassField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RpassField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RpassField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RpassField1FocusLost(evt);
            }
        });
        RpassField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RpassField1KeyPressed(evt);
            }
        });

        RpassField2.setForeground(new java.awt.Color(120, 120, 120));
        RpassField2.setText(" Confirm Password");
        RpassField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RpassField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RpassField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RpassField2FocusLost(evt);
            }
        });
        RpassField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpassField2ActionPerformed(evt);
            }
        });
        RpassField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RpassField2KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Registration");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registration_icon.png"))); // NOI18N

        RadharNumber.setForeground(new java.awt.Color(120, 120, 120));
        RadharNumber.setText("Aadhaar Number");
        RadharNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RadharNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RadharNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RadharNumberFocusLost(evt);
            }
        });
        RadharNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadharNumberMouseClicked(evt);
            }
        });
        RadharNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadharNumberActionPerformed(evt);
            }
        });
        RadharNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RadharNumberKeyPressed(evt);
            }
        });

        RpanNumber.setForeground(new java.awt.Color(120, 120, 120));
        RpanNumber.setText("Pan Number");
        RpanNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 2, true));
        RpanNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RpanNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RpanNumberFocusLost(evt);
            }
        });
        RpanNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RpanNumberMouseClicked(evt);
            }
        });
        RpanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RpanNumberActionPerformed(evt);
            }
        });
        RpanNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RpanNumberKeyPressed(evt);
            }
        });

        RconfirmButton1.setBackground(new java.awt.Color(176, 82, 240));
        RconfirmButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RconfirmButton1.setText("Confirm");
        RconfirmButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RconfirmButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RconfirmButton1MouseExited(evt);
            }
        });
        RconfirmButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RconfirmButton1ActionPerformed(evt);
            }
        });

        RbackButton1.setBackground(new java.awt.Color(176, 82, 240));
        RbackButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RbackButton1.setText("Back");
        RbackButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RbackButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RbackButton1MouseExited(evt);
            }
        });
        RbackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbackButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(RbackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(RconfirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RpassField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RpassField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdepositAmount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RpanNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadharNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RaccountNumber, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 82, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addComponent(RaccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RadharNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RpanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RdepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RpassField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RpassField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RconfirmButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        jLayeredPane1.add(jPanel3, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(860, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RconfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RconfirmButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            String uname = Rusername.getText();
            String query = "select * from accountdetails where Username = '" + uname + "';";
            stm = con.createStatement();
            rs = stm.executeQuery(query);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Duplicate entry!,Username already exists","Warning",JOptionPane.ERROR_MESSAGE);
            }
            else{
                jPanel3.setVisible(true);
                jPanel2.setVisible(false);
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_RconfirmButtonActionPerformed

    private void RconfirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButtonMouseExited
        // TODO add your handling code here:
        RconfirmButton.setBackground(new java.awt.Color(176, 82, 240));
    }//GEN-LAST:event_RconfirmButtonMouseExited

    private void RconfirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButtonMouseEntered
        // TODO add your handling code here:
        RconfirmButton.setBackground(new java.awt.Color(51,153, 0));
        RconfirmButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RconfirmButtonMouseEntered

    private void RpassField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpassField2KeyPressed
        // TODO add your handling code here:
        RpassField2.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_RpassField2KeyPressed

    private void RpassField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpassField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RpassField2ActionPerformed

    private void RpassField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField2FocusLost
        // TODO add your handling code here:
        if(new  String( RpassField2.getPassword()).equals("")){
            RpassField2.setEchoChar( (char) 0);

            RpassField2.setText(" Confirm Password");
            RpassField2.setForeground(new java.awt.Color(120, 120, 120));
        }
    }//GEN-LAST:event_RpassField2FocusLost

    private void RpassField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField2FocusGained
        // TODO add your handling code here:

        if(new  String( RpassField2.getPassword()).equals(" Confirm Password")){
            RpassField2.setEchoChar( '*');
            RpassField2.setForeground(new java.awt.Color(0, 0, 0));
            RpassField2.setText("");
        }
    }//GEN-LAST:event_RpassField2FocusGained

    private void RbackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbackButtonActionPerformed

        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RbackButtonActionPerformed

    private void RbackButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButtonMouseExited
        // TODO add your handling code here:
        RbackButton.setBackground(new java.awt.Color(176, 82, 240));
    }//GEN-LAST:event_RbackButtonMouseExited

    private void RbackButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButtonMouseEntered
        // TODO add your handling code here:
        RbackButton.setBackground(new java.awt.Color(51,153, 0));
        RbackButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_RbackButtonMouseEntered

    private void RpassField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpassField1KeyPressed
        // TODO add your handling code here:
        RpassField1.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_RpassField1KeyPressed

    private void RpassField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField1FocusLost
        // TODO add your handling code here:
        if(new  String( RpassField1.getPassword()).equals("")){
            RpassField1.setEchoChar( (char) 0);
            RpassField1.setForeground(new java.awt.Color(120, 120, 120));
            RpassField1.setText(" Password");
        }
    }//GEN-LAST:event_RpassField1FocusLost

    private void RpassField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpassField1FocusGained
        // TODO add your handling code here:

        if( new String(RpassField1.getPassword()).equals(" Password")){
            RpassField1.setText("");
            RpassField1.setEchoChar('*');

        }
    }//GEN-LAST:event_RpassField1FocusGained

    private void RdepositAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RdepositAmountKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyChar();

        if( key >='0' && key <='9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ){
            RdepositAmount.setEditable(true);
            RdepositAmount.setForeground(new java.awt.Color(0, 0, 0));

        }else{
            RdepositAmount.setEditable(false);
        }
    }//GEN-LAST:event_RdepositAmountKeyPressed

    private void RdepositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdepositAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdepositAmountActionPerformed

    private void RdepositAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RdepositAmountFocusLost
        // TODO add your handling code here:
        if(RdepositAmount.getText().equals("")){
            RdepositAmount.setText(" Deposit Amount");
        }
    }//GEN-LAST:event_RdepositAmountFocusLost

    private void RdepositAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RdepositAmountFocusGained
        // TODO add your handling code here:
        if(  RdepositAmount.getText().equals(" Deposit Amount")){
            RdepositAmount.setText("");
        }
    }//GEN-LAST:event_RdepositAmountFocusGained

    private void RaccountNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RaccountNumberKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyChar();

        if( key >='0' && key <='9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ){
            if(B1){
                RaccountNumber.setText("");
            }
            RaccountNumber.setEditable(true);
            RaccountNumber.setForeground(new java.awt.Color(0, 0, 0));
            B1=false;
            B2=false;
        }else{
            RaccountNumber.setEditable(false);
        }
    }//GEN-LAST:event_RaccountNumberKeyPressed

    private void RaccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaccountNumberActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_RaccountNumberActionPerformed

    private void RaccountNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RaccountNumberMouseClicked
        // TODO add your handling code here:
        if(RaccountNumber.getText().equals( " Account Number")){
            RaccountNumber.setText("");
            B2=false;
        }
        RaccountNumber.setEditable(true);
    }//GEN-LAST:event_RaccountNumberMouseClicked

    private void RaccountNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RaccountNumberFocusLost
        // TODO add your handling code here:
        if(RaccountNumber.getText().equals("")){
            RaccountNumber.setForeground(new java.awt.Color(120, 120, 120));
            RaccountNumber.setText(" Account Number");

        }
        B2=false;
    }//GEN-LAST:event_RaccountNumberFocusLost

    private void RaccountNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RaccountNumberFocusGained
        // TODO add your handling code here:
        if(RaccountNumber.getText().equals(" Account Number") && B2==false){
            RaccountNumber.setText("");
        }
    }//GEN-LAST:event_RaccountNumberFocusGained

    private void RphoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RphoneNumberKeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyChar();

        if( key >='0' && key <='9' || evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE ){
            RphoneNumber.setEditable(true);
            RphoneNumber.setForeground(new java.awt.Color(0, 0, 0));

        }else{
            RphoneNumber.setEditable(false);
        }
    }//GEN-LAST:event_RphoneNumberKeyPressed

    private void RphoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RphoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RphoneNumberActionPerformed

    private void RphoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RphoneNumberFocusLost
        // TODO add your handling code here:
        if(RphoneNumber.getText().equals("")){
            RphoneNumber.setText(" Phone Number");
        }
    }//GEN-LAST:event_RphoneNumberFocusLost

    private void RphoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RphoneNumberFocusGained
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(RphoneNumber.getText().equals(" Phone Number")){
            RphoneNumber.setText("");

        }
    }//GEN-LAST:event_RphoneNumberFocusGained

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void RemailIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RemailIdKeyPressed
        // TODO add your handling code here:
        RemailId.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_RemailIdKeyPressed

    private void RemailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemailIdActionPerformed

    private void RemailIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemailIdFocusLost
        // TODO add your handling code here:
        if(RemailId.getText().equals("")){
            RemailId.setForeground(new java.awt.Color(120, 120, 120));
            RemailId.setText(" Email Id");
        }
    }//GEN-LAST:event_RemailIdFocusLost

    private void RemailIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RemailIdFocusGained
        // TODO add your handling code here:
        if( RemailId.getText().equals(" Email Id")){
            RemailId.setText("");

        }
    }//GEN-LAST:event_RemailIdFocusGained

    private void RlastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RlastNameKeyPressed
        // TODO add your handling code here:
        RlastName.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_RlastNameKeyPressed

    private void RlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RlastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RlastNameActionPerformed

    private void RlastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RlastNameFocusLost
        // TODO add your handling code here:
        if(RlastName.getText().equals("")){
            RlastName.setForeground(new java.awt.Color(120, 120, 120));
            RlastName.setText(" Last Name");
        }
    }//GEN-LAST:event_RlastNameFocusLost

    private void RlastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RlastNameFocusGained
        // TODO add your handling code here:
        if(RlastName.getText().equals(" Last Name")){
            RlastName.setText("");
        }
    }//GEN-LAST:event_RlastNameFocusGained

    private void RfirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RfirstNameKeyPressed
        // TODO add your handling code here:
        RfirstName.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_RfirstNameKeyPressed

    private void RfirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RfirstNameActionPerformed

    private void RfirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RfirstNameFocusLost
        // TODO add your handling code here:
        if(RfirstName.getText().equals("")){
            RfirstName.setForeground(new java.awt.Color(120, 120, 120));
            RfirstName.setText(" First Name");
        }
    }//GEN-LAST:event_RfirstNameFocusLost

    private void RfirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RfirstNameFocusGained
        // TODO add your handling code here:
        if( RfirstName.getText().equals(" First Name")){
            RfirstName.setText("");
        }
    }//GEN-LAST:event_RfirstNameFocusGained

    private void RadharNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadharNumberFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_RadharNumberFocusGained

    private void RadharNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RadharNumberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_RadharNumberFocusLost

    private void RadharNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadharNumberMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RadharNumberMouseClicked

    private void RadharNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadharNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadharNumberActionPerformed

    private void RadharNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RadharNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadharNumberKeyPressed

    private void RpanNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpanNumberFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_RpanNumberFocusGained

    private void RpanNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RpanNumberFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_RpanNumberFocusLost

    private void RpanNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RpanNumberMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RpanNumberMouseClicked

    private void RpanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RpanNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RpanNumberActionPerformed

    private void RpanNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RpanNumberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RpanNumberKeyPressed

    private void RconfirmButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RconfirmButton1MouseEntered

    private void RconfirmButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RconfirmButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RconfirmButton1MouseExited

    private void RconfirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RconfirmButton1ActionPerformed
            try {

            String sql = "insert into AccountDetails values(?,?,?,?,?,?,?,?,?,?,?,?);";
            pst = con.prepareStatement(sql);
            String gender="";
            if(jRadioButton1.isSelected())
            {
                gender = "Male";
            }
            if(jRadioButton2.isSelected())
            {
                gender = "Female";
            }
            pst.setString(1,RaccountNumber.getText());
            pst.setString(2,RfirstName.getText());
            pst.setString(3,RlastName.getText());
            pst.setString(4,Rusername.getText());
            pst.setString(5,RemailId.getText());
            pst.setString(6,gender);
            pst.setString(7,RphoneNumber.getText());
            pst.setString(8,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.setString(9,RadharNumber.getText());
            pst.setString(10,RpanNumber.getText());
            pst.setString(11,RdepositAmount.getText());
            pst.setString(12,new String(RpassField1.getPassword()));

            if(new String(RpassField1.getPassword()).equals(new String(RpassField2.getPassword())))
            {

                int p=JOptionPane.showConfirmDialog(null, "Are you Sure to save?","Confirm",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null,"Account created sucessfully ");
                    new Login().setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
                else
                {
                    this.setVisible(true);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Password not matched please check ! ");
            }

        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_RconfirmButton1ActionPerformed

    private void RbackButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RbackButton1MouseEntered

    private void RbackButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbackButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_RbackButton1MouseExited

    private void RbackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbackButton1ActionPerformed

        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_RbackButton1ActionPerformed

    Boolean B2= true;
    Boolean B1=true;          
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RaccountNumber;
    private javax.swing.JTextField RadharNumber;
    private javax.swing.JButton RbackButton;
    private javax.swing.JButton RbackButton1;
    private javax.swing.JButton RconfirmButton;
    private javax.swing.JButton RconfirmButton1;
    private javax.swing.JTextField RdepositAmount;
    private javax.swing.JTextField RemailId;
    private javax.swing.JTextField RfirstName;
    private javax.swing.JTextField RlastName;
    private javax.swing.JTextField RpanNumber;
    private javax.swing.JPasswordField RpassField1;
    private javax.swing.JPasswordField RpassField2;
    private javax.swing.JTextField RphoneNumber;
    private javax.swing.JTextField Rusername;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
