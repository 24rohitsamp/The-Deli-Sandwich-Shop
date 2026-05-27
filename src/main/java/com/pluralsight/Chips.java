package com.pluralsight;

public class Chips {

    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public String getType() { return type; }

    public double getPrice() { return 1.50; } // the price for chips is fixed at 1.50

    @Override
    public String toString() {
        return String.format("%s chips - $%.2f", type, getPrice()); //format
    }
}