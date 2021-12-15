package com.kakao.ladder.domain;

import com.kakao.ladder.annotation.GetterForUI;
import com.kakao.ladder.common.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ladder {
    private final List<Line> lines;

    private Ladder(List<Line> lines) {
        Preconditions.checkEmpty(lines, "lines는 필수값입니다.");

        this.lines = lines;
    }

    public static Ladder of(List<Line> lines) {
        return new Ladder(lines);
    }

    @GetterForUI
    public List<Line> getLines() {
        return Collections.unmodifiableList(new ArrayList<>(lines));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ladder ladder = (Ladder) o;
        return Objects.equals(lines, ladder.lines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lines);
    }
}

