package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private int size;           // Sizes for sandwich are : 4, 8, or 12
    private String bread;       // types of bread: white, wheat, rye, wrap
    private boolean toasted;
    private List<Topping> toppings;

    public Sandwich(int size, String bread) {
        this.size = size;
        this.bread = bread;
        this.toasted = false;
        this.toppings = new ArrayList<>();
    }

    public int getSize() { return size; }
    public String getBread() { return bread; }
    public boolean isToasted() { return toasted; }
    public void setToasted(boolean toasted) { this.toasted = toasted; }
    public List<Topping> getToppings() { return toppings; }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double getPrice() {
        double price = getBreadPrice();
        for (Topping topping : toppings) {
            price += topping.getPrice(size);
        }
        return price;
    }

    private double getBreadPrice() {
        switch (size) {
            case 4:  return 5.50; // case4 = 4 inch bread
            case 8:  return 7.00; // case8 = 8 inch bread
            case 12: return 8.50; // case12 = 12 inch bread
            default: return 0.0;
        }
    }
