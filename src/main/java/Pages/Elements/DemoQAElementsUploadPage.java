package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DemoQAElementsUploadPage {
    private WebDriver driver;
    private By download = By.cssSelector("#downloadButton");
    private By upload = By.cssSelector("#uploadFile");
    private By uploadPath = By.cssSelector("#uploadedFilePath");

    public DemoQAElementsUploadPage (WebDriver driver) { this.driver = driver; }

    public void setDownload () {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.prompt_for_download", false);
        options.setExperimentalOption("prefs", prefs);

        driver.findElement(download).click();
    }

    public void setUpload (String string) { driver.findElement(upload).sendKeys(string); }

    public String getUploadPath () { return driver.findElement(uploadPath).getText(); }

    public String getUrl () { return driver.getCurrentUrl(); }
}
