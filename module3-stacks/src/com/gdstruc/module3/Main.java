package com.gdstruc.module3;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);

        stack.push(new Friends(1, "Aaden", 5));
        stack.push(new Friends(2, "Al", 3));
        stack.push(new Friends(3, "George", 7));
        stack.push(new Friends(4, "Griffin", 4));
        stack.push(new Friends(5, "Jason", 10));

//        System.out.println("Peeking: " + stack.peek());

        stack.printStack();

    }
}
