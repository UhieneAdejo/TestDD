package test.java;
import main.java.Maths;
import org.junit.*;
public class MathsTest {

    private Maths maths;

    @Before
    public void setUp() {

        maths = new Maths();
    }


    @Test
    public void checkTheSumOfTwoNumbersEqualsThree() {

        int result = maths.addTwoNumbers(1, 2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void checkIfNumberIsPrime() {
        boolean isPrime = maths.numberIsPrime(7);
        Assert.assertTrue(isPrime);
    }

}











