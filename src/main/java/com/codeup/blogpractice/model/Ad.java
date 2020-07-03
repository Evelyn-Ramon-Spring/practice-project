package com.codeup.blogpractice.model;

public class Ad {

    private long id;
    private String title;
    private String description;

    public Ad(long id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Ad(String title, String description){
        this.title = title;
        this.description = description;
    }

    public Ad(){}

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
