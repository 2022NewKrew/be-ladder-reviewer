package cole.kakao.com;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class LadderGameCliImpl implements LadderGame {

    @Override
    public LadderGameParams inputGameParams(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        System.out.println("참여할 사람은 몇 명인가요?");
        int numParticipants = sc.nextInt();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int maxLadderHeight = sc.nextInt();

        return new LadderGameParams(numParticipants, maxLadderHeight);
    }

    @Override
    public String show(LadderGameParams params) {
        LadderGameMap ladderGameMap = new LadderGameMapImpl(params.numParticipants, params.maxLadderHeight);
        Ladder[][] ladderMap = ladderGameMap.getLadderMap();

        return Arrays.stream(ladderMap)
                .map(ladders -> Arrays.stream(ladders)
                        .map(it -> it == Ladder.EXISTS ? "-" : " ")
                        .collect(Collectors.joining("|", "|", "|")))
                .collect(Collectors.joining("\n"));
    }
}
