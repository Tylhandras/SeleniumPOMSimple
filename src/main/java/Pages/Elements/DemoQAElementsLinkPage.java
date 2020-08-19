package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class DemoQAElementsLinkPage {
    private WebDriver driver;
    private By home = By.cssSelector("#simpleLink");
    private By dynamicHome = By.cssSelector("#dynamicLink");
    private By created = By.cssSelector("#created");
    private By noContent = By.cssSelector("#no-content");
    private By moved = By.cssSelector("#moved");
    private By badRequest = By.cssSelector("#bad-request");
    private By unauthorized = By.cssSelector("#unauthorized");
    private By forbidden = By.cssSelector("#forbidden");
    private By notFound = By.cssSelector("#invalid-url");
    private By linkResponse = By.cssSelector("#linkResponse");

    public DemoQAElementsLinkPage (WebDriver driver) { this.driver = driver; }

    public void clickHome () { driver.findElement(home).click(); }

    public void clickDynamicHome () { driver.findElement(dynamicHome).click(); }

    public void clickCreated () { driver.findElement(created).click(); }

    public void clickNoContent () { driver.findElement(noContent).click(); }

    public void clickMoved () { driver.findElement(moved).click(); }

    public void clickBadRequest () { driver.findElement(badRequest).click(); }

    public void clickUnauthorized () { driver.findElement(unauthorized).click(); }

    public void clickForbidden () { driver.findElement(forbidden).click(); }

    public void clickNotFound () { driver.findElement(notFound).click(); }

    public void closeTab () {
        ArrayList<String> windowHandles;
        WebDriverWait wait = new WebDriverWait (driver, 30);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        windowHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        });
        driver.close();
        driver.switchTo().window(windowHandles.get(0));
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public String getResponse () { return driver.findElement(linkResponse).getText(); }

    public int getNumTabsOpen () { return new ArrayList<String>(driver.getWindowHandles()).size(); }

    public void refreshPage () { driver.navigate().refresh(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
