package cardbattleroyale.model;

public interface PlayerAction {
  void takeTurn(Deck deck, Dice dice);
}