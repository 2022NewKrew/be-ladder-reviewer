package com.kakao.talkmsg.cooper;

import java.util.stream.Collectors;

public class Output {
    private static final String VERTEX_STRING = "|";
    private static final String EDGE_STRING = "-";
    private static final String EMPTY_STRING = " ";

    public static void printLadder(Ladder ladder) {
        ladder.getLine().forEach(line -> System.out.println(getLineString(line)));
    }

    public static String getLineString(Line line) {
        StringBuilder lineString = new StringBuilder();
        lineString.append(VERTEX_STRING);
        String edgeString = line.getEdges().stream()
                .map(edge -> edge ? EDGE_STRING : EMPTY_STRING)
                .collect(Collectors.joining(VERTEX_STRING));
        lineString.append(edgeString);
        lineString.append(VERTEX_STRING);
        return lineString.toString();
    }
}