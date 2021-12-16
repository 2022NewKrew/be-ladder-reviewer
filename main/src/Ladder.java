import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Ladder Class
 */
public class Ladder {
    private final Random random = new Random(); //사다리 라인 랜덤 생성용(개선사항)
    private final List<List<String>> frame; //2차원 배열의 사다리

    public Ladder(int memberNumber, int ladderHeight) {
        this.frame = makeFrame(memberNumber, ladderHeight);
    }

    /**
     * 전체 사다리 틀 만들기
     *
     * @param memberNumber 사람수
     * @param ladderHeight 사다리높이
     * @return List<List < String>>
     */
    public List<List<String>> makeFrame(int memberNumber, int ladderHeight) {
        return IntStream
                .range(0, ladderHeight) //사다리 개수에 따라 루프
                .mapToObj(i -> makeLadderRow(memberNumber))
                .collect(Collectors.toList());
    }


    /**
     * 사다리 ladderRow 만들기
     * @param memberNumber 사람수
     * @return 생성된 ladderRow
     */
    private List<String> makeLadderRow(int memberNumber) {
        return IntStream.range(0, memberNumber - 1) //한줄당 사람 수 - 1의 라인이 만들어질수 있음 따라 루프(개선사항)
                //마지막 인덱스 제외하고 랜덤하게 사다리 라인 붙이기
                .mapToObj(j -> (random.nextBoolean()) ? "-" : " ") //사다리("|")는 저장하지 않고 출력할때 그려주도록 수정(개선사항)
                .collect(Collectors.toList());
    }

    /**
     * 사다리 전체 틀 출력
     */
    public void printFrame() {
        //2차원 배열 루프 돌면서 사다리 출력
        this.frame.forEach(this::printLadderRow);
    }


    /**
     * 사다리 ladderRow 출력
     * @param ladderRow 사다리 ladderRow
     */
    private void printLadderRow(List<String> ladderRow) {
        ladderRow.stream()
                .map(s -> "|" + s)
                .forEach(System.out::print);

        System.out.println("|"); //한 라인 출력완료마다 개행처리
    }
}
