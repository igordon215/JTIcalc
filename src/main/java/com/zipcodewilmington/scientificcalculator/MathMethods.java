package com.zipcodewilmington.scientificcalculator;

public class MathMethods {
    // contains all math methods

    // method for addition
    public static double add(double a, double b) {
        double result = a + b;
        return result;
    }
    // method for subtraction
    public static double subtract(double a, double b) {
        double result = a - b;
        return result;
    }
    // method for multiplication
    public static double multiplication(double a, double b) {
        double result = a * b;
        return result;
    }
    // method for division
    public static double division(double a, double b) {
        double result = a / b;
        return result;
    }
    // method for remainder
    public static double remainder(double a, double b) {
        double result = a % b;
        return result;
    }
    // method for square
    public static double square(double a) {
        double result = a * a;
        return result;
    }
    // method for squareRoot
    public static double squareRoot(double a) {
        double result = Math.sqrt(a);
        return result;
    }
    // method for variable exponents
    public static double variExpo(double a, double b) {
        double result = Math.pow(a, b);
        return result;
    }
    // method for finding the inverse
    public static double inverse(double a) {
        double result = 1/a;
        return result;
    }
    // method for invertion
    public static double invert(double a) {
        double result = a * -1;
        return result;
    }
    // method for sin
    public static double sine(double a) {
        double result = Math.sin(a);
        return result;
    }
    // method for cosine
    public static double cosine(double a) {
        double result = Math.cos(a);
        return result;
    }
    // method for tan
    public static double tan(double a) {
        double result = Math.tan(a);
        return result;
    }
    // method for absolute
    public static double absolute(double a) {
        double result = Math.abs(a);
        return result;
    }
    // method to degree
    public static double toDegree(double a) {
        double result = Math.toDegrees(a);
        return result;
    }
    // method to degree
    public static double toRadian(double a){
        double result = Math.toRadians(a);
        return result;
    //inverse sin
    }public static double invSine(double a){
        double result = Math.asin(a);
        return result;
    }

}
