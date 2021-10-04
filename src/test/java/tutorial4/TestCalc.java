package tutorial4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc
{
//    App app=new App();
@Test
    public void testApp()
    {
        assertEquals(Calc.add(3,5),8);
        assertEquals(Calc.add(2223,1005),3228);
    }
}

