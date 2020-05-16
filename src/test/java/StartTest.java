import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StartTest {

    Start start = new Start();
    int [] tablica = {1, 2, 3, 4, 5, 6};

    int [] tablica2 = {6, 5, 4, 3, 2, 1};

    int [] tablica3 = {1, 1, 1, 1, 1, 1};

    int [] tablica4 = {1, 1, 1, 1, 1, 1};

    @Test
    void test() {
        assertArrayEquals(tablica2, start.tablicaNaOdwrot(tablica));
    }

    @Test
    void test2() {
        assertArrayEquals(tablica4, start.tablicaNaOdwrot(tablica3));
    }
}
