package Pages.Forms;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQAFormsPracticePage {
    private WebDriver driver;
    private By firstName = By.cssSelector("#firstName");
    private By lastName = By.cssSelector("#lastName");
    private By userEmail = By.cssSelector("#userEmail");
    private By userGenderMale = By.cssSelector("#gender-radio-1");
    private By userGenderFemale = By.cssSelector("#gender-radio-2");
    private By userGenderOther = By.cssSelector("#gender-radio-3");
    private By phone = By.cssSelector("#userNumber");
    private By birthDate = By.cssSelector("#dateOfBirthInput");
    private By subjects = By.cssSelector("#subjectsInput");
    private By hobbySports = By.cssSelector("#hobbies-checkbox-1");
    private By hobbyReading = By.cssSelector("#hobbies-checkbox-2");
    private By hobbyMusic = By.cssSelector("#hobbies-checkbox-3");
    private By picUpload = By.cssSelector("#uploadPicture");
    private By currentAddress = By.cssSelector("#currentAddress");
    private By userState = By.cssSelector("#react-select-3-input");
    private By userCity = By.cssSelector("#react-select-4-input");
    private By submitBtn = By.cssSelector("#submit");
    private By closeBtn = By.cssSelector("#closeLargeModal");
    private By submitName = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]");
    private By submitEmail = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]");
    private By submitGender = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]");
    private By submitPhone = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    private By submitBirthday = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]");
    private By submitSubjects = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]");
    private By submitHobbies = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[2]");
    private By submitPicture = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[8]/td[2]");
    private By submitAddress = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[2]");
    private By submitCityState = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[10]/td[2]");
    private By submittedForm = By.xpath("//div[@class='modal-content']");

    public DemoQAFormsPracticePage (WebDriver driver) { this.driver = driver; }

    public void clickGenderMale () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(userGenderMale));
    }

    public void clickGenderFemale () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(userGenderFemale));
    }

    public void clickGenderOther () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(userGenderOther));
    }

    public void clickHobbySports () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(hobbySports));
    }

    public void clickHobbyReading () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(hobbyReading));
    }

    public void clickHobbyMusic () {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", driver.findElement(hobbyMusic));
    }

    public void clickSubmitBtn () {
        driver.findElement(submitBtn).click();
    }

    public void clickCloseBtn () {
        driver.findElement(closeBtn).click();
    }

    public void setFirstName (String string) { driver.findElement(firstName).sendKeys(string); }

    public void setLastName (String string) { driver.findElement(lastName).sendKeys(string); }

    public void setUserEmail (String string) { driver.findElement(userEmail).sendKeys(string); }

    public void setPhone (String string) { driver.findElement(phone).sendKeys(string); }

    public void setBirthDate (String string) {
        driver.findElement(birthDate).sendKeys(Keys.CONTROL + "a");
        driver.findElement(birthDate).sendKeys(string);
    }

    public void setSubjects (String string) { driver.findElement(subjects).sendKeys(string); }

    public void setUploadPic (String string) { driver.findElement(picUpload).sendKeys(string); }

    public void setCurrentAddress (String string) { driver.findElement(currentAddress).sendKeys(string); }

    public void setUserState (String string) {
        WebElement stateDrpDown = driver.findElement(userState);
        stateDrpDown.sendKeys(string);
        stateDrpDown.sendKeys(Keys.RETURN);
    }

    public void setUserCity (String string) {
        WebElement cityDrpDown = driver.findElement(userCity);
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(userCity)));
        cityDrpDown.sendKeys(string);
        cityDrpDown.sendKeys(Keys.RETURN);
    }

    public String getUrl () { return driver.getCurrentUrl(); }

    public void pageLoadWait () {
        WebDriverWait wait = new WebDriverWait (driver, 30);

        wait.until(ExpectedConditions.visibilityOfElementLocated(submittedForm));
    }

    public String getSubmitName () { return driver.findElement(submitName).getText(); }

    public String getSubmitEmail () { return driver.findElement(submitEmail).getText(); }

    public String getSubmitGender () { return driver.findElement(submitGender).getText(); }

    public String getSubmitPhone () { return driver.findElement(submitPhone).getText(); }

    public String getSubmitDate () { return driver.findElement(submitBirthday).getText(); }

    public String getSubmitSubjects () { return driver.findElement(submitSubjects).getText(); }

    public String getSubmitHobbies () { return driver.findElement(submitHobbies).getText(); }

    public String getSubmitPicture () { return driver.findElement(submitPicture).getText(); }

    public String getSubmitAddress () { return driver.findElement(submitAddress).getText(); }

    public String getSubmitCityState () { return driver.findElement(submitCityState).getText(); }
}
