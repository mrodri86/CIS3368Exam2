package com.virus.Exam2.Models;


import javax.persistence.*;

@Entity
@Table(name = "virus")
public class Virus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "symptoms")
    public String symptoms;
    @Column(name = "duration")
    public String duration;
    @Column(name = "mortalityrate")
    public String mortalityrate;

    public Virus()
    {

    }

    public Virus(String name, String description, String symptoms, String duration, String mortalityrate ){
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
    }

    public int getId(){return id;}
    public void setId(){this.id=id;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
    public String getDescription(){return description;}
    public void setDescription(){this.name=description;}
    public String getSymptoms(){return symptoms;}
    public void setSymptoms(){this.symptoms=symptoms;}
    public String getDuration(){return duration;}
    public void setDuration(){this.duration=duration;}
    public String getMortalityrate(){return mortalityrate;}
    public void setMortalityrate(){this.mortalityrate=mortalityrate;}
}