package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAWidgetsPage {
    private WebDriver driver;
    private By accordian = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]");
    private By autoComplete = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]");
    private By datePick = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]");
    private By slide = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]");
    private By progressBar = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]");
    private By tabs = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]");
    private By toolTip = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[7]");
    private By menu = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]");
    private By selectMenu = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]");

    public DemoQAWidgetsPage (WebDriver driver) { this.driver = driver; }

    public void clickAccordian () { driver.findElement(accordian).click(); }

    public void clickAutoComplete () { driver.findElement(autoComplete).click(); }

    public void clickDatePick () { driver.findElement(datePick).click(); }

    public void clickSlide () { driver.findElement(slide).click(); }

    public void clickProgress () { driver.findElement(progressBar).click(); }

    public void clickTabs () { driver.findElement(tabs).click(); }

    public void clickToolTip () { driver.findElement(toolTip).click(); }

    public void clickMenu () { driver.findElement(menu).click(); }

    public void clickSelectMenu () { driver.findElement(selectMenu).click(); }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
