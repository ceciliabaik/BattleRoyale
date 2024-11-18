package pokerroyale.model.rounds;

import java.util.List;

import pokerroyale.model.Deck;
import pokerroyale.model.Player;

public interface DealCardStrategy {
  boolean doDeal(Deck deck, List<Player> players);
}
