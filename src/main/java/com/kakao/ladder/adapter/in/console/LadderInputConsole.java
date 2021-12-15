package com.kakao.ladder.adapter.in.console;

import com.kakao.ladder.common.Preconditions;

import java.util.Scanner;

public class LadderInputConsole {
    private static final int MINIMUM_HEIGHT_SIZE = 1;
    private static final int MINIMUM_PARTICIPANT_NUMBER = 2;

    private static final String PARTICIPANT_NUMBER_MESSAGE = "참여할 사람은 몇 명인가요?";
    private static final String LADDER_HIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    private static final Scanner SCANNER = new Scanner(System.in);

    public int inputNumberOfParticipant() {
        System.out.println(PARTICIPANT_NUMBER_MESSAGE);
        int participantNumber = Integer.parseInt(SCANNER.nextLine());

        Preconditions.checkMinimumSize(participantNumber, MINIMUM_PARTICIPANT_NUMBER,
                                       String.format("사람 수는 %s 이상 이어야 합니다.", MINIMUM_PARTICIPANT_NUMBER));
        return participantNumber;
    }

    public int inputHeightOfLadder() {
        System.out.println(LADDER_HIGHT_MESSAGE);
        int heightOfLadder = Integer.parseInt(SCANNER.nextLine());

        Preconditions.checkMinimumSize(heightOfLadder, MINIMUM_HEIGHT_SIZE,
                                       String.format("사다리 높이는 %s 이상 이어야 합니다.", MINIMUM_HEIGHT_SIZE));
        return heightOfLadder;
    }


}
