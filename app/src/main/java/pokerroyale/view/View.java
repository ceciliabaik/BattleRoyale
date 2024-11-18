package cardbattleroyale.view;

public interface View {
    void displayWelcomeMessage();
    void displayPlayerTurn(String playerName);
    void displayGameOver(String playerName);
    void showInstructions();
    void displayScores(String playerName, int score);
}
