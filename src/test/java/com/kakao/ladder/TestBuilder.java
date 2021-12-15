package com.kakao.ladder;

import com.kakao.ladder.core.LadderGameRunner;
import com.kakao.ladder.core.BridgeGenerator;
import com.kakao.ladder.ui.LadderGameView;
import com.kakao.ladder.ui.LadderPrinter;
import com.kakao.ladder.ui.LadderScanner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestBuilder {
    public static LadderGameRunner newLadderGameRunner(String input, OutputManger out, BridgeGenerator generator) {
        return new LadderGameRunner(newLadderGameView(input, out), generator);
    }

    public static LadderGameView newLadderGameView(String input, OutputManger out) {
        return new LadderGameView(newLadderScanner(input), newLadderPrinter(out));
    }

    public static LadderScanner newLadderScanner(String input) {
        return LadderScanner.of(new ByteArrayInputStream(input.getBytes()));
    }

    public static LadderPrinter newLadderPrinter(OutputManger out) {
        return LadderPrinter.of(out.out);
    }

    public static class OutputManger {
        private final ByteArrayOutputStream out = new ByteArrayOutputStream();

        public String getOutput() throws IOException {
            out.flush();
            return out.toString();
        }
    }
}
