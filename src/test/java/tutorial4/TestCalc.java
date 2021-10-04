package tutorial4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc
{
@Test
    public void testAdd()
    {
        assertEquals(Calc.add(3,5),8);
    }

@Test
    public void testSubtract()
    {
        assertEquals(Calc.subtract(5,3),2);
        
    }
}



