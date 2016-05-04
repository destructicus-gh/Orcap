package com.model

import groovy.transform.Canonical

/**
 * Created by a689638 on 3/23/2016.
 * Copyright (C) 2016 HEB
 * @author Ryan Anders
 * This software is the confidential and proprietary information 
 * of HEB
 */

@Canonical
public class Question {
    String questionText;
    String questionBody;
    List<String> answers;
    List<Integer> correctAnswers;

}
