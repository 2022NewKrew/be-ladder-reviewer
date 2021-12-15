package com.kakao.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LineTest {
    @Test
    @DisplayName("라인 정상 생성 검증")
    void create() {
        assertDoesNotThrow(() -> Line.of(Arrays.asList(false, true, false, true)));
    }

    @Test
    @DisplayName("정보가 빈값이거나 null인 경우 예외 발생 검증")
    void create_exception() {
        assertAll(() -> {
            assertThatIllegalArgumentException().isThrownBy(() -> Line.of(Collections.emptyList()));
            assertThatIllegalArgumentException().isThrownBy(() -> Line.of(null));
        });
    }
}
