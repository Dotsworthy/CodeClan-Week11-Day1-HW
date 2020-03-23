import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{
    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator(1,1);}


    @Test
    public void canAddNumbers() {assertEquals(2,calculator.addNumber());}

    @Test
    public void canSubtractNumbers() {assertEquals(0, calculator.subtractNumber());}


    }


