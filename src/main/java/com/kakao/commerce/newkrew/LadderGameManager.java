package com.kakao.commerce.newkrew;

import com.kakao.commerce.newkrew.game.LadderGame;
import com.kakao.commerce.newkrew.ladder.Ladder;
import com.kakao.commerce.newkrew.ladder.LadderSpecification;
import com.kakao.commerce.newkrew.ladder.RandomLadderFactory;

public class LadderGameManager {

    private static final String DEFAULT_VERTICAL_BAR = "|";
    private static final String DEFAULT_CROSS_BAR = "-";
    private static final String DEFAULT_EMPTY_CROSS_BAR = " ";

    public LadderGame makeGame(int width, int depth) {
        LadderSpecification specification = LadderSpecification.builder()
                                                               .verticalBar(DEFAULT_VERTICAL_BAR)
                                                               .crossBar(DEFAULT_CROSS_BAR)
                                                               .emptyCrossBar(DEFAULT_EMPTY_CROSS_BAR)
                                                               .width(width)
                                                               .depth(depth)
                                                               .build();

        Ladder newLadder = RandomLadderFactory.factory().make(specification);

        LadderGame ladderGame = new LadderGame(newLadder);

        return ladderGame;
    }

}
