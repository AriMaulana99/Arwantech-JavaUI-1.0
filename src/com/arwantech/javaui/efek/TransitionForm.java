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

package com.arwantech.javaui.efek;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * File ini bertugas untuk membuat JFrame atau JDialog menjadi seperti 
 * feedin/transisi pada saat form di buka dan pada saat form di tutup.
 * Sehingga terlihat lebih cantik dan menarik.
 * Selain itu bisa juga membuat transisi ketika form dibuka dan form
 * bisa menutup secara otomatis dengan batas waktu yang ditentukan.
 *
 * @author AriMaulana99 <info@arwantech.com>
 */
public final class TransitionForm {
    
    // property untuk membuat form yang akan di atur opacitynya
    private JFrame frame = null;
    private JDialog dialog = null;
     
    // property untuk mengatur nilai transisi
    private float vOpacity[] = new float[3];
    private float opacityFirst = (float) 1.00;
    private float opacityPlus = (float) 0.02;
    private float opacityLast = (float) 0.01;
    
    // property untuk mengatur skejul
    private int speed = 15;
    private int timing = 3;
    private int counterTiming = 0;
    
    // property untuk mengecek JFrame dan JDialog 
    private boolean append = false;
    
    // property untuk membuat button menjadi enable false dan true
    private JComponent component = null;

    // construktor kosong
    @SuppressWarnings("empty-statement")
    public TransitionForm() {
        component = new JButton();
    }

    // construktor untuk transisi JFrame dengan parameter
    @SuppressWarnings("empty-statement")
    public TransitionForm(JFrame frame, int speed) {
        component = new JButton();
        this.speed = speed;
        this.frame = frame;
        this.timing = timing;
        append = false;
    }

    // construktor untuk transisi JFrame dengan parameter
    @SuppressWarnings("empty-statement")
    public TransitionForm(JFrame frame, int speed, int timing) {
        component = new JButton();
        this.speed = speed;
        this.frame = frame;
        this.timing = timing;
        append = false;
    }

    // construktor untuk transisi JDialog dengan parameter
    @SuppressWarnings("empty-statement")
    public TransitionForm(JDialog dialog, int speed) {
        component = new JButton();
        this.speed = speed;
        this.dialog = dialog;
        this.timing = timing;
        append = true;
    }

    // construktor untuk transisi JDialog dengan parameter
    @SuppressWarnings("empty-statement")
    public TransitionForm(JDialog dialog, int speed, int timing) {
        component = new JButton();
        this.speed = speed;
        this.dialog = dialog;
        this.timing = timing;
        append = true;
    }

    // setter getter property
    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JDialog getDialog() {
        return dialog;
    }

    public void setDialog(JDialog dialog) {
        this.dialog = dialog;
    }

    public float getOpacityFirst() {
        return opacityFirst;
    }

    public void setOpacityFirst(float opacityFirst) {
        this.opacityFirst = opacityFirst;
    }

    public float getOpacityPlus() {
        return opacityPlus;
    }

    public void setOpacityPlus(float opacityPlus) {
        this.opacityPlus = opacityPlus;
    }

    public float getOpacityLast() {
        return opacityLast;
    }

    public void setOpacityLast(float opacityLast) {
        this.opacityLast = opacityLast;
    }

    public int getSpeed() {
        return speed;
    }
    

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public JComponent getButton() {
        return component;
    }

    public void setButton(JComponent component) {
        this.component = component;
    }
    
    // method untuk menjalankan transisi saat form open
    @SuppressWarnings("empty-statement")
    public void initFrameTransitionOpen() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        vOpacity[0] = opacityFirst;
        vOpacity[1] = opacityPlus;
        vOpacity[2] = opacityLast;
        
        component.setEnabled(false);
        if (append) {
            dialog.setEnabled(false);
        } else {
            frame.setEnabled(false);
        }
        
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    vOpacity[0] = vOpacity[0] + vOpacity[1];
                    try {
                        setOpacity(vOpacity[0]);
                    } catch (Exception e) {
                        thread.cancel();
                        setOpacity(vOpacity[2]);
                        if (append) {
                            dialog.setEnabled(true);
                            dialog.requestFocus();
                        } else {
                            frame.setEnabled(true);
                            frame.requestFocus();
                        }
                        component.setEnabled(true);
                    }
                }
                };     
            Date startDate = new Date();
            thread.schedule(task, startDate, speed);   
        } catch (Exception ex) {
            thread.cancel();
            System.out.println("Method daftar() ERROR : " + ex);
        } 
        
    }
    
    // method untuk menjalankan transisi saat form close
    @SuppressWarnings("empty-statement")
    public void initFrameTransitionClose() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        vOpacity[0] = opacityFirst;
        vOpacity[1] = opacityPlus;
        vOpacity[2] = opacityLast;
        
        component.setEnabled(false);
        if (append) {
            dialog.setEnabled(false);
        } else {
            frame.setEnabled(false);
        }

        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    vOpacity[0] = vOpacity[0] - vOpacity[1];
                    try {
                        setOpacity(vOpacity[0]);
                    } catch (Exception e) {
                        thread.cancel();
                        setOpacity(vOpacity[2]);
                        if (append) {
                            dialog.dispose();
                            dialog.setEnabled(true);
                        } else {
                            frame.dispose();
                            frame.setEnabled(true);
                        }
                        component.setEnabled(true);
                    }
                }
                };     
            Date startDate = new Date();
            thread.schedule(task, startDate, speed);   
        } catch (Exception ex) {
            thread.cancel();
            System.out.println("Method daftar() ERROR : " + ex);
        } 
        
    }
    
    // method untuk menjalankan transisi saat form open dan close otomatis
    @SuppressWarnings("empty-statement")
    public void initFrameTransitionOpenClose() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        vOpacity[0] = opacityFirst;
        vOpacity[1] = opacityPlus;
        vOpacity[2] = opacityLast;
        
        component.setEnabled(false);
        if (append) {
            dialog.setEnabled(false);
        } else {
            frame.setEnabled(false);
        }

        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    vOpacity[0] = vOpacity[0] + vOpacity[1];
                    try {
                        setOpacity(vOpacity[0]);
                    } catch (Exception e) {
                        thread.cancel();
                        setOpacity(vOpacity[2]);
                        timerFrameClose();
                        component.setEnabled(true);
                    }
                }
                };     
            Date startDate = new Date();
            thread.schedule(task, startDate, speed);   
        } catch (Exception ex) {
            thread.cancel();
            System.out.println("Method daftar() ERROR : " + ex);
        } 
        
    }
    
    // method untuk men SET nilai opacity form
    public void setOpacity(float opacity) {        
        if (append) {
            dialog.setOpacity(opacity);
        } else {
            frame.setOpacity(opacity);
        }
    }

    // method untuk mengatur timing form menutup otomatis
    @SuppressWarnings("empty-statement")
    public void timerFrameClose() {
        final Timer thread = new Timer();;
        final TimerTask task;

        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    if (counterTiming == timing) {
                        thread.cancel();
                        opacityFirst = (float) 1.00;
                        opacityLast = (float) 0.01;
                        initFrameTransitionClose();
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
}
