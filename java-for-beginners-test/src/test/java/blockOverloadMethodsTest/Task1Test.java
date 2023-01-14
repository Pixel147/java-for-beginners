package blockOverloadMethodsTest;

import blockOverloadMethods.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1Test {
    @Test
    public void testAddTwoNumbers()
    {
        int a = 1, b = 2, res = 3;
        assertEquals(new Task1().add(a,b),res);
    }
    @Test
    public void testAddThreeNumbers()
    {
        int a = 1, b = 2, c = -3, res = 0;
        assertEquals(new Task1().add(a,b,c),res);
    }
    @Test
    public void testAddFourNumbers()
    {
        int a = 1, b = 2, c = 3, d =4 , res = 3;
        assertEquals(new Task1().add(a,b,c,d),res);
    }
}
