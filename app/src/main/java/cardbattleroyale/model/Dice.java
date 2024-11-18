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

  public int getValue() {
    return value;
  }

  public int rollSingleDie() {
    value = generator.rollDie();
    return value;
  }

  public int[] rollMultipleDice(int numOfDice) {
    return generator.rollMultipleDice(numOfDice);
  }
}
