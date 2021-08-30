package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 75;
        numbers[1] = 53;
        numbers[2] = 63;
        numbers[3] = 34;
        numbers[4] = 47;
        numbers[5] = 13;
        numbers[6] = 61;
        numbers[7] = 55;
        numbers[8] = 1;
        numbers[9] = 86;

        selectionSort(numbers);
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr)
    {

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {

            for (int i = 0; i < lastSortedIndex; i++)
            {

                if (arr[i] > arr[i + 1])
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
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
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
