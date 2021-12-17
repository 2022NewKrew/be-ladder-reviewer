package laddergame.domain.player;

public class Player {

    private static final String NO_NAME = "noname";

    private final String name;

    public Player() {
        this(NO_NAME);
    }

    public Player(String name) {
        this.name = name;
    }

}
