package com.example.airlines.models;

public class Airline {
    private String name;
    private int logoResId;

    public Airline(String name, int logoResId) {
        this.name = name;
        this.logoResId = logoResId;
    }

    public String getName() {
        return name;
    }

    public int getLogoResId() {
        return logoResId;
    }
} 