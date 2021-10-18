package com.gdstruc.module6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ///Gachalica

        Random rng = new Random();
        int arrGivenSize = rng.nextInt(100) + 1; //determines Given's size
        int targetElementChooser = rng.nextInt(arrGivenSize); //determines the target element

        int[] Given = new int[arrGivenSize];
        int[] Choice = new int [arrGivenSize];

        int Pity = 0; //acts as a counter too

        for (int i = 0; i < Given.length; i++) //fills Given with values
        {
            int RandomValue = rng.nextInt(1001);
            Given[i] = RandomValue;
        }

        for (int i = 0; i < Choice.length; i++) //fills Choices with values equal to the index
        {
            Choice[i] = i;
        }

        int targetElement = Given[targetElementChooser];

//        printGiven(Given);
//        printChoice(Choice);

        for (int i = 0; i == 0;)
        {
            Pity++;

            int arrChoiceIndexChooser = rng.nextInt(Choice.length); //generates an index to choose an available choice from Choice

            do
            {
                arrChoiceIndexChooser = rng.nextInt(Choice.length); //reroll
            } while (Choice[arrChoiceIndexChooser] == -1);

            int chosenElement = Given[Choice[arrChoiceIndexChooser]];

            if (chosenElement == targetElement)
            {
                i = 1;
            }

            if (Pity >= 90)
            {
                Choice[arrChoiceIndexChooser] = -1; //start eliminating choices
            }
        }

        if (Pity >= 90)
        {
            System.out.println("\nPity Activated");
        }
        System.out.println("\nArray Given Size: " + arrGivenSize);
        System.out.println("Target Element " + targetElement + " found at index " + targetElementChooser);
        System.out.println("Attempts Made: " + Pity);
        System.out.println("Ending Program");

        printChoice(Choice);

    }

    public static void printGiven(int[] Given)
    {
        for (int value : Given)
        {
            System.out.println(value);
        }
    }

    public static void printChoice(int[] Choice)
    {
        for (int value : Choice)
        {
            System.out.println(value);
        }
    }
}
