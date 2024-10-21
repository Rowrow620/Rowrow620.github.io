package com.example.Calculator;

/********************************************************************************
 * Division Operation
 * Description: Takes the two user inputs and finds the quotient of them. Returns quotient to Main.
 * Throws error if user tries to divide by Zero.
 *
 ********************************************************************************/

class Division extends Operation {
    @Override
    public double performOperation(double n1, double n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return n1 / n2;
    }
}