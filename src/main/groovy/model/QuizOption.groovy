package model

import gui.OverclockedOrca
import gui.ZombiePenguin
import service.WindowTools

import javax.swing.event.TreeSelectionEvent
import java.awt.Dimension

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
class QuizOption extends TreeOption{
    String name
    static String title = "Quiz Options"

    QuizOption(String name) {
        this.name = name
        generateOptions()
    }

    @Override
    def select(OverclockedOrca instance, TreeSelectionEvent e) {
        instance.getRightLabel().setText title + " - " + this.name
        instance.getListModel().removeAllElements()
        this.options.each {instance.getListModel().addElement(it)}
    }


    @Override
    public String toString() {
        return name
    }

    def generateOptions(){
        this.options.add(new MenuOption("Question") {


            @Override
            def doAction() {
                WindowTools.bootWindow(new ZombiePenguin().getPanel1(), new Dimension(320, 240), "Question")
            }
        })
        this.options.add(new MenuOption("Bigger Question") {
            @Override
            def doAction() {
                WindowTools.bootWindow(new ZombiePenguin().getPanel1(), new Dimension(800, 240), "Bigger Question")
            }
        })
    }
}
