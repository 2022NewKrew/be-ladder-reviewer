package com.kakao.ladder.util;

import com.kakao.ladder.core.BridgeGenerator;
import com.kakao.ladder.model.Ladder;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;

public class BridgeGenerators {
    private final static Random random = new Random();

    public static BridgeGenerator random() {
        return () ->
            Stream.iterate(false, (prev) -> !prev && random.nextBoolean())
                    .skip(1);
    }

    public static BridgeGenerator wrap(final Ladder ladder) {
        final Iterator<Stream<Boolean>> iter = ladder.iterator();
        return iter::next;
    }
}
