package com.kakao.talkmsg.cooper;

import org.apache.commons.collections4.ListUtils;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class LineTest {
    @DisplayName("라인 생성")
    @Test
    void line() {
        Line line = new Line(10);
        assertThat(line.getEdgeSize()).isEqualTo(9);
    }

    @DisplayName("라인 생성할 때 2보다 작은 사람으로 생성하는 경우 에러 발생")
    @Test
    void line_oneperson() {
        assertThat(new Line(2)).isNotNull();
        assertThatThrownBy(() -> new Line(1)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName(" edge가 원하는 수만큼의 random하게 list로 생성되는지 확인한다")
    @Test
    void generateRandomEdges() {
        //given
        Line line = new Line(5);

        //when
        List<Boolean> edges = line.generateRandomEdges(5);

        //then
        assertThat(edges).hasSize(4);

        //when
        List<Boolean> edges2 = line.generateRandomEdges(10);

        //then
        assertThat(edges2).hasSize(9);

    }

    @DisplayName("충분히 큰값을 선택하면 true, false가 섞여있는지 확인한다")
    @RepeatedTest(100)
    void generateRandomEdges_many() {
        //given
        Line line = new Line(5);

        //when
        List<Boolean> edges = line.generateRandomEdges(1000);

        //then
        assertThat(edges).contains(true).contains(false);
    }

    @DisplayName("인접한 edge가 존재하는 않는 list인지 검사")
    @Test
    void isProperEdges() {
        //given
        Line line = new Line(4);

        //when
        boolean actual1 = line.isProperEdges(Arrays.asList(false, false, false));

        //then
        AssertionsForClassTypes.assertThat(actual1).isFalse();

        //when
        boolean actual2 = line.isProperEdges(Arrays.asList(true, false, true));

        //then
        AssertionsForClassTypes.assertThat(actual2).isTrue();

        //when
        boolean actual3 = line.isProperEdges(Arrays.asList(false, false, true));

        //then
        AssertionsForClassTypes.assertThat(actual3).isTrue();
    }

    @DisplayName("인접한 edge가 존재하는 list인지 검사")
    @Test
    void isNotProperEdges() {
        //given
        Line line = new Line(4);

        //when
        boolean actual1 = line.isProperEdges(Arrays.asList(true, true, true));

        //then
        AssertionsForClassTypes.assertThat(actual1).isFalse();

        //when
        boolean actual2 = line.isProperEdges(Arrays.asList(true, true, false));

        //then
        AssertionsForClassTypes.assertThat(actual2).isFalse();
    }

    @DisplayName("인접하는 edge가 존재하는 않는 list를 생성")
    @RepeatedTest(100)
    void generateEdges() {
        //given
        Line line = new Line(4);

        //when
        List<Boolean> edges = line.generateEdges(4);

        //then
        assertThat(edges).hasSize(3);
        AssertionsForClassTypes.assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
        AssertionsForClassTypes.assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
        AssertionsForClassTypes.assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
        AssertionsForClassTypes.assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false))).isFalse();
    }
}