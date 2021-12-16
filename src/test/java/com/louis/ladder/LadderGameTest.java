package com.louis.ladder;

import com.louis.ladder.game.util.LadderUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderGameTest {

    @Test
    void ladderGameTest() {
        List<Integer> horizonIndexList = LadderUtils.getHorizonIndexList(8);

        assertThat(horizonIndexList).containsExactly(1, 3, 5, 7, 9, 11, 13);
    }
}
