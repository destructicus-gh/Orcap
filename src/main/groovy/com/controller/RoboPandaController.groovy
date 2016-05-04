package com.controller

import com.io.ToTextPane
import main.java.gui.RoboPanda
import net.openhft.compiler.CompilerUtils

import javax.swing.*
import java.awt.event.ActionEvent

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */


def static addFile(RoboPanda panda, ActionEvent e) {
    JFileChooser fileChooser = new JFileChooser()
    int returnVal = fileChooser.showOpenDialog(null)
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile()
        panda.file = file
        println("Opening: " + file.getName() + ".")
        panda.fileNameField.setText(file.name)
    } else {
        println("Open command cancelled by user.")
        null
    }
}

def static runTask(RoboPanda panda, ActionEvent e) {
    PrintStream out = new PrintStream(new ToTextPane(panda.outputPanel))
    GroovyClassLoader classLoader = new GroovyClassLoader()
    def myClass = classLoader.parseClass(panda.t.file)
    Class aClass = CompilerUtils.CACHED_COMPILER.loadFromJava("taskResponse", panda.file.text)
    String response = myClass.run(aClass.newInstance(), out, panda.progressBar1)
    panda.getTabs().setSelectedIndex(1)
    println response
}