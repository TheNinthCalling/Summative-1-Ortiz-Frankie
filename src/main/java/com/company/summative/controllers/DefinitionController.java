package com.company.summative.controllers;

import com.company.summative.models.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class DefinitionController {


    ArrayList<Definition> Words = new ArrayList<>();
    public DefinitionController(){
        Words.add(new Definition("Pizza", "A yummy snack!", 1));
        Words.add(new Definition("Flabbergasted", "to be surprised", 2));
        Words.add(new Definition("Soda", "A tasty carbonated beverage", 3));
        Words.add(new Definition("Helmet", "A protective device for one's head", 4));
        Words.add(new Definition("Carpet", "A comfortable floor decoration", 5));
        Words.add(new Definition("Mirror", "a reflective surface upon which one can gaze upon their reflection", 6));
        Words.add(new Definition("Shoes", "a covering of the feet intended to ease their stress", 7));
        Words.add(new Definition("Watermelon", "a melon, with water, that tends to be quite tasty", 8));
        Words.add(new Definition("Backpack", "a device worn on the back with the intention of making it easier to carry heavier loads", 9));
        Words.add(new Definition("Music", "a gift to humanity, capable of instilling emotion like none other", 10));
        Words.add(new Definition("Clouds", "an object in the sky composed of water vapor", 11));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.OK)
    public Definition WordOfDay(){
        Random rand = new Random();
        return Words.get(rand.nextInt(10));
    }
}
