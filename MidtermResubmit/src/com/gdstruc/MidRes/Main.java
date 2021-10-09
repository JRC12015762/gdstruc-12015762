package com.gdstruc.MidRes;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int turnCounter = 0;
        CardStack deck = new CardStack(10);
        CardStack hand = new CardStack(10);
        CardStack discard = new CardStack(10);
        Card Circle1 = new Card("1 of Circles", 1);
        Card Circle2 = new Card("2 of Circles", 2);
        Card Circle3 = new Card("3 of Circles", 3);
        Card Circle4 = new Card("4 of Circles", 4);
        Card Circle5 = new Card("5 of Circles", 5);
        Card Circle6 = new Card("6 of Circles", 6);
        Card Circle7 = new Card("7 of Circles", 7);
        Card Circle8 = new Card("8 of Circles", 8);
        Card Circle9 = new Card("9 of Circles", 9);
        Card Circle10 = new Card("10 of Circles", 10);
        Card Triangle1 = new Card("1 of Triangle", 11);
        Card Triangle2 = new Card("2 of Triangle", 12);
        Card Triangle3 = new Card("3 of Triangle", 13);
        Card Triangle4 = new Card("4 of Triangle", 14);
        Card Triangle5 = new Card("5 of Triangle", 15);
        Card Triangle6 = new Card("6 of Triangle", 16);
        Card Triangle7 = new Card("7 of Triangle", 17);
        Card Triangle8 = new Card("8 of Triangle", 18);
        Card Triangle9 = new Card("9 of Triangle", 19);
        Card Triangle10 = new Card("10 of Triangle", 20);
        Card Square1 = new Card("1 of Squares", 21);
        Card Square2 = new Card("2 of Squares", 22);
        Card Square3 = new Card("3 of Squares", 23);
        Card Square4 = new Card("4 of Squares", 24);
        Card Square5 = new Card("5 of Squares", 25);
        Card Square6 = new Card("6 of Squares", 26);
        Card Square7 = new Card("7 of Squares", 27);
        Card Square8 = new Card("8 of Squares", 28);
        Card Square9 = new Card("9 of Squares", 29);
        Card Square10 = new Card("10 of Squares", 30);
        deck.push(Circle1);
        deck.push(Circle2);
        deck.push(Circle3);
        deck.push(Circle4);
        deck.push(Circle5);
        deck.push(Circle6);
        deck.push(Circle7);
        deck.push(Circle8);
        deck.push(Circle9);
        deck.push(Circle10);
        deck.push(Triangle1);
        deck.push(Triangle2);
        deck.push(Triangle3);
        deck.push(Triangle4);
        deck.push(Triangle5);
        deck.push(Triangle6);
        deck.push(Triangle7);
        deck.push(Triangle8);
        deck.push(Triangle9);
        deck.push(Triangle10);
        deck.push(Square1);
        deck.push(Square2);
        deck.push(Square3);
        deck.push(Square4);
        deck.push(Square5);
        deck.push(Square6);
        deck.push(Square7);
        deck.push(Square8);
        deck.push(Square9);
        deck.push(Square10);

        for (int i = 1; i > 0;) //infinite loop until deck is empty
        {
            Random rng = new Random();
            int commandValue = rng.nextInt(3);
            int randomAction = rng.nextInt(5) + 1;
            switch (commandValue) {
                case 0 -> //draw cards
                        draw(randomAction, deck, hand);
                case 1 -> //discard cards
                        discard(randomAction, hand, discard);
                case 2 -> //get cards from discard pile
                        retrieve(randomAction, discard, hand);
            }
            displayInfo(deck, hand, discard);
            System.out.println("\nPress Enter for next turn...");
            new java.util.Scanner(System.in).nextLine(); //pauses console
            if (deck.getTop() < 1) //break loop if deck is empty
            {
                i--;
            }
            turnCounter++;
        }
        System.out.println("End of program. All cards in the deck are gone.");
        System.out.println("Number of turns taken: " + turnCounter);
    }

    public static void draw(int randomAction, CardStack deck, CardStack hand)
    {
        while (randomAction > deck.getTop()) //safety net in case it tries to get cards beyond what the stack in question has
        {
            randomAction--;
        }
        System.out.println("You randomly draw " + randomAction + " cards!");
        for (int i = 0; i < randomAction; i++)
        {
            hand.push(deck.pop());
        }
    }

    public static void discard(int randomAction, CardStack hand, CardStack discard)
    {
        if (randomAction > hand.getTop()) //safety net in case it tries to get cards beyond what the stack in question has
        {
            System.out.println("No cards to discard.");
        }
        else
        {
            System.out.println("You randomly discard " + randomAction + " cards!");
            for (int i = 0; i < randomAction; i++) {
                discard.push(hand.pop());
            }
        }
    }

    public static void retrieve(int randomAction, CardStack discard, CardStack hand)
    {
        if (randomAction > discard.getTop()) //safety net in case it tries to get cards beyond what the deck has
        {
            System.out.println("No cards to retrieve.");
        }
        else
        {
            System.out.println("You randomly retrieve " + randomAction + " cards!");
            for (int i = 0; i < randomAction; i++) {
                hand.push(discard.pop());
            }
        }
    }

    public static void displayInfo(CardStack deck, CardStack hand, CardStack discard)
    {
        for (int i = hand.getTop(); i > 0; i--)
        {
            System.out.println(hand.getStack()[i - 1]);
        }
        System.out.println("Cards in the deck: " + deck.getTop());
        System.out.println("Discarded cards: " + discard.getTop());
    }

}
