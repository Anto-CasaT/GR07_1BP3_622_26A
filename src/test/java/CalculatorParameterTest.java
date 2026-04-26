

import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorParameterTest {

    private final int a;
    private final int b;
    private final int expectedAddition;
    private final int expectedSubtraction;

    public CalculatorParameterTest(int a, int b, int expectedAddition, int expectedSubtraction) {
        this.a = a;
        this.b = b;
        this.expectedAddition = expectedAddition;
        this.expectedSubtraction = expectedSubtraction;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2, 3, 5, -1},
                {10, 5, 15, 5},
                {0, 0, 0, 0},
                {-3, -2, -5, -1}
        });
    }

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(expectedAddition, calculator.addition(a, b));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(expectedSubtraction, calculator.subtraction(a, b));
    }
}