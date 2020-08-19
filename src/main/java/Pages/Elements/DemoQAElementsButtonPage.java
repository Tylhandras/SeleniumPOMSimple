package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElementsButtonPage {
    private WebDriver driver;
    private By doubleClick = By.cssSelector("#doubleClickBtn");
    private By rightClick = By.cssSelector("#rightClickBtn");
    private By singleClick = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]");
    private By doubleMessage = By.cssSelector("#doubleClickMessage");
    private By rightMessage = By.cssSelector("#rightClickMessage");
    private By singleMessage = By.cssSelector("#dynamicClickMessage");

    public DemoQAElementsButtonPage (WebDriver driver) { this.driver = driver; }

    public void clickDouble() {
        Actions action = new Actions(driver);

        action.doubleClick(driver.findElement(doubleClick)).perform();
    }

    public void clickRight() {
        Actions action = new Actions(driver);

        action.contextClick(driver.findElement(rightClick)).perform();
    }

    public void clickSingle() { driver.findElement(singleClick).click(); }

    public String getDoubleMessage () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(doubleMessage)));

        return driver.findElement(doubleMessage).getText();
    }

    public String getRightMessage () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(rightMessage)));

        return driver.findElement(rightMessage).getText();
    }

    public String getSingleMessage () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(singleMessage)));

        return driver.findElement(singleMessage).getText();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
