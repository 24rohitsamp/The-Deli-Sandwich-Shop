package com.pluralsight;

import java.util.Scanner;

public class HomeScreen {

    private Scanner scanner;
    private OrderScreen orderScreen;

    public HomeScreen() {
        this.scanner = new Scanner(System.in);
        this.orderScreen = new OrderScreen(scanner);
    }

    public void display() {
        System.out.println("==========================================");
        System.out.println("   Welcome to Rohit's DELI-cious Sandwich Shop!  "); //message for users
        System.out.println("==========================================");

        boolean running = true;

        while (running) {
            System.out.println("\n========== HOME SCREEN ==========");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Select an option: "); // 2 option Home Screen

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    Order order = new Order();
                    orderScreen.display(order);
                    break;
                case "0":
                    System.out.println("\nThank you for visiting Rohit's DELI-cious Store! Goodbye!");
                    running = false; // message when done with order
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1 or 0."); // Have to enter 1 or 0 for order
            }
        }

        scanner.close();
    }
}