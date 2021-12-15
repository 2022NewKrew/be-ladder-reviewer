package com.kakao.talkmsg.cooper;

import org.apache.commons.collections4.ListUtils;
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

    @DisplayName("라인 생성할 때 2보다 작은 참가자수로 생성하는 경우 에러 발생")
    @Test
    void line_oneperson() {
        assertThat(new Line(2)).isNotNull();
        assertThatThrownBy(() -> new Line(1)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("edge가 원하는 수만큼 random하게 list로 생성되는지 확인한다")
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
        Line line = new Line(20);

        //when
        List<Boolean> edges = line.generateRandomEdges(20);

        //then
        assertThat(edges).contains(true).contains(false);
    }

    @DisplayName("참가자 3명인 경우에 유효한 list인지 검사")
    @Test
    void isProperEdges_3people() {
        //given
        Line line = new Line(3);

        //when
        boolean actual1 = line.isProperEdges(Arrays.asList(false, false));

        //then
        assertThat(actual1).isFalse();

        //when
        boolean actual2 = line.isProperEdges(Arrays.asList(true, false));

        //then
        assertThat(actual2).isTrue();


        //when
        boolean actual3 = line.isProperEdges(Arrays.asList(false, true));

        //then
        assertThat(actual3).isTrue();

        //when
        boolean actual4 = line.isProperEdges(Arrays.asList(true, true));

        //then
        assertThat(actual4).isFalse();
    }

    @DisplayName("참가자 4명인 경우 인접한 edge가 존재하는 list인지 검사")
    @Test
    void isProperEdges_4people() {
        //given
        Line line = new Line(4);

        //when
        boolean actual1 = line.isProperEdges(Arrays.asList(false, false, false));

        //then
        assertThat(actual1).isFalse();

        //when
        boolean actual2 = line.isProperEdges(Arrays.asList(true, false, true));

        //then
        assertThat(actual2).isTrue();

        //when
        boolean actual3 = line.isProperEdges(Arrays.asList(false, false, true));

        //then
        assertThat(actual3).isTrue();

        //when
        boolean actual4 = line.isProperEdges(Arrays.asList(true, true, true));

        //then
        assertThat(actual4).isFalse();

        //when
        boolean actual5 = line.isProperEdges(Arrays.asList(true, true, false));

        //then
        assertThat(actual5).isFalse();
    }

    @DisplayName("인접하는 edge가 존재하는 않는 list를 생성")
    @RepeatedTest(100)
    void generateEdges() {
        //given
        Line line = new Line(5);

        //when
        List<Boolean> edges = line.generateEdges(5);

        //then
        assertThat(edges).hasSize(4);
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(false, false, false, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(false, false, true, true))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(false, true, true, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(false, true, true, true))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, false, true, true))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, false, true))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, true, false))).isFalse();
        assertThat(ListUtils.isEqualList(edges, Arrays.asList(true, true, true, true))).isFalse();
    }
}