package Test;

import common.EnglishLanguageLabelConstants;
import functions.CreateSession;
import functions.Home;
import functions.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.Base;
import utils.ScreenshotListener;
import utils.Utils;

import java.time.Duration;

import static common.UIConstants.WEB_URL;

@Listeners(ScreenshotListener.class)
public class CreateDeleteEditSessionTest extends Base {
    SoftAssert softAssert = new SoftAssert();
    String EMAIL = Utils.getProperty("email");
    String PASSWORD = Utils.getProperty("password");
    String EVENT_NAME = Utils.getProperty("event_name");
    String Description = Utils.getProperty("description");


    @BeforeMethod(alwaysRun = true)
    public void setup() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis()); // ensure unique profile

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        //       driver = WebDriverManager.chromedriver().create();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(WEB_URL);
        Login.loginToWebAdmin(EMAIL, PASSWORD);
        waitInSeconds(5);

    }

    @Test(description = "Verify Session Creation")
    public void verifyDistanceBasePrivetEventCreate() throws InterruptedException {


        Home.clickCreateCrowdEventBtn();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getDefineYourEventText(), EnglishLanguageLabelConstants.Define_your_event);
        softAssert.assertEquals(CreateSession.getEventNameText(), EnglishLanguageLabelConstants.EVENT_NAME);
        CreateSession.addEventName(EVENT_NAME);
        CreateSession.addDescription(Description);
        waitInSeconds(5);
        CreateSession.clickOnDefineYourEventNextButton();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getSelectHostAndAvailabilityText(), EnglishLanguageLabelConstants.Select_host_availability);
        softAssert.assertEquals(CreateSession.getHostText(), EnglishLanguageLabelConstants.HOST);
        CreateSession.clickOnToggleButton();
        waitInSeconds(5);
        CreateSession.clickOnSelectHostAndAvailabilityNextButton();
        softAssert.assertEquals(CreateSession.getSetTimeAndDateText(), EnglishLanguageLabelConstants.Set_time_and_date);
        softAssert.assertEquals(CreateSession.getStartTimeText(), EnglishLanguageLabelConstants.START_TIME);
        waitInSeconds(5);
        CreateSession.clickOnNextButton();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getBrandYourEventText(), EnglishLanguageLabelConstants.Brand_your_event);
        softAssert.assertEquals(CreateSession.getSelectCoverImageText(), EnglishLanguageLabelConstants.SELECT_COVER_IMAGE);
        CreateSession.clickOnSelectOnlineButton();
        waitInSeconds(5);
        CreateSession.clickOnImage();
        waitInSeconds(5);
        CreateSession.clickOnConfirmButton();
        waitInSeconds(5);
        CreateSession.clickOnSummaryButton();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getSummaryText(), EnglishLanguageLabelConstants.Summary);
        softAssert.assertEquals(CreateSession.getNameText(), EnglishLanguageLabelConstants.Summary_Name);
        CreateSession.clickOnPublishButton();
        waitInSeconds(5);
        Home.clickMySession();
        waitInSeconds(5);
        softAssert.assertEquals(Home.getUpcomingText(), EnglishLanguageLabelConstants.Upcoming);

    }

    @Test(description = "Verify Session Delete")
    public void deleteSession() {


        Home.clickDeleteIcon();
        waitInSeconds(5);
        softAssert.assertEquals(Home.getDeleteYesText(), EnglishLanguageLabelConstants.Delete_Yes);
        Home.clickDeleteYesButton();
        waitInSeconds(5);
        softAssert.assertEquals(Home.getUpcomingText(), EnglishLanguageLabelConstants.Upcoming);


    }

    @Test(description = "Verify Session Edit")
    public void editSession() throws InterruptedException {
        Home.clickEditButton();
        CreateSession.addEventName(EVENT_NAME);
        CreateSession.addDescription(Description);
        waitInSeconds(5);
        CreateSession.clickOnDefineYourEventNextButton();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getSelectHostAndAvailabilityText(), EnglishLanguageLabelConstants.Select_host_availability);
        softAssert.assertEquals(CreateSession.getHostText(), EnglishLanguageLabelConstants.HOST);
        CreateSession.clickOnToggleButton();
        waitInSeconds(5);
        CreateSession.clickOnSelectHostAndAvailabilityNextButton();
        softAssert.assertEquals(CreateSession.getSetTimeAndDateText(), EnglishLanguageLabelConstants.Set_time_and_date);
        softAssert.assertEquals(CreateSession.getStartTimeText(), EnglishLanguageLabelConstants.START_TIME);
        waitInSeconds(5);
        CreateSession.clickOnNextButton();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getBrandYourEventText(), EnglishLanguageLabelConstants.Brand_your_event);
        CreateSession.clickOnSummaryButton();
        waitInSeconds(5);
        softAssert.assertEquals(CreateSession.getSummaryText(), EnglishLanguageLabelConstants.Summary);
        softAssert.assertEquals(CreateSession.getNameText(), EnglishLanguageLabelConstants.Summary_Name);
        CreateSession.clickOnPublishButton();
        waitInSeconds(5);
        Home.clickMySession();
        waitInSeconds(5);
        softAssert.assertEquals(Home.getUpcomingText(), EnglishLanguageLabelConstants.Upcoming);

        ;

    }

    @AfterMethod
    public void browserClose() {
        waitInSeconds(5);
        driver.close();

    }


}
