package functions;

import pages.LoginPage;

public class Login {


    static LoginPage loginPage = new LoginPage();


    public static void loginToWebAdmin(String email, String password) throws InterruptedException {

        loginPage.addEmail(email);
        Thread.sleep(500);
        loginPage.addPassword(password);
        Thread.sleep(500);
        loginPage.clickOnLoginButton();

    }


    public static String getEmailText() {
        return loginPage.getEmailText();

    }

    public static String getLoginButtonText() {
        return loginPage.getLoginButtonText();


    }

    public static String getPasswordText() {

        return loginPage.getPasswordText();

    }

    public static String getInvalidCredentialText() {
        return loginPage.getInvalidCredentialText();

    }

    public static void clickOnLogoutButton() {

        loginPage.clickOnLogoutButton();
    }

    public static boolean checkSprintCrowdLogoAvailable() {
        return loginPage.checkSprintCrowdLogoAvailable();

    }
}
