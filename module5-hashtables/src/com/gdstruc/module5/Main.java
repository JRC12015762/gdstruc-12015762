package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        Player Jericho = new Player(1, "Jeko", 0);
        Player Ronquillo = new Player(2, "Ron", 1);
        Player Calica = new Player(3, "Cal", 2);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(Jericho.getUserName(), Jericho);
        hashtable.put(Ronquillo.getUserName(), Ronquillo);
        hashtable.put(Calica.getUserName(), Calica);

        hashtable.printHashtable();
//        System.out.println(hashtable.get("Cal"));

        hashtable.remove("Jeko");
        System.out.println(hashtable.get("Jeko"));

    }
}
