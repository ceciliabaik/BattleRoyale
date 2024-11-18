package pokerroyale.model.rules;

import pokerroyale.model.Pot;

public interface BetActionStrategy {
  boolean doAction(Pot pot, int amount);
}
