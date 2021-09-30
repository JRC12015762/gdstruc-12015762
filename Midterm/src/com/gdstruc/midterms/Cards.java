package com.gdstruc.midterms;
import java.util.Objects;

public class Cards {

    private String cardName;
    private int cardValue;

    public Cards(String cardName, int cardValue) {
        this.cardName = cardName;
        this.cardValue = cardValue;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return cardValue == cards.cardValue && Objects.equals(cardName, cards.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardName, cardValue);
    }

    @Override
    public String toString() {
        return "{" + cardName + ", Card number: " + cardValue + '}';
    }

}
