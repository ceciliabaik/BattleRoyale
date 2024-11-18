package pokerroyale.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
  private List<Card> cards;

  public Hand() {
    this.cards = new ArrayList<>();
  }

  public List<Card> getCards() {
    return cards;
  }

  public int getHandValue() {
    int sum = 0;
    for (Card card: cards) {
      sum += card.getValue();
    }
    return sum;
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
