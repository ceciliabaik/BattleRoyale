package pokerroyale.model.rules;

import pokerroyale.model.Player;

public class BetStrategy implements BetActionStrategy {

  @Override
  public boolean doAction(Player player, int betAmount) {
    return player.getStackValue() < stack;
  }
}