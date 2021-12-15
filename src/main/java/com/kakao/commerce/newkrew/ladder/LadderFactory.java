package com.kakao.commerce.newkrew.ladder;

public interface LadderFactory {
    Ladder make(LadderSpecification specification);
}
