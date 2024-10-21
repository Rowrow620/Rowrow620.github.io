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