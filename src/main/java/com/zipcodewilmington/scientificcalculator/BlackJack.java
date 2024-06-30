package com.zipcodewilmington.scientificcalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlackJack {

    public static void playBlackJack() {
        Scanner scanner = new Scanner(System.in);
        MainApplication mainApplication = new MainApplication();
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Welcome to Blackjack!");

            // Initialize deck and hands
            List<Card> deck = initializeDeck();
            List<Card> playerHand = new ArrayList<>();
            List<Card> dealerHand = new ArrayList<>();

            // Shuffle the deck
            Collections.shuffle(deck);

            // Deal initial cards
            playerHand.add(deck.remove(0));
            dealerHand.add(deck.remove(0));
            playerHand.add(deck.remove(0));
            dealerHand.add(deck.remove(0));

            // Show initial hands
            System.out.println("\nYour hand: ");
            displayHand(playerHand, false); // Show only player's cards

            System.out.println("\nDealer's hand: ");
            displayHand(dealerHand, true); // Show dealer's cards (one hidden)

            // Player's turn
            boolean playerBust = false;
            while (!playerBust) {
                System.out.print("\nDo you want to hit (h) or stand (s)? ");
                String choice = scanner.nextLine().toLowerCase();

                if ("h".equals(choice)) {
                    playerHand.add(deck.remove(0));
                    System.out.println("\nYour hand: ");
                    displayHand(playerHand, false);

                    // Check if player busts
                    if (getHandValue(playerHand) > 21) {
                        System.out.println("\nYou bust! Dealer wins.");
                        playerBust = true;
                    }
                } else if ("s".equals(choice)) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 'h' or 's'.");
                }
            }

            // Dealer's turn
            boolean dealerBust = false;
            if (!playerBust) {
                System.out.println("\nDealer's turn: ");
                displayHand(dealerHand, false); // Reveal dealer's hidden card

                while (getHandValue(dealerHand) < 17) {
                    dealerHand.add(deck.remove(0));
                    displayHand(dealerHand, false);
                    // Check if dealer busts
                    if (getHandValue(dealerHand) > 21) {
                        System.out.println("\nDealer busts! You win.");
                        dealerBust = true;
                        break;
                    }
                }

                if (!dealerBust) {
                    int playerScore = getHandValue(playerHand);
                    int dealerScore = getHandValue(dealerHand);

                    // Compare scores
                    if (playerScore > dealerScore) {
                        System.out.println("\nYou win!");
                    } else if (playerScore < dealerScore) {
                        System.out.println("\nDealer wins.");
                    } else {
                        System.out.println("\nIt's a tie.");
                    }
                }
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (y/n): ");
            String playChoice = scanner.nextLine().toLowerCase();
            if (!"y".equals(playChoice)) {
                playAgain = false;
            }
        }

        System.out.println("\nThank you for playing Blackjack!");

    }

    // Method to initialize a deck of cards
    private static List<Card> initializeDeck() {
        List<Card> deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
        return deck;
    }

    // Method to display a player's or dealer's hand
    private static void displayHand(List<Card> hand, boolean hideFirstCard) {
        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && hideFirstCard) {
                System.out.println("[Hidden]");
            } else {
                System.out.println(hand.get(i));
            }
        }
        System.out.println("Total value: " + getHandValue(hand));
    }

    // Method to calculate the value of a hand
    private static int getHandValue(List<Card> hand) {
        int value = 0;
        boolean hasAce = false;
        for (Card card : hand) {
            value += card.getRank().getValue();
            if (card.getRank() == Rank.ACE) {
                hasAce = true;
            }
        }
        // If hand value is over 21 and there's an Ace, treat Ace as 1 instead of 11
        if (hasAce && value > 21) {
            value -= 10;
        }
        return value;
    }

    // Enum for card suits
    private enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    // Enum for card ranks and values
    private enum Rank {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(10), QUEEN(10), KING(10), ACE(11);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    // Class representing a card
    private static class Card {
        private final Rank rank;
        private final Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public Rank getRank() {
            return rank;
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }
}
