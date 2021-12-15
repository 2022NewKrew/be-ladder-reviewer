package laddergame.view;

import laddergame.utils.ScannerUtils;

public final class InputView {

    private InputView() {
    }

    public static int acceptParticipants() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return ScannerUtils.nextInt();
    }

    public static int acceptMaxLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return ScannerUtils.nextInt();
    }
}
