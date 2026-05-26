package com.pluralsight;

public class Drink {

    private String size;   // small, medium, large
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() { return size; }
    public String getFlavor() { return flavor; }

    public double getPrice() {
        switch (size.toLowerCase()) {
            case "small":  return 2.00;
            case "medium": return 2.50;
            case "large":  return 3.00;
            default:       return 0.0;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s drink - $%.2f", size, flavor, getPrice());
    }
}