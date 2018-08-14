package com.chickentest.egg.model;

import javax.persistence.*;

@Entity
public class Egg {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    private Long chickenId;


    public Egg(){}

    public Egg(Long id, Long chickenId) {
        this.id = id;
        this.chickenId=chickenId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChicken(){
        return this.chickenId;
    }
    public void setChicken(Long chickenId){
        this.chickenId=chickenId;
    }
}