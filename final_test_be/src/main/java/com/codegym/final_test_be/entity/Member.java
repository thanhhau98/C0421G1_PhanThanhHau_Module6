package com.codegym.final_test_be.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Member {
    @Id
    int id;
    String name;
    String dateOfBirth;
    String address;
    String email;
    String phone;
    byte gender;

    @OneToMany(mappedBy = "member")
    Set<Tour> tour;

    public Member() {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public Set<Tour> getTour() {
        return tour;
    }

    public void setTour(Set<Tour> tour) {
        this.tour = tour;
    }
}
