package com.kakao.ladder.util;

import java.util.Iterator;
import java.util.function.Function;

public class Iterators {
    public static <A, B> Iterator<B> convert(final Iterator<A> iter, final Function<A, B> f) {
        return new Iterator<>() {
            public boolean hasNext() {
                return iter.hasNext();
            }
            public B next() {
                return f.apply(iter.next());
            }
        };
    }
}
