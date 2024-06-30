package com.zipcodewilmington.scientificcalculator;

public class mathMethods {
    // contains all math classes

    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public static double subtract(double a, double b) {
        double result1 = a - b;
        return result1;
    }

    public static double multiplication(double a, double b) {
        double result2 = a * b;
        return result2;
    }

    public static double division(double a, double b) {
        double result3 = a / b;
        return result3;
    }

    public static double remainder(double a, double b) {
        double result4 = a % b;
        return result4;
    }

    public static double square(double a) {
        double result6 = a * a;
        return result6;
    }

    public static double squareRoot(double a) {
        double result7 = Math.sqrt(a);
        return result7;
    }

    public static double variExpo(double a, double b) {
        double result7 = Math.pow(a, b);
        return result7;
    }

    public static double inverse(double a) {
        double result = 1/a;
        return result;
    }
}
