package laddergame.view;

import laddergame.dto.LadderDto;

public class OutputView {
    private static final String NEW_LINE = System.lineSeparator();

    public static void printLadder(LadderDto ladderDto) {
        for (String layerOutput : ladderDto.getLadderOutput()) {
            System.out.printf("%s%s", layerOutput, NEW_LINE);
        }
    }
}
