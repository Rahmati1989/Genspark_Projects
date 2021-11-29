import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main game;
    @BeforeEach
    void setUp() {
     game = new Main();
    }

    @Test
    void getAnswer() {
        assertEquals("Game is over",game.getAnswer(0));
        assertEquals("You approach the cave..\n\n"+
                "It is dark and spooky..\n\n" + "A large dragon jumps out in front of you! he opens his jaws and..\n\n" +
                "Gobbles you down in one bit!",game.getAnswer(1));
        assertEquals("you approach the cave..\n\n" + "Give you his treasure",game.getAnswer(2));

    }
}