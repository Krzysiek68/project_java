import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StartTest {

    Start start = new Start();
    int[] tab = {5, 4, 1, 2, 3, 6};
    int[] tab2 = {6, 5, 4, 3, 2};

    @Test
    void test() {
        assertEquals(true, start.tablica(tab));
    }

    @Test
    void test2() {
        assertEquals(false, start.tablica(tab2));
    }
}
