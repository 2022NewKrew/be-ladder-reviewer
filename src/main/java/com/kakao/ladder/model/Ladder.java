package com.kakao.ladder.model;

import com.kakao.ladder.core.BridgeGenerator;
import com.kakao.ladder.util.Iterators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.kakao.ladder.core.Validators.validate;

public class Ladder implements Iterable<Stream<Boolean>> {
    private final int width;
    private final int height;
    private final List<List<Boolean>> ladder;

    private Ladder(Builder builder) {
        this.ladder = builder.ladder;
        this.width = builder.width;
        this.height = builder.height;
    }

    public boolean hasBridge(int row, int from, int to) {
        validate(row > 0 && row <= height, "invalid row size");
        validate(from > 0 && from <= width, "invalid from index");
        validate(to > 0 && to <= width, "invalid to index");
        validate(Math.abs(to - from) == 1, "invalid distance");

        int start = Math.min(from, to);
        List<Boolean> bridges = ladder.get(row - 1);
        return bridges.get(start - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladder ladder1 = (Ladder) o;
        return width == ladder1.width && height == ladder1.height && Objects.equals(ladder, ladder1.ladder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, ladder);
    }

    @Override
    public Iterator<Stream<Boolean>> iterator() {
        return Iterators.convert(ladder.iterator(), Collection::stream);
    }

    public static class Builder {
        private final int width;
        private final int height;
        private final List<List<Boolean>> ladder;

        public Builder(int width, int height) {
            this.width = width;
            this.height = height;
            ladder = new ArrayList<>(height);
        }

        public Builder from(BridgeGenerator generator) {
            for (int i = 0; i < height; i++) {
                List<Boolean> row = generator.generateRow()
                        .limit(width - 1)
                        .collect(Collectors.toList());
                addRow(row);
            }
            return this;
        }

        public Builder addRow(Boolean... bridges) {
            return addRow(List.of(bridges));
        }
        public Builder addRow(List<Boolean> row) {
            validate(width - 1 == row.size(), "mismatch width");
            validate(ladder.size() < height, "mismatch height");
            ladder.add(Collections.unmodifiableList(row));
            return this;
        }

        public Ladder build() {
            return new Ladder(this);
        }
    }
}
