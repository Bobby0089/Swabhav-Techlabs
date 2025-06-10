package com.company.composite.test;

import com.company.composite.model.MenuCategory;
import com.company.composite.model.MenuItem;

import java.util.Scanner;

public class MenuComponentTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MenuCategory mainMenu = new MenuCategory("Main Menu");

        System.out.print("How many categories do you want to add? ");
        int numCategories = getValidNumber();

        for (int i = 0; i < numCategories; i++) {
            addCategory(mainMenu);
        }

        System.out.println("\n--- Final Menu ---");
        mainMenu.showMenu();   
    }

   
    private static void addCategory(MenuCategory mainMenu) {
        System.out.print("Enter category name: ");
        String categoryName = getValidName();

        MenuCategory category = new MenuCategory(categoryName);

        System.out.print("How many items in " + categoryName + "? ");
        int numItems = getValidNumber();

        for (int j = 0; j < numItems; j++) {
            addItemToCategory(category);
        }

        mainMenu.add(category);
    }

   
    private static void addItemToCategory(MenuCategory category) {
        System.out.print("Enter item name: ");
        String itemName = getValidName();

        MenuItem item = new MenuItem(itemName);
        category.add(item);
    }

   
    private static String getValidName() {
        String name = scanner.nextLine().trim();
        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Please enter again: ");
            name = scanner.nextLine().trim();
        }
        return name;
    }


    private static int getValidNumber() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid number. Please enter again: ");
            scanner.next();  // clear invalid input
        }
        int number = scanner.nextInt();
        scanner.nextLine();  // consume newline
        return number;
    }
}
