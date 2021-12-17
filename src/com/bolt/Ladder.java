package com.bolt;

class Ladder {
    int legCount;
    int height;

    Ladder(int peopleCount, int height) {
        this.legCount = peopleCount - 1;
        this.height = height;
    }

    void print() {
        boolean[] ladderArray = createRandomArray(height * legCount);
        for (int i = 0; i < ladderArray.length; ++i) {
            printNewRow(i);
            printLeg(ladderArray[i]);
        }
    }

    private void printNewRow(int index) {
        if (index % legCount == 0) {
            System.out.print("\n|");
        }
    }

    private void printLeg(boolean isLegExist) {
        String leg = isLegExist ? "-|" : " |";
        System.out.println(leg);
    }

    private boolean[] createRandomArray(int length) {
        boolean[] array = new boolean[length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = getRandomBoolean();
        }
        return array;
    }

    private boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }
}
