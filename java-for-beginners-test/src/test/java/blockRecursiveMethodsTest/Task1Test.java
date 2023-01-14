package blockRecursiveMethodsTest;

import blockRecursiveMethods.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1Test {
    @Test(dataProvider = "dataProvider")
    public void test(int n, int res)
    {
        assertEquals(new Task1().sum(n),res);
    }

    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][]{
                {5,15},
                {10,55},
                {0,0},
                {-5,0}
        };
    }
}
