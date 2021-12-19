package com.kakao.nio.ladder.domain.impl;


import com.kakao.nio.ladder.domain.LadderItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderLevelTest {

    @DisplayName("LadderItem 으로 변환할 수 있다")
    @Test
    void toLadderItems(){
        LadderLevel line = LadderLevel.builder().first(true).next(false).last().build();
        assertThat(line.toLadderItems())
                .containsExactly(LadderItem.Bar, LadderItem.Step, LadderItem.Bar, LadderItem.Empty, LadderItem.Bar);

        LadderLevel line2 = LadderLevel.builder().first(false).next(false).last().build();
        assertThat(line2.toLadderItems())
                .containsExactly(LadderItem.Bar, LadderItem.Empty, LadderItem.Bar, LadderItem.Empty, LadderItem.Bar);

        LadderLevel line3 = LadderLevel.builder().first(false).next(true).last().build();
        assertThat(line3.toLadderItems())
                .containsExactly(LadderItem.Bar, LadderItem.Empty, LadderItem.Bar, LadderItem.Step, LadderItem.Bar);


    }

}