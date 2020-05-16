import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class programTest {
    Temperature temp = new Temperature();

    @Test
    void test() {
        assertEquals(true, temp.lessThanHundred(20,30));
    }

    @Test
    void test2() {
        assertEquals(false, temp.lessThanHundred(120,130));
    }

    @Test
    void test3() {
        assertEquals(true, temp.lessThanHundred(100,30));
    }

    @Test
    void test4() {
        assertEquals(true, temp.lessThanHundred(20,100));
    }
}
