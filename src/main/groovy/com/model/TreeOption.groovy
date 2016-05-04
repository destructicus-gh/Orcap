package com.model

import main.java.gui.OverclockedOrca

import javax.swing.event.TreeSelectionEvent

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
public abstract class TreeOption{

    List<MenuOption> options = new ArrayList<>();

    def select(TreeSelectionEvent e){
        select OverclockedOrca.getSelf(), e
    }
    def abstract select(OverclockedOrca instance, TreeSelectionEvent e);
}