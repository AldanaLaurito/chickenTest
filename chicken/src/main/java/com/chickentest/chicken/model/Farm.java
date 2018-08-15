package com.chickentest.chicken.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy="farm", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Long> chickensId;

    public Farm(){}

    public Farm(Long id, Set<Long> chickens) {
        this.id = id;
        this.chickensId=chickens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Long> getChickens() {
        return this.chickensId;
    }

    public void setChickens(Set<Long> chickens) {
        this.chickensId = chickens;
    }
}
