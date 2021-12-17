package laddergame.domain.player;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Players {

    private final List<Player> players;

    public Players(int count) {
        this(IntStream.range(0, count)
                .mapToObj(num -> new Player())
                .collect(Collectors.toList()));
    }

    private Players(List<Player> players) {
        if (players.size() <= 1) {
            throw new IllegalArgumentException("2명 이상 참여할 수 있습니다.");
        }
        this.players = players;
    }

    public int count() {
        return players.size();
    }
}
