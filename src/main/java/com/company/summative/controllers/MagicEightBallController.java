package com.company.summative.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.company.summative.models.Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class MagicEightBallController {
    /*
    The Magic 8 Ball API provides a magic 8ball service and must implement the following route:
    URI: /magic

    Method: POST

    Request Body: Question

    Response Body: Answer

    The POST request for the Magic 8 Ball endpoint should include a user-provided question.
     */
    private static int idCounter = 1;
    private List<String> answers= new ArrayList<>();
    private Random random= new Random();

    public MagicEightBallController() {
        answers.add("yes");
        answers.add("no");
    }


    @RequestMapping(value="/magic", method = RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    public Answer askQuestion(@RequestBody Answer question){
        question.setId(idCounter++);
        question.setQuestion(answers.get(random.nextInt(2)));
        return question;
    }





}
