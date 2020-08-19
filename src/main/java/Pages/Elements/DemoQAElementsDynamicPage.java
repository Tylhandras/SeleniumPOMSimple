package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElementsDynamicPage {
    private WebDriver driver;

    private By enableBtn = By.cssSelector("#enableAfter");
    private By colorBtn = By.cssSelector("#colorChange");
    private By invisibleBtn = By.cssSelector("#visibleAfter");

    public DemoQAElementsDynamicPage (WebDriver driver) { this.driver = driver; }

    public void runInvisible () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(invisibleBtn)));
    }

    public boolean getVisible () { return driver.findElement(invisibleBtn).isDisplayed(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
