package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAWidgetsSelectPage {
    private WebDriver driver;
    private By valueSelect = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]");
    private By valueContent = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    private By singleSelect = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]");
    private By singleContent = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]");
    private By oldSelect = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/select[1]");
    private By valueOption1 = By.cssSelector("#react-select-2-option-0-0");
    private By valueOption2 = By.cssSelector("#react-select-2-option-0-1");
    private By valueOption3 = By.cssSelector("#react-select-2-option-1-0");
    private By valueOption4 = By.cssSelector("#react-select-2-option-1-1");
    private By valueOption5 = By.cssSelector("#react-select-2-option-2");
    private By valueOption6 = By.cssSelector("#react-select-2-option-3");
    private By singleOption1 = By.cssSelector("#react-select-3-option-0-0");
    private By singleOption2 = By.cssSelector("#react-select-3-option-0-1");
    private By singleOption3 = By.cssSelector("#react-select-3-option-0-2");
    private By singleOption4 = By.cssSelector("#react-select-3-option-0-3");
    private By singleOption5 = By.cssSelector("#react-select-3-option-0-4");
    private By singleOption6 = By.cssSelector("#react-select-3-option-0-5");

    public DemoQAWidgetsSelectPage (WebDriver driver) { this.driver = driver; }

    public void clickValueSelect () { driver.findElement(valueSelect).click(); }

    public void clickSingleSelect () { driver.findElement(singleSelect).click(); }

    public void clickValueOption1 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(valueOption1));
    }

    public void clickValueOption2 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(valueOption2));
    }

    public void clickValueOption3 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(valueOption3));
    }

    public void clickValueOption4 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(valueOption4));
    }

    public void clickValueOption5 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(valueOption5));
    }

    public void clickValueOption6 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(valueOption6));
    }

    public void clickSingleOption1 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(singleOption1));
    }

    public void clickSingleOption2 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(singleOption2));
    }

    public void clickSingleOption3 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(singleOption3));
    }

    public void clickSingleOption4 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(singleOption4));
    }

    public void clickSingleOption5 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(singleOption5));
    }

    public void clickSingleOption6 () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(singleOption6));
    }

    public void clickOldSelect (int index) {
        Select drpColor = new Select(driver.findElement(oldSelect));

        drpColor.selectByIndex(index);
    }

    public String getValueSelected () { return driver.findElement(valueContent).getText(); }

    public String getSingleSelected () { return driver.findElement(singleContent).getText(); }

    public String getOldSelected () {
        Select drpColor = new Select(driver.findElement(oldSelect));

        return drpColor.getFirstSelectedOption().getText();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
