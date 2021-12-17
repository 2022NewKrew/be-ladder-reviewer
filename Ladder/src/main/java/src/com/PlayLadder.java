package src.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayLadder {

    private int persons, height;
    Random random = new Random();

    public PlayLadder(int persons, int height){
        this.persons = persons;
        this.height = height;
    }

    public List<List<String>> procLadder(){
        List<List<String>> laderArray =  new ArrayList<List<String>>();
        for(int i=0; i < height; i++){
            List<String> lineStrArray = new ArrayList<String>();
            for(int r=0; r< persons; r++){
                String connect = r < persons -1 && random.nextBoolean() ? "-" : " ";
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
