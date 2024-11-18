package pokerroyale.model;

public class Player {
  private Hand hand;
  protected int stack;
  private int currentBet;


  public Player(Hand hand) {
    this.hand = hand;
  }

  public Hand getHand() {
    return hand;
  }

  public void addCard(Card card) {
    hand.addCard(card);
  }


  public boolean placeBet(int amount) {
    if (currentBet == 0 && amount <= stack) {
      currentBet += amount;
      stack -= amount;
      return true;
    }
    return false;
  }

  public int calculate() {
    return hand.getHandValue();
  }

  public void clearHand() {
    hand.clear();
  }

  public boolean bet(int betAmount) {
    if (currentBet == 0 && betAmount <= stack) {
      return true;
    }
    return false;
  }

  public boolean raise(int amount) {
    if (currentBet == 0 && amount <= stack) {
      return true;
    }
    return false;
  }

  public boolean call(int amount) {
    if (currentBet == 0 && amount <= stack) {
      return true;
    }
    return false;
  }

  public boolean check(int amount) {
    if (currentBet == 0 && amount <= stack) {
      return true;
    }
    return false;
  }

  public boolean fold(int amount) {
    if (currentBet == 0 && amount <= stack) {
      return true;
    }
    return false;
  }
}
