package com.example.Calculator;

/********************************************************************************
 * Operation (Parent Operation class)
 * Description: This abstract class will be the parent to all operation subclasses.
 *
 ********************************************************************************/


public abstract class Operation {
    public abstract double performOperation(double n1, double n2) throws ArithmeticException;
}