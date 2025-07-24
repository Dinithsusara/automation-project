package Test;

import common.EnglishLanguageLabelConstants;
import functions.Home;
import functions.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Base;
import utils.Utils;

import java.time.Duration;


import static common.UIConstants.WEB_URL;

public class WebLoginTest extends Base {


    String EMAIL = Utils.getProperty("email");
    String PASSWORD = Utils.getProperty("password");
    String INVALID_EMAIL = Utils.getProperty("invalid_email");

    @BeforeMethod(alwaysRun = true)
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // or "--headless"
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--remote-allow-origins=*"); // sometimes needed in CI
        options.addArguments("--user-data-dir=/tmp/chrome-profile-" + System.currentTimeMillis()); // ensure unique profile

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(WEB_URL);
        waitInSeconds(5);


    }


    @Test(description = "verify Successfully Login")
    public void verifySuccessfullyLoginLogout() throws InterruptedException {


        softAssert.assertTrue(Login.checkSprintCrowdLogoAvailable());
        softAssert.assertEquals(Login.getEmailText(), EnglishLanguageLabelConstants.Email);
        softAssert.assertEquals(Login.getPasswordText(), EnglishLanguageLabelConstants.Password);
        Login.loginToWebAdmin(EMAIL, PASSWORD);
        waitInSeconds(5);
        softAssert.assertEquals(Home.getUpcomingText(), EnglishLanguageLabelConstants.Upcoming);
        softAssert.assertAll();


    }

    @Test(description = "verify the login with InvalidEmailId")
    public void verifyWithInvalidEmailId() throws InterruptedException {
        Login.loginToWebAdmin(INVALID_EMAIL, PASSWORD);
        waitInSeconds(5);
        softAssert.assertEquals(Login.getInvalidCredentialText(), EnglishLanguageLabelConstants.Invalid_Credentials);
        softAssert.assertAll();


    }

    @AfterMethod
    public void browserClose() {
        waitInSeconds(5);
        driver.close();

    }

}
