package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQAElementsTablePage {
    private WebDriver driver;
    private By addBtn = By.cssSelector("#addNewRecordButton");
    private By searchBox = By.cssSelector("#searchBox");
    private By displayRows = By.xpath("//span[@class='select-wrap -pageSizeOptions']//select");
    private By firstName = By.cssSelector("#firstName");
    private By lastName = By.cssSelector("#lastName");
    private By userEmail = By.cssSelector("#userEmail");
    private By userAge = By.cssSelector("#age");
    private By userPay = By.cssSelector("#salary");
    private By department = By.cssSelector("#department");
    private By submitBtn = By.cssSelector("#submit");
    private By tableFirstName = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
    private By tableLastName = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]");
    private By tableAge = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]");
    private By tableEmail = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[4]");
    private By tableSalary = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[5]");
    private By tableDepartment = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]");

    public DemoQAElementsTablePage (WebDriver driver) { this.driver = driver; }

    public void clickAdd () { driver.findElement(addBtn).click(); }

    public void clickSubmit () { driver.findElement(submitBtn).click(); }

    public void searchTable (String string) { driver.findElement(searchBox).sendKeys(string); }

    public void setFirstName (String string) { driver.findElement(firstName).sendKeys(string); }

    public void setLastName (String string) { driver.findElement(lastName).sendKeys(string); }

    public void setEmail (String string) { driver.findElement(userEmail).sendKeys(string); }

    public void setAge (String string) { driver.findElement(userAge).sendKeys(string); }

    public void setPay (String string) { driver.findElement(userPay).sendKeys(string); }

    public void setDepartment (String string) { driver.findElement(department).sendKeys(string); }

    public void setDisplayRows (String string) {
        Select drpRow = new Select(driver.findElement(displayRows));

        drpRow.selectByVisibleText(string);
    }

    public String getTableFirst () { return driver.findElement(tableFirstName).getText(); }

    public String getTableLast () { return driver.findElement(tableLastName).getText(); }

    public String getTableAge () { return driver.findElement(tableAge).getText(); }

    public String getTableEmail () { return driver.findElement(tableEmail).getText(); }

    public String getTableSalary () { return driver.findElement(tableSalary).getText(); }

    public String getTableDepartment () { return driver.findElement(tableDepartment).getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
