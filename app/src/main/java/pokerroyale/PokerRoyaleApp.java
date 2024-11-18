package pokerroyale;

import pokerroyale.controller.GameController;
import pokerroyale.model.Game;
import pokerroyale.view.ConsoleView;

public class PokerRoyaleApp {
  public static void main(String[] args) {
    try {
      Game game = new Game();
      ConsoleView view = new ConsoleView();
      GameController controller = new GameController(game, view);

      controller.runGame();
    } catch (Exception e) {
        throw new RuntimeException("An error occurred while starting the game.", e);
    }
  }
}
