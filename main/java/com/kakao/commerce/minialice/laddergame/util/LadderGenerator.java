package com.kakao.commerce.minialice.laddergame.util;

import com.kakao.commerce.minialice.laddergame.dto.Ladder;
import com.kakao.commerce.minialice.laddergame.dto.LadderBody;
import com.kakao.commerce.minialice.laddergame.dto.LadderFootboard;
import com.kakao.commerce.minialice.laddergame.dto.LadderInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LadderGenerator {
    private static final Random RANDOM = new Random();

    public static Ladder make(LadderInput ladderInput) {
        List<LadderBody> ladderBodies = new ArrayList<>();
        for (int i = 0; i < ladderInput.getLadderHeight(); i++) {
            List<LadderFootboard> ladderFootboards = makeLadderFootboards(ladderInput);
            ladderBodies.add(LadderBody.from(ladderFootboards));
        }

        return Ladder.from(ladderBodies);
    }

    private static List<LadderFootboard> makeLadderFootboards(LadderInput ladderInputInfo) {
        List<LadderFootboard> ladderFootboards = new ArrayList<>();
        boolean prevLadderLeg = false;

        for (int i = 0; i < ladderInputInfo.getFootboardAreaCount(); i++) {
            prevLadderLeg = prevLadderLeg ? false : RANDOM.nextBoolean();

            ladderFootboards.add(LadderFootboard.from(prevLadderLeg));
        }

        return ladderFootboards;
    }
}
