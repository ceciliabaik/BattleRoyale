package cardbattleroyale.model;

import java.util.Random;

import cardbattleroyale.model.rules.AttackBattleStrategy;
import cardbattleroyale.model.rules.DefaultBattleStrategy;
import cardbattleroyale.model.rules.BattleRulesFactory;
import cardbattleroyale.model.rules.BattleStrategy;
import cardbattleroyale.model.rules.DefendBattleStrategy;

public class ComputerPlayer extends Player {
  private DefaultBattleStrategy defaultBattleRule;
  private DefendBattleStrategy defendBattleRule;
  private AttackBattleStrategy attackBattleRule;
  private Random random;

  public ComputerPlayer(String name, Hand hand, BattleRulesFactory factory) {
    super(name, hand);
    defaultBattleRule = factory.getDefaultBattleRule();
    defendBattleRule = factory.getDefendBattleRule();
    attackBattleRule = factory.getAttackBattleRule();
    random = new Random();
  }

  @Override
  public void takeTurn(Deck deck, Dice dice) {
    int strategyChoice = random.nextInt(3);

     BattleStrategy selectedStrategy;
    switch (strategyChoice) {
      case 0:
        selectedStrategy = defaultBattleRule;
        break;
      case 1:
        selectedStrategy = defendBattleRule;
        break;
      case 2:
        selectedStrategy = attackBattleRule;
        break;
      default:
        selectedStrategy = defaultBattleRule;
        break;
    }

    boolean result = selectedStrategy.playCard(getHand(), getOpponentHand());
    System.out.println(getName() + " played a card: " + result);
  }

  private Hand getOpponentHand() {
    return new Hand();
  }
}
