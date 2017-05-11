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

import com.arwantech.javaui.utils.Utility;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.text.JTextComponent;

/**
 *
 * @author AriMaulana99
 */
public class TransitionTextfield {
    
    private int counter;
    private Color colorBorder;
    private final int greenWhite = 0;
    private final int greenOrange = 1;
    private final int blueOrange = 2;
    private final int grayBlue = 3;
    private final int grayPink = 4;
    private final int blueSoft = 5;
    private final int greenSoft = 6;
    private int colorType = 0;
    private Color bgExited;
    private Color bgEntered;
    private int speed = 40; 
    private final JTextComponent[] textFields;
    private boolean append = false;

    
    public int getGreenWhite() {
        return greenWhite;
    }

    public int getGreenOrange() {
        return greenOrange;
    }

    public int getBlueOrange() {
        return blueOrange;
    }

    public int getGrayBlue() {
        return grayBlue;
    }

    public int getGrayPink() {
        return grayPink;
    }

    public int getBlueSoft() {
        return blueSoft;
    }

    public int getGreenSoft() {
        return greenSoft;
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public int getColorType() {
        return colorType;
    }

    public void setColorType(int colorType) {
        this.colorType = colorType;
    }

    public Color getBgExited() {
        return bgExited;
    }

    public void setBgExited(Color bgExited) {
        this.bgExited = bgExited;
    }

    public Color getBgEntered() {
        return bgEntered;
    }

    public void setBgEntered(Color bgEntered) {
        this.bgEntered = bgEntered;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public TransitionTextfield(JTextComponent...textFields) {
        this.textFields = textFields;
        colorBorder = Color.decode("#BFBFBF");
        bgExited = colorBorder;
        bgEntered = Color.decode("#0F4472");
    }
    

    public List<String> listColorGradient(int color) {
        List<String> colorGradient = null;
        switch (color) {
            case greenWhite :
                colorGradient = colorGradientGreenWhite();
                break;
            case greenOrange :
                colorGradient = colorGradientGreenOrange();
                break;
            case blueOrange :
                colorGradient = colorGradientBlueOrange();
                break;
            case grayBlue :
                colorGradient = colorGradientGrayBlue();
                break;
            case grayPink :
                colorGradient = colorGradientGrayPink();
                break;
            case blueSoft :
                colorGradient = colorGradientBlueSoft();
                break;
            case greenSoft :
                colorGradient = colorGradientGreenSoft();
                break;
        }
        return colorGradient;
    }
    
  
                  
    public List<String> colorGradientGreenWhite() {
        List<String> code = new ArrayList<>();
        code.add(0, "#45BA81");
        code.add(1, "#4EBD87");
        code.add(2, "#58C18E");
        code.add(3, "#61C494");
        code.add(4, "#6AC89A");
        code.add(5, "#74CBA0");
        code.add(6, "#7DCFA7");
        code.add(7, "#86D2AD");
        code.add(8, "#8FD6B3");
        code.add(9, "#99D9BA");
        code.add(10, "#A2DCC0");
        code.add(11, "#ABE0C6");
        code.add(12, "#B5E3CD");
        code.add(13, "#BEE7D3");
        code.add(14, "#C7EAD9");
        code.add(15, "#D0EEE0");
        code.add(16, "#DAF1E6");
        code.add(17, "#E3F5EC");
        code.add(18, "#ECF8F2");
        code.add(19, "#F6FCF9");
        code.add(20, "#FFFFFF");
        return code;
    }
    
    public List<String> colorGradientGreenOrange() {
        List<String> code = new ArrayList<>();
        code.add(0, "#8FD049");
        code.add(1, "#95C845");
        code.add(2, "#9AC042");
        code.add(3, "#A0B83E");
        code.add(4, "#A5B13A");
        code.add(5, "#ABA937");
        code.add(6, "#B1A133");
        code.add(7, "#B6992F");
        code.add(8, "#BC912C");
        code.add(9, "#C18928");
        code.add(10, "#C78224");
        code.add(11, "#CD7A21");
        code.add(12, "#D2721D");
        code.add(13, "#D86A1A");
        code.add(14, "#DD6216");
        code.add(15, "#E35A12");
        code.add(16, "#E9520F");
        code.add(17, "#EE4B0B");
        code.add(18, "#F44307");
        code.add(19, "#F93B04");
        code.add(20, "#FF3300");
        return code;
    }
    
    public List<String> colorGradientBlueOrange() {
        List<String> code = new ArrayList<>();
        code.add(0, "#337AB7");
        code.add(1, "#3D76AE");
        code.add(2, "#4773A5");
        code.add(3, "#526F9C");
        code.add(4, "#5C6C92");
        code.add(5, "#666889");
        code.add(6, "#706580");
        code.add(7, "#7A6177");
        code.add(8, "#855E6E");
        code.add(9, "#8F5A65");
        code.add(10, "#99565C");
        code.add(11, "#A35352");
        code.add(12, "#AD4F49");
        code.add(13, "#B84C40");
        code.add(14, "#C24837");
        code.add(15, "#CC452E");
        code.add(16, "#D64125");
        code.add(17, "#E03E1B");
        code.add(18, "#EB3A12");
        code.add(19, "#F53709");
        code.add(20, "#FF3300");
        return code;
    }
    
    public List<String> colorGradientGrayBlue() {
        List<String> code = new ArrayList<>();
        code.add(0, "#D8D8D8");
        code.add(1, "#D0D5DA");
        code.add(2, "#C8D2DC");
        code.add(3, "#BFCFDE");
        code.add(4, "#B7CBE0");
        code.add(5, "#AFC8E2");
        code.add(6, "#A6C5E4");
        code.add(7, "#9EC2E6");
        code.add(8, "#96BFE8");
        code.add(9, "#8EBCEA");
        code.add(10, "#86B8EC");
        code.add(11, "#7DB5ED");
        code.add(12, "#75B2EF");
        code.add(13, "#6DAFF1");
        code.add(14, "#64ACF3");
        code.add(15, "#5CA9F5");
        code.add(16, "#54A6F7");
        code.add(17, "#4CA2F9");
        code.add(18, "#449FFB");
        code.add(19, "#3B9CFD");
        code.add(20, "#3399FF");
        return code;
    }
    
    public List<String> colorGradientGrayPink() {
        List<String> code = new ArrayList<>();
        code.add(0, "#666666");
        code.add(1, "#6E6166");
        code.add(2, "#755C66");
        code.add(3, "#7D5766");
        code.add(4, "#855266");
        code.add(5, "#8C4C66");
        code.add(6, "#944766");
        code.add(7, "#9C4266");
        code.add(8, "#A33D66");
        code.add(9, "#AB3866");
        code.add(10, "#B23366");
        code.add(11, "#BA2E66");
        code.add(12, "#C22966");
        code.add(13, "#C92466");
        code.add(14, "#D11F66");
        code.add(15, "#D91A66");
        code.add(16, "#E01466");
        code.add(17, "#E80F66");
        code.add(18, "#F00A66");
        code.add(19, "#F70566");
        code.add(20, "#FF0066");
        return code;
    }
    
    
    public List<String> colorGradientBlueSoft() {
        List<String> code = new ArrayList<>();
        code.add(0, "#337AB7");
        code.add(1, "#3177B4");
        code.add(2, "#2F75B0");
        code.add(3, "#2E72AD");
        code.add(4, "#2C6FA9");
        code.add(5, "#2A6CA6");
        code.add(6, "#286AA2");
        code.add(7, "#26679F");
        code.add(8, "#25649B");
        code.add(9, "#236298");
        code.add(10, "#215F94");
        code.add(11, "#1F5C91");
        code.add(12, "#1D5A8E");
        code.add(13, "#1C578A");
        code.add(14, "#1A5487");
        code.add(15, "#185283");
        code.add(16, "#164F80");
        code.add(17, "#144C7C");
        code.add(18, "#134979");
        code.add(19, "#114775");
        code.add(20, "#0F4472");
        return code;
    }
    
    public List<String> colorGradientGreenSoft() {
        List<String> code = new ArrayList<>();
        code.add(0, "#8FD049");
        code.add(1, "#8BCA46");
        code.add(2, "#86C543");
        code.add(3, "#82BF40");
        code.add(4, "#7DBA3C");
        code.add(5, "#79B439");
        code.add(6, "#75AF36");
        code.add(7, "#70AA33");
        code.add(8, "#6CA430");
        code.add(9, "#679E2D");
        code.add(10, "#63992A");
        code.add(11, "#5F9426");
        code.add(12, "#5A8E23");
        code.add(13, "#568820");
        code.add(14, "#51831D");
        code.add(15, "#4D7E1A");
        code.add(16, "#497817");
        code.add(17, "#447213");
        code.add(18, "#406D10");
        code.add(19, "#3B680D");
        code.add(20, "#37620A");
        return code;
    }
    
    
    public void initTransitionMaterialUI() {   
        Utility.setMarginLeftInput(20, 1, colorBorder, textFields); 
        for (JTextComponent textField : textFields) {
            textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                super.focusGained(evt); //To change body of generated methods, choose Tools | Templates.
                Timer timer = new Timer();
                append = false;
                try {
                    final List<String> codeColorGradient;
                    counter = 0;
                    codeColorGradient = listColorGradient(colorType);
                    Collections.sort(codeColorGradient, Collections.reverseOrder());

                    final TimerTask task = new TimerTask() {
                        @Override
                        public void run() { 
                            try {
                                Color color;
                                //System.out.println("TIMER BERJALAN  " + counter);
                                color = Color.decode(codeColorGradient.get(counter));
                                Utility.setMarginLeftInput(20, 3, color, textFields);
                                counter++;
                            } catch (Exception e) {
                                timer.cancel(); 
                            }
                            if (append) {
                                timer.cancel(); 
                                Utility.setMarginLeftInput(20, 1, colorBorder, textFields);
                            }
                        }
                        };     
                    Date startDate = new Date();
                    timer.schedule(task, startDate, speed);
                } catch (Exception e) {
                    timer.cancel();   
                    System.out.println("ERROR : " + e);
                }   
                }
            });


            textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent evt) {
                super.focusLost(evt); //To change body of generated methods, choose Tools | Templates.     
                    append = true;
                    Utility.setMarginLeftInput(20, 1, colorBorder, textFields);
                }
            });
        }
    }
    
    public void initTransitionKotak() {   
        Utility.setMarginLeftInput(20, 1, 1, 1, 1, colorBorder, textFields); 
        for (JTextComponent textField : textFields) {
            textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                super.focusGained(evt); //To change body of generated methods, choose Tools | Templates.
                Timer timer = new Timer();
                append = false;
                try {
                    final List<String> codeColorGradient;
                    counter = 0;
                    codeColorGradient = listColorGradient(colorType);
                    Collections.sort(codeColorGradient, Collections.reverseOrder());

                    final TimerTask task = new TimerTask() {
                        @Override
                        public void run() { 
                            try {
                                Color color;
                                //System.out.println("TIMER BERJALAN  " + counter);
                                color = Color.decode(codeColorGradient.get(counter));
                                Utility.setMarginLeftInput(17, 3, 3, 3, 3, color, textFields);
                                counter++;
                            } catch (Exception e) {
                                timer.cancel(); 
                            }
                            if (append) {
                                timer.cancel(); 
                                Utility.setMarginLeftInput(17, 1, 1, 1, 1, colorBorder, textFields);
                            }
                        }
                        };     
                    Date startDate = new Date();
                    timer.schedule(task, startDate, speed);
                } catch (Exception e) {
                    timer.cancel();   
                    System.out.println("ERROR : " + e);
                }   
                }
            });


            textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent evt) {
                super.focusLost(evt); //To change body of generated methods, choose Tools | Templates.     
                    append = true;
                    Utility.setMarginLeftInput(17, 1, 1, 1, 1, colorBorder, textFields);
                }
            });
        }
    }
    
    
}
