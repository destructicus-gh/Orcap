package model
import gui.OverclockedOrca
import main.java.gui.RoboPanda
import service.TaskService
import service.WindowTools

import javax.swing.event.TreeSelectionEvent
import java.awt.*
/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
class TaskOption extends TreeOption{
    String name
    static String title = "Task Options"

    TaskOption(String name) {
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
        this.options.add(new MenuOption("Open Task") {
            @Override
            def doAction() {
                WindowTools.bootWindow(new RoboPanda(TaskService.getTasks().get(0)).getPanel1(), new Dimension(320, 240), "Task 1")
            }
        })
        this.options.add(new MenuOption("View Description") {
            @Override
            def doAction() {
                //WindowTools.bootWindow(new RoboPanda(TaskService.getTasks().get(0)).getPanel1(), new Dimension(800, 240), "View Description")
            }
        })
    }
}
