package com.company;
//
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class GameTest {
    private Game game;

    @Before
    public void setup() {
        game = new Game();
    }

    @After
    public void tearDown() {
        game = null;
    }

    @Test
    public void shouldReturn14FromChance() {
        int actual = game.calculateScore("1,1,3,3,6", "chance");
        int expected = 14;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn21FromChance() {
        int actual = game.calculateScore("4,5,5,6,1", "Chance");
        int expected = 21;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn50onYahtzeeWithAllDieAs1s(){
        int actual = game.calculateScore("1,1,1,1,1", "Yahtzee");
        int expected = 50;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0onYahtzeeWithWrongCombination(){
        int actual = game.calculateScore("1,1,1,2,1", "Yahtzee");
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTheSumOfTwoHighestMatchingDie(){
        int actual = game.calculateScore("3,3,3,4,4", "pairs");
        int expected = 8;

        assertEquals(expected, actual);
    }
}