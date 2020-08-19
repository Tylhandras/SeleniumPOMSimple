package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsAccordianPage {
    private WebDriver driver;
    private By tab1 = By.cssSelector("#section1Heading");
    private By tab1Content = By.cssSelector("#section1Content");
    private By tab2 = By.cssSelector("#section2Heading");
    private By tab2Content = By.cssSelector("#section2Content");
    private By tab3 = By.cssSelector("#section3Heading");
    private By tab3Content = By.cssSelector("#section3Content");

    public DemoQAWidgetsAccordianPage (WebDriver driver) { this.driver = driver; }

    public void clickTab1 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.findElement(tab1).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tab1Content)));
    }

    public void clickTab2 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.findElement(tab2).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tab2Content)));
    }

    public void clickTab3 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.findElement(tab3).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tab3Content)));
    }

    public boolean getTab1 () { return driver.findElement(tab1Content).isDisplayed(); }

    public boolean getTab2 () { return driver.findElement(tab2Content).isDisplayed(); }

    public boolean getTab3 () { return driver.findElement(tab3Content).isDisplayed(); }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
