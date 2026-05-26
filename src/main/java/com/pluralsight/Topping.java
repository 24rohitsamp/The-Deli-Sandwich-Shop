package com.pluralsight;

public class Topping {
    private String name;
    private boolean extra;

    public Topping(String name) {
        this.name = name;
        this.extra = false;
    }

    public Topping(String name, boolean extra) {
        this.name = name;
        this.extra = extra;
    }

    public String getName() { return name; }
    public boolean isExtra() { return extra; }
    public void setExtra(boolean extra) { this.extra = extra; }

    public double getPrice(int sandwichSize) { return 0.0; } // Toppings are free by default (premium is added price)

    @Override
    public String toString() {
        return name + (extra ? " (extra)" : "");
    }
}