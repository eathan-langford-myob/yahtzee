package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Game {

    public static ScoreCard scoreCard = new ScoreCard();

    public int calculateScore (String roll, String category){
        int sum = -1;
        int[] finalRoll = Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();

        switch(category) {
            case "chance":
                sum = scoreCard.checkIfChanceUsed()?scoreCard.calculateChance(finalRoll):scoreCard.getChance();
            default:{

            }
        }
        return sum;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
