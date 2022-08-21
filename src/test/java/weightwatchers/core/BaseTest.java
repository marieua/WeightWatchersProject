package weightwatchers.core;

import framework.Actions.SetUp.GeneralTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Data;

public class BaseTest extends GeneralTest {
    Data constants = new Data();

    @BeforeMethod
    public void start(){
        getDriver().manage().window().maximize();
        getDriver().get(constants.url);
    }

    @AfterMethod
    public void end(){
        getDriver().quit();
    }


}
