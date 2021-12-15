package ladder.view;

import ladder.domain.Ladder;

public class ResultView {
    public void printLadder(Ladder ladder) {
        ladder.getFloors().forEach(floor -> {
            floor.getLines().forEach(this::printLine);
            System.out.println();
        });
    }

    private void printLine(Boolean point) {
        if (point) {
            System.out.print("-|");
            return;
        }
        System.out.print(" |");
    }
}
