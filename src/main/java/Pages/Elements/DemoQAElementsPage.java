package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAElementsPage {
    private WebDriver driver;
    private By textBox = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
    private By checkBox = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]");
    private By radioBtn = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]");
    private By webTable = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]");
    private By buttons = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]");
    private By links = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]");
    private By upload = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]");
    private By dynProp = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]");

    public DemoQAElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickText () {
        driver.findElement(textBox).click();
    }

    public void clickCheck () {
        driver.findElement(checkBox).click();
    }

    public void clickRadio () {
        driver.findElement(radioBtn).click();
    }

    public void clickWebTab () {
        driver.findElement(webTable).click();
    }

    public void clickButtons () {
        driver.findElement(buttons).click();
    }

    public void clickLinks () {
        driver.findElement(links).click();
    }

    public void clickUpDown () {
        driver.findElement(upload).click();
    }

    public void clickDynamic () {
        driver.findElement(dynProp).click();
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void scrollPage () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
    }
}
