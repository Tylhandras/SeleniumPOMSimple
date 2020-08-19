package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAInteractionsPage {
    private WebDriver driver;
    private By sortable = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]");
    private By select = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[2]");
    private By resize = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[3]");
    private By droppable = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]");
    private By draggable = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[5]");

    public DemoQAInteractionsPage (WebDriver driver) { this.driver = driver; }

    public void clickSortable () { driver.findElement(sortable).click(); }

    public void clickSelect () { driver.findElement(select).click(); }

    public void clickResize () { driver.findElement(resize).click(); }

    public void clickDrop () { driver.findElement(droppable).click(); }

    public void clickDrag () { driver.findElement(draggable).click(); }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
