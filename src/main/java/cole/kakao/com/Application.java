package cole.kakao.com;

public class Application {

    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGameCliImpl();
        LadderGame.LadderGameParams params = ladderGame.inputGameParams(System.in);

        System.out.println(ladderGame.generateMap(params));
    }
}
