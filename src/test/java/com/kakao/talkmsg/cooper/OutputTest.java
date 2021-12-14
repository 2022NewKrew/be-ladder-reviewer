package com.kakao.talkmsg.cooper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OutputTest {

    @Test
    public void getLineString() {
        //given
        Line line = new Line(Arrays.asList(true, false, false, true, false));

        //when
        String lineString = Output.getLineString(line);

        //then
        assertThat(lineString).isEqualTo("|-| | |-| |");
    }
}