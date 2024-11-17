package cardbattleroyale.model.rules;

public class BattleRulesFactory {

  public DefaultBattleStrategy getDefaultBattleRule() {
    return new BasicBattleStrategy();
  }

  public DefendBattleStrategy getDefendBattleRule() {
    return new DefendBattleStrategy();
  }

  public AttackBattleStrategy getAttackBattleRule() {
    return new AttackBattleStrategy();
  }

}