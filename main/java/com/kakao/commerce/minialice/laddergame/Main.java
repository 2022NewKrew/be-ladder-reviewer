package com.kakao.commerce.minialice.laddergame;

import com.kakao.commerce.minialice.laddergame.dto.Ladder;
import com.kakao.commerce.minialice.laddergame.dto.LadderInput;
import com.kakao.commerce.minialice.laddergame.util.LadderGenerator;
import com.kakao.commerce.minialice.laddergame.util.LadderInputReader;
import com.kakao.commerce.minialice.laddergame.util.LadderPrinter;

public class Main {

    public static void main(String[] args) {
        LadderInput ladderInput = LadderInputReader.read();

        Ladder ladder = LadderGenerator.make(ladderInput);

        LadderPrinter.print(ladder);
    }
}
