package com.bus_station.hibernate.logic;

import java.util.Set;
import java.util.HashSet;
/**
 * Created by Azuzu on 29.05.2016.
 */
public class Route {
    private Long id;
    private String name;
    private int number;
    private Set busses = new HashSet();

    public Route(){
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setBusses(Set busses) {
        this.busses = busses;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public Set getBusses() {
        return busses;
    }
}
