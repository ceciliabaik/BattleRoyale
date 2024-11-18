package pokerroyale.model;

import java.util.List;

public class Dealer {
  private Deck deck;
  private Pot pot;
  private List<Player> players;

  public Dealer(List<Player> players) {
    this.players = players;
    this.deck = new Deck();
    this.pot = new Pot();
  }

  public boolean newGame(Player player) {
    if (deck.isEmpty() || isGameOver()) {
      deck = new Deck();
      deck.shuffle();
      pot.clear();
      player.clearHand();
    }
    return false;
  }

  public void startBettingRound() {

  }

  public void handleBetting() {

  }

  public void awardPot() {

  }

  public void determineWinner() {

  }

  public void showDown() {

  }

  public boolean isGameOver() {
    if (!deck.isEmpty()) {
      return true;
    }
    return false;
  }
}
