
package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    void singlePin() {
        game.roll(3);
        assertEquals(3, game.score());
    }

//    @Test
//    void gutterGame() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void allOnes() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void oneSpare() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void oneStrike() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void perfectGame() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void dutch200Even() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void dutch200Odd() {
//        fail("Not implemented");
//    }
//
//    @Test
//    void nineSpareGame() {
//        fail("Not implemented");
//    }

}
