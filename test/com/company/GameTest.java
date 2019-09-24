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
        int actual = game.calculateScore("4,5,5,6,1", "chance");
        int expected = 21;

        assertEquals(expected, actual);
    }
}