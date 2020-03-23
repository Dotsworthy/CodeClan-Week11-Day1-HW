import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{
    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator(3,2);}


    @Test
    public void canAddNumbers() {assertEquals(5,calculator.addNumber());}

    @Test
    public void canSubtractNumbers() {assertEquals(1, calculator.subtractNumber());}

    @Test
    public void canMultiplyNumbers() {assertEquals(6,calculator.multiplyNumber());}
    }


