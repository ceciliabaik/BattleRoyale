package cardbattleroyale.model;

public class Card {
  private final Suit suit;
  private final Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public Rank getRank() {
    return rank;
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

  public String toString() {
    return rank + " of " + suit;
  }
}
