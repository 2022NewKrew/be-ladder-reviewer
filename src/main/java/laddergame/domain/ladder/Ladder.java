package laddergame.domain.ladder;

import laddergame.domain.player.Players;
import laddergame.exception.LadderGameException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {

    private final Players players;
    private final List<LadderRow> ladderRows;

    public Ladder(Players players, int height) {
        if (height <= 0) {
            throw new LadderGameException("사다리 높이는 1 이상이여야 합니다.");
        }

        this.players = players;
        this.ladderRows = IntStream.range(0, height)
                .mapToObj((num) -> LadderRow.create(players.count()-1))
                .collect(Collectors.toList());
    }

    public List<LadderRow> getLadderRows() {
        return ladderRows;
    }

}
