package com.codegym.final_test_be.dto;

import com.codegym.final_test_be.entity.Member;
import com.codegym.final_test_be.entity.Scope;
import com.codegym.final_test_be.entity.TourType;

import javax.validation.constraints.Max;

public class TourDto {
    Integer id;
    String name;
    String location;
    String startDate;
    String returnDay;
    String registrationEndDate;
    @Max(12)
    int maxOfMember;
    String calendar;
    String request;
    double cost;
    TourType tourType;
    Scope scope;
    Member member;

    public TourDto() {
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

    public void setMaxOfMember(int maxOfMember) {
        this.maxOfMember = maxOfMember;
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
}
