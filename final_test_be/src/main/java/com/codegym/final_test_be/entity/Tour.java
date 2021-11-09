package com.codegym.final_test_be.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Tour {
    @Id
    Integer id;
    String name;
    String location;
    String startDate;
    String returnDay;
    String registrationEndDate;
    int maxOfMember;
    String calendar;
    String request;
    double cost;

    @JsonBackReference(value = "tour_tour_type")
    @ManyToOne(targetEntity = TourType.class)
    @JoinColumn(name = "tour_type_id" , referencedColumnName = "id")
    TourType tourType;

    @JsonBackReference(value = "tour_scope")
    @ManyToOne(targetEntity = Scope.class)
    @JoinColumn(name = "scope_id" , referencedColumnName = "id")
    Scope scope;

    @JsonBackReference(value = "tour_member")
    @ManyToOne(targetEntity = Member.class)
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    Member member;

    public Tour() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getReturnDay() {
        return returnDay;
    }

    public void setReturnDay(String returnDay) {
        this.returnDay = returnDay;
    }

    public String getRegistrationEndDate() {
        return registrationEndDate;
    }

    public void setRegistrationEndDate(String registrationEndDate) {
        this.registrationEndDate = registrationEndDate;
    }

    public int getMaxOfMember() {
        return maxOfMember;
    }

    public void setMaxOfMember(int numberOfMember) {
        this.maxOfMember = numberOfMember;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
