package com.kakao.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LadderTest {
    @Test
    @DisplayName("사다리 정상 생성 검증")
    void create() {
        assertDoesNotThrow(() -> Ladder.of(Arrays.asList(Line.of(Arrays.asList(false, true)),
                                                         Line.of(Arrays.asList(false, false)))));
    }

    @Test
    @DisplayName("라인 정보가 빈값이거나 null인 경우 예외 발생 검증")
    void create_exception() {
        assertAll(() -> {
            assertThatIllegalArgumentException().isThrownBy(() -> Ladder.of(Collections.emptyList()));
            assertThatIllegalArgumentException().isThrownBy(() -> Ladder.of(null));
        });
    }
}
