package Pages.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAAlertsFramePage {
    private WebDriver driver;
    private By frame1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/iframe[1]");
    private By frame2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/iframe[1]");

    public DemoQAAlertsFramePage (WebDriver driver) { this.driver = driver; }

    public void switchToFrame1 () { driver.switchTo().frame(driver.findElement(frame1)); }

    public void switchToFrame2 () { driver.switchTo().frame(driver.findElement(frame2)); }

    public void returnToPage () { driver.switchTo().defaultContent(); }

    public String getFrame1Text () { return driver.findElement(By.cssSelector("#sampleHeading")).getText(); }

    public String getFrame2Text () { return driver.findElement(By.cssSelector("#sampleHeading")).getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
