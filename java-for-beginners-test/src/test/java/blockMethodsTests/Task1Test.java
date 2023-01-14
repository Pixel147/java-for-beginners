package blockMethodsTests;

import blockMethods.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task1Test {
    @Test(dataProvider = "dataProvider")
    public void testTask1(int a,int b, int res)
    {
        assertEquals(new Task1().maxInt(a,b), res);
    }
    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][] {
                {1,2,2},
                {2,1,2},
                {-2,2,2},
                {2,-2,2},
                {-4,-2,-2},
                {2,2,2}
        };
    }
}
