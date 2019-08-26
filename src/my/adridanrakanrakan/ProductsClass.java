/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.adridanrakanrakan;

/**
 *
 * @author ayieb
 */
import java.util.*;
import java.lang.*;
import javax.swing.*;
public class ProductsClass extends javax.swing.JFrame {

    /**
     * Creates new form ProductsClass
     */
    public ProductsClass() {
        initComponents();
    }
    
    int countLaici = 0;
    int countBlackcurrant = 0;
    int countStroberi = 0;
    int countMango = 0;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProduct = new javax.swing.JPanel();
        jLaiciButton = new javax.swing.JButton();
        jStrawberryButton = new javax.swing.JButton();
        jMangoButton = new javax.swing.JButton();
        jBlackcurrentButton = new javax.swing.JButton();
        jReceiptPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jReceipt = new javax.swing.JTextArea();
        jSubtotalLabel = new javax.swing.JLabel();
        jTaxLabel = new javax.swing.JLabel();
        jTotalPriceLabel = new javax.swing.JLabel();
        jTotalTax = new javax.swing.JTextField();
        jSubtotal = new javax.swing.JTextField();
        jTotalPrice = new javax.swing.JTextField();
        jQtyPanel = new javax.swing.JPanel();
        jQtyLycheePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jQtyLaici = new javax.swing.JTextField();
        jClearLaici = new javax.swing.JButton();
        jqtyStrawberryPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jQtyStroberi = new javax.swing.JTextField();
        jClearStroberi = new javax.swing.JButton();
        jQtyMangoPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jQtyMango = new javax.swing.JTextField();
        jClearMango = new javax.swing.JButton();
        jQtyBlackcurrantPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jQtyBlackcurrent = new javax.swing.JTextField();
        jClearBlackcurrant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jProduct.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLaiciButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/laici.png"))); // NOI18N
        jLaiciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLaiciButtonActionPerformed(evt);
            }
        });

        jStrawberryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/stroberi.png"))); // NOI18N
        jStrawberryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStrawberryButtonActionPerformed(evt);
            }
        });

        jMangoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/pelam.png"))); // NOI18N
        jMangoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMangoButtonActionPerformed(evt);
            }
        });

        jBlackcurrentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/anggot.png"))); // NOI18N
        jBlackcurrentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlackcurrentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jProductLayout = new javax.swing.GroupLayout(jProduct);
        jProduct.setLayout(jProductLayout);
        jProductLayout.setHorizontalGroup(
            jProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLaiciButton, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jStrawberryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jMangoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBlackcurrentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jProductLayout.setVerticalGroup(
            jProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jStrawberryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLaiciButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMangoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jBlackcurrentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jReceiptPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jReceipt.setColumns(20);
        jReceipt.setRows(5);
        jScrollPane1.setViewportView(jReceipt);

        jSubtotalLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jSubtotalLabel.setText("Subtotal:");

        jTaxLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTaxLabel.setText("Tax:");

        jTotalPriceLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTotalPriceLabel.setText("Total:");

        jTotalTax.setText("jTextField1");

        jSubtotal.setText("jTextField2");

        jTotalPrice.setText("jTextField3");

        javax.swing.GroupLayout jReceiptPanelLayout = new javax.swing.GroupLayout(jReceiptPanel);
        jReceiptPanel.setLayout(jReceiptPanelLayout);
        jReceiptPanelLayout.setHorizontalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jReceiptPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jReceiptPanelLayout.createSequentialGroup()
                        .addGroup(jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSubtotalLabel)
                            .addComponent(jTotalPriceLabel)
                            .addComponent(jTaxLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jTotalTax)
                            .addComponent(jSubtotal))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jReceiptPanelLayout.setVerticalGroup(
            jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jReceiptPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTaxLabel)
                    .addComponent(jTotalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubtotalLabel)
                    .addComponent(jSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jReceiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotalPriceLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
        );

        jQtyPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jQtyLycheePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lychee:");

        jQtyLaici.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jQtyLaici.setText("jTextField1");
        jQtyLaici.setEnabled(false);
        jQtyLaici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQtyLaiciActionPerformed(evt);
            }
        });

        jClearLaici.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/clear (1).png"))); // NOI18N
        jClearLaici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearLaiciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jQtyLycheePanelLayout = new javax.swing.GroupLayout(jQtyLycheePanel);
        jQtyLycheePanel.setLayout(jQtyLycheePanelLayout);
        jQtyLycheePanelLayout.setHorizontalGroup(
            jQtyLycheePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyLycheePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jQtyLaici, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jQtyLycheePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jClearLaici)
                .addGap(54, 54, 54))
        );
        jQtyLycheePanelLayout.setVerticalGroup(
            jQtyLycheePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyLycheePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jQtyLycheePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyLaici, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jClearLaici)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jQtyLaici.getAccessibleContext().setAccessibleName("");
        jQtyLaici.getAccessibleContext().setAccessibleDescription("");

        jqtyStrawberryPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Strawberry:");

        jQtyStroberi.setText("jTextField1");
        jQtyStroberi.setEnabled(false);
        jQtyStroberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQtyStroberiActionPerformed(evt);
            }
        });

        jClearStroberi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/clear (1).png"))); // NOI18N
        jClearStroberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearStroberiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jqtyStrawberryPanelLayout = new javax.swing.GroupLayout(jqtyStrawberryPanel);
        jqtyStrawberryPanel.setLayout(jqtyStrawberryPanelLayout);
        jqtyStrawberryPanelLayout.setHorizontalGroup(
            jqtyStrawberryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jqtyStrawberryPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jClearStroberi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jqtyStrawberryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jQtyStroberi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jqtyStrawberryPanelLayout.setVerticalGroup(
            jqtyStrawberryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jqtyStrawberryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jqtyStrawberryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyStroberi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jClearStroberi)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jQtyMangoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mango:");

        jQtyMango.setText("jTextField1");
        jQtyMango.setEnabled(false);
        jQtyMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQtyMangoActionPerformed(evt);
            }
        });

        jClearMango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/clear (1).png"))); // NOI18N
        jClearMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearMangoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jQtyMangoPanelLayout = new javax.swing.GroupLayout(jQtyMangoPanel);
        jQtyMangoPanel.setLayout(jQtyMangoPanelLayout);
        jQtyMangoPanelLayout.setHorizontalGroup(
            jQtyMangoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyMangoPanelLayout.createSequentialGroup()
                .addGroup(jQtyMangoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jQtyMangoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jQtyMango, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jQtyMangoPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jClearMango)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jQtyMangoPanelLayout.setVerticalGroup(
            jQtyMangoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyMangoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jQtyMangoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyMango, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jClearMango)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jQtyBlackcurrantPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Blackcurrant:");

        jQtyBlackcurrent.setText("jTextField1");
        jQtyBlackcurrent.setEnabled(false);
        jQtyBlackcurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQtyBlackcurrentActionPerformed(evt);
            }
        });

        jClearBlackcurrant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/adridanrakanrakan/clear (1).png"))); // NOI18N
        jClearBlackcurrant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearBlackcurrantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jQtyBlackcurrantPanelLayout = new javax.swing.GroupLayout(jQtyBlackcurrantPanel);
        jQtyBlackcurrantPanel.setLayout(jQtyBlackcurrantPanelLayout);
        jQtyBlackcurrantPanelLayout.setHorizontalGroup(
            jQtyBlackcurrantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyBlackcurrantPanelLayout.createSequentialGroup()
                .addGroup(jQtyBlackcurrantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jQtyBlackcurrantPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jQtyBlackcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jQtyBlackcurrantPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jClearBlackcurrant)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jQtyBlackcurrantPanelLayout.setVerticalGroup(
            jQtyBlackcurrantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyBlackcurrantPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jQtyBlackcurrantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyBlackcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jClearBlackcurrant)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jQtyPanelLayout = new javax.swing.GroupLayout(jQtyPanel);
        jQtyPanel.setLayout(jQtyPanelLayout);
        jQtyPanelLayout.setHorizontalGroup(
            jQtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jQtyLycheePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jqtyStrawberryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jQtyMangoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jQtyBlackcurrantPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jQtyPanelLayout.setVerticalGroup(
            jQtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jQtyPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jQtyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jqtyStrawberryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyLycheePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyMangoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQtyBlackcurrantPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jQtyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(267, 267, 267)
                .addComponent(jReceiptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jQtyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 245, Short.MAX_VALUE))
                    .addComponent(jReceiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
                  
   
    private void jQtyStroberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQtyStroberiActionPerformed
       
    }//GEN-LAST:event_jQtyStroberiActionPerformed

    private void jQtyMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQtyMangoActionPerformed
   
    }//GEN-LAST:event_jQtyMangoActionPerformed
 
    private void jQtyBlackcurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQtyBlackcurrentActionPerformed
  
    }//GEN-LAST:event_jQtyBlackcurrentActionPerformed

    private void jQtyLaiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQtyLaiciActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jQtyLaiciActionPerformed

    private void jClearLaiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearLaiciActionPerformed
        jQtyLaici.setText(" ");
        
    }//GEN-LAST:event_jClearLaiciActionPerformed

    private void jClearStroberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearStroberiActionPerformed
        jQtyStroberi.setText(" ");
        countStroberi = 0;
    }//GEN-LAST:event_jClearStroberiActionPerformed

    private void jClearMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearMangoActionPerformed
      jQtyMango.setText(" ");
      countMango=0;
    }//GEN-LAST:event_jClearMangoActionPerformed

    private void jClearBlackcurrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearBlackcurrantActionPerformed
        jQtyBlackcurrent.setText(" ");
        countBlackcurrant = 0;
    }//GEN-LAST:event_jClearBlackcurrantActionPerformed
       //COUNT BLACKCURRANT QTY BASED ON CLICK
     
    private void jBlackcurrentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlackcurrentButtonActionPerformed
        //Enable Quantity Textfield
      jQtyBlackcurrent.setEnabled(true);
    }//GEN-LAST:event_jBlackcurrentButtonActionPerformed

    private void jMangoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMangoButtonActionPerformed
        //Enable Quantity Textfield
      jQtyMango.setEnabled(true);
    }//GEN-LAST:event_jMangoButtonActionPerformed

    private void jStrawberryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStrawberryButtonActionPerformed
        //Enable Quantity Textfield
      jQtyStroberi.setEnabled(true);
    }//GEN-LAST:event_jStrawberryButtonActionPerformed

    private void jLaiciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLaiciButtonActionPerformed
        //Enable Quantity Textfield
      jQtyLaici.setEnabled(true);
    }//GEN-LAST:event_jLaiciButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlackcurrentButton;
    private javax.swing.JButton jClearBlackcurrant;
    private javax.swing.JButton jClearLaici;
    private javax.swing.JButton jClearMango;
    private javax.swing.JButton jClearStroberi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLaiciButton;
    private javax.swing.JButton jMangoButton;
    private javax.swing.JPanel jProduct;
    private javax.swing.JPanel jQtyBlackcurrantPanel;
    private javax.swing.JTextField jQtyBlackcurrent;
    private javax.swing.JTextField jQtyLaici;
    private javax.swing.JPanel jQtyLycheePanel;
    private javax.swing.JTextField jQtyMango;
    private javax.swing.JPanel jQtyMangoPanel;
    private javax.swing.JPanel jQtyPanel;
    private javax.swing.JTextField jQtyStroberi;
    private javax.swing.JTextArea jReceipt;
    private javax.swing.JPanel jReceiptPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jStrawberryButton;
    private javax.swing.JTextField jSubtotal;
    private javax.swing.JLabel jSubtotalLabel;
    private javax.swing.JLabel jTaxLabel;
    private javax.swing.JTextField jTotalPrice;
    private javax.swing.JLabel jTotalPriceLabel;
    private javax.swing.JTextField jTotalTax;
    private javax.swing.JPanel jqtyStrawberryPanel;
    // End of variables declaration//GEN-END:variables
}
