package ladder.application.port.in;

import ladder.application.port.out.LadderOut;

public interface LadderGame {
  void outLadder();

  void setLadderOut(LadderOut ladderOut);
}
