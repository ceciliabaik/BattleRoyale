package cardbattleroyale.model;

public abstract class Player implements PlayerAction {
  protected String name;
  protected Hand hand;
  protected int score;

  public Player(String name, Hand hand) {
    this.name = name;
    this.hand = hand;
    this.score = 0;
  }

  public String getName() {
    return name;
  }

  public Hand getHand() {
    return hand;
  }

  public int getScore() {
    return score;
  }

  public int calculateScore() {
    return hand.getHandValue();
  }

  public void resetHand() {
    hand.clear();
  }

  @Override
  public abstract void takeTurn(Deck deck, Dice dice);
}
