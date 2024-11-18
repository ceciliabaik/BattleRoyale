package pokerroyale.model.rounds;

public class PokerRoundsFactory {

  public DealCommunityCardStrategy getCommunityCardRound() {
    return new DealCommunityCardStrategy();
  }

  public DealHoleCardsStrategy getHoleCardsRound() {
    return new DealHoleCardsStrategy();
  }

  public DealFlopCardsStrategy getFlopCardsRound() {
    return new DealFlopCardsStrategy();
  }
}