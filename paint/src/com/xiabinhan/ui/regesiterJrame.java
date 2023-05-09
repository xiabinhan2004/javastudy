package com.xiabinhan.ui;

import javax.swing.*;


public class regesiterJrame extends JFrame {

    public regesiterJrame() {
        this.setSize(500, 500);
        this.setAlwaysOnTop(true);
        this.setTitle("niubi");
     
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(1);
        JMenuBar jb=new JMenuBar();
        JMenu fcJMenu=new JMenu("功能");
        JMenuItem changeimage=new JMenuItem("更换图片");
        fcJMenu.add(changeimage);
        this.setVisible(true);
    }






}
