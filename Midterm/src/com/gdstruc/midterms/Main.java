package com.gdstruc.midterms;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int turnCounter = 0;

        PlayerDeck playerDeck = new PlayerDeck(10);

//        Cards Circle1 = new Cards("1 of Circles", 1);
//        Cards Circle2 = new Cards("2 of Circles", 2);
//        Cards Circle3 = new Cards("3 of Circles", 3);
//        Cards Circle4 = new Cards("4 of Circles", 4);
//        Cards Circle5 = new Cards("5 of Circles", 5);
//        Cards Circle6 = new Cards("6 of Circles", 6);
//        Cards Circle7 = new Cards("7 of Circles", 7);
//        Cards Circle8 = new Cards("8 of Circles", 8);
//        Cards Circle9 = new Cards("9 of Circles", 9);
//        Cards Circle10 = new Cards("10 of Circles", 10);
//        Cards Triangle1 = new Cards("1 of Triangle", 11);
//        Cards Triangle2 = new Cards("2 of Triangle", 12);
//        Cards Triangle3 = new Cards("3 of Triangle", 13);
//        Cards Triangle4 = new Cards("4 of Triangle", 14);
//        Cards Triangle5 = new Cards("5 of Triangle", 15);
//        Cards Triangle6 = new Cards("6 of Triangle", 16);
//        Cards Triangle7 = new Cards("7 of Triangle", 17);
//        Cards Triangle8 = new Cards("8 of Triangle", 18);
//        Cards Triangle9 = new Cards("9 of Triangle", 19);
//        Cards Triangle0 = new Cards("10 of Triangle", 20);
//        Cards Squares1 = new Cards("1 of Squares", 21);
//        Cards Squares2 = new Cards("2 of Squares", 22);
//        Cards Squares3 = new Cards("3 of Squares", 23);
//        Cards Squares4 = new Cards("4 of Squares", 24);
//        Cards Squares5 = new Cards("5 of Squares", 25);
//        Cards Squares6 = new Cards("6 of Squares", 26);
//        Cards Squares7 = new Cards("7 of Squares", 27);
//        Cards Squares8 = new Cards("8 of Squares", 28);
//        Cards Squares9 = new Cards("9 of Squares", 29);
//        Cards Squares10 = new Cards("10 of Squares", 30);

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
