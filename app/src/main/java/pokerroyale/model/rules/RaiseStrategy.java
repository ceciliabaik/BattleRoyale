package pokerroyale.model.rules;

import pokerroyale.model.Pot;

public class RaiseStrategy implements BetActionStrategy {

  @Override
  public boolean doAction(Pot pot, int amount) {
    return pot.addAmount(amount);
  }
}
