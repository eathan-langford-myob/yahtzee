package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Game {

    public static ScoreCard scoreCard = new ScoreCard();

    public int calculateScore (String roll, String category){
    int[] finalRoll = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
    return IntStream.of(finalRoll).sum();
    }

    public static void main(String[] args) {
	// write your code here
    }
}
