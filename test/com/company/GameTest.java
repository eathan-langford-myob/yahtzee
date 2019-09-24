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
    public void shouldReturnSumFromChance() {
        int actual = game.calculateScore("1,1,3,3,6", "chance");
        int expected = 14;

        assertEquals(expected, actual);
    }
}