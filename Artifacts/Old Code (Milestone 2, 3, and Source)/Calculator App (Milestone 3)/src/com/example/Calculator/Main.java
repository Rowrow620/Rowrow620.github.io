/*-------------------------------------------------------------------------------------------
* Author: Juan Sanchez
* Date: 9/29/2024
* Version: 1.2 (Milestone 2)
* Class: CS499
* -------------------------------------------------------------------------------------------
* Description of Program: This program coded in Java is a multipurpose calculator application.
* The application prompts the user with a welcome message as well as asking the user to choose one of 9 options from the display menu.
* The first 7 options available involve multiple arithmemitic options in which the user will either be prompted to enter 1 or 2 numbers accordingly.
* The penultimate option is a sorting numbers algorithm in which the user will be prompted to enter as many numbers as they choose. After they do, they will be
* asked to choose sorting in ascending or descending order. The last option is exit and will exit the application entirely.
*
* Notes on changes:
* -----------------
* 1.0 (original)
* The code was converted from binary -> assembly -> C++ prior to the final conversion to Java in Milestone 1 (Version 1.1).
* Originally, it was a simple calculator app with only options 1-3 related to artihmetic and 4 being exit.
*
* 1.1
* In versions 1.1, we created the abstract class operations as well as used inheritance to create the rest of the operation classes.
* I added exception handling by throwing an arithmetic exception during the operation process in case of any errors.
* Added data validation to ensure that the user is entering a number.
*
* 1.2
* Created a package for the project as well as seperated all classes out of the Main file. Changed from
* storing the user inputs in integers to storing them in hashmaps for the operations. Added Modulus, Power, and Square Root options.
* For the square root option, the user will only need to enter one number and they receive its square root.
* Added a sorting choice in which the user will input any amount of numbers into an array list, choose either ascending or
* descending order, and then receive the appropriate list based on their choices. In the new data structures, doubles are used instead of Integers.
*
*
* --------------------------------------------------------------------------------------------*/

package com.example.Calculator;
import java.util.*;

// 1.2 Update 1:
// created package and seperated the classes into seperate files.
// Classes created/moved to class files:
// abstract class - Operations
// derived from operations - Addition, Subtraction, Multiplication, Division, Modulus, Power, SquareRoot
// SortOperation added and is not derived from the operation abstract class

// Main class
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.2 Update 2: Added hashmap operationsMap to be used to store operations
        // Added due to its versatility and plan to use its features more with the added database next update.

        Map<Integer, Operation> operationsMap = new HashMap<>();
        operationsMap.put(1, new Addition());
        operationsMap.put(2, new Subtraction());
        operationsMap.put(3, new Multiplication());
        operationsMap.put(4, new Division());
        operationsMap.put(5, new Modulus());
        operationsMap.put(6, new Power());
        operationsMap.put(7, new SquareRoot());
        SortOperation sortOperation = new SortOperation();

        int userChoice;

        // loops displayMenu until user chooses to exit
        while (true) {
            DisplayMenu.showMenu();
            //Validates User input through getValidInteger
            userChoice = DisplayMenu.getValidInteger(scanner, "Enter your choice (1-9): ");
            //closes program if user enter '9'
            if (userChoice == 9) {
                System.out.println("Exiting program."); // closes program
                break;
            }

            //Update 3:  Added a sorting operation that takes user inputs and sorts based on user choices (ascend/descend)
            // Validates user inputs and requests another input if number is incorrect

            // Sorting operation (choice 8)
            if (userChoice == 8) {
                List<Double> numbers = DisplayMenu.getNumberList(scanner);
                System.out.print("Sort in ascending order? (y/n): ");
                boolean ascending = scanner.next().equalsIgnoreCase("y");
                List<Double> sortedNumbers = sortOperation.performSortOperation(numbers, ascending);
                System.out.println("Sorted numbers: " + sortedNumbers);
            } else if (!operationsMap.containsKey(userChoice)) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.");
                continue;
            } else {
                //
                if (userChoice == 7) {
                    // prompt for only one number for square root
                    double n1 = DisplayMenu.getValidInteger(scanner, "Choose one number: ");
                    Operation operation = operationsMap.get(userChoice);
                    double result = operation.performOperation(n1, 0); // n2 is ignored
                    System.out.println("Result: " + result);
                } else {
                    // for the other operations requiring two numbers
                    double n1 = DisplayMenu.getValidInteger(scanner, "Enter the first number: ");
                    double n2 = DisplayMenu.getValidInteger(scanner, "Enter the second number: ");

                    Operation operation = operationsMap.get(userChoice);
                    try {
                        double result = operation.performOperation(n1, n2);
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            // ask if the user wants to continue
            System.out.print("Continue? (y/n): ");
            String continueChoice = scanner.next().toLowerCase();
            if (!continueChoice.equals("y")) {
                System.out.println("Exiting program.");
                break;
            }
        }

        scanner.close();
    }
}