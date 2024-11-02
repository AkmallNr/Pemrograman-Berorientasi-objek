package com.example;

public class Passenger {
    private String name;
    private boolean vip;

    // Constructor
    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Getter method for 'vip' status
    public boolean isVip() {
        return vip;
    }
}
