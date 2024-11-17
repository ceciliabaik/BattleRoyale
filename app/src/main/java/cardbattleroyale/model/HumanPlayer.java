package cardbattleroyale.model;

public class HumanPlayer extends Player {

  public HumanPlayer(String name, Hand hand) {
    super(name, hand);
  }

  @Override
  public void takeTurn(Deck deck, Dice dice) {
  }
}
