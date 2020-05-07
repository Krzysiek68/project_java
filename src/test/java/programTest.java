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
        assertEquals(false, temp.lessThanHundred(20,30));
    }
}
