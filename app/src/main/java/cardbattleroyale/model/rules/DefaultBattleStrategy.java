package cardbattleroyale.model.rules;

import cardbattleroyale.model.Hand;

public class BasicBattleStrategy implements BattleStrategy {

  @Override
  public boolean playCard(Hand playerHand, Hand computerHand) {
    return !computerHand.isEmpty();
  }
}
