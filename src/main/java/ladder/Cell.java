package ladder;

public enum Cell {
    BLANK(" "), VERTICAL("|"), HORIZONTAL("-");

    private final String expression;

    Cell(String expression) {
        this.expression = expression;
    }

    public String toString() {
        return expression;
    }
}
