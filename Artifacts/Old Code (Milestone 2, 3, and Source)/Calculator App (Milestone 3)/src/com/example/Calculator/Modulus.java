package com.example.Calculator;

/********************************************************************************
 * Division Operation
 * Description: Takes the two user inputs and finds the modulus of them. Returns answer to Main.
 * Throws error if user tries to find modulus by zero.
 *
 ********************************************************************************/
class Modulus extends Operation {
    @Override
    public double performOperation(double n1, double n2) throws ArithmeticException  {
        if (n2 == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return n1 % n2;
    }
}