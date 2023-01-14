package blockRecursiveMethodsTest;

import blockRecursiveMethods.Task2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2Test {
    @Test(dataProvider = "dataProvider")
    public void test(int n, int res)
    {
        assertEquals(new Task2().factorial(n),res);
    }

    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][]{
                {5,120},
                {3,6},
                {0,1},
                {-5,1}
        };
    }
}
