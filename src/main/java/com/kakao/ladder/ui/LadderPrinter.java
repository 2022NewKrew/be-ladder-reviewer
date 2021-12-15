package com.kakao.ladder.ui;

import com.kakao.ladder.model.Ladder;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

public class LadderPrinter {
    private final PrintStream out;
    private final String LINE = "|";
    private final String BRIDGE = "-";
    private final String EMPTY = " ";

    private LadderPrinter(PrintStream out) {
        this.out = out;
    }

    public static LadderPrinter system() {
        return new LadderPrinter(System.out);
    }

    public static LadderPrinter of(OutputStream out) {
        return new LadderPrinter(new PrintStream(out));
    }

    /*
     * print msg
     */
    public void printMessage(String msg) {
        out.println(msg);
    }

    public void printError(String error) {
        out.println("[ERROR] " + error);
    }

    /*
     * print ladder
     */
    public void printLadder(Ladder ladder) {
        for(Stream<Boolean> bridges : ladder) {
            out.print(LINE);
            bridges.forEach((hasBridge) -> {
                out.print(hasBridge ? BRIDGE : EMPTY);
                out.print(LINE);
            });
            out.println();
        }
    }
}
