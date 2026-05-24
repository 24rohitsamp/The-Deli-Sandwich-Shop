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

            switch (choice) {
                case 1 -> orderScreen.handleOrder();
                case 0 -> {
                    System.out.println("\n  Thanks for visiting DELI-cious. Goodbye!\n");
                    running = false;
                }
                default -> System.out.println("  Invalid option. Please try again.");
            }
        }
    }


