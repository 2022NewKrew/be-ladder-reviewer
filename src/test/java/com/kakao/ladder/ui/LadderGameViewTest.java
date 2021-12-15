package com.kakao.ladder.ui;

import com.kakao.ladder.TestBuilder;
import com.kakao.ladder.TestBuilder.OutputManger;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderGameViewTest {

    @Test
    public void testRetry() throws IOException {
        OutputManger out = new OutputManger();
        LadderGameView view = TestBuilder.newLadderGameView("a\n123\n", out);

        int count = view.inputPlayers();
        assertEquals(count, 123);

        String expected = "참여할 사람은 몇 명인가요?\n" +
                "[ERROR] For input string: \"a\"\n" +
                "최대 사다리 높이는 몇 개인가요?\n";
        assertEquals(expected, out.getOutput());
    }
}
