package Pages.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAAlertsModalPage {
    private WebDriver driver;
    private By smallModal = By.cssSelector("#showSmallModal");
    private By largeModal = By.cssSelector("#showLargeModal");
    private By closeSmall = By.cssSelector("#closeSmallModal");
    private By closeLarge = By.cssSelector("#closeLargeModal");
    private By modalBody = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]");

    public DemoQAAlertsModalPage (WebDriver driver) { this.driver = driver; }

    public void clickSmallModal () { driver.findElement(smallModal).click(); }

    public void clickLargeModal () { driver.findElement(largeModal).click(); }

    public void closeSmallModal () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeSmall)));
        driver.findElement(closeSmall).click();
    }

    public void closeLargeModal () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeLarge)));
        driver.findElement(closeLarge).click();
    }

    public String getModalText () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalBody)));
        return driver.findElement(modalBody).getText();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
