package pokerroyale.model;

import java.util.List;
import java.util.ArrayList;

import pokerroyale.model.enums.Color;
import pokerroyale.model.enums.Value;

public class Pot {
  private List<Chip> chips;

  public Pot() {
    chips = new ArrayList<>();
  }

  public List<Chip> getChips() {
    return chips;
  }

  public void addChip(Chip chip) {
    chips.add(chip);
  }

  public Value getTotalAmount() {
    int sum = 0;
    for (Chip chip : chips) {
      sum += chip.getValue();
    }
    return sum;
  }

   public boolean addAmount(int amount) {
    }

  public void clear() {
    chips.clear();
  }
}
