package pages;

import org.openqa.selenium.By;
import utils.Base;

public class CreateSessionPage extends Base {
    //Define your Session SubPage
    private final By event_name_input = By.id("create-event-text-event-name");
    private final By description_input = By.id("create-event-text-description");
    private final By select_distance_or_time_base_toggle = By.xpath("//div[@class='react-switch-handle']");
    private final By define_your_event_next_btn = By.id("create-event-step1-next");
    private final By define_your_event__text = By.id("create-event-step1-title");
    private final By event_name_text = By.id("create-event-label-event-name");


    //Select host & availability SubPage

    private final By select_host_and_availability_next_btn = By.id("create-event-step2-next");
    private final By select_host_and_availability_txt = By.id("create-event-step2-title");
    private final By host_txt = By.id("create-event-label-host");


    //Set time and date

    private final By set_time_and_date_text = By.id("create-event-step3-title");
    private final By start_time_text = By.id("create-event-label-start-time");
    private final By set_time_and_date_next_btn = By.id("create-event-step3-next");

    //Brand your session
    private final By brand_your_event_text = By.id("create-event-step4-title");
    private final By select_cover_image_text = By.id("create-event-label-select-image");
    private final By select_online_btn = By.xpath("//button[@class='_primaryButton_1ssy3_1 btn btn-primary']");

    private final By summary_btn = By.id("create-event-step4-summary");
    private final By sun_img = By.xpath("//img[@alt='silhouette photo of a person running on road']");
    private final By confirm_btn = By.xpath("//button[@class='_primaryButton_1ssy3_1 btn btn-primary']");



    //Summary
    private final By summary_text = By.id("create-event-summary-title");
    private final By name_text = By.xpath("//h6[text()='Name']");
    private final By publish_btn = By.id("create-event-summary-publish");
    private final By your_event_has_been_created_text = By.xpath("//h2[text()='Your event has been created']");
    private final By share_event_text = By.xpath("//h6[text()='Share the event over social media']");
    private final By done_btn = By.xpath("//button[@class='button_primaryButton__ZmHde btn btn-primary']");


    //Define your Session SubPage
    public void clickOnDefineYourEventNextButton() {
        driver.findElement(define_your_event_next_btn).click();
    }


    public void addEventName(String event_name) {

        driver.findElement(event_name_input).sendKeys(event_name);

    }

    public void addDescription(String description) {

        driver.findElement(description_input).sendKeys(description);

    }

    public void clickOnToggleButton() {

        driver.findElement(select_distance_or_time_base_toggle).click();

    }

    public String getDefineYourEventText() {
        return driver.findElement(define_your_event__text).getText();
    }

    public String getEventNameText() {
        return driver.findElement(event_name_text).getText();
    }


    //Select host & availability SubPage


    public void clickOnSelectHostAndAvailabilityNextButton() {
        driver.findElement(select_host_and_availability_next_btn).click();
    }


    public String getSelectHostAndAvailabilityText() {
        return driver.findElement(select_host_and_availability_txt).getText();
    }

    public String getHostText() {
        return driver.findElement(host_txt).getText();
    }


    //Set time and date


    public String getSetTimeAndDateText() {
        return driver.findElement(set_time_and_date_text).getText();

    }

    public String getStartTimeText() {
        return driver.findElement(start_time_text).getText();

    }


    public void clickOnNextButton() {
        driver.findElement(set_time_and_date_next_btn).click();
    }


    //Brand your session


    public void clickOnSelectOnlineButton() {
        driver.findElement(select_online_btn).click();
    }

    public void clickOnSummaryButton() {
        driver.findElement(summary_btn).click();
    }


    public void clickOnConfirmButton() {
        driver.findElement(confirm_btn).click();
    }

    public void clickOnImage() {
        driver.findElement(sun_img).click();
    }

    public String getBrandYourEventText() {
        return driver.findElement(brand_your_event_text).getText();
    }

    public String getSelectCoverImageText() {
        return driver.findElement(select_cover_image_text).getText();
    }


    //Summary

    public String getSummaryText() {
        return driver.findElement(summary_text).getText();

    }

    public String getNameText() {
        return driver.findElement(name_text).getText();

    }


    public String getYourEventCreatedText() {
        return driver.findElement(your_event_has_been_created_text).getText();

    }

    public String getShareEventText() {
        return driver.findElement(share_event_text).getText();

    }

    public void clickOnDoneButton() {

        driver.findElement(done_btn).click();
    }


    public void clickOnPublishButton() {

        driver.findElement(publish_btn).click();
    }


}
