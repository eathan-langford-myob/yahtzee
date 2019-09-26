package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class ScoreCard {
//private int ones = -1;
//private int twos = -1;
//private int threes = -1;
//private int fours = -1;
//private int fives = -1;
//private int sixes = -1;
//private int threeOfaKind = -1;
//private int fourOfaKind = -1;
//private int fullHouse = -1;
//private int smallStraight = -1;
//private int largeStraight = -1;
//private int yahtzee = -1;
//private int chance = -1;
//private int total = -1;

private HashMap<String, Integer> categories;

public HashMap<String, Integer> getCategories(){
return categories;
}

public boolean checkIfAvailable(String category){
    return categories.get(category) < 0;
}

public int calculate(int[] roll, String category) {
    switch (category){
        case "chance":
            return calculateChance(roll);
        case "yahtzee":
            return calculateYahtzee(roll);
    }
return -1;
}



private int calculateYahtzee(int[] roll) {
   return Arrays.stream(roll).distinct().count() == 1 ? 50 : 0;
}

    public int calculateChance(int[] roll) {
    return IntStream.of(roll).sum();
}

    public ScoreCard() {
        categories = new HashMap();
        categories.put("ones",-1);
        categories.put("twos",-1);
        categories.put("threes",-1);
        categories.put("fours",-1);
        categories.put("fives",-1);
        categories.put("sixes",-1);
        categories.put("pairs",-1);
        categories.put("twoPairs",-1);
        categories.put("threeOfaKind",-1);
        categories.put("fourOfaKind",-1);
        categories.put("fullHouse",-1);
        categories.put("smallStraight",-1);
        categories.put("largeStraight",-1);
        categories.put("yahtzee",-1);
        categories.put("chance",-1);
        categories.put("total",-1);
    }

//    public int getOnes() {
//        return ones;
//    }
//
//    private void setOnes(int ones) {
//        this.ones = ones;
//    }
//
//    public int getTwos() {
//        return twos;
//    }
//
//    private void setTwos(int twos) {
//        this.twos = twos;
//    }
//
//    public int getThrees() {
//        return threes;
//    }
//
//    private void setThrees(int threes) {
//        this.threes = threes;
//    }
//
//    public int getFours() {
//        return fours;
//    }
//
//    private void setFours(int fours) {
//        this.fours = fours;
//    }
//
//    public int getFives() {
//        return fives;
//    }
//
//    private void setFives(int fives) {
//        this.fives = fives;
//    }
//
//    public int getSixes() {
//        return sixes;
//    }
//
//    private void setSixes(int sixes) {
//        this.sixes = sixes;
//    }
//
//    public int getThreeOfaKind() {
//        return threeOfaKind;
//    }
//
//    private void setThreeOfaKind(int threeOfaKind) {
//        this.threeOfaKind = threeOfaKind;
//    }
//
//    public int getFourOfaKind() {
//        return fourOfaKind;
//    }
//
//    private void setFourOfaKind(int fourOfaKind) {
//        this.fourOfaKind = fourOfaKind;
//    }
//
//    public int getFullHouse() {
//        return fullHouse;
//    }
//
//    private void setFullHouse(int fullHouse) {
//        this.fullHouse = fullHouse;
//    }
//
//    public int getSmallStraight() {
//        return smallStraight;
//    }
//
//    private void setSmallStraight(int smallStraight) {
//        this.smallStraight = smallStraight;
//    }
//
//    public int getLargeStraight() {
//        return largeStraight;
//    }
//
//    private void setLargeStraight(int largeStraight) {
//        this.largeStraight = largeStraight;
//    }
//
//    public int getYahtzee() {
//        return yahtzee;
//    }
//
//    private void setYahtzee(int yahtzee) {
//        this.yahtzee = yahtzee;
//    }
//
//    public int getChance() {
//        return chance;
//    }
//
//    private void setChance(int chance) {
//        this.chance = chance;
//    }
//
//    public int getTotal() {
//        return total;
//    }
//
//    private void setTotal(int total) {
//        this.total = total;
//    }
}
