package Pages.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAAlertsPage {
    private WebDriver driver;
    private By browserWindows = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]");
    private By alerts = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]");
    private By frames = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]");
    private By nestedFrames = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]");
    private By modalDialog = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]");

    public DemoQAAlertsPage (WebDriver driver) { this.driver = driver; }

    public void clickBrowser () {
        driver.findElement(browserWindows).click();
    }

    public void clickAlerts () {
        driver.findElement(alerts).click();
    }

    public void clickFrames () {
        driver.findElement(frames).click();
    }

    public void clickNested () {
        driver.findElement(nestedFrames).click();
    }

    public void clickModal () {
        driver.findElement(modalDialog).click();
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
