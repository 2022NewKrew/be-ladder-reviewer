package src.com;

import java.util.Scanner;

public class InputData {

    private static final Scanner sc = new Scanner(System.in);
    static final String INSERT_USER_COMMENT = "참여할 사람은 몇 명인가요?";
    static final String INSERT_LADDER_COMMENT = "최대 사다리 높이는 몇 개 인가요?";


    public int insertData(String type){
        String coment = "P".equals(type) ? INSERT_USER_COMMENT : INSERT_LADDER_COMMENT;
        System.out.println(coment);
        return validate(Integer.parseInt(sc.nextLine()));
    }


    private int validate(int data) {
        if(data <= 1) {
            throw new RuntimeException("2명이상 가능합니다");
        }
        return data;
    }

    public void scannerClose() {
        sc.close();
    }





}
