package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQAInteractionsDragPage {
    private WebDriver driver;
    private By simpleTab = By.cssSelector("#draggableExample-tab-simple");
    private By axisTab = By.cssSelector("#draggableExample-tab-axisRestriction");
    private By containerTab = By.cssSelector("#draggableExample-tab-containerRestriction");
    private By cursorTab = By.cssSelector("#draggableExample-tab-cursorStyle");
    private By simpleDrag = By.cssSelector("#dragBox");
    private By axisDragX = By.cssSelector("#restrictedX");
    private By axisDragY = By.cssSelector("#restrictedY");
    private By containerDrag1 = By.xpath("//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']");
    private By containerDrag2 = By.xpath("//span[@class='ui-widget-header ui-draggable ui-draggable-handle']");
    private By cursorDrag1 = By.cssSelector("#cursorCenter");
    private By cursorDrag2 = By.cssSelector("#cursorTopLeft");
    private By cursorDrag3 = By.cssSelector("#cursorBottom");

    public DemoQAInteractionsDragPage (WebDriver driver) { this.driver = driver; }

    public void clickSimple () { driver.findElement(simpleTab).click(); }

    public void clickAxis () { driver.findElement(axisTab).click(); }

    public void clickContainer () { driver.findElement(containerTab).click(); }

    public void clickCursorTab () { driver.findElement(cursorTab).click(); }

    public void moveSimple (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(simpleDrag), xOffset, yOffset).build().perform();
    }
    public void moveAxisX (int offset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(axisDragX), offset, 0).build().perform();
    }
    public void moveAxisY (int offset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(axisDragY), 0, offset).build().perform();
    }
    public void moveContainerOne (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(containerDrag1), xOffset, yOffset).build().perform();
    }
    public void moveContainerTwo (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(containerDrag2), xOffset, yOffset).build().perform();
    }
    public void moveCursorCenter (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(cursorDrag1), xOffset, yOffset).build().perform();
    }
    public void moveCursorLeft (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(cursorDrag2), xOffset, yOffset).build().perform();
    }
    public void moveCursorBottom (int xOffset, int yOffset) {
        Actions action = new Actions(driver);

        action.dragAndDropBy(driver.findElement(cursorDrag3), xOffset, yOffset).build().perform();
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public Point getSimplePosition () { return driver.findElement(simpleDrag).getLocation(); }

    public Point getAxisXPosition () { return driver.findElement(axisDragX).getLocation(); }

    public Point getAxisYPosition () { return driver.findElement(axisDragY).getLocation(); }

    public Point getBoxPosition () { return driver.findElement(containerDrag1).getLocation(); }

    public Point getParentPosition () { return driver.findElement(containerDrag2).getLocation(); }

    public Point getCursorCenterPosition () { return driver.findElement(cursorDrag1).getLocation(); }

    public Point getCursorLeftPosition () { return driver.findElement(cursorDrag2).getLocation(); }

    public Point getCursorBottomPosition () { return driver.findElement(cursorDrag3).getLocation(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
