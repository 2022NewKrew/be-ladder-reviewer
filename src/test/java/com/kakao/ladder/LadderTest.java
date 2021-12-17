package com.kakao.ladder;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author tom.kang
 * @since 2021.12.17
 */
public class LadderTest {

    @Test public void generateRow() {
        String serialized = Ladder.generateRow(1000).stream().map(x -> x ? "O" : "X").collect(Collectors.joining(""));
        assertFalse("사다리의 가로 라인은 연속으로 올 수 없다.", serialized.matches("^.*OO.*$"));
    }

    @Test public void displayRow() {
        assertEquals("사다리 열 출력이 예상과 동일해야 한다.", Ladder.displayRow(List.of(true, false)), "|-| |");
    }

    @Test public void ladder() {
        String displayed = new Ladder(3, 5).display();
        assertTrue("랜덤으로 생성된 사다리가 예상 패턴에 일치해야 한다.", displayed.matches("^(\\|([ \\-]\\|){2}(\n|$)){5}"));
    }
}
