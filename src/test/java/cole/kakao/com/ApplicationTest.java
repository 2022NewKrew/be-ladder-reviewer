package cole.kakao.com;

import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void main() {
        LadderGame ladderGame = new LadderGameCliImpl();
        LadderGame.LadderGameParams params = ladderGame.inputGameParams(System.in);

        String map = ladderGame.generateMap(params);
        System.out.println(map);
    }
}