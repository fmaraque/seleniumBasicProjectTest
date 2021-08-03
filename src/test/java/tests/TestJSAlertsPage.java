package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.IFramePage;
import pages.JSAlertsPage;

public class TestJSAlertsPage extends BaseTest{


    @Test
    public void clickOnAlertAndCheckTheText(){
        JSAlertsPage jsAlertsPage = new JSAlertsPage(driver);

        jsAlertsPage.launchBrowser();

        jsAlertsPage.clickForAlert();

        jsAlertsPage.clickOkAlert();

        jsAlertsPage.checkResultIsTheExpected("You successfully clicked an alert");
    }

    @Test
    public void clickOnConfirmCheckTheText(){
        JSAlertsPage jsAlertsPage = new JSAlertsPage(driver);

        jsAlertsPage.launchBrowser();

        jsAlertsPage.clickForConfirm();

        jsAlertsPage.clickOkAlert();

        jsAlertsPage.checkResultIsTheExpected("You clicked: Ok");

    }

    @Test
    public void clickOnPromptAddTextAndCheckTheText(){
        String text = "Test Success";

        JSAlertsPage jsAlertsPage = new JSAlertsPage(driver);

        jsAlertsPage.launchBrowser();

        jsAlertsPage.clickForPrompt();

        jsAlertsPage.addTextToPrompt(text);

        jsAlertsPage.clickOkAlert();

        jsAlertsPage.checkResultIsTheExpected("You entered: " +text);

    }

}
