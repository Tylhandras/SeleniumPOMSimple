package Pages.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAAlertsAlertPage {
    private WebDriver driver;
    private By alertBtn = By.cssSelector("#alertButton");
    private By delayBtn = By.cssSelector("#timerAlertButton");
    private By confirmBtn = By.cssSelector("#confirmButton");
    private By promptBtn = By.cssSelector("#promtButton");

    public DemoQAAlertsAlertPage (WebDriver driver) { this.driver = driver; }

    public void clickAlert() { driver.findElement(alertBtn).click(); }

    public void clickDelay() { driver.findElement(delayBtn).click(); }

    public void clickConfirm() { driver.findElement(confirmBtn).click(); }

    public void clickPrompt() { driver.findElement(promptBtn).click(); }

    public void ackAlert() {
        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();

        alert.dismiss();
    }

    public void setAlert(String string) {
        Alert alert = driver.switchTo().alert();

        alert.sendKeys(string);
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public boolean isAlertPresent() {
        WebDriverWait wait = new WebDriverWait (driver, 30);
        wait.until(ExpectedConditions.alertIsPresent());

        try {
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException Ex) { return false; }
    }
}
