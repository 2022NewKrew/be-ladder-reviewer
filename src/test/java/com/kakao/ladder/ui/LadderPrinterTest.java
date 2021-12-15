package com.kakao.ladder.ui;

import com.kakao.ladder.TestBuilder;
import com.kakao.ladder.TestBuilder.OutputManger;
import com.kakao.ladder.model.Ladder;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderPrinterTest {
    private final OutputManger out = new OutputManger();
    private final LadderPrinter printer = TestBuilder.newLadderPrinter(out);

    @Test
    public void testOneLine() throws IOException {
        Ladder ladder = new Ladder.Builder(3, 1)
                .addRow(false, true)
                .build();

        printer.printLadder(ladder);

        assertEquals("| |-|\n", out.getOutput());
    }

    @Test
    public void testMultiLine() throws IOException {
        Ladder ladder = new Ladder.Builder(3, 4)
                .addRow(false, true)
                .addRow(true, false)
                .addRow(false, false)
                .addRow(true, true)
                .build();

        printer.printLadder(ladder);

        String expected =
                "| |-|\n" +
                "|-| |\n" +
                "| | |\n" +
                "|-|-|\n";

        assertEquals(expected, out.getOutput());
    }
}
