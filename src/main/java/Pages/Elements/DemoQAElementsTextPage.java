package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAElementsTextPage {
    private WebDriver driver;
    private By name = By.cssSelector("#userName");
    private By email = By.cssSelector("#userEmail");
    private By curAddr = By.cssSelector("#currentAddress");
    private By permAddr = By.cssSelector("#permanentAddress");
    private By submitBtn = By.cssSelector("#submit");
    private By submittedForm = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[1]");
    private By submitName = By.cssSelector("#name");
    private By submitEmail = By.cssSelector("#email");
    private By submitCurrentAddress = By.xpath("//p[@id='currentAddress']");
    private By submitPermanentAddress = By.xpath("//p[@id='permanentAddress']");

    public DemoQAElementsTextPage (WebDriver driver) { this.driver = driver; }

    public void setName (String string) { driver.findElement(name).sendKeys(string); }

    public void setEmail (String string) { driver.findElement(email).sendKeys(string); }

    public void setCurrent (String string) { driver.findElement(curAddr).sendKeys(string); }

    public void setPermanent (String string) { driver.findElement(permAddr).sendKeys(string); }

    public void clickSubmit () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(submitBtn));
    }

    public String getSubmitName () { return driver.findElement(submitName).getText(); }

    public String getSubmitEmail () { return driver.findElement(submitEmail).getText(); }

    public String getSubmitCurrentAddress () { return driver.findElement(submitCurrentAddress).getText(); }

    public String getSubmitPermanentAddress () { return driver.findElement(submitPermanentAddress).getText(); }

    public void pageLoadWait () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(submittedForm));
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
