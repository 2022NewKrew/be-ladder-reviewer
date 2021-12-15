package com.kakao.talkmsg.cooper;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    public static final int MIN_PEOPLE = 2;
    private static final int MIN_HEIGHT = 1;
    private static Random random = new Random();
    private List<List<Boolean>> points;

    public Ladder(int numOfPeople) {
        new Ladder(numOfPeople, MIN_HEIGHT);
    }

    public Ladder(int numOfPeople, int height) {
        if (numOfPeople < MIN_PEOPLE || height < MIN_HEIGHT) {
            throw new IllegalArgumentException();
        }
        this.points = IntStream.range(0, height).mapToObj(num -> getEdges(numOfPeople)).collect(Collectors.toList());
    }

    public List<List<Boolean>> getPoints() {
        return Collections.unmodifiableList(this.points);
    }

    public List<Boolean> getEdges(int numOfPeople) {
        List<Boolean> randomEdges;
        do {
            randomEdges = generateRandomEdges(numOfPeople);
        } while (!isProperEdges(randomEdges));
        return randomEdges;
    }

    public boolean isProperEdges(List<Boolean> edges) {
        boolean previousEdge = false;
        for (Boolean currentEdge : edges) {
            if (previousEdge && currentEdge) {
                return false;
            }
            previousEdge = currentEdge;
        }
        return previousEdge;
    }

    public List<Boolean> generateRandomEdges(int numOfPeople) {
        int width = numOfPeople - 1;
        return IntStream.range(0, width).mapToObj(t -> random.nextBoolean()).collect(Collectors.toList());
    }

    public int getWidth() {
        return points.get(0).size();
    }

    public int getHeight() {
        return points.size();
    }
}
