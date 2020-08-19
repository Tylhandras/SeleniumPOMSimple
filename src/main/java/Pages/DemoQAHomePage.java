package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAHomePage {
    private WebDriver driver;
    private By elements = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
    private By forms = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]");
    private By alerts = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]");
    private By widgets = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]");
    private By interactions = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]");

    public DemoQAHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElements () {
        driver.findElement(elements).click();
    }

    public void clickForms() {
        driver.findElement(forms).click();
    }

    public void clickAlerts() {
        driver.findElement(alerts).click();
    }

    public void clickWidgets() {
        driver.findElement(widgets).click();
    }

    public void clickInteractions() {
        driver.findElement(interactions).click();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
