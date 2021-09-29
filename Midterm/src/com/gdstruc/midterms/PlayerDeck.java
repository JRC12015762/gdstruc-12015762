package com.gdstruc.midterms;
import java.util.EmptyStackException;

public class PlayerDeck { //array stack

    private Cards[] stack;
    private int top;
    PlayerHand playerHand = new PlayerHand(30);

    public PlayerDeck(int capacity)
    {
        stack = new Cards[capacity];
    }

    public void push(Cards cards)
    {
        if (top == stack.length) // if stack is full, resize array
        {
            Cards[] newStack = new Cards[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[top++] = cards;
    }

    public Cards pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Cards poppedCards = stack[--top];
        stack[top] = null;
        return poppedCards;
    }

    public Cards peek()
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

    public Cards playerTransfer ()
    {

        playerHand.push(stack[top - 1]);
        return pop();

    }


}
