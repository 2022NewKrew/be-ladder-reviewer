package ladder.adapter.out;

import ladder.application.port.out.LadderOut;
import ladder.domain.Ladder;

import java.util.List;

public class StandardOut implements LadderOut {

  private void printFoothold(Boolean foothold) {
    char footholdChar = ' ';
    if (foothold) {
      footholdChar = '-';
    }
    System.out.print(footholdChar);
  }

  private void printRow(Integer persons, List<Boolean> footholds) {
    for (int column = 0; column < persons - 1; column++) {
      System.out.print('|');
      printFoothold(footholds.get(column));
    }
    System.out.print("|\n");
  }

  @Override
  public void out(Ladder ladder) {
    for (int row = 0; row < ladder.ladderHeight; row++) {
      printRow(ladder.persons, ladder.footholds.get(row));
    }
  }
}
