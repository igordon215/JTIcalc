package com.zipcodewilmington.scientificcalculator;

public class AskNumber {

    // Ask for a Double

    public static double askDouble() {
        double d = 0;
        d = Console.getDoubleInput("Enter a number.");
        return d;
    }

// ASK FOR THE OPERATION
public static String getOperation() {
   String operator = "";
   String menu = "\nPLEASE PICK FROM THE FOLLOWING \n| ADD | SUBTRACT |  MULTIPLY |  DIVIDE |  REMAINDER |  SQUARE |  SquareRoot | VariableExpo\n| INVERSE | -NUM | M+ | MC | MRC | SINE | INVERSESINE |COSINE | TANGENT | DEGREE | RADIAN | CLEAR| MAGIC8BALL |";
   operator = Console.getStringInput("What would you like to do...?" + menu);
//WHILE LOOP
   while(!operator.equalsIgnoreCase("Add")  && !operator.equalsIgnoreCase("Subtract")  && !operator.equalsIgnoreCase("Multiply")  && !operator.equalsIgnoreCase("Divide") && !operator.equalsIgnoreCase("Remainder") && !operator.equalsIgnoreCase("Square") && !operator.equalsIgnoreCase("SquareRoot") && !operator.equalsIgnoreCase("VariableExpo") && !operator.equalsIgnoreCase("Inverse") && !operator.equalsIgnoreCase("-Num") && !operator.equalsIgnoreCase("M+") && !operator.equalsIgnoreCase("MC") && !operator.equalsIgnoreCase("MRC") && !operator.equalsIgnoreCase("Sine") && !operator.equalsIgnoreCase("InverseSine") && !operator.equalsIgnoreCase("Cosine") && !operator.equalsIgnoreCase("Tangent")  && !operator.equalsIgnoreCase("Degree") && !operator.equalsIgnoreCase("Radian") && !operator.equalsIgnoreCase("Clear") && !operator.equalsIgnoreCase("Magic8Ball") ){
        Console.println("You Chose " + operator);
        operator = Console.getStringInput("~~INVALID INPUT~~!  Enter one of the following..." + menu);
    }
    return operator;
}
}