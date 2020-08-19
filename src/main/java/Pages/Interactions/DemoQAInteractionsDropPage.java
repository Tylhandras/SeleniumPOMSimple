package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAInteractionsDropPage {
    private WebDriver driver;
    private By simpleTab = By.cssSelector("#droppableExample-tab-simple");
    private By acceptTab = By.cssSelector("#droppableExample-tab-accept");
    private By preventTab = By.cssSelector("#droppableExample-tab-preventPropogation");
    private By revertTab = By.cssSelector("#droppableExample-tab-revertable");
    private By simpleDrag = By.cssSelector("#draggable");
    private By simpleDrop = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]");
    private By acceptDrag1 = By.cssSelector("#acceptable");
    private By acceptDrag2 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
    private By acceptDrop = By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']");
    private By preventDrag = By.cssSelector("#dragBox");
    private By preventDropOuter1 = By.cssSelector("#notGreedyDropBox");
    private By preventDropInner1 = By.cssSelector("#notGreedyInnerDropBox");
    private By preventDropOuter2 = By.cssSelector("#greedyDropBox");
    private By preventDropInner2 = By.cssSelector("#greedyDropBoxInner");
    private By revertDrag1 = By.cssSelector("#revertable");
    private By revertDrag2 = By.cssSelector("#notRevertable");
    private By revertDrop = By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']");

    public DemoQAInteractionsDropPage (WebDriver driver) { this.driver = driver; }

    public void clickSimple () { driver.findElement(simpleTab).click(); }

    public void clickAccept () { driver.findElement(acceptTab).click(); }

    public void clickPrevent () { driver.findElement(preventTab).click(); }

    public void clickRevert () { driver.findElement(revertTab).click(); }

    public void moveSimple () {
        Actions action = new Actions(driver);

        action.dragAndDrop(driver.findElement(simpleDrag), driver.findElement(simpleDrop)).build().perform();
    }

    public void moveAcceptOne () {
        Actions action = new Actions(driver);

        action.dragAndDrop(driver.findElement(acceptDrag1), driver.findElement(acceptDrop)).build().perform();
    }

    public void moveAcceptTwo () {
        WebDriverWait wait = new WebDriverWait (driver, 30);
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(acceptDrag2));
        action.dragAndDrop(driver.findElement(acceptDrag2), driver.findElement(acceptDrop)).build().perform();
    }

    public void movePrevent () {
        Actions action = new Actions(driver);

        action.dragAndDrop(driver.findElement(preventDrag), driver.findElement(preventDropInner1)).build().perform();
    }

    public void movePreventGreedy () {
        Actions action = new Actions(driver);

        action.dragAndDrop(driver.findElement(preventDrag), driver.findElement(preventDropInner2)).build().perform();
    }

    public void moveRevertOne () {
        Actions action = new Actions(driver);

        action.dragAndDrop(driver.findElement(revertDrag1), driver.findElement(revertDrop)).build().perform();
    }

    public void moveRevertTwo () {
        WebDriverWait wait = new WebDriverWait (driver, 30);
        Actions action = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(revertDrag2));
        action.dragAndDrop(driver.findElement(revertDrag2), driver.findElement(revertDrop)).build().perform();
    }

    public String getSimpleText () { return driver.findElement(simpleDrop).getText(); }

    public String getAcceptText () { return driver.findElement(acceptDrop).getText(); }

    public String getNotGreedyText () { return driver.findElement(preventDropOuter1).getText(); }

    public String getGreedyText () { return driver.findElement(preventDropOuter2).getText(); }

    public String getRevertText () { return driver.findElement(revertDrop).getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }

    public Point getSimplePosition () { return driver.findElement(simpleDrag).getLocation(); }

    public Point getAcceptPositionOne () { return driver.findElement(acceptDrag1).getLocation(); }

    public Point getAcceptPositionTwo () { return driver.findElement(acceptDrag2).getLocation(); }

    public Point getPreventPosition () { return driver.findElement(preventDrag).getLocation(); }

    public Point getRevertPositionOne () { return driver.findElement(revertDrag1).getLocation(); }

    public Point getRevertPositionTwo () { return driver.findElement(revertDrag2).getLocation(); }

    public void pageRefresh() { driver.navigate().refresh(); }

    public void movementWait () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.attributeToBe(revertDrag1, "class", "drag-box mt-4 ui-draggable ui-draggable-handle"));
    }
}
