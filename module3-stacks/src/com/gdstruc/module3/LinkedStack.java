package com.gdstruc.module3;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Friends> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Friends>();
    }

    public void push(Friends friends)
    {
        stack.push(friends);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Friends peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Friends> iterator = stack.listIterator();

        System.out.println("Printing stack: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
