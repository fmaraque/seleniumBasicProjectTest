package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JSAlertsPage extends BasePage{

    String URL = "http://the-internet.herokuapp.com/javascript_alerts";

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    private WebElement btnAlert;
    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    private WebElement btnConfirm;
    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    private WebElement btnPrompt;
    @FindBy(id = "result")
    private WebElement resultText;


    public JSAlertsPage(WebDriver driver) {
        super(driver);
    }

    public void launchBrowser() {
        driver.get(URL);
        Assert.assertEquals(driver.getCurrentUrl(), URL, "URL is not the expected");
    }

    public void clickForAlert(){
        btnAlert.click();

    }

    public void clickForConfirm(){
        btnConfirm.click();
    }

    public void clickForPrompt(){
        btnPrompt.click();
    }

    public void clickOkAlert(){
        driver.switchTo().alert().accept();
    }
    public void addTextToPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void checkResultIsTheExpected(String text){
        Assert.assertEquals(resultText.getText(),text,"Result is not the expected");
    }

}
