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
        double result1 = a - b;
        return result1;
    }
    // method for multiplication
    public static double multiplication(double a, double b) {
        double result2 = a * b;
        return result2;
    }
    // method for division
    public static double division(double a, double b) {
        double result3 = a / b;
        return result3;
    }
    // method for remainder
    public static double remainder(double a, double b) {
        double result4 = a % b;
        return result4;
    }
    // method for square
    public static double square(double a) {
        double result6 = a * a;
        return result6;
    }
    // method for squareRoot
    public static double squareRoot(double a) {
        double result7 = Math.sqrt(a);
        return result7;
    }
    // method for variable exponents
    public static double variExpo(double a, double b) {
        double result7 = Math.pow(a, b);
        return result7;
    }
    // method for finding the inverse
    public static double inverse(double a) {
        double result = 1/a;
        return result;
    }
    // method for invertion
    public static double invert(double a) {
        double result8 = a * -1;
        return result8;
    }
    // method for sin
    public static double sine(double a) {
        double result9 = Math.sin(a);
        return result9;
    }
    // method for cosine
    public static double cosine(double a) {
        double result10 = Math.cos(a);
        return result10;
    }
    // method for tan
    public static double tan(double a) {
        double result11 = Math.tan(a);
        return result11;
    }
    // method for absolute
    public static double absolute(double a) {
        double result5 = Math.abs(a);
        return result5;
    }
    // method to degree
    public static double toDegree(double a) {
        double result12 = Math.toDegrees(a);
        return result12;
    }
    // method to degree
    public static double toRadian(double a){
        double result13 = Math.toRadians(a);
        return result13;
    //inverse sin
    }public static double invSine(double a){
        double result14 = Math.asin(a);
        return result14;
    }

}
