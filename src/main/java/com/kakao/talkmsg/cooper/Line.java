package com.kakao.talkmsg.cooper;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Line {
    private static final int MIN_PEOPLE = 2;
    private static Random random = new Random();
    private final List<Boolean> edges;

    public Line(int numOfPeople) {
        if (numOfPeople < MIN_PEOPLE) {
            throw new IllegalArgumentException();
        }
        this.edges = generateEdges(numOfPeople);
    }

     public Line(List<Boolean> edges) {
        if (edges.size() < MIN_PEOPLE && !isProperEdges(edges)) {
            throw new IllegalArgumentException();
        }
        this.edges = edges;
    }

    public List<Boolean> getEdges() {
        return Collections.unmodifiableList(edges);
    }

    public int getEdgeSize() {
        return edges.size();
    }

    public List<Boolean> generateEdges(int numOfPeople) {
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
}
