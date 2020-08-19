package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQAWidgetsAutoPage {
    private WebDriver driver;
    private By multiIn = By.cssSelector("#autoCompleteMultipleInput");
    private By multiInValue = By.className("css-12jo7m5");
    private By singleIn = By.cssSelector("#autoCompleteSingleInput");
    private By singleInValue = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    private By deleteAll = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]");
    private By deleteItem = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");

    public DemoQAWidgetsAutoPage (WebDriver driver) { this.driver = driver; }

    public void setMultipleInput (String string) {
        driver.findElement(multiIn).sendKeys(string);
        driver.findElement(multiIn).sendKeys(Keys.RETURN);
    }

    public void setSingleInput (String string) {
        driver.findElement(singleIn).sendKeys(string);
        driver.findElement(singleIn).sendKeys(Keys.RETURN);
    }

    public String getMultipleInput () {
        List<WebElement> temp = driver.findElements(multiInValue);
        String output = "";

        for (WebElement iter : temp)
            output += (iter.getText() + " ");

        return output;
    }

    public String getSingleInput () { return driver.findElement(singleInValue).getText(); }

    public void clearEntry () { driver.findElement(deleteItem).click(); }

    public void clearALl() { driver.findElement(deleteAll).click(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
