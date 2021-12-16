package ladder.application.port;

import ladder.application.port.in.LadderGame;
import ladder.application.port.out.LadderOut;
import ladder.domain.Ladder;

public class LadderService implements LadderGame {
  private final Ladder ladder;
  private LadderOut ladderOut;

  public LadderService(Integer persons, Integer ladderHeight) {
    this.ladder = Ladder.generate(persons, ladderHeight);
  }

  @Override
  public void outLadder() {
    ladderOut.out(ladder);
  }

  @Override
  public void setLadderOut(LadderOut ladderOut) {
    this.ladderOut = ladderOut;
  }
}
