package blockMethodsTests;

import blockMethods.Task2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2Test {
    @Test(dataProvider = "dataProvider")
    public void inputIntegersToIntEx(String str, String res)
    {
        assertEquals(new Task2().reverseString(str),res);
    }
    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][] {
                {"hello","olleh"},
                {"",""},
                {"madam","madam"},
                {"12345","54321"}
        };
    }
}
