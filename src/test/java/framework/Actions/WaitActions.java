package framework.Actions;

import framework.Actions.SetUp.GeneralTest;

import java.time.Duration;

public class WaitActions extends GeneralTest {

    public void implicitlyWait(int time) {
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
}

