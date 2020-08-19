package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsProgressPage {
    private WebDriver driver;
    private By progressBar = By.xpath("//div[@class='progress-bar bg-info']");
    private By startStop = By.cssSelector("#startStopButton");
    private By resetBtn = By.cssSelector("#resetButton");

    public DemoQAWidgetsProgressPage (WebDriver driver) { this.driver = driver; }

    public void clickStartStop () { driver.findElement(startStop).click(); }

    public void clickReset () { driver.findElement(resetBtn).click(); }

    public String getProgress () { return driver.findElement(progressBar).getAttribute("aria-valuenow"); }

    public void progressWait (String string) {
        WebDriverWait wait = new WebDriverWait(driver, 30, 5);

        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(progressBar).getAttribute("aria-valuenow").equals(string);
            }
        });
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
