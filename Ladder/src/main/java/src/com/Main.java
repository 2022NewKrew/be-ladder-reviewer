package src.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final String INSERT_USER_COMMENT = "참여할 사람은 몇 명인가요?";
    static final String INSERT_LADDER_COMMENT = "최대 사다리 높이는 몇 개 인가요?";
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printLadder(playLadder(insertData("P"), insertData("L")));
    }

    public static int insertData(String type){
        String coment = INSERT_USER_COMMENT;
        if("L".equals(type)){
            coment = INSERT_LADDER_COMMENT;
        }
        System.out.println(coment);
        return Integer.parseInt(sc.nextLine());
    }

    public static List<List<String>> playLadder(int persons, int height){
        Random random1 = new Random();
        List<List<String>> laderArray =  new ArrayList<List<String>>();
        for(int i=0; i < height; i++){
            List<String> lineStrArray = new ArrayList<String>();
            for(int r=0; r< persons; r++){
                String connect = r < persons -1 && random1.nextBoolean() ? "-" : " ";
                lineStrArray.add("|" + connect);
            }
            laderArray.add(lineStrArray);
        }
        return laderArray;
    }

    public static void printLadder(List<List<String>> laderArray){
        laderArray.forEach(item -> {
            item.forEach(System.out::print);
            System.out.println();
        });
    }



}