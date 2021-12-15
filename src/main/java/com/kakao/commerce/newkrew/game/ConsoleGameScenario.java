package com.kakao.commerce.newkrew.game;

import java.util.Scanner;

public abstract class ConsoleGameScenario implements GameScenario {
    protected static Scanner scanner = new Scanner(System.in);

    protected int readInt() {
        return scanner.nextInt();
    }

    protected String readString() {
        return scanner.next();
    }

    protected void printMessage(String message) {
        System.out.println(message);
    }
}
