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
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author AriMaulana99
 */
public class SlidingForm {
    
    private JDialog dialog;
    private JFrame frame;
    private JButton button = null;
    
    private int x = 10;
    private int xFirst = 0;
    private int xRectangle = 0;
    private int y = 10;
    private int yFirst = 10;
    private int yRectangle = 10;
    private int width;
    private int height;
    private int speed = 8;
    private final int maxBoundsY = 1500;
    private final int maxBoundsX = 2000;
    
    private boolean append = false;


    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public JDialog getDialog() {
        return dialog;
    }

    public void setDialog(JDialog dialog) {
        this.dialog = dialog;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getxFirst() {
        return xFirst;
    }

    public void setxFirst(int xFirst) {
        this.xFirst = xFirst;
    }

    public int getxRectangle() {
        return xRectangle;
    }

    public void setxRectangle(int xRectangle) {
        this.xRectangle = xRectangle;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getyFirst() {
        return yFirst;
    }

    public void setyFirst(int yFirst) {
        this.yFirst = yFirst;
    }

    public int getyRectangle() {
        return yRectangle;
    }

    public void setyRectangle(int yRectangle) {
        this.yRectangle = yRectangle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // construktor kosong
    public SlidingForm() {
        button = new JButton();
    }
    
    // construktor dengan parameter JFrame
    public SlidingForm(JFrame frame) {
        button = new JButton();
        append = true;
        this.frame = frame;
    } 
    
     // construktor dengan parameter JDialog
    public SlidingForm(JDialog dialog) {
        button = new JButton();
        append = false;
        this.dialog = dialog;
    }

    @SuppressWarnings("empty-statement")
    public void initSlidingTopToBootom() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        button.setEnabled(false);
        y = yFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    if (append) {
                        frame.setBounds(x, y+=5, width, height);
                    } else {
                        dialog.setBounds(x, y+=5, width, height);
                    }
                    
                    if (y == yRectangle || y == maxBoundsY) {
                        thread.cancel();
                        y = yFirst;
                        button.setEnabled(true);
                        dialog.requestFocus();
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
    
    @SuppressWarnings("empty-statement")
    public void initSlidingBootomToTop() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        button.setEnabled(false);
        y = yFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    if (append) {
                        frame.setBounds(x, y-=5, width, height);
                    } else {
                        dialog.setBounds(x, y-=5, width, height);
                    }
                    
                    if (y == yRectangle || y == -maxBoundsY) {
                        thread.cancel();
                        y = yFirst;
                        button.setEnabled(true);
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
    
    @SuppressWarnings("empty-statement")
    public void initSlidingRightToLeft() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        button.setEnabled(false);
        x = xFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    if (append) {
                        frame.setBounds(x-=5, y, width, height);
                    } else {
                        dialog.setBounds(x-=5, y, width, height);
                    }
                    
                    if (x == xRectangle || x == -maxBoundsX) {
                        thread.cancel();
                        x = xFirst;
                        button.setEnabled(true);
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
    
    @SuppressWarnings("empty-statement")
    public void initSlidingLeftToRight() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        button.setEnabled(false);
        x = xFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    if (append) {
                        frame.setBounds(x+=5, y, width, height);
                    } else {
                        dialog.setBounds(x+=5, y, width, height);
                    }
                    
                    if (x == xRectangle || x == maxBoundsX) {
                        thread.cancel();
                        x = xFirst;
                        button.setEnabled(true);
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
    
    @SuppressWarnings("empty-statement")
    public void initSlidingTopBootomTop() {
        final Timer thread = new Timer();;
        final TimerTask task;
        
        button.setEnabled(false);
        y = yFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    if (append) {
                        frame.setBounds(x, y+=5, width, height);
                    } else {
                        dialog.setBounds(x, y+=5, width, height);
                    }
                    
                    if (y == yRectangle || y == maxBoundsY) {
                        thread.cancel();
                        button.setEnabled(true);
                        yRectangle = yFirst;
                        yFirst = y;
                        initSlidingBootomToTop();
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
    
    
}
