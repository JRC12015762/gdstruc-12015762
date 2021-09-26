package com.gdstruc.module3;

import java.util.EmptyStackException;

public class ArrayStack {
    private Friends[] stack;
    private int top;

    public ArrayStack(int capacity)
    {
        stack = new Friends[capacity];
    }

    public void push(Friends friends)
    {
        if (top == stack.length) // if stack is full, resize array
        {
            Friends[] newStack = new Friends[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = friends;
    }

    public Friends pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Friends poppedFriends = stack[--top];
        stack[top] = null;
        return poppedFriends;
    }

    public Friends peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }

}
