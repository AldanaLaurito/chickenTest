package com.chickentest.chicken.model;

import javax.persistence.*;

@Entity
public class Egg {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="chicken_id")
    private Chicken chicken;


    public Egg(){}

    public Egg(Long id, Chicken chicken) {
        this.id = id;
        this.chicken=chicken;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Chicken getChicken(){
        return this.chicken;
    }
    public void setChicken(Chicken chicken){
        this.chicken=chicken;
    }
}
