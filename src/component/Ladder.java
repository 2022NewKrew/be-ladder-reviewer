package component;

public class Ladder {
    private final int row;
    private final int col;
    private final boolean[][] ladderArr;

    public Ladder(int row, int col) {
        this.row = row;
        this.col = col - 1;
        if (row < 0 || col < 0) {
            throw new IllegalArgumentException("row and col must be positive");
        }
        ladderArr = new boolean[row][col];
    }

    private boolean isRange(int r, int c) {
        return (0 <= r && r < row) && (0 <= c && c < col);
    }

    private boolean isBlank(int r, int c) {
        return !ladderArr[r][c];
    }

    private boolean isValid(int r, int c) {
        final boolean leftOk = !isRange(r, c - 1) || isBlank(r, c - 1);
        final boolean rightOk = !isRange(r, c + 1) || isBlank(r, c + 1);
        return isRange(r, c) && leftOk && rightOk;
    }

    public void createAllLineByRandom() {
        int numLines = (int) (Math.random() * (row * col * 2));
        for (int i = 0; i < numLines; i++) {
            int r = (int) (Math.random() * row);
            int c = (int) (Math.random() * col);
            createLine(r, c);
        }
    }

    public void createLine(int r, int c) {
        if (isValid(r, c)) {
            ladderArr[r][c] = true;
        }
    }

    public void printRow(int r) {
        for (int j = 0; j < col; j++) {
            System.out.print(ladderArr[r][j] ? "-|" : " |");
        }
    }

    public void printLadder() {
        for (int i = 0; i < row; i++) {
            System.out.print("|");
            printRow(i);
            System.out.println();
        }
    }
}
