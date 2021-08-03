package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IFramePage extends BasePage{

    String URL = "http://the-internet.herokuapp.com/iframe";

    @FindBy(id = "mce_0_ifr")
    private WebElement iFrame;
    @FindBy(id = "tinymce")
    private WebElement editor;
    @FindBy(xpath = "//body[@id='tinymce']/p")
    private WebElement textFromEditor;


    public IFramePage(WebDriver driver) {
        super(driver);
    }

    public void launchBrowser() {
        driver.get(URL);
        Assert.assertEquals(driver.getCurrentUrl(), URL, "URL is not the expected");
    }

    public void moveToiFrame(){
        driver.switchTo().frame(iFrame);
    }

    public void moveToMainPage(){
        driver.switchTo().defaultContent();
    }

    public void clearEditor(){
        editor.clear();
    }

    public void setTextInEditor(String text){
        editor.sendKeys(text);
    }

    public void checkTextHasBeenAdded(String text){
        Assert.assertEquals(textFromEditor.getText(),text,"Text is not the same");
    }

}
