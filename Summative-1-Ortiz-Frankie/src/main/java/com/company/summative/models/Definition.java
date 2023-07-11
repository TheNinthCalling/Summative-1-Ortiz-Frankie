package com.company.summative.models;

public class Definition {

    private int id;

    private String word;

    private String definition;

    public Definition(String word, String definition, int id){
        setDefinition(definition);
        setWord(word);
        setId(id);
    }
    //Setters
    public void setDefinition(String definition){
        this.definition = definition;
    }
    public void setWord(String word){
        this.word = word;
    }
    public void setId(int id){
        this.id = id;
    }
    //Getters
    public String getDefinition(){
        return this.definition;
    }
    public String getWord(){
        return this.word;
    }
    public int getId(){
        return this.id;
    }



}
