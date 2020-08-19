package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsTipsPage {
    private WebDriver driver;
    private By tipButton = By.cssSelector("#toolTipButton");
    private By tipTextBox = By.cssSelector("#toolTipTextField");
    private By tipText1 = By.xpath("//a[contains(text(),'Contrary')]");
    private By tipText2 = By.xpath("//a[contains(text(),'1.10.32')]");
    private By tipBtnContent = By.id("buttonToolTip");
    private By tipBoxContent = By.id("textFieldToolTip");
    private By text1Content = By.id("contraryTexToolTip");
    private By text2Content = By.id("sectionToolTip");

    public DemoQAWidgetsTipsPage (WebDriver driver) { this.driver = driver; }

    public void hoverButton () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(tipButton)).build().perform();
    }

    public void hoverBox () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(tipTextBox)).build().perform();
    }

    public void hoverTextOne () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(tipText1)).build().perform();
    }

    public void hoverTextTwo () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(tipText2)).build().perform();
    }

    public boolean getHoverButton () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tipBtnContent)));
        return driver.findElement(tipBtnContent).isDisplayed();
    }

    public boolean getHoverBox () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tipBoxContent)));
        return driver.findElement(tipBoxContent).isDisplayed();
    }

    public boolean getHoverText1 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(text1Content)));
        return driver.findElement(text1Content).isDisplayed();
    }

    public boolean getHoverText2 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(text2Content)));
        return driver.findElement(text2Content).isDisplayed();
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
