package Pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQAFormsPage {
    private WebDriver driver;
    private By practiceForm = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]");

    public DemoQAFormsPage (WebDriver driver) { this.driver = driver; }

    public void clickPracticeForm () {
        driver.findElement(practiceForm).click();
    }

    public String getUrl () { return driver.getCurrentUrl(); }
}
