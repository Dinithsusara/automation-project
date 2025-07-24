package pages;

import org.openqa.selenium.By;
import utils.Base;

public class HomePage extends Base {

    private final By create_new_crowd_event_btn = By.xpath("//button[@type='button']");
    private final By upcoming_txt = By.id("controlled-tab-example-tab-upcoming");
    private final By all_crowd_event_txt = By.xpath("//h3[text()='ALL CROWD EVENTS']");
    private final By my_session_btn = By.xpath("//span[text()='My Sessions']");
    private final By delete_btn = By.xpath("//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAE/SURBVHgB7dmBTcMwFEXRC2KAjOARMkKZgG4QMQGMwCaICYAJYAQ2aJiAbgC2AqpFmzSpHcuN35GeZDVupH65svUNIiIiIiIiIlKaC9KqbNY2puf5l82rTcsC1TYbm+8RaVgYw/gf/5cVCVyRxordsm9tnnrmNd48N35nIZ4Zt7xrb96GBC5Jo/LGnwPztiSWqgDZKr4AMc8Bhu6/Xh14Vnmfbxle6sYbtweeu+/e2nyQmQembXMheSFDUw46oVkTyRxHYWPzxm4pXxN2tP3/Lrf0k+8WU/krwRAm5rv2aBukcCoAhVMBKJwKQOFUAAqnAlA4FYDCpSiA4XSG4y2yIHNdjLj7vbvf8SP9FyHH3Hjj7HqAQwzdRWfMNljDmYnVI3SFvGcmKa7HXQOz5jQtXQc4+x6giIiIiIiIiJyPHypGmhFxfPCMAAAAAElFTkSuQmCC']");
    private final By delete_yes_btn = By.xpath("//button[@class='_primaryButton_1ssy3_1 btn btn-primary']");
    private final By edit_btn = By.xpath("//img[@src='data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAEgSURBVHgB7djNUcMwEIbhj58CKGE7ATrgyC3qIC2oBDqADqAcbnEJdADSjJloJBlysBPZep+ZnSReX771rGZiCQAAAAAAAH25UZvuQj2Hehq/f6ojFuoQ6jupV3XCVIbvZgimMvy7OhmCqQzvxp7XxodgKsP77B6f9R+0Eab6zh/GXipdB68NME0fePkQdllvp5Uz1XfeqRzCvnJt1UzTB55UDuG/1VgV09/hfzl1HD7Kd57wWjET4QlPeBG+ivDaUPio6/BOHYePvI6hXibuaS78tZbxVbkWw78lv4dQj+PnxSw1gFyT4aNbLeNex7c28b3+PukNaiT83Lym/8c3e+DNuQLDCf3mnvyV5uVUf8JDqA/VD0cAAAAAAADgjH4AR1/UW8VzZK0AAAAASUVORK5CYII=']");
    private final By delete_yes_text = By.xpath("//span[text()='Yes']");

    public void clickCreateCrowdEventBtn() {
        driver.findElement(create_new_crowd_event_btn).click();

    }

    public void clickMySession() {
        driver.findElement(my_session_btn).click();

    }

    public String getUpcomingText() {

        return driver.findElement(upcoming_txt).getText();
    }

    public String getAllCrowdEventText() {

        return driver.findElement(all_crowd_event_txt).getText();
    }

    public void clickDeleteIcon() {
        driver.findElement(delete_btn).click();

    }

    public void clickDeleteYesButton() {
        driver.findElement(delete_yes_btn).click();

    }
    public void clickEditButton(){
        driver.findElement(edit_btn).click();
    }
    public String getDeleteYesText() {

        return driver.findElement(delete_yes_btn).getText();
    }


}
