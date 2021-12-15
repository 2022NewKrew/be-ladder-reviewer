package com.kakao.ladder.ui;

import com.kakao.ladder.TestBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderScannerTest {

    @Test
    public void testReadPlayerCount() {
        LadderScanner scanner = TestBuilder.newLadderScanner("3\n");
        int height = scanner.readHeight();
        assertEquals(3, height);
    }

    @Test
    public void testReadHeight() {
        LadderScanner scanner = TestBuilder.newLadderScanner("123\n");
        int height = scanner.readHeight();
        assertEquals(123, height);
    }
}
