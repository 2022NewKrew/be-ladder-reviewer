package cole.kakao.com;

interface LadderGameMapGenerator {

    String VERTICAL_BAR = "|";
    String HORIZONTAL_BAR_EMPTY = " ";
    String HORIZONTAL_BAR_EXISTS = "-";
    String END_OF_HORIZONTAL_LADDER = "\n";

    String generate();
}
