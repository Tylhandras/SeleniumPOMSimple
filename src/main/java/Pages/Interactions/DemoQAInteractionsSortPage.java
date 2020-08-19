package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DemoQAInteractionsSortPage {
    private WebDriver driver;
    private By list = By.cssSelector("#demo-tab-list");
    private By listContent = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]");
    private By grid = By.cssSelector("#demo-tab-grid");
    private By gridContent = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]");
    private By listOne = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    private By listTwo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]");
    private By listThree = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]");
    private By listFour = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]");
    private By listFive = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]");
    private By listSix = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]");
    private By gridOne = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    private By gridTwo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
    private By gridThree = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]");
    private By gridFour = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]");
    private By gridFive = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]");
    private By gridSix = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]");
    private By gridSeven = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]");
    private By gridEight = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]");
    private By gridNine = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]");

    public DemoQAInteractionsSortPage (WebDriver driver) { this.driver = driver; }

    public void clickSortList () { driver.findElement(list).click(); }

    public void clickSortGrid () { driver.findElement(grid).click(); }

    public void clickListOne (int offset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(listOne)).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListTwo (int offset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(listTwo)).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListThree (int offset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(listThree)).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListFour (int offset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(listFour)).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListFive (int offset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(listFive)).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickListSix (int offset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(listSix)).clickAndHold().moveByOffset(0, offset).release().build().perform();
    }

    public void clickGridOne (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridOne)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridTwo (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridTwo)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridThree (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridThree)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridFour (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridFour)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridFive (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridFive)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridSix (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridSix)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridSeven (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridSeven)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridEight (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridEight)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickGridNine (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.click(driver.findElement(gridNine)).clickAndHold().moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public String getListOrder () {
        List<WebElement> order = driver.findElements(By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action']"));
        String output = "";

        for (WebElement element : order)
            output += (element.getText() + " ");

        return output;
    }

    public String getGridOrder () {
        List<WebElement> order = driver.findElements(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action']"));
        String output = "";

        for (WebElement element : order)
            output += (element.getText() + " ");

        return output;
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
