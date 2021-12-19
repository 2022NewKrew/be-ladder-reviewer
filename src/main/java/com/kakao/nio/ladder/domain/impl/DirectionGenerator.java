package com.kakao.nio.ladder.domain.impl;

import java.util.Random;

public class DirectionGenerator {

    public static Random random = new Random();

    public static boolean generate(){
        return random.nextBoolean();
    }

}
