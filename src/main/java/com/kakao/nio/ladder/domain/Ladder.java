package com.kakao.nio.ladder.domain;

/**
 * 사다리
 *
 * 생성된 사다리는 LadderReader 로 LadderLine 단위로 읽을 수 있다
 */
public interface Ladder {

    /**
     * 사다리를 LadderLine 단위로 읽을 수 있는 Reader 를 제공한다
     * @return
     */
    LadderReader getReader();
}
