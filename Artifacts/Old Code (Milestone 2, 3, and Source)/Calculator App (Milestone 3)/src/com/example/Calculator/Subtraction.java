package com.example.Calculator;

/********************************************************************************
 * Subtraction Operation
 * Description: Takes the two user inputs and finds the difference. Returns difference to Main.
 *
 ********************************************************************************/
public class Subtraction extends Operation {
    @Override
    public double performOperation(double n1, double n2) {
        return n1 - n2;
    }
}