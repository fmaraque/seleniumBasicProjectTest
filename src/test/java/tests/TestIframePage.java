package tests;

import org.testng.annotations.Test;
import pages.IFramePage;

public class TestIframePage extends BaseTest{

    private String testText = "This is a test.";

    @Test
    public void addSomeTextAndCheckIsAdded(){
        IFramePage iFramePage = new IFramePage(driver);

        iFramePage.launchBrowser();

        iFramePage.moveToiFrame();

        iFramePage.clearEditor();

        iFramePage.setTextInEditor(testText);

        iFramePage.checkTextHasBeenAdded(testText);
    }

}
