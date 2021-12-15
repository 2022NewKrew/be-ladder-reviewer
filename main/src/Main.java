import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<List<String>> ladder = makeLadder(5, 5); //사람수, 사다리 높이 파라미터 전달
        printLadder(ladder);
    }


    /**
     * 랜덤 사다리 만들기
     *
     * @param member 사람수
     * @param height 사다리높이
     * @return List<List<String>>
     */
    public static List<List<String>> makeLadder(int member, int height) {
        Random random = new Random(); //사다리 라인 랜덤 생성용
        return IntStream
                .range(0, height) //사다리 개수에 따라 루프
                .mapToObj(i -> IntStream.range(0, member) //사람 수에 따라 루프
                        //마지막 인덱스 제외하고 랜덤하게 사다리 라인 붙이기
                        .mapToObj(j -> (j < member - 1 && random.nextBoolean()) ? "|" + "-" : "|" + " ")
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }


    /**
     * 사다리 출력기
     *
     * @param ladder 출력할 사다리
     */
    public static void printLadder(List<List<String>> ladder) {
        //2차원 배열 루프 돌면서 사다리 출력
        ladder.forEach(floor -> {
            floor.forEach(System.out::print);

            System.out.println(); //한 라인 출력완료마다 개행처리
        });
    }
}
