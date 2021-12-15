package com.kakao.talkmsg.cooper;

import org.apache.commons.collections4.ListUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

    @DisplayName(" edge가 원하는 수만큼의 random하게 list로 생성되는지 확인한다")
    @Test
    void generateRandomEdges() {
        //given
        Ladder ladder = new Ladder(5);

        //when
        List<Boolean> edges = ladder.generateRandomEdges(5);

        //then
        assertThat(edges).hasSize(4);

        //when
        List<Boolean> edges2 = ladder.generateRandomEdges(10);

        //then
        assertThat(edges2).hasSize(9);

    }

    @DisplayName("충분히 큰값을 선택하면 true, false가 섞여있는지 확인한다")
    @RepeatedTest(100)
    void generateRandomEdges_many() {
        //given
        Ladder ladder = new Ladder(2);

        //when
        List<Boolean> edges = ladder.generateRandomEdges(1000);

        //then
        assertThat(edges).contains(true).contains(false);
    }

    @DisplayName("인접한 edge가 존재하는 않는 list인지 검사")
    @Test
    void isProperEdges() {
        //given
        Ladder ladder = new Ladder(4);

        //when
        boolean actual1 = ladder.isProperEdges(Arrays.asList(false, false, false));

        //then
        assertThat(actual1).isFalse();

        //when
        boolean actual2 = ladder.isProperEdges(Arrays.asList(true, false, true));

        //then
        assertThat(actual2).isTrue();

        //when
        boolean actual3 = ladder.isProperEdges(Arrays.asList(false, false, true));

        //then
        assertThat(actual3).isTrue();
    }

    @DisplayName("인접한 edge가 존재하는 list인지 검사")
    @Test
    void isNotProperEdges() {
        //given
        Ladder ladder = new Ladder(4);

        //when
        boolean actual1 = ladder.isProperEdges(Arrays.asList(true, true, true));

        //then
        assertThat(actual1).isFalse();

        //when
        boolean actual2 = ladder.isProperEdges(Arrays.asList(true, true, false));

        //then
        assertThat(actual2).isFalse();
    }

    @DisplayName("인접하는 edge가 존재하는 않는 list를 생성")
    @RepeatedTest(100)
    void getEdges() {
        //given
        Ladder ladder = new Ladder(4);

        //when
        List<Boolean> edges = ladder.getEdges(4);

        //then
        assertThat(edges).hasSize(3);
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
    }
}