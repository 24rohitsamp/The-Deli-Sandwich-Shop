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
        System.out.println("   Welcome to DELI-cious Sandwich Shop!  ");
        System.out.println("==========================================");

        boolean running = true;

        while (running) {
            System.out.println("\n========== HOME SCREEN ==========");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    Order order = new Order();
                    orderScreen.display(order);
                    break;
                case "0":
                    System.out.println("\nThank you for visiting Rohit's DELI-cious Store! Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1 or 0.");
            }
        }

        scanner.close();
    }
}