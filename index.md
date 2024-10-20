## **Self-Assessment**

#### Backstory

Having started my journey at SNHU in January of 2023, I have spent almost a full two years now in the process of getting my Computer Science Bachelors Degree. While I do not believe I had any innate talent for coding, I have always been fond of puzzle-solving, and do not lack the persistence (some may prefer to call it *stubbornness*) that is often needed in the world of coding. With both of my parents being born in Mexico and them being the first to have kids in an attempt to start a fruitful life in the United States, I am the oldest second-generation immigrant of my extended family. In turn, I was the first to attend college before any of my cousins or my younger sister. While this pressure seemed insurmountable at times, as well as there being multiple bumps in the road along the way, I have persevered and have been named on the Honor Roll 8 times, named on the Dean's list 2 times, and have managed to finally be named on the President's list two times in my last two semesters here at SNHU. To say that this brings a warm joy and an indescribable feeling of relief would only be an understatement. If you had seen my lack of academic consistency during my years in community college and had you told me that this would be the student I turned into, I would surely not believe it. As such, I am tremendously proud of what I have accomplished so far and I aspire to use all I have learned to become a successful programmer outside of SNHU.

----

#### What I Have Learned


While studying in the Computer Science program here at SNHU, I have learned how to think about problems in the mindset of a developer. I have become more aware of the small details, as well as more considerate of coding vulnerabilities throughout any development process I do. I have come to understand the importance of repeated development testing, using tools such as assertions and exceptions where needed to maintain code security and stability. Testing code thoroughly throughout the development process is a vital step in being a great developer. Adopting the mindset that is understanding that there are almost always ways to improve your code despite any confidence in technical skill has been useful in helping me find ways that others would attempt to problem-solve in ways that I would not. 
Through employing these skills in my development process, I have been able to show just how deep my understanding is in relation to Computer Science techniques, skills, and development tools that are needed for any programming solution, and am capable of learning any tools that either new or necessary for a task due to my experience using a wide variety of software and tools previously. I have grown to be comfortable in Java, C++, and Python programming languages. I have also become stronger at using HTML, CSS, and Javascript. 

I learned about the software development lifecycle, SCRUM, project management strategies, and the relationship these things have with the developer. Whether I decide to choose a path as a developer, a project manager, or some other position in the world of computer science, this newfound understanding of how each role works with each other will allow me to do exceptionally well in any area. I have come to understand the importance of pseudocode as well as being able to explain the code to clients in ways that is understandable to someone who is not familiar with coding if it is ever needed, as I am sure it will be. One of the most important things I learned is learning how to efficiently use algorithmic principles to create programming solutions, as well as balancing any trade-offs that come with doing so. 

In CS465, I learned the ins and outs of Full Stack development through designing and launching a web application. For this application, we used databases and frameworks and used tools for full stack development such as MongoDB, Express, Angular, and Node.js. I learned how to create a customer facing website, how to move static html to templates using JSON, and configure NoSQL databases for my full stack applications. This class was a great learning experience for me as a developer as I had not done much full stack development beforehand, but have now come out as a strong full stack developer. 

In CS360, I created an Android mobile application and learned more about mobile architecture and programming for mobile devices. I created an application in which the user could create a username and password that was saved to a database and login with their credentials. Then, the user would be able to create, read, edit, or save events that could be tied to alarms based on their mobile phone number. 

In CS410, software reverse engineering and how to approach it led to me being able to reverse engineer code from binary and assembly into higher level code such as C++. Security of code and eliminating vulnerabilities was something that was instilled upon me constantly as a programmer here at SNHU, and this class made use of it as reverse engineering leads to many code vulnerabilities in which need to be fixed. 


## Code Review

## Original Artifacts

#### Reverse Engineered Basic Arithmetic Calculator in C++

My original artifact for this ePortfolio that I choose to fix is from the last class I mentioned, **CS410: Reverse Software Engineering**. 
I reverse engineered code from binary to assembly and finally C++. At this point, I identified and fixed any vulnerabilties. Once I completed that, I converted the code back to binary. 

In this code, the user would be shown a displaymenu with multiple options numbered 1 through 4. Once the user entered their choice, they would enter 2 numbers for the chosen arithmetic operation (add, subtract, or multiply). The arithmetic operation's answer would be printed on the terminal for the user to see. In my edited code, I added input validation for both the user choice and the user numbers input for the operations to ensure the user choice was 1-4 and that the operation numbers would not be too large as to cause overflow. 

The C++ code:

```
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

Using C++, I converted the code of a command-line calculator from binary to assembly and finally C++ using reverse engineering techniques. In this calculator, the user would be presented with a display menu with multiple options available to choose from. Once the user chooses an option (currently one of 3 operations: addition, subtraction, or multiplication), they would be prompted to enter a number. Once complete, they would be prompted to enter a second number. The numbers would go through simple numeric limit input validation to ensure that there is no overflow. Finally, the answer to the operation would be printed to the screen. 
This was created in my Reverse Software Engineering class last semester meaning that the code is only about a few months old. 

## Second Enhancement

#### Algorithms and Data Structure

## Third Enhancement 

#### Databases

