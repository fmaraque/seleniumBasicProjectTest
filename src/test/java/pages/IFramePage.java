package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class IFramePage extends BasePage{

    String URL = "http://the-internet.herokuapp.com/iframe";

    public IFramePage(WebDriver driver) {
        super(driver);
    }

    public void launchBrowser() {
        driver.get(URL);
        Assert.assertEquals(driver.getCurrentUrl(), URL, "URL is not the expected");
    }

}
