package pokerroyale.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
  private Dealer dealer;
  private List<Player> players;

  public Game(int numOfPlayers) {
    dealer = new Dealer();
    players = new ArrayList<>();
  }

  public createPlayers() {
    for (int i = 0; i < numOfPlayers; i++) {
      players.add(new Player());
    }
  }
}
