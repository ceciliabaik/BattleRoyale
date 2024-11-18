package pokerroyale.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import prngtoolkit.factories.GeneratorFactory;
import prngtoolkit.generators.DeckShuffleGenerator;

import pokerroyale.model.enums.Suit;
import pokerroyale.model.enums.Rank;

public class Deck {
  private List<Card> cards;
  private DeckShuffleGenerator<Card> generator;
  Random random;
  GeneratorFactory factory;

  public Deck() {
    this.cards = new ArrayList<>();
    initializeDeck();
    this.generator = factory.createDeckShuffleGenerator(random, cards);
  }

  private void initializeDeck() {
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        addCard(suit, rank);
      }
    }
  }

  private void addCard(Suit suit, Rank rank) {
    cards.add(new Card(suit, rank));
  }

  public void shuffle() {
    generator.shuffleDeck();
  }

  public Card drawCard() {
    if (cards.isEmpty()) {
      throw new IllegalStateException("The deck is empty. Cannot draw a card.");
    }
    return removeTopCard();
  }

  private Card removeTopCard() {
    return cards.remove(cards.size() -1);
  }

  public List<Card> getShuffledDeck() {
    return generator.getShuffledDeck();
  }

  public void resetDeck() {
    generator.resetDeck();
  }

  public boolean isEmpty() {
    return cards.isEmpty();  
  }
}
