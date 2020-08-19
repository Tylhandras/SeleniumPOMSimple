package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAWidgetsMenuPage {
    private WebDriver driver;
    private By mainItem1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]");
    private By mainItem2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]");
    private By Item2Sub1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]");
    private By Item2Sub2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[2]");
    private By Item2Sub3 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]");
    private By Item2Leaf1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[1]");
    private By Item2Leaf2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]/ul[1]/li[2]");
    private By mainItem3 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[3]");

    public DemoQAWidgetsMenuPage (WebDriver driver) { this.driver = driver; }

    public void hoverMenu1 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(mainItem1)).build().perform();
    }

    public void hoverMenu2 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(mainItem2)).build().perform();
    }

    public void hoverMenu3 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(mainItem3)).build().perform();
    }

    public void hoverMenu2Sub1 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(Item2Sub1)).build().perform();
    }

    public void hoverMenu2Sub2 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(Item2Sub2)).build().perform();
    }

    public void hoverMenu2Sub3 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(Item2Sub3)).build().perform();
    }

    public void hoverMenu2Leaf1 () {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(Item2Leaf1));
        action.moveToElement(driver.findElement(Item2Leaf1)).build().perform();
    }

    public void hoverMenu2Leaf2 () {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(Item2Leaf2)).build().perform();
    }

    public String getBackgroundMenu1 () { return driver.findElement(mainItem1).getCssValue("background-color"); }

    public String getBackgroundMenu2 () { return driver.findElement(mainItem2).getCssValue("background-color"); }

    public String getBackgroundMenu3 () { return driver.findElement(mainItem3).getCssValue("background-color"); }

    public String getBackgroundSub1 () { return driver.findElement(Item2Sub1).getCssValue("background-color"); }

    public String getBackgroundSub2 () { return driver.findElement(Item2Sub2).getCssValue("background-color"); }

    public String getBackgroundSub3 () { return driver.findElement(Item2Sub3).getCssValue("background-color"); }

    public String getBackgroundLeaf1 () { return driver.findElement(Item2Leaf1).getCssValue("background-color"); }

    public String getBackgroundLeaf2 () { return driver.findElement(Item2Leaf2).getCssValue("background-color"); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
