package com.example.Calculator;

/********************************************************************************
 * Multiplication Operation
 * Description: Takes the two user inputs and finds the product of them. Returns product to Main.
 *
 ********************************************************************************/


class Multiplication extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 * n2;
    }
}
