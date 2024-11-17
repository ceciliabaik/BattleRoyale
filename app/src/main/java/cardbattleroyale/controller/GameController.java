package cardbattleroyale.controller;

import cardbattleroyale.model.Game;
import cardbattleroyale.view.ConsoleView;

public class GameController {
  private Game game;
  private ConsoleView view;

  public GameController(Game game, ConsoleView view) {
    this.game = game;
    this.view = view;
  }

  public void runGame() {
    view.displayWelcomeMessage();
    game.startGame();

    while (!game.isGameOver()) {
      view.displayPlayerTurn();
      game.playRound();
      view.displayScores();
    }

    view.displayGameOver();
  }
}
