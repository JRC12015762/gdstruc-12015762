package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Candice", 100));
        playerList.add(new Player(2, "Dragon", 205));
        playerList.add(new Player(3, "Lee", 34));

//        System.out.println(playerList.get(1));

        playerList.add(2, new Player(123, "Jamal", 55));

        playerList.remove(2);

//        System.out.println(playerList.contains(new Player(2, "Dragon", 205)));
        System.out.println(playerList.indexOf(new Player(2, "Dragon", 205)));

//        playerList.forEach(player -> System.out.println(player));

        for (Player p: playerList)
        {
            System.out.println(p);
        }
    }
}