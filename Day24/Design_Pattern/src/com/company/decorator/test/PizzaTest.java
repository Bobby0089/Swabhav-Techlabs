package com.company.decorator.test;

import com.company.decorator.model.*;

import java.util.Scanner;

public class PizzaTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BasePizza basePizza = selectBasePizza();

        basePizza = addToppings(basePizza);

        System.out.println("\n----- Final Order Summary -----");
        System.out.println("Total Amount: ₹" + basePizza.amount());
        System.out.println("Pizza Description: " + basePizza.discription());
        System.out.println("--------------------------------");
    }

    private static BasePizza selectBasePizza() {
        while (true) {
            System.out.println("Select Base Pizza:");
            System.out.println("1. Cheese Pizza - ₹200");
            System.out.println("2. Veggie Pizza - ₹250");
            System.out.println("3. Pepperoni Pizza - ₹350");
            System.out.println("4. BBQ Chicken Pizza - ₹400");

            int choice = getUserChoice();
            if (choice == 1) {
                return new CheesePizza();
            } else if (choice == 2) {
                return new VeggiePizza();
            } else if (choice == 3) {
                return new PepperoniPizza();
            }else if (choice == 4) {
                return new BBQChickenPizza();
            } else {
                System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static BasePizza addToppings(BasePizza basePizza) {
        while (true) {
            System.out.println("Do you want to add toppings?");
            System.out.println("1. Cheese - ₹20");
            System.out.println("2. Pepperoni - ₹75");
            System.out.println("3. Mushrooms - ₹50");
            System.out.println("4. Bacon - ₹75");
            System.out.println("5. Onions - ₹25");
            System.out.println("6. No More Toppings");

            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    basePizza = new Cheese(basePizza);
                    break;
                case 2:
                    basePizza = new Pepperoni(basePizza);
                    break;
                case 3:
                    basePizza = new Mushrooms(basePizza);
                    break;
                case 4:
                    basePizza = new Bacon(basePizza);
                    break;
                case 5:
                    basePizza = new Onions(basePizza);
                    break;
                case 6:
                    return basePizza;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}

