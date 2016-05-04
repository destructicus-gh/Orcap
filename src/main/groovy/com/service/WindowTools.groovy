package com.service

import javax.swing.*
import java.awt.*

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
def static bootWindow(JPanel jPanel, Dimension dimension, String title){
    JFrame frame = new JFrame(title);
    frame.setContentPane(jPanel);
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frame.setSize(dimension);
    frame.setVisible(true);
    return frame;
}
def static bootWindow(JPanel jPanel, Dimension dimension, String title, Boolean isMain){
    JFrame frame = new JFrame(title);
    frame.setContentPane(jPanel);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(dimension);
    frame.setVisible(true);
    return frame;
}
