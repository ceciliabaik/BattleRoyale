package cardbattleroyale.view;

import cardbattleroyale.model.Player;

public class ConsoleView implements View {

  @Override
  public void displayWelcomeMessage() {
     System.out.println("Welcome to Card Battle Royale!");
  }

  @Override
  public void displayPlayerTurn(String playerName) {
    System.out.println("\nIt's " + playerName + "'s turn!");
    displayGameState();
  }

  private void displayGameState() {
    System.out.println("\n--- Current Game State ---");
    System.out.println("Player: " + player.getName());
    System.out.println("Score: " + player.getScore());
    displayHand();
    System.out.println("--------------------------");
  }

  @Override
  public void showInstructions() {
    System.out.println("\n--- Instructions ---");
    System.out.println("1. Each round, each player draws a card from the deck.");
    System.out.println("2. Both players roll a die.");
    System.out.println("3. The player with the highest card value and die roll wins the round.");
    System.out.println("4. The first player to win 3 rounds wins the game.");
    System.out.println("5. In case of a tie, the round is considered a draw.\n");
  }

  @Override
  public void displayScores(String playerName, int score) {
    System.out.println("Scores: ");
    System.out.println(playerName + " - Score: " + score);
  }

  private void displayHand() {
    if (player.getHand().isEmpty()) {
      System.out.println("Your hand is empty.");
    } else {
      System.out.println("Your hand contains:");
      player.getHand().getCards().forEach(card -> System.out.println(card));
    }
  }

  @Override
  public void displayGameOver(String playerName) {
    System.out.println("\nGame Over! " + playerName + " wins!");
  }

  public void showGameEndMessage() {
    System.out.println("Thank you for playing Card Battle Royale! Goodbye!");
  }
}
