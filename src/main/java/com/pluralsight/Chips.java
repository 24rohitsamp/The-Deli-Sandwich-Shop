package com.pluralsight;

public class Chips {

    private static final double PRICE = 1.50;
    private String chipType;

    public Chips(String chipType) {
        this.chipType = chipType;
    }

    public double getPrice()    { return PRICE; }
    public String getChipType() { return chipType; }

    public void printOrder() {
        System.out.printf("  Chips: %s  -  $%.2f%n", chipType, getPrice());
    }
}