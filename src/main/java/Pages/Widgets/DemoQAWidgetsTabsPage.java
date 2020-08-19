package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsTabsPage {
    private WebDriver driver;
    private By tab1 = By.cssSelector("#demo-tab-what");
    private By tab1Content = By.cssSelector("#demo-tabpane-what");
    private By tab2 = By.cssSelector("#demo-tab-origin");
    private By tab2Content = By.cssSelector("#demo-tabpane-origin");
    private By tab3 = By.cssSelector("#demo-tab-use");
    private By tab3Content = By.cssSelector("#demo-tabpane-use");

    public DemoQAWidgetsTabsPage (WebDriver driver) { this.driver = driver; }

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

    public boolean getTab1Content () { return driver.findElement(tab1Content).isDisplayed(); }

    public boolean getTab2Content () { return driver.findElement(tab2Content).isDisplayed(); }

    public boolean getTab3Content () { return driver.findElement(tab3Content).isDisplayed(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
