package pokerroyale.model.rounds;

import java.util.List;

import pokerroyale.model.Card;
import pokerroyale.model.Deck;
import pokerroyale.model.Player;

public class DealFlopCardsStrategy implements DealCardStrategy {
  private List<Card> communityCards;

  @Override
  public boolean doDeal(Deck deck, List<Player> players) {
    for (int i = 0; i < 3; i++) {
      Card card = deck.drawCard();
      card.flip();
      communityCards.add(card);
    }
    return true;
  }
}
