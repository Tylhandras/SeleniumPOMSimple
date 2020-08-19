package Pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class DemoQAWidgetsSliderPage {
    private WebDriver driver;
    private By slider = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]");

    public DemoQAWidgetsSliderPage (WebDriver driver) { this.driver = driver; }

    public void moveSlider() {
        Random rand = new Random();
        Actions move = new Actions(driver);

        Action action = move.dragAndDropBy(driver.findElement(slider), rand.nextInt(75), 0).build();
        action.perform();
    }

    public String getValue () { return driver.findElement(slider).getAttribute("value"); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
