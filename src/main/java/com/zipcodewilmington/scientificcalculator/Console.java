package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner strScanner = new Scanner(System.in);
        println(prompt);
        String strInput = strScanner.nextLine();
        return strInput;
    }


    public static double getDoubleInput(String prompt) {
        Scanner doubleScanner = new Scanner(System.in);
        println(prompt);
        while (!doubleScanner.hasNextDouble()) {
            doubleScanner.next();
            println("Invalid Input! Please enter a Double.");
        }
        double doubleInput = doubleScanner.nextDouble();

        return doubleInput;
    }
}