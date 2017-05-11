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

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author AriMaulana99
 */
public class ChangeTwoColor {
    
    private JButton buttons[] = null;
    private JPanel panels[] = null;
    private JLabel labels[] = null;
    private Color bgEntered;
    private Color bgExited;
    private Color fgEntered;
    private Color fgExited;
    private Font fontEntered;
    private Font fontExited;
    
    public ChangeTwoColor(JButton...buttons) {
        this.buttons = buttons;
        bgExited = buttons[0].getBackground();
        fgExited = buttons[0].getForeground();
        fgEntered = buttons[0].getForeground();
    }
    
    public ChangeTwoColor(JPanel...panels) {
        this.panels = panels;
        bgExited = panels[0].getBackground();
        fgExited = panels[0].getForeground();
        fgEntered = panels[0].getForeground();
    }
    
    public ChangeTwoColor(JLabel...labels) {
        this.labels = labels;
        fontEntered = new Font("Arial", Font.BOLD, 13); 
        fontExited = labels[0].getFont();
        bgExited = labels[0].getBackground();
        fgExited = labels[0].getForeground();
        fgEntered = labels[0].getForeground();
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public void setButtons(JButton[] buttons) {
        this.buttons = buttons;
    }

    public JPanel[] getPanels() {
        return panels;
    }

    public void setPanels(JPanel[] panels) {
        this.panels = panels;
    }

    public Color getBgEntered() {
        return bgEntered;
    }

    public void setBgEntered(Color bgEntered) {
        this.bgEntered = bgEntered;
    }

    public Color getBgExited() {
        return bgExited;
    }

    public void setBgExited(Color bgExited) {
        this.bgExited = bgExited;
    }

    public Color getFgEntered() {
        return fgEntered;
    }

    public void setFgEntered(Color fgEntered) {
        this.fgEntered = fgEntered;
    }

    public Color getFgExited() {
        return fgExited;
    }

    public void setFgExited(Color fgExited) {
        this.fgExited = fgExited;
    }

    public Font getFontEntered() {
        return fontEntered;
    }

    public void setFontEntered(Font fontEntered) {
        this.fontEntered = fontEntered;
    }

    public Font getFontExited() {
        return fontExited;
    }

    public void setFontExited(Font fontExited) {
        this.fontExited = fontExited;
    }

    public JLabel[] getLabels() {
        return labels;
    }

    public void setLabels(JLabel[] labels) {
        this.labels = labels;
    }
    
    
    
    public void changeTwoColorButton(){
        Font biasa = new Font("Arial", Font.PLAIN, 12);
        for (JButton button : buttons) {
            button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                super.mouseEntered(evt); //To change body of generated methods, choose Tools | Templates.
                button.setBackground(bgEntered);
                button.setForeground(fgEntered);
                
                }
            });
        }
        
        for (JButton button : buttons) {
            button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent evt) {
                super.mouseExited(evt); //To change body of generated methods, choose Tools | Templates.
                button.setBackground(bgExited);
                button.setForeground(fgExited);
                
                }
            });
        }
    } 
    
    public void changeTwoColorPanel(){
        Font biasa = new Font("Arial", Font.PLAIN, 12);
        for (JPanel panel : panels) {
            panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                super.mouseEntered(evt); //To change body of generated methods, choose Tools | Templates.
                panel.setBackground(bgEntered);
                panel.setForeground(fgEntered);
                
                }
            });
        }
        
        for (JPanel panel : panels) {
            panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent evt) {
                super.mouseExited(evt); //To change body of generated methods, choose Tools | Templates.
                panel.setBackground(bgExited);
                panel.setForeground(fgExited);
                
                }
            });
        }
    } 
    
    public void changeTwoColorLabel(){
        
        for (JLabel label : labels) {
            label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                super.mouseEntered(evt); //To change body of generated methods, choose Tools | Templates.
                label.setBackground(bgEntered);
                label.setForeground(fgEntered);
                label.setFont(fontEntered);
                }
            });
        }
        
        for (JLabel label : labels) {
            label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent evt) {
                super.mouseExited(evt); //To change body of generated methods, choose Tools | Templates.
                label.setBackground(bgExited);
                label.setForeground(fgExited);
                label.setFont(fontExited);
                }
            });
        }
    } 
    
}
