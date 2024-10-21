package com.example.Calculator;

/********************************************************************************
 * Square Operation
 * Derived from Operation parent class
 * Description: Takes one user input and returns the square root to main.
 *
 ********************************************************************************/
class SquareRoot extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        //uses the first number, n2 isnt used
        return Math.sqrt(n1);
    }
}
