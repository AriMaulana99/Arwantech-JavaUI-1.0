/*
 * Copyright (c) 2017 ARWANTECH CREATIVE TEAM
 *
 * Anda diperkenankan mengedit isi dari source code ini
 * asalkan tetap menyertakan copyright ini.
 *
 * File ini dibuat menggunakan :
 * Editor     : NetBeans IDE 8.0.2
 * NoteBook   : ASUS Notebook K42F
 * OS         : Windows 10 Pro 64bit
 * Compiler   : JDK 8 update 18
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 *      http://www.apache.org/licenses/LICENSE-2.0
 */
package com.arwantech.javaui.notification;

import com.arwantech.javaui.efek.SlidingForm;
import com.arwantech.javaui.efek.TransitionForm;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author AriMaulana99
 */
public final class AlertError extends javax.swing.JDialog {

    private final int timing = 1;
    private int counterTiming = 0;
    
    /**
     * Creates new form AlertSuccess
     * @param parent
     * @param modal
     */
    public AlertError(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AlertError(java.awt.Frame parent, boolean modal, String text) {
        super(parent, modal);
        initComponents();
        lblText.setText(text);
        lblText.requestFocus();
        transisiOpen();
        slidingOpen();
        timerFrameBergerak();
    }
    
    private void transisiOpen() {
        TransitionForm transitionFrame = new TransitionForm(this, 8);
        transitionFrame.setOpacityFirst((float) 0.01);
        transitionFrame.setOpacityLast((float) 1.00);
        transitionFrame.initFrameTransitionOpen();
    }

    private void transisiClose() {
        TransitionForm transitionFrame = new TransitionForm(this, 5);
        transitionFrame.setOpacityFirst((float) 1.00);
        transitionFrame.setOpacityLast((float) 0.01);
        transitionFrame.initFrameTransitionClose();
    }
    
    private void slidingOpen() {
        SlidingForm slidingForm = new SlidingForm(this);
        slidingForm.setWidth(this.getWidth());
        slidingForm.setHeight(this.getHeight());
        slidingForm.setX(5);
        slidingForm.setyFirst(-50);
        slidingForm.setyRectangle(30);
        slidingForm.initSlidingTopToBootom();
    }

    private void slidingTopBootomTop() {
        SlidingForm slidingForm = new SlidingForm(this);
        slidingForm.setWidth(this.getWidth());
        slidingForm.setHeight(this.getHeight());
        slidingForm.setX(5);
        slidingForm.setyFirst(30);
        slidingForm.setyRectangle(85);
        slidingForm.setSpeed(16);
        slidingForm.initSlidingTopBootomTop();
    }
    
    @SuppressWarnings("empty-statement")
    public void timerFrameBergerak() {
        final Timer thread = new Timer();;
        final TimerTask task;

        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    if (counterTiming == timing) {
                        thread.cancel();
                        slidingTopBootomTop();
                    }
                    counterTiming++;
                }
                };     
            Date startDate = new Date();
            thread.schedule(task, startDate, 1000);   
        } catch (Exception ex) {
            thread.cancel();
            System.out.println("Method daftar() ERROR : " + ex);
        } 
        
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
        lblText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 222, 222));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 68, 66), 2));

        lblText.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        lblText.setForeground(new java.awt.Color(169, 68, 66));
        lblText.setText("Proses simpan data succsessfull");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 167, 165));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        transisiClose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        transisiClose();
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(AlertError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlertError dialog = new AlertError(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
