package com.kakao.ladder;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * @author tom.kang
 * @since 2021.12.17
 */
public class GameTest {

    @Test public void askInt() {
        String question = "숫자를 입력해주세요.";
        int inputValue = 3;
        try (Scanner scan = new Scanner(new ByteArrayInputStream(String.valueOf(inputValue).getBytes()))) {
            PrintStream backup = System.out;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            Integer input = Game.askInt(question, scan);
            assertEquals("출력 값이 예상과 동일해야 한다.", out.toString(), question + "\n");
            assertEquals("입력 값이 예상과 동일해야 한다.", input.longValue(), inputValue);
            System.setOut(backup);
        }
    }
}
