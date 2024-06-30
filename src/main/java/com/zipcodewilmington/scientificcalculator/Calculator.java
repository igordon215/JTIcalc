package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    double firstVal;
    double secondVal;
    double savedVal;
    double displayVal;

    public Calculator(double firstValIn, double secondValIn, double displayValIn, double savedValIn) {
        this.firstVal = firstValIn;
        this.secondVal = secondValIn;
        this.displayVal = displayValIn;
        this.savedVal = savedValIn;
    }

    //Display based on user input
    public void setFirstVal(String prompt) {
        Scanner doubleScanner = new Scanner(System.in);
        Console.println(prompt);
        while (!doubleScanner.hasNextDouble()) {
            doubleScanner.next();
            Console.println("Invalid Input! Please enter a Number.");
        }
        this.displayVal = doubleScanner.nextDouble();
        this.firstVal = this.displayVal;
    }

    public double getDisplayVal() {
        return displayVal;
    }

    public void clearDisplayVal() {
        this.displayVal = 0;
        Console.println("Your total is %.2f", displayVal);
    }

    public void setSavedVal(double a) {
        this.savedVal = a;
    }

    public double getSavedVal() {
        return savedVal;
    }
}
