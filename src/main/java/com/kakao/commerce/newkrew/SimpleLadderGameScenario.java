package com.kakao.commerce.newkrew;

import com.kakao.commerce.newkrew.game.ConsoleGameScenario;
import com.kakao.commerce.newkrew.game.LadderGame;

public class SimpleLadderGameScenario extends ConsoleGameScenario {

    @Override
    public void play() {
        printMessage("참여할 사람은 몇 명인가요?");
        int width = readInt();

        printMessage("최대 사다리 높이는 몇 개인가요?");
        int depth = readInt();

        LadderGameManager ladderGameManager = new LadderGameManager();
        LadderGame ladderGame = ladderGameManager.makeGame(width, depth);

        printMessage("");
        printMessage(ladderGame.toLadderString());
    }
}
