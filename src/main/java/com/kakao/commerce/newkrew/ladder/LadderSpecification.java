package com.kakao.commerce.newkrew.ladder;

public class LadderSpecification {

    private final String verticalBar;
    private final String crossBar;
    private final String emptyCrossBar;
    private final int width;
    private final int depth;

    public LadderSpecification(String verticalBar, String crossBar, String emptyCrossBar,
                               int width, int depth) {
        this.verticalBar = verticalBar;
        this.crossBar = crossBar;
        this.emptyCrossBar = emptyCrossBar;
        this.width = width;
        this.depth = depth;
    }

    public String getVerticalBar() {
        return verticalBar;
    }

    public String getCrossBar() {
        return crossBar;
    }

    public String getEmptyCrossBar() {
        return emptyCrossBar;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public static LadderSpecificationBuilder builder() {return new LadderSpecificationBuilder();}

    public static final class LadderSpecificationBuilder {

        private String verticalBar;
        private String crossBar;
        private String emptyCrossBar;
        private int width;
        private int depth;

        private LadderSpecificationBuilder() {}

        public LadderSpecificationBuilder verticalBar(String verticalBar) {
            this.verticalBar = verticalBar;
            return this;
        }

        public LadderSpecificationBuilder crossBar(String crossBar) {
            this.crossBar = crossBar;
            return this;
        }

        public LadderSpecificationBuilder emptyCrossBar(String emptyCrossBar) {
            this.emptyCrossBar = emptyCrossBar;
            return this;
        }

        public LadderSpecificationBuilder width(int width) {
            this.width = width;
            return this;
        }

        public LadderSpecificationBuilder depth(int depth) {
            this.depth = depth;
            return this;
        }

        public LadderSpecification build() {
            return new LadderSpecification(verticalBar, crossBar, emptyCrossBar, width, depth);
        }
    }
}
