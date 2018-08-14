package com.chickentest.chicken.model;

import javax.persistence.*;

@Entity
public class Chicken {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="farm_id")
    private Farm farm;

    public Chicken() {    }

    public Chicken(Long id,Farm farm) {
        this.id = id;
        this.farm=farm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}
