package com.kakao.ladder.domain.strategy;

import java.util.List;

public interface LineStrategy {
    List<Boolean> createPoints(int countOfPerson);
}
