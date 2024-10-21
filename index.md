# ePortfolio

## **Self-Assessment**

###### Name: Juan Sanchez

###### SNHU CS-499 Final Project

#### Backstory

Having started my journey at SNHU in January of 2023, I have spent almost a full two years now in the process of getting my Computer Science Bachelors Degree. While I do not believe I had any innate talent for coding, I have always been fond of puzzle-solving, and do not lack the persistence (some may prefer to call it *stubbornness*) that is often needed in the world of coding. With both of my parents being born in Mexico and them being the first to have kids in an attempt to start a fruitful life in the United States, I am the oldest second-generation immigrant of my extended family. In turn, I was the first to attend college before any of my cousins or my younger sister. While this pressure seemed insurmountable at times, as well as there being multiple bumps in the road along the way, I have persevered and have been named on the Honor Roll 8 times, named on the Dean's list 2 times, and have managed to finally be named on the President's list two times in my last two semesters here at SNHU. To say that this brings a warm joy and an indescribable feeling of relief would only be an understatement. If you had seen my lack of academic consistency during my years in community college and had you told me that this would be the student I turned into, I would surely not believe it. As such, I am tremendously proud of what I have accomplished so far and I aspire to use all I have learned to become a successful programmer outside of SNHU.

----

#### What I Have Learned


While studying in the Computer Science program here at SNHU, I have learned how to think about problems in the mindset of a developer. I have become more aware of the small details, as well as more considerate of coding vulnerabilities throughout any development process I do. I have come to understand the importance of repeated development testing, using tools such as assertions and exceptions where needed to maintain code security and stability. Testing code thoroughly throughout the development process is a vital step in being a great developer. Adopting the mindset that is understanding that there are almost always ways to improve your code despite any confidence in technical skill has been useful in helping me find ways that others would attempt to problem-solve in ways that I would not. 
Through employing these skills in my development process, I have been able to show just how deep my understanding is in relation to Computer Science techniques, skills, and development tools that are needed for any programming solution, and am capable of learning any tools that either new or necessary for a task due to my experience using a wide variety of software and tools previously. I have grown to be comfortable in Java, C++, and Python programming languages. I have also become stronger at using HTML, CSS, and Javascript. I have learned technical concepts and how to approach someone who may not be affluet in the technical concepts while still being able to help them understand the process of development. 

I learned about the software development lifecycle, SCRUM, project management strategies, and the relationship these things have with the developer. Whether I decide to choose a path as a developer, a project manager, or some other position in the world of computer science, this newfound understanding of how each role works with each other will allow me to do exceptionally well in any area. I have come to understand the importance of pseudocode as well as being able to explain the code to clients in ways that is understandable to someone who is not familiar with coding if it is ever needed, as I am sure it will be. One of the most important things I learned is learning how to efficiently use algorithmic principles to create programming solutions, as well as balancing any trade-offs that come with doing so. I have learned the benefits of working in a team through collaborative effort in learning new coding techniques with my classmates. 

In CS465, I learned the ins and outs of Full Stack development through designing and launching a web application. For this application, we used databases and frameworks and used tools for full stack development such as MongoDB, Express, Angular, and Node.js. I learned how to create a customer facing website, how to move static html to templates using JSON, and configure NoSQL databases for my full stack applications. This class was a great learning experience for me as a developer as I had not done much full stack development beforehand, but have now come out as a strong full stack developer. 

In CS360, I created an Android mobile application and learned more about mobile architecture and programming for mobile devices. I created an application in which the user could create a username and password that was saved to a database and login with their credentials. Then, the user would be able to create, read, edit, or save events that could be tied to alarms based on their mobile phone number. 

In CS410, software reverse engineering and how to approach it led to me being able to reverse engineer code from binary and assembly into higher level code such as C++. Security of code and eliminating vulnerabilities was something that was instilled upon me constantly as a programmer here at SNHU, and this class made use of it as reverse engineering leads to many code vulnerabilities in which need to be fixed. 

Refining my strengths as a developer at SNHU and the development of my ePortfolio has led to a showcase of all my strengths and has started preparing me for the professional world. Understanding and applying data structures and algorithms has been a very big cornerstone of my growth here at SNHU. One of the highlights of my learning here involved enhancing the efficiency of operations in what used to be a C++-based arithmetic solver into a full Java-based multipurpose calculator application, which is now a key part of my ePortfolio. By improving the algorithmic complexity, I learned how to balance performance with maintainability, a skill that is essential when optimizing software for real applications. Additionally, my experience in my CS410 Reverse Software Engineering project taught me how to convert and analyze binary code, showcasing my ability to dissect complex algorithms and ensure the security and integrity of code. This depth in algorithms has shaped my professional goals toward roles that require performance optimization and problem-solving, such as back-end development or algorithm design.

In this ePortfolio, I will be enhancing the artifact in 3 different key areas: *Software design and engineering, Algorithms and Data structures, and Databases,* to showcase my understanding of all the aformentioned sections of Computer Science and prove my growth as a programmer since I started here at SNHU.

## Code Review

### [Code Review](https://youtu.be/ZDhAX6tFf-Y ) 

In the link above, I will present why I chose this artifact, as well as how I plan to enhance the artifact in all 3 sections based on the requirements of the ePortfolio. I will also go over these details down below, but the code review is a great way to get a better understanding of the original code and my thought process going into this project.

## The Original Artifact and Why I Choose It

#### Reverse Engineered Basic Arithmetic Calculator in C++

My original artifact for this ePortfolio that I choose to fix is from the last class I mentioned, **CS410: Reverse Software Engineering**, which I took and completed in August of this year. 
I reverse engineered code from binary to assembly and finally C++. At this point, I identified and fixed any vulnerabilties. Once I completed that, I converted the code back to binary. 

The vulnerabilities I found were as follows:

- No error thrown or loop if numbers are incorrectly lower than 1 or higher than 3
  
- No form of handling unnecessarily large numbers or invalid data input
  
In this code, the user would be shown a displaymenu with multiple options numbered 1 through 4. Once the user entered their choice, they would enter 2 numbers for the chosen arithmetic operation (add, subtract, or multiply). The arithmetic operation's answer would be printed on the terminal for the user to see. In my edited code, I added input validation for both the user choice and the user numbers input for the operations to ensure the user choice was 1-4 and that the operation numbers would not be too large as to cause overflow. 

This will be the artifact improved in each of the 3 improved artifact sections. 

The three enhanced artifacts included in this portfolio come together to illustrate a comprehensive demonstration of my skills and growth as a computer science professional. These artifacts showcase my proficiency in core areas of software development, including reverse engineering, software design, algorithms and data structures, and database integration. Each artifact represents a significant step in the evolution of the original C++ project, highlighting my ability to enhance and optimize solutions in various technical domains.

The orginal C++ code once fixed of vulnerabilties:

```java
#include <iostream>
#include <limits>  

using namespace std;

void DisplayMenu() {
    cout << " 1) Add" << endl;
    cout << " 2) Subtract" << endl;
    cout << " 3) Multiply" << endl;
    cout << " 4) Exit" << endl;
}

int main() {
    int userNum = 0;

    while (userNum != 4) {
        DisplayMenu();

        cout << "Enter your choice (1-4): ";
        cin >> userNum;

        // Input validation
        if (cin.fail()) {
            cin.clear(); 
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Discard invalid input
            cout << "Invalid input. Please enter a number between 1 and 4." << endl;
            continue;
        }

        if (userNum == 4) {
            cout << "Exiting program." << endl;
            break;
        }

        if (userNum < 1 || userNum > 3) {
            cout << "Invalid choice. Please enter a number between 1 and 4." << endl;
            continue;
        }

        int n1, n2;

        cout << "Enter the first number: ";
        while (!(cin >> n1)) {
            cin.clear(); 
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); 
            cout << "Invalid input. Please enter a valid integer for the first number: ";
        }

        cout << "Enter the second number: ";
        while (!(cin >> n2)) {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); 
            cout << "Invalid input. Please enter a valid integer for the second number: ";
        }

        switch (userNum) {
        case 1:
            cout << n1 << " + " << n2 << " = " << (n1 + n2) << endl;
            break;
        case 2:
            cout << n1 << " - " << n2 << " = " << (n1 - n2) << endl;
            break;
        case 3:
            cout << n1 << " * " << n2 << " = " << (n1 * n2) << endl;
            break;
        }
    }

    return 0;
}

```

## First Enhancement 

#### Software Design and Engineering

###### Submitted 9/22/2024

I choose this code to show my capabilities as a developer related to software design and engineering. Due to how much room the code had to be improved into a more versatile application, while lacking a lot of features to actually be useable in its current state outside of niche situations, I found that this was a great place to showcase my understanding behind software design and how to approach enhancing a project into a realistic application for real-world use. While the code was C++ in the original artifact, I changed the code into Java to further showcase my skills in transfering code into different languages as well as expanding the complexity of existing code. 
This artifact not only showcases my skills as a programmer, but also provides room for further enhancements to demonstrate advanced software design techniques. The calculator application serves as a foundation that can be improved by refining its design and structure. Specifically, I am enhancing the input validation even further and refactoring the code to use object-oriented principles such as inheritance, as well as adding a new operation that is Divide. This will involve separating the operations into individual methods, which will be derived from a parent class. These improvements will enhance both the user experience and the maintainability of the code, demonstrating my ability to design and implement clean, scalable software solutions. By adding input validation, I ensure that the program handles user input more efficiently and prevents errors that could lead to incorrect calculations or crashes. Additionally, refactoring the code to implement inheritance improves the structure of the application, allowing for future expandability and making the program easier to maintain and debug. These improvements demonstrate my ability to use innovative techniques like object-oriented design, which is essential for developing scalable and reliable software solutions that meet industry standards.

The main challenges I encountered during this enhancement process involved translating my C++ code into Java, which highlighted the differences in language syntax and libraries. The enhancements made to the input validation process ensure that user input is handled correctly and prevent common errors like overflow, which could lead to system crashes. Moreover, refactoring the program to implement inheritance and separate concerns improved the code's maintainability and readability. This not only makes it easier for future developers to understand and modify the code but also aligns with industry best practices for software engineering.

The experience of converting code from C++ to Java and enhancing it taught me valuable lessons about adapting software across different languages. This skill will be beneficial in my professional career as I work on cross-platform applications or migrate legacy systems to more modern environments.

```java
import java.util.Scanner;

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

```
## Second Enhancement

#### Algorithms and Data Structure

###### Submitted on 10/1/2024

This enhancement is a continuation of the previous improvements made in Enhancement One to the calculator project. Initially, the calculator supported three operations: addition, subtraction, and multiplication. In Enhancement One, it was expanded to four with the addition of the Division operation as well as implementing inheritance for all operation classes. For this enhancement, I focused on optimizing the calculator’s performance and incorporating advanced data structures. I expanded the existing functionality by adding even more additional operations (modulus, power, square root, and sorting), implemented more efficient validation mechanisms, and introduced HashMap and ArrayList data structures to improve flexibility. The sorting algorithm uses a hybrid approach of merge and insertion sorting with a time complexity of O(n logn) for the average case, ensuring high efficiency for both ascending and descending sorts. By introducing data structures like HashMap and ArrayList, the code became more versatile and easier to maintain. These enhancements not only allow for more scalable solutions but also align with industry standard practices for modular, flexible code. The sorting algorithm demonstrates my ability to design efficient solutions to common problems, ensuring the application can handle a variety of inputs while maintaining optimal performance. Additionally, I refactored the code to improve readability by modularizing the design, allowing future developers to easily navigate and modify the program. In this enhancement, I cleaned the main file by moving all of the operations into their own class. As such, I will show the main class and one example class for clarity in the example below.

Enhancing this artifact provided valuable insights into algorithm optimization and the challenges of managing data structures in a modular program. One of the most significant challenges was implementing a sorting algorithm with the desired O(n logn) time complexity while ensuring that it could handle dynamic input sizes effectively. I learned a great deal about the nuances of sorting algorithms in Java, particularly how Collections.sort() can simplify complex sorting operations without compromising performance or development time.
Feedback played a crucial role in this enhancement. Initially, my code lacked sufficient documentation around time complexity and algorithmic choices, which was highlighted in the feedback I received. To address this, I added detailed comments in the code, explaining the logic behind each algorithm and providing a clear breakdown of Big O notation for the sorting algorithm. This ensured that the code met the standards of both efficiency and clarity.

The updated Main class:

```java

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
```
operation examples:

```java
class SortOperation  {

    // time complexity:
    // O(n log n)
    public List<Double> performSortOperation(List<Double> numbers, boolean ascending) {
        if (ascending) {
            Collections.sort(numbers); // Sort in ascending order
        } else {
            numbers.sort(Collections.reverseOrder()); // Sort in descending order
        }
        return numbers;
    }
}
```
```java
class Addition extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 + n2;
    }
}
```


## Third Enhancement 

#### Databases

###### Submitted on 10/7/2024

This enhancement is the third and final (yay!) iteration of the multipurpose calculator project. In the initial stages, the calculator was only able to perform basic arithmetic operations such as addition, subtraction, and multiplication before being enhanced with more operations and improved modularity through object-oriented design. In this final enhancement, I implemented database functionality using SQLite3, allowing the program to store results from operations and retrieve a history of the last 10 operations performed by the user. This added layer of complexity introduced data persistence, making the application even more useful in real world scenario where users may want to revisit previous calculations.

The database feature includes storing the type of operation, the operands, and the results. The data retrieval function is presented as an option in the display menu, and only the most recent 10 operations are shown, ensuring that the display remains manageable while maintaining performance. I included this artifact in my ePortfolio because it demonstrates my understanding of database design and data persistence in the context of software development. By integrating SQLite, I showcased my ability to connect an application to a relational database, execute SQL queries efficiently, and retrieve data in a user friendly format. This enhancement also reflects my skills in modular programming, as I refactored the code to ensure that the database operations are kept separate from the core functionality of the calculator. his artifact highlights my skills in data storage and retrieval, SQL optimization, and error handling. By limiting the history retrieval to the 10 most recent operations, I ensured that the database queries remain efficient, even as the database grows over time. 

The process of integrating SQLite into the calculator application was a very fruitful learning experience. One of the most significant lessons was the importance of data persistence. In previous versions of the application, all operations were handled in memory, meaning that once the program was closed, all data was lost. By adding a database, I learned how to manage persistent storage, giving the application the ability to retain data between sessions and providing users with the ability to retrieve their previous calculations. One of the main challenges I faced was optimizing the database queries to ensure they were efficient. Initially, I didn’t focus enough on the time complexity of operations, but as the application grew, I realized the importance of considering performance. The SQL ORDER BY and LIMIT clauses were used to retrieve the 10 most recent operations efficiently, ensuring the program remains responsive even with larger datasets. 

```java

public class Main {

    // establishes connection to SQLite
    private static Connection connect() {
        String url = "jdbc:sqlite:calculator.db"; // SQLite db file
        Connection conn = null;
        try {
            // loads the SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");

            // establish a connection with the db
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            System.out.println("SQL error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC Driver was not found.");
            e.printStackTrace();
        }
        return conn;
    }

    // creates operations table in SQLite database
    private static void createTable() {
        // SQL that creates a new table
        String sql = "CREATE TABLE IF NOT EXISTS operations ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " operation TEXT NOT NULL,"
                + " operand1 REAL,"
                + " operand2 REAL,"
                + " result REAL"
                + ");";

        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'operations' created or already exists.");
        } catch (SQLException e) {
            System.out.println("SQL error during table creation: " + e.getMessage());
        }
    }

    // inserts an operation into the SQLite database
    private static void insertOperation(String operation, double operand1, double operand2, double result) {
        String sql = "INSERT INTO operations(operation, operand1, operand2, result) VALUES(?,?,?,?)";

        try (Connection conn = connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, operation);
            pstmt.setDouble(2, operand1);
            pstmt.setDouble(3, operand2);
            pstmt.setDouble(4, result);
            pstmt.executeUpdate();
            System.out.println("Operation saved to database.");
        } catch (SQLException e) {
            System.out.println("Error during insertion: " + e.getMessage());
        }
    }

    // UPDATE 1.3: display the last 10 past operations
    // Needed to get operation 0 in the displaymenu to work
    private static void viewPastOperations() {
        String sql = "SELECT id, operation, operand1, operand2, result FROM operations "
                + "ORDER BY id DESC LIMIT 10";  // gets only the last 10 operations

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            System.out.println("ID | Operation | Operand1 | Operand2 | Result");
            System.out.println("---------------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String operation = resultSet.getString("operation");
                double operand1 = resultSet.getDouble("operand1");
                double operand2 = resultSet.getDouble("operand2");
                double result = resultSet.getDouble("result");
                System.out.printf("%d | %s | %.2f | %.2f | %.2f%n", id, operation, operand1, operand2, result);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving past operations: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // hashmap operationsMap to be used to store operations
        Map<Integer, Operation> operationsMap = new HashMap<>();
        operationsMap.put(1, new Addition());
        operationsMap.put(2, new Subtraction());
        operationsMap.put(3, new Multiplication());
        operationsMap.put(4, new Division());
        operationsMap.put(5, new Modulus());
        operationsMap.put(6, new Power());
        operationsMap.put(7, new SquareRoot());
        SortOperation sortOperation = new SortOperation();

        createTable();

        int userChoice;

        // loops displayMenu until user chooses to exit
        while (true) {
            DisplayMenu.showMenu();

            userChoice = DisplayMenu.getValidInteger(scanner, "Enter your choice (0-9):");
            // closes program if user enters '9'
            if (userChoice == 9) {
                System.out.println("Exiting program."); // closes program
                break;
            }

            // View past operations (new option 10)
            if (userChoice == 0) {
                viewPastOperations();
                continue;
            }

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
                double n1 = DisplayMenu.getValidInteger(scanner, "Enter the first number: ");
                double n2 = (userChoice == 7) ? 0 : DisplayMenu.getValidInteger(scanner, "Enter the second number: ");
                Operation operation = operationsMap.get(userChoice);
                try {
                    double result = operation.performOperation(n1, n2);
                    System.out.println("Result: " + result);

                    // Added 1.3: stores the operation in the database
                    insertOperation(operation.getClass().getSimpleName(), n1, n2, result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
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

```
## Journals
[Journal 1: What Makes a Productive Code Review?](CS499_Documents/Journal1.pdf)

[Journal 2: Marketing With ePortfolios and Artifact Update](CS499_Documents/Journal2.pdf "Marketing With ePortfolios and Artifact Update")

[Journal 3: Career Choice and Artifact Update](CS499_Documents/Journal3.pdf "Career Choice and Artifact Update")

[Journal 4: Computer Science Trends and Artifact Update](CS499_Documents/Journal4.pdf "Computer Science Trends and Artifact Update")

[Journal 5: Emerging Technology and Artifact Update](CS499_Documents/Journal5.pdf "Emerging Technology and Artifact Update")
