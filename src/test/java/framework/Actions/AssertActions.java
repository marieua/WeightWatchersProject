package framework.Actions;
import org.testng.Assert;

public class AssertActions {
    public void assertEquals (String expected, String actual, String errorMessage){
       Assert.assertEquals(actual, expected, errorMessage);
    }
}
