package weightwatchers.core.pages;

import framework.Actions.AssertActions;
import framework.Actions.GeneralActions;
import framework.Actions.WaitActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Data;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    GeneralActions commonOperations = new GeneralActions();
    AssertActions assertOperations = new AssertActions();
    Data constants = new Data();
    WaitActions waitOperations = new WaitActions();

    @FindBy(className = "buttonText-3DCCO")
    public WebElement buttonInPerson;

    @FindBy(id = "location-search")
    public WebElement txtLocationSearch;

    @FindBy(id = "location-search-cta")
    public WebElement btnLocationSearch;

    @FindBy(css = "div[id='location-1252089'] a[class='linkUnderline-1_h4g']")
    public WebElement titleOfTheFirstResult;

    @FindBy(css = "div[id='location-1252089'] span[class='distance-OhP63']")
    public WebElement distanceOfTheFirstResult;

    @FindBy( id = "location-1252089")
    public WebElement firstResult;

    public void checkTitle() {
        assertOperations.assertEquals(constants.title, commonOperations.getTitle(), constants.titleErrorMessage);
    }

    public void clickInPerson() {
        commonOperations.clickElement(buttonInPerson);
    }

    public void enterZipCode() {
        commonOperations.sendKeys(txtLocationSearch, constants.zipCode);
    }

    public void clickLocationSearch() {
        commonOperations.clickElement(btnLocationSearch);
    }

    public String printTitleOfTheFirstResult() {
        waitOperations.implicitlyWait(10);
        String title = commonOperations.getText(titleOfTheFirstResult);
        System.out.println("\n"+"Location: " + commonOperations.getText(titleOfTheFirstResult));

        return title;
    }

    public void printDistanceOfTheFirstResult() {
        System.out.println("Distance: " + commonOperations.getText(distanceOfTheFirstResult));
    }

    public void clickFirstResult() {
        commonOperations.clickElement(firstResult);
    }





}
