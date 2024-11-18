package pokerroyale.model.rounds;

import java.util.List;

import pokerroyale.model.Deck;
import pokerroyale.model.Player;

public class DealHoleCardsStrategy implements DealCardStrategy {

  @Override
  public boolean doDeal(Deck deck, List<Player> players) {
    for (Player player : players) {
      player.addCard(deck.drawCard());
      player.addCard(deck.drawCard());
    }
    return true;
  }
}
