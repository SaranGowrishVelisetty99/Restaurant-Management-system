/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oorestaurant;
import java.awt.Component;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


public class oo_restaurant extends javax.swing.JFrame {
    
    

    
    public oo_restaurant() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabeltax4 = new javax.swing.JLabel();
        jLabeltax5 = new javax.swing.JLabel();
        jLabeltax6 = new javax.swing.JLabel();
        chickenpizzatxt = new javax.swing.JTextField();
        chickenburgertxt = new javax.swing.JTextField();
        vegpizzatxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtontotal = new javax.swing.JButton();
        jButtonreceipt = new javax.swing.JButton();
        jButtonreset = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        choclatetxt = new javax.swing.JTextField();
        pineappletxt = new javax.swing.JTextField();
        vanillatxt = new javax.swing.JTextField();
        jLabeltax1 = new javax.swing.JLabel();
        jLabeltax2 = new javax.swing.JLabel();
        jLabeltax3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        costofmilkshakes = new javax.swing.JTextField();
        costofitems = new javax.swing.JTextField();
        costofsnacks = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtreciept = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        Taxtxt = new javax.swing.JTextField();
        subTotaltxt = new javax.swing.JTextField();
        Totaltxt = new javax.swing.JTextField();
        jLabelsubtotal = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabeltax = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jLabeltax4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax4.setText("chicken pizza");

        jLabeltax5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax5.setText("veg pizza");

        jLabeltax6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax6.setText("chicken burger");

        chickenpizzatxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        chickenpizzatxt.setText("0");

        chickenburgertxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        chickenburgertxt.setText("0");

        vegpizzatxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        vegpizzatxt.setText("0");
        vegpizzatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegpizzatxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("snacks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabeltax5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabeltax4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeltax6))
                        .addGap(92, 92, 92)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chickenpizzatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(chickenburgertxt)
                    .addComponent(vegpizzatxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltax6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chickenburgertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltax4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chickenpizzatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltax5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vegpizzatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurant Management System");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName(" Restaurant Management System");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jButtontotal.setText("total");
        jButtontotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontotalActionPerformed(evt);
            }
        });

        jButtonreceipt.setText("receipt");
        jButtonreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreceiptActionPerformed(evt);
            }
        });

        jButtonreset.setText("reset");
        jButtonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonresetActionPerformed(evt);
            }
        });

        jButtonexit.setText("exit");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jButtontotal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButtonreceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButtonexit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtontotal)
                    .addComponent(jButtonreceipt)
                    .addComponent(jButtonexit)
                    .addComponent(jButtonreset)))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        choclatetxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        choclatetxt.setText("0");

        pineappletxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pineappletxt.setText("0");

        vanillatxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        vanillatxt.setText("0");

        jLabeltax1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax1.setText("vanilla");

        jLabeltax2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax2.setText("pineapple");

        jLabeltax3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax3.setText("choclate ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("milkshakes");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeltax1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltax2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltax3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vanillatxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(choclatetxt)
                    .addComponent(pineappletxt))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choclatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltax3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vanillatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltax1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltax2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pineappletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("cost of snacks");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("cost of milkshakes");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Total cost of Items");

        costofmilkshakes.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        costofmilkshakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costofmilkshakesActionPerformed(evt);
            }
        });

        costofitems.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        costofitems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costofitemsActionPerformed(evt);
            }
        });

        costofsnacks.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        costofsnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costofsnacksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(costofsnacks, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(costofmilkshakes)
                    .addComponent(costofitems))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costofsnacks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costofmilkshakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costofitems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        txtreciept.setColumns(20);
        txtreciept.setRows(5);
        jScrollPane1.setViewportView(txtreciept);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        Taxtxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Taxtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxtxtActionPerformed(evt);
            }
        });

        subTotaltxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Totaltxt.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });

        jLabelsubtotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelsubtotal.setText("Sub Total");

        jLabelTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTotal.setText("Total");

        jLabeltax.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabeltax.setText("Tax");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeltax, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Taxtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(subTotaltxt)
                    .addComponent(Totaltxt))
                .addGap(21, 21, 21))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Taxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subTotaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonresetActionPerformed
        JTextField cleartext = null;
       for(Component c:jPanel1.getComponents()) {
       if (c.getClass().toString().contains("javax.swing.JTextField")){
          cleartext = (JTextField)c;
          cleartext.setText("0");
          
       }
       
       }
       
       for(Component c:jPanel9.getComponents()) {
       if (c.getClass().toString().contains("javax.swing.JTextField")){
          cleartext = (JTextField)c;
          cleartext.setText("0");
          
       }
       
       }
       for(Component c:jPanel3.getComponents()) {
       if (c.getClass().toString().contains("javax.swing.JTextField")){
          cleartext = (JTextField)c;
          cleartext.setText("");
       }
       
       }
       for(Component c:jPanel11.getComponents()) {
       if (c.getClass().toString().contains("javax.swing.JTextField")){
          cleartext = (JTextField)c;
          cleartext.setText("");
          
       }
       
       }
       txtreciept.setText(null);
    }//GEN-LAST:event_jButtonresetActionPerformed

    private void vegpizzatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegpizzatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegpizzatxtActionPerformed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void costofmilkshakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costofmilkshakesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costofmilkshakesActionPerformed

    private void costofitemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costofitemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costofitemsActionPerformed

    private void costofsnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costofsnacksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costofsnacksActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
        subclass iExit  = new subclass() ;
        iExit.iExitSystem();
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void TaxtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaxtxtActionPerformed

    private void jButtontotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontotalActionPerformed
        subclass ItemCost = new subclass ();
        
        double iTax, isubTotal, iTotal;
        
        ItemCost.chickenburger = ItemCost.pchickenburger * Double.parseDouble (chickenburgertxt.getText());
        ItemCost.chickenpizza  = ItemCost.pchickenpizza * Double.parseDouble(chickenpizzatxt.getText());
        ItemCost.vegpizza = ItemCost.pvegpizza * Double.parseDouble(vegpizzatxt.getText());
        ItemCost.choclate = ItemCost.pchoclate * Double.parseDouble(choclatetxt.getText());
        ItemCost.vanilla = ItemCost.pvanilla * Double.parseDouble(vanillatxt.getText());
        ItemCost.pineapple = ItemCost.ppineapple * Double.parseDouble(pineappletxt.getText());
        
        isubTotal = ItemCost.getAmount();
        iTax = ItemCost.cFindTax(isubTotal);
        iTotal = isubTotal + iTax;
        
        String subTotal = String.format("$%.2f",isubTotal);
        
        subTotaltxt.setText(subTotal);
        
        String Tax = String.format("$%.2f", iTax);
        
        Taxtxt.setText(Tax);
        
        String Total = String.format("$%.2f",iTotal);
        
        Totaltxt.setText(Total);
        
        String snacks =String.format("$%.2f",ItemCost.snacks);
        costofsnacks.setText(snacks);
        
        String milkshakes = String.format("$%.2f", ItemCost.milkshakes);
        costofmilkshakes.setText(milkshakes);
        
        String Totalcost = String.format("$%.2f", ItemCost.TotalofSNM);
        costofitems.setText(Totalcost);
    }//GEN-LAST:event_jButtontotalActionPerformed

    private void jButtonreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreceiptActionPerformed
       int refs = 12345+ (int) (Math.random()*4238);
       
       Calendar timer = Calendar.getInstance();
       timer.getTime();
       SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
       tTime.format(timer.getTime());
       SimpleDateFormat Tdate = new SimpleDateFormat("dd:MMM:yyy");
       Tdate.format(timer.getTime());
       
      txtreciept.append("\tRestaurant Management Systems:\n"+"\n\n"+
         "Snacks:\t\t"+costofsnacks.getText()+"\n\n"+
     "milkshakes:\t\t"+costofmilkshakes.getText()+"\n\n"+
    "costofItems:\t\t"+costofitems.getText()+"\n\n"+
         "\n======================================\n"+
            "Tax:\t\t"+Taxtxt.getText()+"\n\n"+
       "subTotal:\t\t"+subTotaltxt.getText()+"\n\n"+
          "Total:\t\t"+Totaltxt.getText()+"\n"+
         "\n======================================\n"+
           "Date:\t\t"+Tdate.format(timer.getTime())+"\n\n"+
           "Time:\t\t"+tTime.format(timer.getTime())+"\n\n"+
                    "\n\n\t\tThank You");
       
       
    }//GEN-LAST:event_jButtonreceiptActionPerformed

    
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(oo_restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oo_restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oo_restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oo_restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oo_restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Taxtxt;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JTextField chickenburgertxt;
    private javax.swing.JTextField chickenpizzatxt;
    private javax.swing.JTextField choclatetxt;
    private javax.swing.JTextField costofitems;
    private javax.swing.JTextField costofmilkshakes;
    private javax.swing.JTextField costofsnacks;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonreceipt;
    private javax.swing.JButton jButtonreset;
    private javax.swing.JButton jButtontotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelsubtotal;
    private javax.swing.JLabel jLabeltax;
    private javax.swing.JLabel jLabeltax1;
    private javax.swing.JLabel jLabeltax2;
    private javax.swing.JLabel jLabeltax3;
    private javax.swing.JLabel jLabeltax4;
    private javax.swing.JLabel jLabeltax5;
    private javax.swing.JLabel jLabeltax6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pineappletxt;
    private javax.swing.JTextField subTotaltxt;
    private javax.swing.JTextArea txtreciept;
    private javax.swing.JTextField vanillatxt;
    private javax.swing.JTextField vegpizzatxt;
    // End of variables declaration//GEN-END:variables
}
