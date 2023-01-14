package blockMethodsTests;

import blockMethods.Task4;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task4Test {
    @Test(dataProvider = "dataProvider")
    public void inputIntegersToIntEx(String[] arr,int[] res)
    {
        assertEquals(new Task4().stringLength(arr),res);
    }
    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][] {
                {new String[]{"hello", "world", "test"}, new int[] {5, 5, 4}},
                {new String[]{}, new int[]{}},
                {new String[]{"hello"},new int[]{5}},
                {new String[]{"1", "22", "333"},new int[]{1,2,3}}
        };
    }
}
