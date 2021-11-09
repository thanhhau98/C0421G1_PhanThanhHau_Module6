package com.codegym.final_test_be.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TourType {
    @Id
    int id;
    String name;

    @OneToMany(mappedBy = "tourType")
    Set<Tour> tours;

    public TourType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
