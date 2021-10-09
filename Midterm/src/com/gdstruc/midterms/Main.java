package com.gdstruc.midterms;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int turnCounter = 0;

        PlayerDeck playerDeck = new PlayerDeck(10);

        playerDeck.push(new Cards("1 of Circles", 1));
        playerDeck.push(new Cards("2 of Circles", 2));
        playerDeck.push(new Cards("3 of Circles", 3));
        playerDeck.push(new Cards("4 of Circles", 4));
        playerDeck.push(new Cards("5 of Circles", 5));
        playerDeck.push(new Cards("6 of Circles", 6));
        playerDeck.push(new Cards("7 of Circles", 7));
        playerDeck.push(new Cards("8 of Circles", 8));
        playerDeck.push(new Cards("9 of Circles", 9));
        playerDeck.push(new Cards("10 of Circles", 10));
        playerDeck.push(new Cards("1 of Triangles", 11));
        playerDeck.push(new Cards("2 of Triangles", 12));
        playerDeck.push(new Cards("3 of Triangles", 13));
        playerDeck.push(new Cards("4 of Triangles", 14));
        playerDeck.push(new Cards("5 of Triangles", 15));
        playerDeck.push(new Cards("6 of Triangles", 16));
        playerDeck.push(new Cards("7 of Triangles", 17));
        playerDeck.push(new Cards("8 of Triangles", 18));
        playerDeck.push(new Cards("9 of Triangles", 19));
        playerDeck.push(new Cards("10 of Triangles", 20));
        playerDeck.push(new Cards("1 of Squares", 21));
        playerDeck.push(new Cards("2 of Squares", 22));
        playerDeck.push(new Cards("3 of Squares", 23));
        playerDeck.push(new Cards("4 of Squares", 24));
        playerDeck.push(new Cards("5 of Squares", 25));
        playerDeck.push(new Cards("6 of Squares", 26));
        playerDeck.push(new Cards("7 of Squares", 27));
        playerDeck.push(new Cards("8 of Squares", 28));
        playerDeck.push(new Cards("9 of Squares", 29));
        playerDeck.push(new Cards("10 of Squares", 30));

        for (int i = 1; i > 0;) //infinite loop until player deck is empty
        {

            Random rng = new Random();
            int commandValue = rng.nextInt(3);

            switch (commandValue) {
                case 0 -> { //draw cards
                    int randomDraw = rng.nextInt(5) + 1;
                    System.out.println("You randomly draw " + randomDraw + " cards!");
                    playerDeck.draw(randomDraw);
                }
                case 1 -> { //discard cards
                    int randomDiscard = rng.nextInt(5) + 1;
                    System.out.println("You randomly discard " + randomDiscard + " cards!");
                    playerDeck.discard(randomDiscard);
                }
                case 2 -> { //get cards from discard pile
                    int randomRetrieve = rng.nextInt(5) + 1;
                    System.out.println("You randomly retrieve " + randomRetrieve + " cards!");
                    playerDeck.retrieve(randomRetrieve);
                }
            }

            playerDeck.displayInfo();
            System.out.println("\nPress Enter for next turn...");
            new java.util.Scanner(System.in).nextLine(); //pauses console

            if (playerDeck.getDeckTop() <= 0)
            {
                i--;
            }

            turnCounter++;

        }

        System.out.println("End of program. All cards in the deck are gone.");
        System.out.println("Number of turns taken: " + turnCounter);

    }

}
