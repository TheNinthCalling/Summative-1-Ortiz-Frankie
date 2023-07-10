package com.company.summative.controllers;

import com.company.summative.models.Definition;
import com.company.summative.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    List<Quote> quotes = new ArrayList<>();
    private static int idCounter = 1;
    public QuoteController(){
        quotes.add(new Quote("Albert Einstein", "Imagination is more important than knowledge."));
        quotes.add(new Quote("Dr. Seuss", "Don't cry because it's over, smile because it happened."));
        quotes.add(new Quote("Steve Jobs", "Stay hungry, stay foolish."));
        quotes.add(new Quote("Maya Angelou", "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel."));
        quotes.add(new Quote("Walt Disney", "The way to get started is to quit talking and begin doing."));
        quotes.add(new Quote("Mahatma Gandhi", "Be the change that you wish to see in the world."));
        quotes.add(new Quote("Albert Einstein", "I have no special talents, I am just passionately curious"));
        quotes.add(new Quote("Martin Luther King Jr.", "Darkness cannot drive out darkness; only light can do that. Hate cannot drive out hate; only love can do that."));
        quotes.add(new Quote("Oscar Wilde", "Be yourself; everyone else is already taken."));
        quotes.add(new Quote("Miles Davis", "Sometimes you have to play a long time to be able to play like yourself"));
    }
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Quote getRandomQuote(){
        Random rand = new Random();
        Quote toReturn= quotes.get(rand.nextInt(quotes.size()));
        toReturn.setId(idCounter++);
        return toReturn;
    }

}



