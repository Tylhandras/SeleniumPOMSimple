package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DemoQAWidgetsDatePage {
    private WebDriver driver;
    private By date = By.cssSelector("#datePickerMonthYearInput");
    private By dateTime = By.cssSelector("#dateAndTimePickerInput");

    public DemoQAWidgetsDatePage (WebDriver driver) { this.driver = driver; }

    public void setDate (String string) {
        driver.findElement(date).sendKeys(Keys.CONTROL + "a");
        driver.findElement(date).sendKeys(string);
        driver.findElement(date).sendKeys(Keys.RETURN);
    }

    public void setDayAndTime (String string) {
        driver.findElement(dateTime).sendKeys(Keys.CONTROL + "a");
        driver.findElement(dateTime).sendKeys(string);
        driver.findElement(dateTime).sendKeys(Keys.RETURN);
    }

    public String getDate () { return driver.findElement(date).getAttribute("value"); }

    public String getDayAndTime () { return driver.findElement(dateTime).getAttribute("value"); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
