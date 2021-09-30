package com.gdstruc.midterms;
import java.util.EmptyStackException;

public class PlayerDeck { //array stack

    private Cards[] deck;
    private Cards[] hand;
    private Cards[] discard;
    private int top;
    private int handTop;
    private int discardTop;
    PlayerHand playerHand = new PlayerHand(10);

    public PlayerDeck(int capacity)
    {
        deck = new Cards[capacity];
        hand = new Cards [capacity];
        discard = new Cards [capacity];
    }

    public void push(Cards cards)
    {
        if (top == deck.length) // if deck is full, resize array
        {
            Cards[] newStack = new Cards[2 * deck.length];
            System.arraycopy(deck, 0, newStack, 0, deck.length);
            deck = newStack;
        }

        deck[top++] = cards;
//        System.out.println(top);
    }

    public Cards pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Cards poppedCards = deck[--top];
        deck[top] = null;
        return poppedCards;
    }

    public Cards peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return deck[top - 1];
    }

    public boolean isEmpty()
    {
        return top == 0;
    }

    public void printStack()
    {
        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(deck[i]);
        }
    }

    public void draw (int randomDraw)
    {

        while (randomDraw > top) //safety net in case it tries to get cards beyond what the deck has
        {
            randomDraw--;
        }

        for (int j = randomDraw; j > 0; j--) //runs a number of times according to randomDraw
        {
            if (handTop == hand.length) // if hand is full, resize array
            {
                Cards[] newStack = new Cards[2 * hand.length];
                System.arraycopy(hand, 0, newStack, 0, hand.length);
                hand = newStack;
            }

            hand[handTop++] = deck[top - 1]; //the first drawn card will be in hand[0]
            pop();
        }

    }

    public void discard (int randomDiscard)
    {

        while (randomDiscard > handTop) //safety net in case it tries to get cards beyond what the deck has
        {
            randomDiscard--;
        }

        for (int j = randomDiscard; j > 0; j--) //runs a number of times according to randomDiscard
        {
            if (discardTop == discard.length) // if hand is full, resize array
            {
                Cards[] newStack = new Cards[2 * discard.length];
                System.arraycopy(discard, 0, newStack, 0, discard.length);
                discard = newStack;
            }

            discard[discardTop++] = hand[handTop - 1]; //the first drawn card will be in discard[0]
            popHand();
        }

    }

    public void retrieve (int randomRetrieve)
    {

        while (randomRetrieve > discardTop) //safety net in case it tries to get cards beyond what the deck has
        {
            randomRetrieve--;
        }

        for (int j = randomRetrieve; j > 0; j--) //runs a number of times according to randomRetrieve
        {
            if (handTop == hand.length) // if hand is full, resize array
            {
                Cards[] newStack = new Cards[2 * hand.length];
                System.arraycopy(hand, 0, newStack, 0, hand.length);
                hand = newStack;
            }

            hand[handTop++] = discard[discardTop - 1];
            popDiscard();
        }

    }

    public Cards peekHand()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return hand[handTop - 1];
    }

    public Cards peekDiscard()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return discard[discardTop - 1];
    }

    public Cards popHand()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Cards poppedCards = hand[--handTop];
        hand[handTop] = null;
        return poppedCards;
    }

    public Cards popDiscard()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Cards poppedCards = discard[--discardTop];
        discard[discardTop] = null;
        return poppedCards;
    }

    public void displayInfo ()
    {

        System.out.println("Current Hand: " + handTop);
        for (int i = handTop; i > 0; i--)
        {
            int j = 0;
            System.out.println(hand[i - 1]);
        }

        System.out.println("Cards in the deck: " + top);
        System.out.println("Discarded cards: " + discardTop);

    }

    public int getDeckTop ()
    {

        return top;

    }

}
