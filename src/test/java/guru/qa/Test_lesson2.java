package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_lesson2 {
    @Test
    void Git_FirstTest() {
        Assertions.assertTrue(150 > 1);

    }
    @Test
    void Git_SecondTest() {
        Assertions.assertTrue(150 < 200);

    }
}
