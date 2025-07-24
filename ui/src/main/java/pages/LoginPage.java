package pages;

import org.openqa.selenium.By;
import utils.Base;

public class LoginPage extends Base {

    private final By email_input = By.id("formGroupEmail");
    private final By password_input = By.id("formGroupPassword");
    private final By login_btn = By.xpath("//button[@type='submit']");
    private final By email_txt = By.xpath("//span[text()='EMAIL']");
    private final By password_txt = By.xpath("//div[text()='PASSWORD']");
    private final By invalid_credential_txt = By.xpath("//p[text()='INVALID CREDENTIALS']");
    private final By logout_btn = By.xpath("//button[@class='flex items-center space-x-2 focus:outline-none appearance-none']");
    private final By sprint_crowd_logo = By.xpath("//img[@src='/assets/sc-logo-BJkKU2tD.png']");
    private final By login_btn_txt = By.xpath("//span[text()='EMAIL']");


    public void addPassword(String password) {
        driver.findElement(password_input).sendKeys(password);
    }

    public void addEmail(String email) {
        driver.findElement(email_input).sendKeys(email);
    }

    public void clickOnLoginButton() {
        driver.findElement(login_btn).click();
    }

    public String getEmailText() {
        return driver.findElement(email_txt).getText();
    }

    public String getLoginButtonText() {
        return driver.findElement(login_btn_txt).getText();
    }

    public String getPasswordText() {
        return driver.findElement(password_txt).getText();
    }

    public String getInvalidCredentialText() {
        return driver.findElement(invalid_credential_txt).getText();
    }

    public void clickOnLogoutButton() {
        driver.findElement(logout_btn).click();
    }

    public boolean checkSprintCrowdLogoAvailable() {
        return driver.findElement(sprint_crowd_logo).isDisplayed();
    }


}
