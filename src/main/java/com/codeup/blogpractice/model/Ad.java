package com.codeup.blogpractice.model;


import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 100)
    private String title;
    @Column(columnDefinition = "text")
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
