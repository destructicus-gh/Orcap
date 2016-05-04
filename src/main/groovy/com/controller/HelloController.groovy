package com.controller

import com.model.Message
import com.model.QuizOption
import com.service.TaskRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile
/**
 * Created by a689638 on 5/2/2016.
 * Copyright (C) 2016 HEB
 *
 * @author Ryan Anders
 *         This software is the confidential and proprietary information
 *         of HEB
 */

@RestController
public class HelloController {
    @Autowired
    TaskRunner taskRunner


    @RequestMapping("/")
    public QuizOption index() {
        return new QuizOption("Option Text");
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public String readFile(MultipartFile file) throws IOException {
        return "read";
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    def greeting(Message text) throws Exception {
        println text.getText()
        println text.getUserId()
        new Message(text:"hit that back")
    }
}

