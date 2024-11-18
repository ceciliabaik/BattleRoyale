package pokerroyale.model;

import pokerroyale.model.enums.Color;
import pokerroyale.model.enums.Value;

public class Chip {
  private Color color;
  private Value value;

  public Chip(Color color, Value value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return color;
  }

  public Value getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Chip{color=" + color + ", value=" + value + "}";
  }
}
