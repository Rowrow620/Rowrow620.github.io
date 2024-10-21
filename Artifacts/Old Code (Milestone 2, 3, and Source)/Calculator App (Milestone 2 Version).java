iimport java.util.Scanner;

// Base abstract class
abstract class Operation {
    public abstract double performOperation(double n1, double n2) throws ArithmeticException;
}

// Addition class inherits from Operation
class Addition extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 + n2;
    }
}

// Subtraction class inherits from Operation
class Subtraction extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 - n2;
    }
}

// Multiplication class inherits from Operation
class Multiplication extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 * n2;
    }
}

// Division class inherits from Operation
class Division extends Operation {
    @Override
    public double performOperation(double n1, double n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return n1 / n2;
    }
}

// Class to display the menu and handle user input
class DisplayMenu {
    public static void showMenu() {
        System.out.println("1) Add");
        System.out.println("2) Subtract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Exit");
    }
}

// Main class
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice != 5) {
            DisplayMenu.showMenu();
            System.out.print("Enter your choice (1-5): ");

            // Validate user input for menu choice
            if (!scanner.hasNextInt()) {
                scanner.next(); // Discard invalid input
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }

            userChoice = scanner.nextInt();

            if (userChoice == 5) {
                System.out.println("Exiting program.");
                break;
            }

            if (userChoice < 1 || userChoice > 5) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continue;
            }

            // Get two numbers from the user
            System.out.print("Enter the first number: ");
            while (!scanner.hasNextDouble()) {
                scanner.next(); // Discard invalid input
                System.out.print("Invalid input. Please enter a valid number for the first operand: ");
            }
            double n1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            while (!scanner.hasNextDouble()) {
                scanner.next(); // Discard invalid input
                System.out.print("Invalid input. Please enter a valid number for the second operand: ");
            }
            double n2 = scanner.nextDouble();


            Operation operation = null;
            try {
                switch (userChoice) {
                    case 1:
                        operation = new Addition();
                        break;
                    case 2:
                        operation = new Subtraction();
                        break;
                    case 3:
                        operation = new Multiplication();
                        break;
                    case 4:
                        operation = new Division();
                        break;
                }

                if (operation != null) {
                    double result = operation.performOperation(n1, n2);
                    System.out.println("Result: " + result);
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
