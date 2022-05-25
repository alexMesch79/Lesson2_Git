package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_lesson2 {
    @Test
    void Git_FirstTest() {
        //Assertions.assertTrue(150 > 1);
        Assertions.assertFalse(150 < 1);

    }
    @Test
    void Git_SecondTest() {
        Assertions.assertTrue(150 < 200);

    }
    @Test
    void Git_ThirdeTest() {
        //Assertions.assertTrue( 150 ==  150);
        Assertions.assertEquals(150, 150);
    }
}
