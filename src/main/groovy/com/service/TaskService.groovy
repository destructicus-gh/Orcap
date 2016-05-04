package com.service

import com.model.Task

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */


def static List<Task> getTasks(){
    List<Task> tasks = new ArrayList<>()
    tasks.add(new Task(name:"", file: new File("disconnected/taskA.groovy")))
    tasks
}