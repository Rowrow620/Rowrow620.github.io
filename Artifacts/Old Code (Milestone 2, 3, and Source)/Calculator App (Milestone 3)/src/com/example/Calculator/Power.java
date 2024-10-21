package com.example.Calculator;

/********************************************************************************
 * Power Operation
 * Derived from Operation parent class
 * Description: Takes the two user inputs and finds the power of the first number by the second user input. Returns answer to Main.
 *
 ********************************************************************************/

class Power extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return Math.pow(n1, n2);
    }
}