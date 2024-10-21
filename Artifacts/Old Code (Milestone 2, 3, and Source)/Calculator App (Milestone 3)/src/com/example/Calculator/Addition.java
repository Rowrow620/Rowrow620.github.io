package com.example.Calculator;

/********************************************************************************
 * Addition Operation
 * Description: Takes the two user inputs and finds the sum of them. Returns sum to Main.
 *
 ********************************************************************************/

class Addition extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 + n2;
    }
}