package src.com;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InputData inputData = new InputData();
        int persons = inputData.insertData("P");
        int height = inputData.insertData("L");
        inputData.scannerClose();

        PlayLadder playLadder = new PlayLadder(persons, height);
        List<List<String>> ladderArray = playLadder.procLadder();
        playLadder.printLadder(ladderArray);
    }

}