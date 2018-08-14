package com.chickentest.egg.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy="farm", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Chicken> chickens;

    public Farm(){}

    public Farm(Long id, Set<Chicken> chickens) {
        this.id = id;
        this.chickens=chickens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(Set<Chicken> chickens) {
        this.chickens = chickens;
    }
}
