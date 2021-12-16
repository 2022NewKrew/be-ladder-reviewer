package com.gyuyeol.ladder.ui;

import com.gyuyeol.ladder.model.LadderLine;
import com.gyuyeol.ladder.model.LadderLines;

import java.util.List;
import java.util.Scanner;

public class LadderGameUI {
    private static final Scanner scanner = new Scanner(System.in);

    public int getPlayerCount() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return getNumber();
    }

    public int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return getNumber();
    }

    private int getNumber() {
        return Integer.parseInt(scanner.nextLine());
    }

    public void drawResult(int playerCount, int ladderHeight, LadderLines ladderLines) {
        int ladderLineCountOfRow = (playerCount - 1);

        for (int rowIndex = 0; rowIndex < ladderHeight; rowIndex++) {
            drawRow(ladderLines.getLadderLines(), ladderLineCountOfRow, rowIndex);
        }
    }

    private void drawRow(List<LadderLine> ladderLines, int ladderLineCountOfRow, int rowIndex) {
        System.out.print("|");

        for (int columnIndex = 0; columnIndex < ladderLineCountOfRow; columnIndex++) {
            LadderLine ladderLine = ladderLines.get((rowIndex * ladderLineCountOfRow) + columnIndex);
            String lineString = getLineString(ladderLine.movable());
            System.out.print(lineString);
            System.out.print("|");
        }
        System.out.println();
    }

    private String getLineString(boolean movable) {
        if (movable) {
            return "-";
        }

        return " ";
    }
}
