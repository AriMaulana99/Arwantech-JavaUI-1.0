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
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author AriMaulana99
 */
public class SlidingPanel {
    
    private JPanel panel;
    private JPanel panelBackground;
    private JFrame frame;
    private JButton button = null;
    
    private int x = 0;
    private int xFirst = 0;
    private int xRectangle = 0;
    private int y = 0;
    private int yFirst = 0;
    private int yRectangle = 0;
    private int width = 0;
    private int height = 0;
    private int speed = 8;
    private final int maxBoundsY = 1500;
    private final int maxBoundsX = 2000;

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanelBackground() {
        return panelBackground;
    }

    public void setPanelBackground(JPanel panelBackground) {
        this.panelBackground = panelBackground;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
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

    public SlidingPanel(JFrame frame, JPanel panel, JPanel panelBackground) {
        button = new JButton();
        this.frame = frame;
        this.panel = panel;
        this.panelBackground = panelBackground;
        
    }
    

    public void initSlidingTopToBootom() {
        final Timer thread = new Timer();
        final TimerTask task;
        
        width = panelBackground.getWidth();
        height = panelBackground.getHeight();
        
        panel.setSize(width, height);
        panelBackground.removeAll();
        panelBackground.add(panel);
        frame.setVisible(true);
        button.setEnabled(false);
        
        y = yFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    panel.setBounds(x, y+=5, width, height);
                    if (y == yRectangle || y == maxBoundsY) {
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
    
    public void initSlidingBootomToTop() {
        final Timer thread = new Timer();
        final TimerTask task;
        
        width = panelBackground.getWidth();
        height = panelBackground.getHeight();
        
        panel.setSize(width, height);
        panelBackground.removeAll();
        panelBackground.add(panel);
        frame.setVisible(true);
        button.setEnabled(false);
        
        y = yFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    panel.setBounds(x, y-=5, width, height);
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
    
    public void initSlidingRightToToLeft() {
        final Timer thread = new Timer();
        final TimerTask task;
        
        width = panelBackground.getWidth();
        height = panelBackground.getHeight();
        
        panel.setSize(width, height);
        panelBackground.removeAll();
        panelBackground.add(panel);
        frame.setVisible(true);
        button.setEnabled(false);
        
        x = xFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    panel.setBounds(x-=5, y, width, height);
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
    
    public void initSlidingLeftToToRight() {
        final Timer thread = new Timer();
        final TimerTask task;
        
        width = panelBackground.getWidth();
        height = panelBackground.getHeight();
        
        panel.setSize(width, height);
        panelBackground.removeAll();
        panelBackground.add(panel);
        frame.setVisible(true);
        button.setEnabled(false);
        
        x = xFirst;
        try { 
            /* Thread */
            task = new TimerTask() {
                @Override
                public void run() { 
                    //System.out.println("TIMER 2 Berjalan");
                    panel.setBounds(x+=5, y, width, height);
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
    
}
