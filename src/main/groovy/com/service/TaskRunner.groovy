package com.service

import com.model.Message
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

import java.util.concurrent.LinkedTransferQueue
/**
 * Created by a689638 on 5/3/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */
@Service
class TaskRunner {
    class Task{
        Integer taskId
        String username
        Integer instanceId
        Integer progress = 0
    }
    Integer instanceId = 0;
    Queue<Task> tasks = new LinkedTransferQueue<>()

    @Autowired
    private SimpMessagingTemplate template;

    private final queue = "queue/task-progress"

    def startNewTask(String username, int taskId){
        this.template.convertAndSendToUser(username, queue,"task id:"+taskId+" confirmed")
    }

    def subscribeToTask(String username, Integer taskId){
        Task newTask = new Task(username:username, taskId:taskId, instanceId: instanceId++);
        tasks.add(newTask);
        new Message(text: newTask.getInstanceId())
    }
    @Scheduled(fixedDelay=500L)
    def sendUpdates() {
        for (Task tr : this.tasks) {
            tr.setProgress(tr.getProgress()+10);
            this.template.convertAndSendToUser(tr.username, queue,new Message(text: tr.getProgress()) );
            if (tr.getProgress() >=100){
                tasks.remove(tr);
            }
        }
    }


}
