import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StartTest {

    Start start = new Start();
    String word = "Tester";
    String word2 = "1234567";

    @Test
    void test() {
        assertEquals("Tes", start.halfString(word));
    }

    @Test
    void test2() {
        assertEquals("123", start.halfString(word2));
    }
}

