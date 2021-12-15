package com.kakao.ladder.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LadderTest {

    @Test
    public void testAddRows() {
        Ladder.Builder ladder = new Ladder.Builder(5, 1);

        assertThrows(IllegalArgumentException.class, () -> ladder.addRow(true, true, false));
        assertThrows(IllegalArgumentException.class, () -> ladder.addRow(true, true, false, false, false));

        ladder.addRow(true, true, false, false);
        assertThrows(IllegalArgumentException.class, () -> ladder.addRow(true, true, false, false));
    }

    @Test
    public void testBridge() {
        Ladder ladder = new Ladder.Builder(5, 1)
                .addRow(true, true, false, false)
                .build();

        assertThrows(IllegalArgumentException.class, () -> ladder.hasBridge(1, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> ladder.hasBridge(1, 6, 5));

        assertThrows(IllegalArgumentException.class, () -> ladder.hasBridge(0, 1, 2));
        assertThrows(IllegalArgumentException.class, () -> ladder.hasBridge(2, 1, 2));

        assertTrue(ladder.hasBridge(1, 1, 2));
        assertTrue(ladder.hasBridge(1, 2, 1));

        assertTrue(ladder.hasBridge(1, 2, 3));
        assertTrue(ladder.hasBridge(1, 3, 2));

        assertFalse(ladder.hasBridge(1, 3, 4));
        assertFalse(ladder.hasBridge(1, 4, 3));

        assertFalse(ladder.hasBridge(1, 4, 5));
        assertFalse(ladder.hasBridge(1, 5, 4));
    }

}
