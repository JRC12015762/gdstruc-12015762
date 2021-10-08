package com.gdstruc.module4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int gameCount = 0;
        int rngPlayerId = 1;
        ArrayQueue queue = new ArrayQueue(5);
        queue.add(new Player(0, "Admin_JerichoCalica", 100));
        System.out.println("Jericho the admin has joined!");
        new java.util.Scanner(System.in).nextLine();
        for (int i = 0; i < 1;) //loops until 10 games are made
        {
            Random rng = new Random();
            int playerMatchmaking = rng.nextInt(7) + 1;
            System.out.println(playerMatchmaking + " players have joined!");
            for (int j = playerMatchmaking; j > 0; j--)
            {
                int rngPlayerLevel = rng.nextInt(100) + 1;
                queue.add(new Player(rngPlayerId, generateString(), rngPlayerLevel));
                rngPlayerId++;
            }
            if (queue.size() >= 5)
            {
                matchFound(queue);
                gameCount++;
            }
            queue.printQueue();
            System.out.println("\nPress Enter for next turn...");
            new java.util.Scanner(System.in).nextLine();
            if (gameCount >= 10)
            {
                i = 1;
            }
        }
        System.out.println("10 games have been made. Ending program.");
    }

    public static String generateString()
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int stringLength = 10;
        for(int i = 0; i < stringLength; i++)
        {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
    }

    public static void matchFound(ArrayQueue queue)
    {
        for (int i = 0; i < 5; i++)
        {
            queue.remove();
        }
        System.out.println("Match Found!");
    }
}
