package cardbattleroyale.model.rules;

import cardbattleroyale.model.Hand;

public interface BattleStrategy {
  boolean playCard(Hand playerHand, Hand computerHand);
}
