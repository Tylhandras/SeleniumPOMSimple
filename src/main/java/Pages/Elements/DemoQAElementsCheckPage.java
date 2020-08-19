package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQAElementsCheckPage {
    private WebDriver driver;
    private By expand = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]");
    private By collapse = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[2]");
    private By rootToggle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/button[1]");
    private By rootNode = By.cssSelector("#tree-node-home");
    private By branch1Toggle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]");
    private By branch1Node = By.cssSelector("#tree-node-desktop");
    private By branch1Leaf1Node = By.cssSelector("#tree-node-notes");
    private By branch1Leaf2Node = By.cssSelector("#tree-node-commands");
    private By branch2Toggle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/span[1]/button[1]");
    private By branch2Node = By.cssSelector("#tree-node-documents");
    private By branch2Sub1Toggle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[1]/span[1]/button[1]");
    private By branch2Sub1Node = By.cssSelector("#tree-node-workspace");
    private By branch2Sub1Leaf1Node = By.cssSelector("#tree-node-react");
    private By branch2Sub1Leaf2Node = By.cssSelector("#tree-node-angular");
    private By branch2Sub1Leaf3Node = By.cssSelector("#tree-node-veu");
    private By branch2Sub2Toggle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[2]/ol[1]/li[2]/span[1]/button[1]");
    private By branch2Sub2Node = By.cssSelector("#tree-node-office");
    private By branch2Sub2Leaf1Node = By.cssSelector("#tree-node-public");
    private By branch2Sub2Leaf2Node = By.cssSelector("#tree-node-private");
    private By branch2Sub2Leaf3Node = By.cssSelector("#tree-node-classified");
    private By branch2Sub2Leaf4Node = By.cssSelector("#tree-node-general");
    private By branch3Toggle = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/ol[1]/li[3]/span[1]/button[1]");
    private By branch3Node = By.cssSelector("#tree-node-downloads");
    private By branch3Leaf1Node = By.cssSelector("#tree-node-wordFile");
    private By branch3Leaf2Node = By.cssSelector("#tree-node-excelFile");

    public DemoQAElementsCheckPage (WebDriver driver) { this.driver = driver; }

    public void clickExpand () { driver.findElement(expand).click(); }

    public void clickCollapse () { driver.findElement(collapse).click(); }

    public void clickHomeTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(rootToggle));
    }

    public void clickHomeCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(rootNode));
    }

    public void clickDeskTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch1Toggle));
    }

    public void clickDeskCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch1Node));
    }

    public void clickNotes () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch1Leaf1Node));
    }

    public void clickCommands () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch1Leaf2Node));
    }

    public void clickDocTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Toggle));
    }

    public void clickDocCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Node));
    }

    public void clickWorkTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub1Toggle));
    }

    public void clickWorkCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub1Node));
    }

    public void clickReact () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub1Leaf1Node));
    }

    public void clickAngular () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub1Leaf2Node));
    }

    public void clickVeu () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub1Leaf3Node));
    }

    public void clickOfficeTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub2Toggle));
    }

    public void clickOfficeCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub2Node));
    }

    public void clickPublic () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub2Leaf1Node));
    }

    public void clickPrivate () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub2Leaf2Node));
    }

    public void clickClassified () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub2Leaf3Node));
    }

    public void clickGeneral () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch2Sub2Leaf4Node));
    }

    public void clickDownTog () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch3Toggle));
    }

    public void clickDownCheck () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch3Node));
    }

    public void clickWordFile () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch3Leaf1Node));
    }

    public void clickExcelFile () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(branch3Leaf2Node));
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public String getBoxesList() {
        List<WebElement> elementList = driver.findElements(By.tagName("input"));
        String output = "";

        for (WebElement element : elementList) {
            if (element.isSelected())
                output += element.getAttribute("id");
        }

        return output;
    }
}
