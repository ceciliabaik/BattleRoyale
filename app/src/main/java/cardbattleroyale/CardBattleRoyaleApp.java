package cardbattleroyale;

import cardbattleroyale.controller.GameController;
import cardbattleroyale.model.Game;
import cardbattleroyale.view.ConsoleView;

public class CardBattleRoyaleApp {
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
