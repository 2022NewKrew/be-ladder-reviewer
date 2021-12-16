class Ladder {
    private final int row;
    private final int col;
    private final boolean[][] ladderArr;

    public Ladder(int row, int col) {
        this.row = row;
        this.col = col;
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

    public void createLineByRandom() {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (isValid(r, c) && Math.random() < 0.5) {
                    ladderArr[r][c] = true;
                }
            }
        }
    }

    public void printLadder() {
        for (int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < col; j++) {
                System.out.print(ladderArr[i][j] ? "-|" : " |");
            }
            System.out.println();
        }
    }
}
