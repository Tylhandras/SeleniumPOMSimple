package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAElementsRadioPage {
    private WebDriver driver;
    private By yesBtn = By.cssSelector("#yesRadio");
    private By impressBtn = By.cssSelector("#impressiveRadio");

    public DemoQAElementsRadioPage (WebDriver driver) { this.driver = driver; }

    public void clickYesBtn () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(yesBtn));
    }

    public void clickImpress () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(impressBtn));
    }

    public boolean getRadioYes () { return driver.findElement(yesBtn).isSelected(); }

    public boolean getRadioImpressive () { return driver.findElement(impressBtn).isSelected(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
