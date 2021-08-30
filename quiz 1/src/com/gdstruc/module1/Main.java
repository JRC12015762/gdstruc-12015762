package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 38;
        numbers[1] = 61;
        numbers[2] = 80;
        numbers[3] = 36;
        numbers[4] = 64;
        numbers[5] = 44;
        numbers[6] = 20;
        numbers[7] = 60;
        numbers[8] = 3;
        numbers[9] = 24;

        System.out.println("Bubble Sort:");
        bubbleSort(numbers);
        printArrayElements(numbers);

        System.out.println("\nSelection Sort:");
        selectionSort(numbers);
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {

            for (int i = 0; i < lastSortedIndex; i++)
            {

                if (arr[i] < arr[i + 1]) //changed the sign to less than and it makes it descending
                {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }

            }

        }

    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex]) //changed the sign to less than too
                {
                    smallestIndex = i; //changed the name so it makes sense
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {

        for (int j : arr)
        {

            System.out.println(j);

        }

    }
}
