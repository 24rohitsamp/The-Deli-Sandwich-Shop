package com.pluralsight;

public class HomeScreen {

    private final OrderScreen orderScreen = new OrderScreen();

    public void run() {

        boolean running = true;
        while (running) {

        }
        //Interface
            System.out.println("  1) New Order");
            System.out.println("  0) Exit");

            int choice = UserInterface.promptInt("Enter choice:");

            
    }


