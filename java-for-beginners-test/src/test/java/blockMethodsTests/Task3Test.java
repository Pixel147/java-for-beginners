package blockMethodsTests;

import blockMethods.Task3;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task3Test {
    @Test(dataProvider = "dataProvider")
    public void inputIntegersToIntEx(int[] arr,double res)
    {
        assertEquals(new Task3().averageArray(arr),res);
    }
    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][] {
                {new int[]{1,2,3,4,5},3.0},
                {new int[]{-1,-2,-3,-4,-5},-3.0},
                {new int[]{},0.0},
                {new int[]{1,2,3,4,5,6},3.5}
        };
    }
}
