package cardbattleroyale.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private List<Card> cards;

  public Hand() {
    this.cards = new ArrayList<>();
  }

  public int getHandValue() {
    int totalValue = 0;
    for (Card card: cards) {
      totalValue += card.getValue();
    }
    return totalValue;
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public void clear() {
    cards.clear();
  }

  public boolean isEmpty() {
    return cards.isEmpty();
  }
}
