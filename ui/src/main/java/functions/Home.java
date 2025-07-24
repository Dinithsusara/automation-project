package functions;

import pages.HomePage;

public class Home {
    static HomePage homePage = new HomePage();


    public static void clickCreateCrowdEventBtn() {
        homePage.clickCreateCrowdEventBtn();

    }

    public static void clickMySession() {
        homePage.clickMySession();

    }

    public static String getUpcomingText() {
        return homePage.getUpcomingText();

    }

    public static String getAllCrowdEventText() {
        return homePage.getAllCrowdEventText();

    }

    public static void clickDeleteIcon() {
        homePage.clickDeleteIcon();

    }

    public static void clickDeleteYesButton() {
        homePage.clickDeleteYesButton();

    }

    public static void clickEditButton() {
        homePage.clickEditButton();

    }

    public static String getDeleteYesText() {

        return homePage.getDeleteYesText();
    }
}
