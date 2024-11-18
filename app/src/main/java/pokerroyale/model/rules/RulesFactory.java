package pokerroyale.model.rules;

public class RulesFactory {

  public BetStrategy getBetRule() {
    return new BetStrategy();
  }

  public RaiseStrategy getRaiseRule() {
    return new RaiseStrategy();
  }
}