package weightwatchers.core.tests;

import org.testng.annotations.Test;
import weightwatchers.core.BaseTest;
import weightwatchers.core.pages.HomePage;
import weightwatchers.core.pages.WorkshopStudio;

public class CheckWeightWatchersTest extends BaseTest {
    @Test
    public void Control() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());

        homePage.checkTitle();
    }

    @Test
    public void Control2() throws InterruptedException {
        HomePage homePage = new HomePage(getDriver());

        homePage.clickInPerson();
        homePage.enterZipCode();
        homePage.clickLocationSearch();
        String title = homePage.printTitleOfTheFirstResult();
        homePage.printDistanceOfTheFirstResult();
        homePage.clickFirstResult();

        WorkshopStudio workshopStudio = new WorkshopStudio(getDriver());

        workshopStudio.checkTitles(title);
        workshopStudio.clickBusinessHours();
        workshopStudio.printBusinessHours();

    }




}
