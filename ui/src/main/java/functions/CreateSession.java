package functions;

import pages.CreateSessionPage;

public class CreateSession {

    static CreateSessionPage createSessionPage = new CreateSessionPage();


    //Define your Session SubPage
    public static void clickOnDefineYourEventNextButton() {
        createSessionPage.clickOnDefineYourEventNextButton();
    }


    public static void addEventName(String event_name) {

        createSessionPage.addEventName(event_name);

    }

    public static void addDescription(String description) {

        createSessionPage.addDescription(description);

    }

    public static void clickOnToggleButton() {

        createSessionPage.clickOnToggleButton();

    }

    public static String getDefineYourEventText() {
        return createSessionPage.getDefineYourEventText();
    }

    public static String getEventNameText() {
        return createSessionPage.getEventNameText();
    }


    //Select host & availability SubPage


    public static void clickOnSelectHostAndAvailabilityNextButton() {
        createSessionPage.clickOnSelectHostAndAvailabilityNextButton();
    }


    public static String getSelectHostAndAvailabilityText() {
        return createSessionPage.getSelectHostAndAvailabilityText();
    }

    public static String getHostText() {
        return createSessionPage.getHostText();
    }


    //Set time and date


    public static String getSetTimeAndDateText() {
        return createSessionPage.getSetTimeAndDateText();

    }

    public static String getStartTimeText() {
        return createSessionPage.getStartTimeText();

    }


    public static void clickOnNextButton() {
        createSessionPage.clickOnNextButton();
    }


    //Brand your session


    public static void clickOnSelectOnlineButton() {
        createSessionPage.clickOnSelectOnlineButton();
    }

    public static void clickOnSummaryButton() {
        createSessionPage.clickOnSummaryButton();
    }


    public static void clickOnConfirmButton() {
        createSessionPage.clickOnConfirmButton();
    }

    public static void clickOnImage() {
        createSessionPage.clickOnImage();
    }

    public static String getBrandYourEventText() {
        return createSessionPage.getBrandYourEventText();
    }

    public static String getSelectCoverImageText() {
        return createSessionPage.getSelectCoverImageText();
    }


    //Summary

    public static String getSummaryText() {
        return createSessionPage.getSummaryText();

    }

    public static String getNameText() {
        return createSessionPage.getNameText();

    }


    public static String getYourEventCreatedText() {
        return createSessionPage.getYourEventCreatedText();

    }

    public static String getShareEventText() {
        return createSessionPage.getShareEventText();

    }

    public static void clickOnDoneButton() {

        createSessionPage.clickOnDoneButton();
    }


    public static void clickOnPublishButton() {

        createSessionPage.clickOnPublishButton();
    }

}
