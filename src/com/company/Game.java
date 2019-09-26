package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Game {

    public static ScoreCard scoreCard = new ScoreCard();

    public int[] splitTotalRollToSingleDie(String roll){
        return Arrays.stream(roll.split(",")).mapToInt(Integer::parseInt).toArray();
    }

    public int calculateScore (String roll, String category) {
        String lowercaseCategory = category.toLowerCase();
        int[] splitRoll = splitTotalRollToSingleDie(roll);
        return scoreCard.checkIfAvailable(lowercaseCategory) ? scoreCard.calculate(splitRoll, lowercaseCategory) : scoreCard.getCategories().get(lowercaseCategory);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
