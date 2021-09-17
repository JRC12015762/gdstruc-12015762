package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Player> playerList = new ArrayList<>();
//
//        playerList.add(new Player(1, "Candice", 100));
//        playerList.add(new Player(2, "Dragon", 205));
//        playerList.add(new Player(3, "Lee", 34));

//        System.out.println(playerList.get(1));

// this adds an element in the list in index 2
//        playerList.add(2, new Player(123, "Jamal", 55));

//        playerList.remove(2);

//        System.out.println(playerList.contains(new Player(2, "Dragon", 205)));
//        System.out.println(playerList.indexOf(new Player(2, "Dragon", 205)));

//        playerList.forEach(player -> System.out.println(player));

//        for (Player p: playerList)
//        {
//            System.out.println(p);
//        }

        Player Candice = new Player(1, "Candice", 100);
        Player Dragon = new Player(2, "Dragon", 205);
        Player Lee = new Player(3, "Lee", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(Candice);
        playerLinkedList.addToFront(Dragon);
        playerLinkedList.addToFront(Lee);

//        playerLinkedList.removeFront(); //removes front node

        String containsResult = playerLinkedList.containsPlayer(Candice); //contains
        System.out.println(containsResult);

        String indexOfResult = playerLinkedList.indexOfPlayer(Dragon); //indexof
        System.out.println(indexOfResult);

        playerLinkedList.printList();
//        playerLinkedList.printPrevious();

    }
}
