package pokerroyale.model;

import pokerroyale.model.enums.Rank;
import pokerroyale.model.enums.Suit;

public class Card {
  private final Suit suit;
  private final Rank rank;
  private boolean isFaceUp;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
    this.isFaceUp = false;
  }

  public Suit getSuit() {
    return isFaceUp ? suit : Suit.HIDDEN;
  }

  public Rank getRank() {
    return isFaceUp ? rank : Rank.HIDDEN;
  }

  public boolean isFaceUp() {
    return this.isFaceUp;
  }

  public int getValue() {
    switch (rank) {
      case ACE:
        return 14;
      case KING:
        return 13;
      case QUEEN:
        return 12;
      case JACK:
        return 11;
      default:
        return getNumericValue();
    }
  }

  private int getNumericValue() {
    return rank.ordinal() + 2;
  }

  public void reveal() {
    this.isFaceUp = true;
  }

  public void flip() {
    this.isFaceUp = !this.isFaceUp;
  }

  @Override
  public String toString() {
    return isFaceUp ? rank + " of " + suit : "Hidden";
  }
}
