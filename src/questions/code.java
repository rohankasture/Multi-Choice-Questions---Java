package questions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;

/**
 *
 * @author shradha_b
 */
public class code extends javax.swing.JFrame {
 

    /**
     * Creates new form code
     */
    public code() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 140, 141));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lets 'C' if You Can Crack");

        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(189, 195, 199));
        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Submit");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(189, 195, 199));
        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("30 : 00");
        jLabel6.setOpaque(true);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Buttercup\\Documents\\logoname2.jpg")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("START");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(99, 99, 99)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(496, 496, 496))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setBackground(new java.awt.Color(189, 195, 199));
        jPanel2.setOpaque(false);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 62, 80));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("50-50");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 62, 80));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 62, 80));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SKIP");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(44, 62, 80));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("x2");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(127, 140, 141));
        jLabel7.setText("Question #1");

        jTextArea3.setBackground(new java.awt.Color(41, 128, 185));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setEnabled(false);
        jTextArea3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setBackground(new java.awt.Color(41, 128, 185));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setBorder(null);
        jTextArea4.setEnabled(false);
        jTextArea4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setBackground(new java.awt.Color(41, 128, 185));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setBorder(null);
        jTextArea5.setEnabled(false);
        jTextArea5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea2.setBackground(new java.awt.Color(41, 128, 185));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setEnabled(false);
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea1.setBackground(new java.awt.Color(41, 128, 185));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Open Sans", 1, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185)));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("L E V E L   1");

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("S C O R E    0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea2MouseClicked
        // TODO add your handling code here:
      if(wrng1==1|| wrng2==1)
          ans=0;
      else{
       ans=1;
        chgColor(ans);
      }
    }//GEN-LAST:event_jTextArea2MouseClicked

    private void jTextArea3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea3MouseClicked
        // TODO add your handling code here:
       if(wrng1==2|| wrng2==2)
          ans=0;
       else{
       ans=2;
       chgColor(ans);
       }
    }//GEN-LAST:event_jTextArea3MouseClicked

    private void jTextArea4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea4MouseClicked
        // TODO add your handling code here:
        if(wrng1==3|| wrng2==3)
          ans=0;
        else{
            ans=3;
        
       chgColor(ans);
        }
    }//GEN-LAST:event_jTextArea4MouseClicked

    private void jTextArea5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea5MouseClicked
        // TODO add your handling code here:
        if(wrng1==4|| wrng2==4)
          ans=0;
        else{
        ans=4;
        chgColor(ans);
        }
    }//GEN-LAST:event_jTextArea5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if(ans==0){
            JOptionPane.showMessageDialog(null,"Please enter a valid option");
            return;
        }
        if(fifty==true)
            wrng1=wrng2=0;
        
      if (currentLevel==0)
      {
             
          if(ans==tQues.ans){
          score=score+(2*twice);
          easyToMedium--;
        
          if(easyToMedium==0){
              easyToMedium=2;
              currentLevel++;
          }
          
          }
          else{
          easyToMedium=2;
          score=score-(1*twice);
          }
      jLabel9.setText("S C O R E   " +  Integer.toString(score) );  
      }
      
      
      else if (currentLevel==1)
      {
      if(ans==tQues.ans){
            score=score+(4*twice);
            mediumToHard--;
            
            if (mediumToHard==0){
                mediumToHard=2;
               currentLevel++;
            }
      }
      else{
          score=score-(2*twice);
           mediumToHard=2;
           currentLevel--;
      }
      jLabel9.setText("S C O R E   " +  Integer.toString(score) );
      }
      
      
      
      else if (currentLevel==2)
      {
      if(ans==tQues.ans){
            score=score+(10*twice);
      }
      
      else{
          score=score-(5*twice);
          currentLevel--;
      }
      jLabel9.setText("S C O R E   " +  Integer.toString(score) );
      }
       twice=1;
        try {
            nextQ();
        } catch (IOException ex) {
            Logger.getLogger(code.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        if(start==false)
        {
           rem = new Reminder(1);
           fifty=false;
         Color c=new Color(127,127,127);
        
       try {
            // TODO add your handling code here:
            openDB();
        } catch (IOException ex) {
            Logger.getLogger(code.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                nextQ();
            } catch (IOException ex) {
                Logger.getLogger(code.class.getName()).log(Level.SEVERE, null, ex);
            }
      
      start=true;  
      jLabel11.setForeground(c);
      
      }
  
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLayeredPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLayeredPane1MouseClicked

   
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
      //  JOptionPane.showMessageDialog( null,"inside");
        if (fifty==false){
        //    JOptionPane.showMessageDialog( null,tQues.ans);
           switch(tQues.ans){
               case 1:
                   jTextArea4.setText("");
                   jTextArea5.setText("");
                   wrng1=3;
                   wrng2=4;
                   break;
                   
               case 2:
                   jTextArea5.setText("");
                   jTextArea2.setText("");
                   wrng1=4;
                   wrng2=1;
                   break;
                   
               case 3:
                   jTextArea2.setText("");
                   jTextArea3.setText("");
                   wrng1=1;
                   wrng2=2;
                   break;
                   
               case 4:
                   jTextArea3.setText("");
                   jTextArea4.setText("");
                   wrng1=2;
                   wrng2=3;
                   break;
           }
         
        }
        Color c4=new Color(127,127,127);
        jLabel3.setForeground(c4);
        fifty=true;
   
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        if(skip==false){
            try {
                nextQ();
            } catch (IOException ex) {
                Logger.getLogger(code.class.getName()).log(Level.SEVERE, null, ex);
            }
        skip=true;
        Color c5=new Color(127,127,127);
        jLabel5.setForeground(c5);
        if(fifty==true)
            wrng1=wrng2=0;
        
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        if(doubleScore==false){
            twice=2;
            //JOptionPane.showMessageDialog(null,"twice="+twice);
            doubleScore=true;
            Color c6=new Color(127,127,127);
            jLabel12.setForeground(c6);
            if(fifty==true)
            wrng1=wrng2=0;
        
        }
        
    }//GEN-LAST:event_jLabel12MouseClicked

    
    
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
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new code().setVisible(true);
            }
        });
    }

    public void chgColor(int ans){
        
        
        jTextArea2.setBackground(c2);
        jTextArea3.setBackground(c2);
        jTextArea4.setBackground(c2);
        jTextArea5.setBackground(c2);
        
        switch(ans)
        {
            
            case 1:
                jTextArea2.setBackground(c3);
                break;
            case 2:
                jTextArea3.setBackground(c3);
                break;
            case 3:
                jTextArea4.setBackground(c3);
                break;
            case 4:
                jTextArea5.setBackground(c3);
                break;
                
           }
    }
    
    public void openDB () throws FileNotFoundException, IOException{
       
        ip=new File("database.dat");
        fis = new FileInputStream(ip);
        ois=new ObjectInputStream(fis);
        
        
         while(fis.available() !=0)
         {
             
             try {
                tQues = (Question)ois.readObject();
                if(tQues.type == 0) {
                easy.add(tQues);
               
               }
               
               else if(tQues.type == 1){
               medium.add(tQues);
               
               }
               
               else if(tQues.type == 2){
               hard.add(tQues);
               
               }
               
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(code.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
    }
    
    public void nextQ() throws IOException{
      
        //ans=0;
        currentQues++;
        jLabel7.setText("Question #" + currentQues);
        //chgColor(ans);
        
        if (currentLevel==0){
            //JOptionPane.showMessageDialog(null, "Called easy");
          easy();
          
        }
       else if (currentLevel==1){
        medium();
      
      }
       else if (currentLevel==2){
      hard();
     }
 
      jTextArea1.setText(tQues.ques);
      jTextArea2.setText(tQues.opt[0]);
      jTextArea3.setText(tQues.opt[1]);
      jTextArea4.setText(tQues.opt[2]);
      jTextArea5.setText(tQues.opt[3]);
      jTextArea1.setCaretPosition(0);
      jTextArea2.setCaretPosition(0);
      jTextArea3.setCaretPosition(0);
      jTextArea4.setCaretPosition(0);
      jTextArea5.setCaretPosition(0);
    
      
     jPanel1.setBackground(c1);
     jTextArea1.setBackground(c2);
     jTextArea2.setBackground(c2);
     jTextArea3.setBackground(c2);
     jTextArea4.setBackground(c2);
     jTextArea5.setBackground(c2);
     
     imageName = ImageIO.read(imgFile);
     jLabel10.setIcon(new ImageIcon(imageName));
      
    }
    
    public void easy(){
    //    JOptionPane.showMessageDialog(null, "Called easy");
        int temp;
        c1=new Color (44,62,80);
        c2=new Color(41,128,185);
        c3=new Color(0,80,130);
        jLabel8.setText("L E V E L  1");
    
        temp=r1.nextInt(easyNum);
         tQues=easy.get(temp);  
         easy.remove(temp);
         easyNum--;
         imgFile=new File("logoname_e.png");
    }
    
    public void medium(){
        int temp;
        c2= new Color(22,170,133);
        c1= new Color(26,120,80);
        c3=new Color(0,80,40);
        jLabel8.setText("L E V E L  2");
        temp=r1.nextInt(medNum);
         tQues=medium.get(temp);  
         medium.remove(temp);
         medNum--;
         imgFile=new File("logoname_m.png");
    }
    
    public void hard(){
        int temp;
        c1= new Color(160,57,43);
        c2= new Color(231, 76, 60);
        c3=new Color(190,40,20);
        jLabel8.setText("L E V E L  3");
        temp=r1.nextInt(hardNum);
         tQues=hard.get(temp);  
         hard.remove(temp);
         hardNum--;
         imgFile=new File("logoname_h.png");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables

    public int  level=1, currentQues=1;
    public static int score=0;
    public File ip, imgFile;
    public FileInputStream fis;
    public ObjectInputStream ois;
    public int ans=0,i=0; 
    private Question tQues;
    public int currentLevel=0, easyToMedium=2, mediumToHard=2, wrng1=0,wrng2=0,easyNum=45,medNum=60,hardNum=23,twice=1;
    public boolean start=false, fifty=false,skip=false,doubleScore=false;
    ArrayList<Question> easy = new ArrayList<>();
    ArrayList<Question> medium = new ArrayList<>();
    ArrayList<Question> hard = new ArrayList<>();
    ArrayList<Question> list = new ArrayList<>();
    Reminder rem;
    public Image imageName;
    public Color c1,c2,c3,c;
    Random r1=new Random();
    
   
    
}