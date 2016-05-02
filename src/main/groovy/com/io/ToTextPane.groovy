package com.controller.io

import javax.swing.JTextPane

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
class ToTextPane extends OutputStream {
    JTextPane jTextPane;

    public ToTextPane(JTextPane jTextPane) {
        this.jTextPane = jTextPane;
    }

    public void write(int b) throws IOException {
        jTextPane.setText(jTextPane.getText() + Character.toChars(b)[0]);
    }
}
