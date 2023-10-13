package test.java;
import main.java.Fib;
import org.junit.*;

import static org.junit.Assert.assertEquals;


public class FibTest {


    Fib fib;

    @Before
    public void setup() {
        fib = new Fib(10);
    }

    @Test
    public void generateAFibOfTen() {

        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] actual = fib.getGeneratedNumbers();

        Assert.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}