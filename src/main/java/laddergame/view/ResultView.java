package laddergame.view;

import laddergame.domain.ladder.Ladder;
import laddergame.domain.ladder.LadderRow;

import java.util.List;

public class ResultView {

    private Ladder ladder;

    public ResultView(Ladder ladder) {
        this.ladder = ladder;
    }

    public void printLadder() {
        List<LadderRow> ladderRows = ladder.getLadderRows();

        ladderRows.forEach(ladderRow -> {
            ladderRow.forEach(System.out::print);
            System.out.println();
        });
    }

}
