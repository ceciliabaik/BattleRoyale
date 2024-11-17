package cardbattleroyale.model;

import java.util.Random;

import prngtoolkit.factories.GeneratorFactory;
import prngtoolkit.generators.DiceRollGenerator;

public class Dice {
  private DiceRollGenerator generator;
  private int value;

  public Dice(GeneratorFactory factory, Random random) {
    this.generator = factory.createDiceRollGenerator(random);
  }

  public Dice(GeneratorFactory factory, Random random, int numOfSides) {
    this.generator = factory.createDiceRollGeneratorWithCustomSides(random, numOfSides);
  }

  public int getValue() {
    return value;
  }

  public int rollSingleDie() {
    return generator.rollDie();
  }

  public int[] rollMultipleDice(int numOfDice) {
    return generator.rollMultipleDice(numOfDice);
  }
}
