package com.kakao.talkmsg.cooper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LadderTest {

    @DisplayName("사다리 생성")
    @Test
    void ladder() {
        Ladder ladder = new Ladder(4, 10);
        assertThat(ladder.getWidth()).isEqualTo(3);
        assertThat(ladder.getHeight()).isEqualTo(10);

    }

    @DisplayName("사다리 생성할 때 2보다 작은 사람으로 생성하는 경우 에러 발생")
    @Test
    void ladder_oneperson() {
        assertThat(new Ladder(2, 10)).isNotNull();
        assertThatThrownBy(() -> new Ladder(1, 10)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("사다리 생성할 때 높이를 0보다 작게 주는 경우 에러 발생")
    @Test
    void ladder_zeroheight() {
        assertThat(new Ladder(2, 1)).isNotNull();
        assertThatThrownBy(() -> new Ladder(2, 0)).isInstanceOf(IllegalArgumentException.class);
    }
}