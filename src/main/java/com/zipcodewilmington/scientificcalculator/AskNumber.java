package com.zipcodewilmington.scientificcalculator;

public class AskNumber {

    // Ask for a Double

    public static double askDouble() {
        double d = 0;
        d = Console.getDoubleInput("Enter a number.");
        return d;
    }

// Ask for an Operator