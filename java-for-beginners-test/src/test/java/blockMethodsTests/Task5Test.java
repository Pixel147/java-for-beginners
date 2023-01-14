package blockMethodsTests;

import blockMethods.Task5;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task5Test {
    @Test(dataProvider = "dataProvider")
    public void inputIntegersToIntEx(int[] arr,int[] res)
    {
        assertEquals(new Task5().getMinMax(arr),res);
    }
    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][] {
                {new int[]{1,2,3,4,5}, new int[] {1,5}},
                {new int[]{}, new int[]{0,0}},
                {new int[]{-1,-2,-3,-4,-5},new int[]{-5,-1}},
                {new int[]{4,4,4,4,4},new int[]{4,4}}
        };
    }
}
