package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size = 0;

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;

        size++; //increments size when a player is added
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer().getName());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("List Size: " + size);
    }

    public void printPrevious() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer().getName());
            System.out.print("(" + current.getPreviousPlayer().getPlayer().getName() + ")");
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("List Size: " + size);

    }

    public void removeFront () { //remove method
        head = head.getNextPlayer();
        size--; //decrements size when a player is removed
    }

    public String containsPlayer (Player player) { //checks if player given in Main equals the head using their names
        PlayerNode current = head;
        for (int i = 0; i < size; i++) { //repeats a number of times equal to the size established earlier
            if (current.getPlayer().getName() == player.getName()) {
                return "The player " + player.getName() + " exists in the list!";

            }
            else {
                current = current.getNextPlayer();

            }
        }
        return "Player does not exist in the list.";

    }

    public String indexOfPlayer (Player player) { //checks the player's index
        PlayerNode current = head;
        for (int i = 0; i < size; i++) {
            if (current.getPlayer().getName() == player.getName()) {
                return player.getName() + "'s index is " + i + ".";

            }
            else {
                current = current.getNextPlayer();

            }
        }
        return "Player given does not exist.";

    }
}
