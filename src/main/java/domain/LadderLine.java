package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class LadderLine {
    private static final String SYMBOL_VERTICAL_BAR = "|";

    private List<Point> points = new ArrayList<>();

    public LadderLine(List<Point> points) {
        this.points = points;
    }

    public LadderLine(int userCount, Random random) {
        boolean current = random.nextBoolean();
        points.add(Point.firstPoint(current));
        for (int i = 1; i < userCount - 1; i++) {
            Point point = new Point(current, random.nextBoolean());
            points.add(point);
            current = point.getCurrent();
        }
        points.add(Point.lastPoint(current));
    }

    public String getResultLine() {
        StringBuilder sb = new StringBuilder();
        points.forEach(point -> {
            sb.append(SYMBOL_VERTICAL_BAR);
            sb.append(point.getResultPoint());
        });
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LadderLine line = (LadderLine) o;
        return Objects.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
