package com.company;

public class ScoreCard {
private int ones;
private int twos;
private int threes;
private int fours;
private int fives;
private int sixes;
private int threeOfaKind;
private int fourOfaKind;
private int fullHouse;
private int smallStraight;
private int largeStraight;
private int yahtzee;
private int chance;
private int total;

    public ScoreCard() {

    }

    public int getOnes() {
        return ones;
    }

    private void setOnes(int ones) {
        this.ones = ones;
    }

    public int getTwos() {
        return twos;
    }

    private void setTwos(int twos) {
        this.twos = twos;
    }

    public int getThrees() {
        return threes;
    }

    private void setThrees(int threes) {
        this.threes = threes;
    }

    public int getFours() {
        return fours;
    }

    private void setFours(int fours) {
        this.fours = fours;
    }

    public int getFives() {
        return fives;
    }

    private void setFives(int fives) {
        this.fives = fives;
    }

    public int getSixes() {
        return sixes;
    }

    private void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getThreeOfaKind() {
        return threeOfaKind;
    }

    private void setThreeOfaKind(int threeOfaKind) {
        this.threeOfaKind = threeOfaKind;
    }

    public int getFourOfaKind() {
        return fourOfaKind;
    }

    private void setFourOfaKind(int fourOfaKind) {
        this.fourOfaKind = fourOfaKind;
    }

    public int getFullHouse() {
        return fullHouse;
    }

    private void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getSmallStraight() {
        return smallStraight;
    }

    private void setSmallStraight(int smallStraight) {
        this.smallStraight = smallStraight;
    }

    public int getLargeStraight() {
        return largeStraight;
    }

    private void setLargeStraight(int largeStraight) {
        this.largeStraight = largeStraight;
    }

    public int getYahtzee() {
        return yahtzee;
    }

    private void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    public int getChance() {
        return chance;
    }

    private void setChance(int chance) {
        this.chance = chance;
    }

    public int getTotal() {
        return total;
    }

    private void setTotal(int total) {
        this.total = total;
    }
}
