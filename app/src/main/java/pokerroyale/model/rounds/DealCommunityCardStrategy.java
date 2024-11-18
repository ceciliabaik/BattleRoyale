package pokerroyale.model.rounds;

import java.util.List;

import pokerroyale.model.Card;
import pokerroyale.model.Deck;
import pokerroyale.model.Player;

public class DealCommunityCardStrategy implements DealCardStrategy {
  private List<Card> communityCards;

  @Override
  public boolean doDeal(Deck deck, List<Player> players) {
    Card card = deck.drawCard();
    card.flip();
    communityCards.add(card);
    return true;
  }
}
