package com.codegym.final_test_be.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Scope {
    @Id
    int id;
    String name;

    @OneToMany(mappedBy = "scope")
    Set<Tour> tours;

    public Scope() {
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
