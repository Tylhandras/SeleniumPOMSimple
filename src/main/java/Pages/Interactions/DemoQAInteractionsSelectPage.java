package Pages.Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class DemoQAInteractionsSelectPage {
    private WebDriver driver;
    private By list = By.cssSelector("#demo-tab-list");
    private By grid = By.cssSelector("#demo-tab-grid");
    private By listOne = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]");
    private By listTwo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]");
    private By listThree = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]");
    private By listFour = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]");
    private By gridOne = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/li[1]");
    private By gridTwo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/li[2]");
    private By gridThree = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/li[3]");
    private By gridFour = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/li[1]");
    private By gridFive = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/li[2]");
    private By gridSix = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/li[3]");
    private By gridSeven = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[1]");
    private By gridEight = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[2]");
    private By gridNine = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/li[3]");

    public DemoQAInteractionsSelectPage (WebDriver driver) { this.driver = driver; }

    public void clickSelectList () { driver.findElement(list).click(); }

    public void clickSelectGrid () { driver.findElement(grid).click(); }

    public void clickList1 () { driver.findElement(listOne).click(); }

    public void clickList2 () { driver.findElement(listTwo).click(); }

    public void clickList3 () { driver.findElement(listThree).click(); }

    public void clickList4 () { driver.findElement(listFour).click(); }

    public void clickGrid1 () { driver.findElement(gridOne).click(); }

    public void clickGrid2 () { driver.findElement(gridTwo).click(); }

    public void clickGrid3 () { driver.findElement(gridThree).click(); }

    public void clickGrid4 () { driver.findElement(gridFour).click(); }

    public void clickGrid5 () { driver.findElement(gridFive).click(); }

    public void clickGrid6 () { driver.findElement(gridSix).click(); }

    public void clickGrid7 () { driver.findElement(gridSeven).click(); }

    public void clickGrid8 () { driver.findElement(gridEight).click(); }

    public void clickGrid9 () { driver.findElement(gridNine).click(); }

    public boolean elementHasClass(WebElement element) {
        return Arrays.asList(element.getAttribute("class").split(" ")).contains("active");
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public String getSelectList () {
        String output = "";

        if (elementHasClass(driver.findElement(listOne)))
            output += "1 ";
        if (elementHasClass(driver.findElement(listTwo)))
            output += "2 ";
        if (elementHasClass(driver.findElement(listThree)))
            output += "3 ";
        if (elementHasClass(driver.findElement(listFour)))
            output += "4 ";
    System.out.println(output);
        return output;
    }

    public String getSelectGrid () {
        String output = "";

        if (elementHasClass(driver.findElement(gridOne)))
            output += "1 ";
        if (elementHasClass(driver.findElement(gridTwo)))
            output += "2 ";
        if (elementHasClass(driver.findElement(gridThree)))
            output += "3 ";
        if (elementHasClass(driver.findElement(gridFour)))
            output += "4 ";
        if (elementHasClass(driver.findElement(gridFive)))
            output += "5 ";
        if (elementHasClass(driver.findElement(gridSix)))
            output += "6 ";
        if (elementHasClass(driver.findElement(gridSeven)))
            output += "7 ";
        if (elementHasClass(driver.findElement(gridEight)))
            output += "8 ";
        if (elementHasClass(driver.findElement(gridNine)))
            output += "9 ";

        return output;
    }
}
