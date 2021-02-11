import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test {
    @Test
    void sumTwoNumbers() {


        Main main = new Main();
        int y = main.Sum(1, 2);
        assertEquals(y, 3);
    }
}