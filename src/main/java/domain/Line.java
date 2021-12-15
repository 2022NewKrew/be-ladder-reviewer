package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Line {

    private static final int MIN_COUNT = 2;

    private final List<Point> points = new ArrayList<>();

    public Line(int count, PointGenerator pointGenerator) {
        if (count < MIN_COUNT || pointGenerator == null) {
            throw new IllegalArgumentException();
        }

        points.add(Point.first());
        points.addAll(generatePoints(count, pointGenerator));
    }

    private List<Point> generatePoints(int count, PointGenerator pointGenerator) {
        return Stream.generate(pointGenerator::next)
                .limit(count - points.size())
                .collect(Collectors.toList());
    }

    public static Line create(int count, PointGenerator pointGenerator) {
        return new Line(count, pointGenerator);
    }

    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }
}
