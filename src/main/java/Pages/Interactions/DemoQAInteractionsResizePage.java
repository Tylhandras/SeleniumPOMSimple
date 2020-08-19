package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class DemoQAInteractionsResizePage {
    private WebDriver driver;
    private By restrictedResize = By.cssSelector("#resizableBoxWithRestriction");
    private By restrictedMove = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]");
    private By unrestrictedResize = By.cssSelector("#resizable");
    private By unrestrictedMove = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span[1]");

    public DemoQAInteractionsResizePage (WebDriver driver) { this.driver = driver; }

    public void clickResizeOne (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(restrictedMove)).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public void clickResizeTwo (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.clickAndHold(driver.findElement(unrestrictedMove)).moveByOffset(xOffset, yOffset).release().build().perform();
    }

    public Point getSizeOne () {
        return new Point(driver.findElement(restrictedResize).getSize().getHeight(), driver.findElement(restrictedResize).getSize().getWidth());
    }

    public Point getSizeTwo () {
        return new Point(driver.findElement(unrestrictedResize).getSize().getHeight(), driver.findElement(unrestrictedResize).getSize().getWidth());
    }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
