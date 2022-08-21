package weightwatchers.core.pages;

import framework.Actions.AssertActions;
import framework.Actions.GeneralActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Data;

import java.util.List;

public class WorkshopStudio {
    public WorkshopStudio(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    Data constants = new Data();
    GeneralActions commonOperations = new GeneralActions();
    AssertActions assertOperations = new AssertActions();

    @FindBy( className = "locationName-1jro_")
    public WebElement locationName;

    @FindBy( className = "title-3o8Pv")
    public WebElement btnBusinessHours;

    String businessHoursDay = "dayName-CTNC6";
    String businessHoursList = "times-fms3v";

    public void checkTitles(String title) {
        assertOperations.assertEquals(title, commonOperations.getText(locationName),
                constants.locationTitleErrorMessage);
    }

    public void clickBusinessHours() {
        commonOperations.clickElement(btnBusinessHours);
    }

    public void printBusinessHours() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> businessDays = commonOperations.findElements(By.className(businessHoursDay));
        Thread.sleep(3000);
        List<WebElement> businessHours = commonOperations.findElements(By.className(businessHoursList));

        System.out.println("\n"+"Business hours");
        for(int i = 0; i < businessDays.size(); i++) {
            System.out.print(commonOperations.getText(businessDays.get(i)) + "  ");
            System.out.println(commonOperations.getText(businessHours.get(i)));
        }
    }


}
