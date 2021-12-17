package com.kakao.ladder;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * @author tom.kang
 * @since 2021.12.17
 */
public class GameTest {

    @Test public void askInt() {
        try (Scanner scan = new Scanner(new ByteArrayInputStream("3".getBytes()))) {
            assertSame(Game.askInt("숫자를 입력해주세요.", scan), 3);
        }
    }

    @Test public void ladder() {
        String displayed = new Game(3, 5).display();
        assertTrue(displayed.matches("^(\\|([ \\-]\\|){2}(\n|$)){5}"));
    }
}
