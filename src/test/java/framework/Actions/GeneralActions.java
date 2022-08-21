package framework.Actions;

import framework.Actions.SetUp.GeneralTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GeneralActions extends GeneralTest {
    public String getTitle(){
        return getDriver().getTitle();
    }
    public void clickElement(WebElement webElement){ webElement.click(); }

    public void sendKeys(WebElement webElement, String string) { webElement.sendKeys(string); }

    public String getText(WebElement webElement) { return webElement.getText(); }

    public List<WebElement> findElements(By webElement){ return getDriver().findElements(webElement); }
}
