package com.kakao.commerce;

import java.util.List;

public class Line {

    private final List<String> blocks;

    public Line(List<String> blocks) {
        this.blocks = blocks;
    }

    public void drawLine() {
        for (String block : blocks) {
            System.out.print(block);
        }
        System.out.println();
    }
}
