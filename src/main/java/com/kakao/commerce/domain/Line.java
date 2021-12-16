package com.kakao.commerce.domain;

import java.util.List;

public class Line implements Drawable {

    private final List<String> blocks;

    public Line(List<String> blocks) {
        this.blocks = blocks;
    }

    @Override
    public void draw() {
        for (String block : blocks) {
            System.out.print(block);
        }
        System.out.println();
    }
}
