package com.kakao.ladder.ui;

import java.io.InputStream;
import java.util.Scanner;

import static com.kakao.ladder.core.Validators.validateHeight;
import static com.kakao.ladder.core.Validators.validatePlayerCount;

public class LadderScanner {
    private final Scanner sc;

    private LadderScanner(Scanner sc) {
        this.sc = sc;
    }

    public static LadderScanner of(InputStream in) {
        return new LadderScanner(new Scanner(in));
    }

    public static LadderScanner system() {
        return LadderScanner.of(System.in);
    }

    public int readPlayerCount() {
        int count = readInt();
        validatePlayerCount(count);
        return count;
    }

    public int readHeight() {
        int height = readInt();
        validateHeight(height);
        return height;
    }

    /*
     * Scanner에서 nextInt 후 nextLine 호출하면
     * 입력값이 없어도 빈값이 리턴되는 문제가 있음
     * 일단 line 으로 읽고 이를 int로 파싱한다.
     */
    private int readInt() {
        return Integer.parseInt(sc.nextLine());
    }
}
