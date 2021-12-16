package ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
  public Integer persons;
  public Integer ladderHeight;
  public List<List<Boolean>> footholds;

  public Ladder(Integer persons, Integer ladderHeight) {
    this.persons = persons;
    this.ladderHeight = ladderHeight;
    this.footholds = new ArrayList<>();
    for (int row = 0; row < ladderHeight; row++) {
      footholds.add(generateRow(persons));
    }
  }

  private static List<Boolean> generateRow(Integer persons) {
    List<Boolean> row = new ArrayList<>();
    for (int column = 0; column < persons - 1; column++) {
      row.add(Math.random() > 0.5);
    }
    return row;
  }

  public static Ladder generate(Integer persons, Integer ladderHeight) {
    return new Ladder(persons, ladderHeight);
  }
}
