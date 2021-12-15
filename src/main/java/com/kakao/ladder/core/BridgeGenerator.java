package com.kakao.ladder.core;

import java.util.stream.Stream;

public interface BridgeGenerator {
    Stream<Boolean> generateRow();
}
