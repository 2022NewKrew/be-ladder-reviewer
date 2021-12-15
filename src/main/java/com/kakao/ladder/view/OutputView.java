package com.kakao.ladder.view;

import com.kakao.ladder.domain.Direction;
import com.kakao.ladder.domain.Ladder;
import com.kakao.ladder.domain.LadderLine;
import com.kakao.ladder.domain.Point;

import java.util.stream.Collectors;

public class OutputView {

    private static final String VERTICAL = "ㅣ";
    private static final String HORIZON = "-";
    private static final String BLANK = " ";

    private OutputView() {
    }

    public static void drawLadder(Ladder ladder) {
        ladder.getLadderLines()
                .stream()
                .map(OutputView::ladderLineFormat)
                .forEach(System.out::println);
    }

    private static String ladderLineFormat(LadderLine ladderLine) {
        return ladderLine.getPoints()
                .stream()
                .map(Point::getDirection)
                .map(OutputView::pointLineFormat)
                .collect(Collectors.joining());
    }

    private static String pointLineFormat(Direction direction) {
        if (Direction.LEFT == direction) {
            return HORIZON + VERTICAL;
        }
        return BLANK + VERTICAL;
    }


}
