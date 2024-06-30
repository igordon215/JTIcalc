package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

    private static void askMagic8Ball() {
        Scanner scanner = new Scanner(System.in)
        System.out.print("Ask the Magic 8 Ball a yes-or-no question: ");
        scanner.nextLine(); // Consume newline before reading the question
        String question = scanner.nextLine();
        String response = getRandomMagic8BallResponse();
        System.out.println("Magic 8 Ball says: " + response);
    }

    private static String getRandomMagic8BallResponse() {
        String[] responses = {
                "It is certain.",
                "It is decidedly so.",
                "Without a doubt.",
                "Yes – definitely.",
                "You may rely on it.",
                "As I see it, yes.",
                "Most likely.",
                "Outlook good.",
                "Yes.",
                "Signs point to yes.",
                "Reply hazy, try again.",
                "Ask again later.",
                "Better not tell you now.",
                "Cannot predict now.",
                "Concentrate and ask again.",
                "Don't count on it.",
                "My reply is no.",
                "My sources say no.",
                "Outlook not so good.",
                "Very doubtful."
        };
        Random random = new Random();

        int index = random.nextInt(responses.length);
        return responses[index];
    }
}
