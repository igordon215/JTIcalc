package com.zipcodewilmington.scientificcalculator;

/**
  JTI CALC. v10.1
 */
public class MainApplication {

    public static void main(String[] args) {


        //DISPLAY FOR NEW USER
        Calculator user = new Calculator(0, 0, 0, 0);
        Magic8Ball magic8Ball = new Magic8Ball();
        Console.println("Greetings! Welcome to JTI Calculator! \n ZIPCODE ROCKS");

        //SHOW STARTING DISPLAY
        Console.println("| Your total value is | %.2f", user.getDisplayVal());




        //START WHILE LOOP aka start the calc program
        while (true) {
             //Store Operation ????
            String operator = "";

            //Receive first value and set to display value
            user.setFirstVal("Enter a starting value");
            Console.println("| Your total value is | %.2f", user.getDisplayVal());
            //START PROGRAM LOOP
            while (true) {
                //ASK FOR THE OPERATOR + CONSOLE PRINT
                String nextOperator;
                nextOperator = AskNumber.getOperation();

                //Magic8ball
                if (nextOperator.equalsIgnoreCase("Magic8ball")) {
                    Magic8Ball.askMagic8Ball();
                    //ADDITION
                }else if (nextOperator.equalsIgnoreCase("BlackJack")) {
                    BlackJack.playBlackJack();
                }else if (nextOperator.equalsIgnoreCase("Add")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.add(user.displayVal, user.secondVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //SUBTRACTION
                } else if (nextOperator.equalsIgnoreCase("Subtract")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.subtract(user.displayVal, user.secondVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //MULTIPLICATION
                } else if (nextOperator.equalsIgnoreCase("Multiply")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.multiplication(user.displayVal, user.secondVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //DIVISION
                } else if (nextOperator.equalsIgnoreCase("Divide")) {
                    user.secondVal = AskNumber.askDouble();
                    if (user.secondVal == 0) {
                        //need an error statement
                        Console.println("UH-OH... ERROR!");
                        user.displayVal = 0;
                        Console.println("| Your total value is | %.2f", user.getDisplayVal());
                        user.setFirstVal("Enter a starting value");
                    } else
                        user.displayVal = MathMethods.division(user.displayVal, user.secondVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //REMAINDER
                } else if (nextOperator.equalsIgnoreCase("Remainder")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.remainder(user.displayVal, user.secondVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //SQUARE
                } else if (nextOperator.equalsIgnoreCase("Square")) {
                    user.displayVal = MathMethods.square(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //SQUARE ROOT
                } else if (nextOperator.equalsIgnoreCase("SquareRoot")) {
                    user.displayVal = MathMethods.squareRoot(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //VARIABLE EXPONENT
                } else if (nextOperator.equalsIgnoreCase("VariableExpo")) {
                    user.secondVal = AskNumber.askDouble();
                    user.displayVal = MathMethods.variExpo(user.displayVal,user.secondVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                // INVERSE
                } else if (nextOperator.equalsIgnoreCase("Inverse")) {
                    user.displayVal = MathMethods.inverse(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                // -NUM
                } else if (nextOperator.equalsIgnoreCase("-Num")) {
                    user.displayVal = MathMethods.invert(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //CURRENT DISPLAY VALUE
                } else if (nextOperator.equalsIgnoreCase("M+")) {
                    user.savedVal = user.displayVal;
                    Console.println("You saved " + user.savedVal + " in memory.");
                //RESET MEMORY
                } else if (nextOperator.equalsIgnoreCase("MC")) {
                    user.savedVal = 0;
                    Console.println("Memory reset.");
                //RECALL CURRENT VALUE
                } else if (nextOperator.equalsIgnoreCase("MRC")) {
                    Console.println("Your saved number is " + user.savedVal);
                //SINE
                } else if (nextOperator.equalsIgnoreCase("Sine")) {
                    user.displayVal = MathMethods.sine(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //COSINE
                } else if (nextOperator.equalsIgnoreCase("Cosine")) {
                    user.displayVal = MathMethods.cosine(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                //TANGENT
                } else if (nextOperator.equalsIgnoreCase("Tangent")) {
                    user.displayVal = MathMethods.tan(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                // TO DEGREE
                } else if (nextOperator.equalsIgnoreCase("Degree")) {
                    user.displayVal = MathMethods.toDegree(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);
                // TO RADIAN
                } else if (nextOperator.equalsIgnoreCase("Radian")) {
                        user.displayVal = MathMethods.toRadian(user.displayVal);
                        Console.println("| Your total value is | %.2f", user.displayVal);
                //INVERSE SIN
                } else if (nextOperator.equalsIgnoreCase("InverseSine")) {
                    user.displayVal = MathMethods.invSine(user.displayVal);
                    Console.println("| Your total value is | %.2f", user.displayVal);


                //CLEAR DISPLAY
                } else if (nextOperator.equalsIgnoreCase("Clear")) {
                    user.clearDisplayVal();
                }
                    break;

            }
        }
    }
}
