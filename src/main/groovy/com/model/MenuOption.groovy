package com.model

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
public abstract class MenuOption {
    public String name
    Boolean active = true;
    MenuOption(name){
        this.name = name
    }

    def abstract doAction()


    @Override
    public String toString() {
        return name
    }
}
