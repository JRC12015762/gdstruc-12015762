package com.jerichocalica;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class Main {

    public static void main(String[] args) {



    }

    public static void humanCommands () {

        TestHuman human1 = new TestHuman("Chris Chan", 69, 420); //just like a function ormethod
        TestHuman human2 = new TestHuman("Ben Dover", 123, 1000);

        System.out.println(human1.name);

        human2.eat();

    }

    public static void classObject () {

        TestClass JRC = new TestClass();
        TestClass Jeko = new TestClass();

        System.out.println(JRC.name);

        JRC.code();
    }

    public static void statementMethod() {

        String bruh = "bruh";
        String brah = "brah";
        int bazinga = 1337;

        helloMethod(bruh, brah, bazinga); //order matters

        int x = 1;
        int y = 2;

        int z = numbersAddMethod(x, y);
        System.out.println(z);
    }

    static void helloMethod(String bruh, String brah, int bazinga) { //order matters
        System.out.println("Hello " + bruh + ", are you " + bazinga + "?");
    }

    static int numbersAddMethod(int x, int y){
        return x + y;
    }

    public static void array2d() {

        String[][] funnyDotJpeg = new String[3][3];

        //first size is x, the second size is y,
        //it doesn't actually, but it's easier to label them as such
        funnyDotJpeg[0][0] = "damedane";
        funnyDotJpeg[0][1] = "kiryukill";
        funnyDotJpeg[0][2] = "majima";
        funnyDotJpeg[1][0] = "mungo";
        funnyDotJpeg[1][1] = "mongo";
        funnyDotJpeg[1][2] = "peace";
        funnyDotJpeg[2][0] = "indian";
        funnyDotJpeg[2][1] = "japanese";
        funnyDotJpeg[2][2] = "korean";

        for(int i = 0; i < funnyDotJpeg.length; i++) {
            System.out.println();
            //loops the thing a number of times according to the array's x size which is labelled as i

            for(int j = 0; j < funnyDotJpeg[i].length; j++) {
                System.out.print(funnyDotJpeg[i][j] + " "); //where we labeled the x and y values as i and j respectively
                //prints 0,0 and then 0,1 and then 0,2
                //it loops because of the first loop and then prints 1,0 and then 1,1 and so on
                //it increments j as long as the size of j is smaller than the maximum size of i
                //when the second loop is done, it redeclares j as 0 and loops until the first loop is satisfied
            }
        }

        //declare values within the declaration line

        String[][] funnyDotJpeg2 = {
                {"damedane", "kiryukill", "majima"},
                {"mungo", "mongo", "peace"},
                {"indian", "japanese", "korean"}
        };
    }

    public static void array() {

        String[] goodStuff = {"Grass", "Sugar", "Mentos"};
        //replaces element in array
        //goodStuff[0] = "Jenga";

        //declare size of array and declare each element individually
        String[] balls = new String[3];
        balls[0] = "Compressed";
        balls[1] = "Stretched";
        balls[2] = "Tortured";

        System.out.println(goodStuff[0]);
    }

    public static void statementLoop () {

        Scanner scanner = new Scanner(System.in);
        String gangName = "";

        while(gangName.isBlank()) {

            System.out.println("Which group do you belong to? ");
            gangName = scanner.nextLine();
        }

        System.out.println(gangName + ", huh? Coward.");

        //while loop checks condition first then executes code
        //do while loop always executes the code once then checks the condition
        //for loop will execute code a number of times
    }

    public static void statementSwitch() {

        String fart = "Wet";
        //this is an enhanced switch
        switch (fart) {
            case "Air" -> System.out.println("That's clean.");
            case "Shart" -> System.out.println("Oh no.");
            case "Wet" -> System.out.println("F");
        }
        // under here is a classic switch statement
//        switch(fart) {
//            case "Air":
//                System.out.println("That's clean.");
//                break;
//            case "Shart":
//                System.out.println("Oh no.");
//                break;
//            case "Wet":
//                System.out.println("F");
//                break;
//        }
    }

    public static void statementIf() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your age? ");
        int age = scanner.nextInt();

        if(age >= 60) {
            System.out.println("boomer");
        }
        else if(age >= 18) {
            System.out.println("You can make an OnlyFans account.");
        }
        else{
            System.out.println("Goo goo ga ga");
        }
    }

    public static void randomStuff() {

        Random rng = new Random();

        int die6 = rng.nextInt(6) + 1;
        double percentage = rng.nextDouble();
        boolean YayNay = rng.nextBoolean();

        System.out.println("Six-Sided Die: " + die6);
        System.out.println("Random Percent: " + percentage);
        System.out.println("Coin Flip: " + YayNay);
    }

    public static void GUI() {

        String option1 = JOptionPane.showInputDialog("What are you?");
        JOptionPane.showMessageDialog(null, "Hello " + option1);

        int option2 = Integer.parseInt(JOptionPane.showInputDialog("How many friends do you have?"));
        JOptionPane.showMessageDialog(null, "Wow, " + option2 + " friends is something.");

        double option3 = Double.parseDouble(JOptionPane.showInputDialog("What's the value of pi?"));
        JOptionPane.showMessageDialog(null, option3 + " is wrong. You missed a few decimals.");
    }

    public static void printNuts() {

        String epic = "deez";
        String phrase = "nuts";

        System.out.println(epic + " " + phrase);
    }

    public static void InputOutput() {

        Scanner scanner = new Scanner(System.in); //initialize the scanner

        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

        System.out.println("What's your dong size? ");
        int size = scanner.nextInt();
        System.out.println("A good "+ size + " inches.");

        scanner.nextLine(); //resets the scanner
        System.out.println("What are your balls? ");
        String balls = scanner.nextLine();
        System.out.println("Your balls are "+ balls);

        scanner.close(); //closes the scanner
    }
}
