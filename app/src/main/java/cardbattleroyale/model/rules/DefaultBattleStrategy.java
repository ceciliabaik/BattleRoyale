package cardbattleroyale.model.rules;

import cardbattleroyale.model.Hand;

public class DefaultBattleStrategy implements BattleStrategy {

  @Override
  public boolean playCard(Hand playerHand, Hand opponentHand) {
    return !opponentHand.isEmpty();
  }
}
