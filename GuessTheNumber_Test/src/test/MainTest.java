import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isRespond() {
        assertEquals(true,Main.isRespond(1,1));
        assertEquals(false,Main.isRespond(1,2));
        assertEquals(false,Main.isRespond(3,2));

    }

    @Test
    void isPlayAgain() {
        assertEquals(true,Main.isPlayAgain("y"));
        assertEquals(false,Main.isPlayAgain("n"));
    }
}