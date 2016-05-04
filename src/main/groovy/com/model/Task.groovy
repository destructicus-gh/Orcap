package com.model

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
public class Task {
    String name
    File file

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", file=" + file +
                '}';
    }
}
