package blockMethodsTests;

import blockMethods.Task6;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task6Test {
    @Test(dataProvider = "dataProvider")
    public void testTask6(String str,String res)
    {
        assertEquals(new Task6().reverseWords(str), res);
    }
    @DataProvider
    public Object[][] dataProvider()
    {
        return new Object[][] {
                {"hello world", "world hello"},
                {"",""},
                {"hello","hello"},
                {"123 456 789","789 456 123"}
        };
    }
}
