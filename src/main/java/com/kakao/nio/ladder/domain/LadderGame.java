package com.kakao.nio.ladder.domain;

import com.kakao.nio.ladder.domain.impl.LadderImpl;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LadderGame {

    private Ladder ladder;

    private static Map<LadderItem, String> ladderPointSymbols;
    static {
        ladderPointSymbols = new HashMap<>();
        ladderPointSymbols.put(LadderItem.Bar, "|");
        ladderPointSymbols.put(LadderItem.Empty, " ");
        ladderPointSymbols.put(LadderItem.Step, "-");
    }

    public LadderGame(int numOfMembers, int height) {
        this.ladder = new LadderImpl(numOfMembers, height);
    }

    public void printLadder(PrintWriter writer) {
        LadderReader reader = this.ladder.getReader();
        List<LadderItem> line;
        while( (line = reader.readLine()) != null ) {
            line.forEach( point -> writer.print(ladderPointSymbols.get(point)));
            writer.println();
        }
        writer.flush();
    }
}
