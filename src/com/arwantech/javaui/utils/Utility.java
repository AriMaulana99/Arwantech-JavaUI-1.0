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
package com.arwantech.javaui.utils;

import com.arwantech.javaui.notification.AlertError;
import com.arwantech.javaui.notification.AlertInformation;
import com.arwantech.javaui.notification.AlertSuccess;
import com.arwantech.javaui.notification.AlertWarning;
import com.arwantech.javaui.notification.ConfirmDialog;
import com.arwantech.javaui.notification.MessageBox;
import com.arwantech.javaui.notification.MessageError;
import com.arwantech.javaui.notification.MessageInformation;
import com.arwantech.javaui.notification.MessageSuccess;
import com.arwantech.javaui.notification.MessageWarning;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.JTextComponent;

/**
 *
 * @author AriMaulana99
 */
public class Utility {
    
    public static void messageBox(final JFrame parentComponent, JButton button, final String text) {
        PanelBlur pn = new PanelBlur(null, true, parentComponent.getX(), parentComponent.getY(), parentComponent.getWidth(), parentComponent.getHeight());
        MessageBox  massageBox = new MessageBox(null, true, pn, button, text);
        pn.setDialog(massageBox);
        pn.setLocationRelativeTo(parentComponent);
        pn.setVisible(true);
    }
    
    public static void messageBox(final JFrame parentComponent, JButton button, final String text, String title) {
        PanelBlur pn = new PanelBlur(null, true, parentComponent.getX(), parentComponent.getY(), parentComponent.getWidth(), parentComponent.getHeight());
        MessageBox  massageBox = new MessageBox(null, true, pn, button, text, title);
        pn.setDialog(massageBox);
        pn.setLocationRelativeTo(parentComponent);
        pn.setVisible(true);
    }
    
    public static boolean confirmDialog(final JFrame parentComponent, JButton button, final String text) {
        PanelBlur pn = new PanelBlur(null, true, parentComponent.getX(), parentComponent.getY(), parentComponent.getWidth(), parentComponent.getHeight());
        ConfirmDialog  confirmDialog = new ConfirmDialog(null, true, pn, button, text);
        pn.setDialog(confirmDialog);
        pn.setLocationRelativeTo(parentComponent);
        pn.setVisible(true);
        return confirmDialog.isAppend();
    }
    
    public static boolean confirmDialog(final JFrame parentComponent, JButton button, final String text, final String title) {
        PanelBlur pn = new PanelBlur(null, true, parentComponent.getX(), parentComponent.getY(), parentComponent.getWidth(), parentComponent.getHeight());
        ConfirmDialog  confirmDialog = new ConfirmDialog(null, true, pn, button, text, title);
        pn.setDialog(confirmDialog);
        pn.setLocationRelativeTo(parentComponent);
        pn.setVisible(true);
        return confirmDialog.isAppend();
    }
    
    public static void alertSuccess(final JFrame parentComponent, final String text) {
        AlertSuccess as = new AlertSuccess(parentComponent, true, text);
        as.setLocationRelativeTo(parentComponent);
        as.setVisible(true);
    }
    
    public static void alertError(final JFrame parentComponent, final String text) {
        AlertError ae = new AlertError(parentComponent, true, text);
        ae.setLocationRelativeTo(parentComponent);
        ae.setVisible(true);
    }
    
    public static void alertInformation(final JFrame parentComponent, final String text) {
        AlertInformation ai = new AlertInformation(parentComponent, true, text);
        ai.setLocationRelativeTo(parentComponent);
        ai.setVisible(true);
    }
    
    public static void alertWarning(final JFrame parentComponent, final String text) {
        AlertWarning aw = new AlertWarning(parentComponent, true, text);
        aw.setLocationRelativeTo(parentComponent);
        aw.setVisible(true);
    }
    
    public static void messageSuccess(final JFrame parentComponent, final String text) {
        MessageSuccess aw = new MessageSuccess(parentComponent, true, text);
        aw.setLocationRelativeTo(parentComponent);
        aw.setVisible(true);
    }
    
    public static void messageInformation(final JFrame parentComponent, final String text) {
        MessageInformation aw = new MessageInformation(parentComponent, true, text);
        aw.setLocationRelativeTo(parentComponent);
        aw.setVisible(true);
    }
    
    public static void messageWarning(final JFrame parentComponent, final String text) {
        MessageWarning aw = new MessageWarning(parentComponent, true, text);
        aw.setLocationRelativeTo(parentComponent);
        aw.setVisible(true);
    }
    
    public static void messageError(final JFrame parentComponent, final String text) {
        MessageError aw = new MessageError(parentComponent, true, text);
        aw.setLocationRelativeTo(parentComponent);
        aw.setVisible(true);
    }
    
    public static void showFormDialog(final JFrame parentComponent, JDialog dialog) {
        PanelBlur pn = new PanelBlur(null, true, parentComponent.getX(), parentComponent.getY(), parentComponent.getWidth(), parentComponent.getHeight());
        pn.setDialog(dialog);
        pn.setLocationRelativeTo(parentComponent);
        pn.setVisible(true);
    }
    
    public static Image getImage(final String pathAndFileName) {
        final URL url = Thread.currentThread().getContextClassLoader().getResource(pathAndFileName);
        return Toolkit.getDefaultToolkit().getImage(url);
    }
    
    public static void setMarginLeftInput(int marginLeft, int sizeLine, Color colorLine, JTextComponent... jcs){      
        for (JTextComponent jtc : jcs) {
            Border empty = new EmptyBorder(0, marginLeft, 0, 0);
            MatteBorder matteBorder = (MatteBorder)BorderFactory.createMatteBorder(0, 0, sizeLine, 0, colorLine);
            CompoundBorder border = new CompoundBorder(matteBorder, empty);
            jtc.setBorder(border);
        }
    }
    
    public static void setMarginLeftInput(int marginLeft, int lineLeft, int lineTop, int lineBootom, int lineRight, Color colorLine, JTextComponent... jcs){      
        for (JTextComponent jtc : jcs) {
            Border empty = new EmptyBorder(0, marginLeft, 0, 0);
            MatteBorder matteBorder = (MatteBorder)BorderFactory.createMatteBorder(lineLeft, lineTop, lineBootom, lineRight, colorLine);
            CompoundBorder border = new CompoundBorder(matteBorder, empty);
            jtc.setBorder(border);
        }
    }
    
    public static void setMarginLeftInput(int marginLeft,Color colorLine, JButton... buttons){      
        for (JButton button : buttons) {
            Border empty = new EmptyBorder(0, marginLeft, 0, 0);
            //MatteBorder matteBorder = (MatteBorder)BorderFactory.createMatteBorder(0, 0, sizeLine, 0, colorLine);
            CompoundBorder border = new CompoundBorder(empty, empty);
            button.setBorder(border);
        }
    }
    
    public static void setMarginLeftInput(int marginLeft, JLabel... labels){      
        for (JLabel label : labels) {
            Border empty = new EmptyBorder(0, marginLeft, 0, 0);
            //MatteBorder matteBorder = (MatteBorder)BorderFactory.createMatteBorder(0, 0, sizeLine, 0, colorLine);
            CompoundBorder border = new CompoundBorder(empty, empty);
            label.setBorder(border);
        }
    }
    
    public static void setInputUI(final JTextComponent textField, final JLabel label) {
        textField.addCaretListener((javax.swing.event.CaretEvent evt) -> {
            if (textField.getText().isEmpty()) {
                label.setVisible(true);
            } else {
                label.setVisible(false);
            }
        });
    }
    
    public static void clearALLTxt(JTextComponent... jtcs){      
        for (JTextComponent jtc : jtcs) {
            jtc.setText("");
        }
       System.out.println("clearAllTxt Berhasil");
    
    }
    
    public static boolean validasiInputNotNull(JComponent[] component, String[] field) {
        boolean status = true;
        String[] keterangan = new String[field.length];
        
        /* DAFTAR NAMA KELAS COMPONENT SWING */
        final String jTextField = "class javax.swing.JTextField";
        final String jPasswordField = "class javax.swing.JPasswordField";
        final String jComboBox = "class javax.swing.JComboBox";
        final String jSpinner = "class javax.swing.JSpinner";
        final String jRadioButton = "class javax.swing.JRadioButton";
        final String jCheckBox = "class javax.swing.JCheckBox";
        final String jTextArea = "class javax.swing.JTextArea";
        
        /* KETERANGAN VALIDASI SETIAP COMPONENT */
        String ketTextFieldNotNull = " tidak boleh kosong";
        String ketPasswordFieldNotNull = " tidak boleh kosong";
        String ketComboBoxNotNull = " harus di pilih";
        String ketSpinnerNotNull = " tidak boleh nol";
        String ketRadioButtonNotNull = " harus di pilih";
        String ketCheckBoxNotNull = " harus di ckelis";
        String ketTextAreaNotNull = " tidak boleh kosong";
        
        /* PROSES PENGECEKAN SETIAP COMPONENT */
        int i = 0;
        for (JComponent  component1 : component) {
            String vComponent = component1.getClass().toString();
            switch (vComponent) {
                case jTextField :
                    JTextField jTextField1 = (JTextField) component1;
                    keterangan[i] =  jTextField1.getText().equals("") ? field[i] + ketTextFieldNotNull : null;
                    break;
                case jPasswordField :
                    JPasswordField jPasswordField1 = (JPasswordField) component1;
                    keterangan[i] =  jPasswordField1.getText().equals("") ? field[i] + ketPasswordFieldNotNull : null;
                    break;
                case jComboBox :
                    JComboBox jComboBox1 = (JComboBox) component1;
                    keterangan[i] =  jComboBox1.getSelectedIndex() == 0 ? field[i] + ketComboBoxNotNull : null;
                    break;
                case jSpinner :
                    JSpinner jSpinner1 = (JSpinner) component1;
                    keterangan[i] =  (int) jSpinner1.getValue() == 0 || (int) jSpinner1.getValue() < 0 ? field[i] + ketSpinnerNotNull : null;
                    break;
                case jRadioButton :
                    JRadioButton jRadioButton1 = (JRadioButton) component1;
                    keterangan[i] =  jRadioButton1.isSelected() == false ? field[i] + ketRadioButtonNotNull : null;
                    break;
                case jCheckBox :
                    JCheckBox jCheckBox1 = (JCheckBox) component1;
                    keterangan[i] =  jCheckBox1.isSelected() == false ? field[i] + ketCheckBoxNotNull : null;
                    break;
                case jTextArea :
                    JTextArea jTextArea1 = (JTextArea) component1;
                    keterangan[i] =  jTextArea1.getText().equals("") ? field[i] + ketTextAreaNotNull : null;
                    break;
            }
            i++;
        }
        
        /* MENAMPILKAN KETERANGAN COMPONENT YANG NULL SECARA BERURUTAN */
        for (String keterangan1 : keterangan) {
            if (keterangan1 != null) {
                Utility.messageInformation(null, keterangan1);
                status = false;
                break;
            } else {
                status = true;
            }
        }
        return status;
    }
    
    public static JRadioButton groupRbt(ButtonGroup buttonGroup) {
        boolean status;
        status = buttonGroup.getSelection() != null;
        JRadioButton jRadioButton = new JRadioButton();
        jRadioButton.setSelected(status);
        return jRadioButton;
    }
    
    public static JCheckBox groupCbx(ButtonGroup buttonGroup) {
        boolean status;
        status = buttonGroup.getSelection() != null;
        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setSelected(status);
        return jCheckBox;
    }
    
    public static void resetInput(JComponent...component) {
        
        /* DAFTAR NAMA KELAS COMPONENT SWING */
        final String jTextField = "class javax.swing.JTextField";
        final String jPasswordField = "class javax.swing.JPasswordField";
        final String jComboBox = "class javax.swing.JComboBox";
        final String jSpinner = "class javax.swing.JSpinner";
        final String jRadioButton = "class javax.swing.JRadioButton";
        final String jCheckBox = "class javax.swing.JCheckBox";
        final String jTextArea = "class javax.swing.JTextArea";
        //final String buttonGroup = "class javax.swing.ButtonGroup";

        
        /* PROSES PENGECEKAN SETIAP COMPONENT */
        for (JComponent  component1 : component) {
            String vComponent = component1.getClass().toString();
            switch (vComponent) {
                case jTextField :
                    JTextField jTextField1 = (JTextField) component1;
                    jTextField1.setText("");
                    break;
                case jPasswordField :
                    JPasswordField jPasswordField1 = (JPasswordField) component1;
                    jPasswordField1.setText("");
                    break;
                case jComboBox :
                    JComboBox jComboBox1 = (JComboBox) component1;
                    jComboBox1.setSelectedIndex(0);
                    break;
                case jSpinner :
                    JSpinner jSpinner1 = (JSpinner) component1;
                    jSpinner1.setValue(0);
                    break;
                case jRadioButton :
                    JRadioButton jRadioButton1 = (JRadioButton) component1;
                    jRadioButton1.setSelected(false);
                    break;
                case jCheckBox :
                    JCheckBox jCheckBox1 = (JCheckBox) component1;
                    jCheckBox1.setSelected(false);
                    break;
                case jTextArea :
                    JTextArea jTextArea1 = (JTextArea) component1;
                    jTextArea1.setText("");
                    break;
            }
        }
    }
    
    public static void resetButtonGroup(ButtonGroup...buttonGroups) {
        for (ButtonGroup buttonGroup : buttonGroups) {
            buttonGroup.clearSelection();
        }
    }
    
    public static void initLoading(final JFrame parentComponent, JDialog loading) {
        PanelBlur pn = new PanelBlur(null, true, parentComponent.getX(), parentComponent.getY(), parentComponent.getWidth(), parentComponent.getHeight());
        pn.setDialog(loading);
        pn.setLocationRelativeTo(parentComponent);
        pn.setVisible(true);
    }
    
    
    public static void onEnter (final JComponent... jcs){
        int batas = jcs.length - 1;
        for (int i = 0; i < batas; i++) {
            int j = i + 1;
            jcs[i].addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                    if (e.getKeyCode()==KeyEvent.VK_ENTER) {                        
                        jcs[j].requestFocus();                        
                    }
                }
            });
        }
    }
    
    public static void setLimitInput(JTextField jtf, int offset) {
        jtf.setDocument(new JTextFieldLimit(offset));
    }
    
    public static void setItemCbx(JComboBox jcb, String...item) {
        String[] data = item;
        for (String data1 : data) {
            jcb.removeItem(data1);
        }

        for (String data1 : data) {
            jcb.addItem(data1);
        }
    }
    
    
}
