package com.example.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/********************************************************************************
 * DisplayMenu Class
 * Description: Prints to screen the possible choices available from the calculator application. (1-9)
 * Validates to see if user input is a number using the getValidIntegerMethod. Asks the user for
 * any amount of numbers and sorts in either ascending or descending order based on their choice.
 *
 ********************************************************************************/

class DisplayMenu {
    // show the menu
    public static void showMenu() {
        System.out.println("\nSelect an operation:");
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Modulus");
        System.out.println("6) Power");
        System.out.println("7) Square Root");
        System.out.println("8) Sort numbers");
        System.out.println("9) Exit");
    }

    // validates integer from the user
    public static int getValidInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    // get a list of numbers from the user for sorting

    // Update 4: store the number list for the sorting choice in an array list. prompts the user to enter numbers
    // followed by a space and to enter 'done' when finished. validates inputs to ensure they are numbers.
    public static List<Double> getNumberList(Scanner scanner) {
        List<Double> numbers = new ArrayList<>();
        System.out.println("Enter numbers each separated by spaces. When finished, type 'done': ");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                numbers.add(scanner.nextDouble());
            } else if (scanner.hasNext("done")) {
                scanner.next();
                break;
            } else {
                System.out.println("Invalid input. Enter numbers or 'done' to finish.");
                scanner.next();
            }
        }
        return numbers;
    }

}
