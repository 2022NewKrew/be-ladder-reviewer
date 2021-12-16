package com.gyuyeol.ladder.model;

import java.util.stream.Stream;

public interface LadderLineGenerator {
    Stream<Boolean> movableStream(int count);
}
