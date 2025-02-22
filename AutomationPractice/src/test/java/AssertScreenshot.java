package test.java;

import main.java.PageEvents.AssertScreenshotEvents;
import main.java.PageEvents.HappyPath_Purchase2ItemsEvents;
import main.java.PageEvents.ReviewOrdersAndMessageEvents;
import main.java.Utils.Constants;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class AssertScreenshot extends BaseTest{

    //    Setting browser name and url for running the test
    @BeforeMethod
    @Parameters(value ={"browserName"})
    public void beforeMethodMethod(String browserName, Method testMethod){
        logger = extent.createTest(testMethod.getName());
        setupDriver(browserName);
        driver.manage().window().maximize();
        // Can Change URL from constants page
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //    Performs logging in
    @Test
    public void sampleMethod() throws InterruptedException, IOException {
        HappyPath_Purchase2ItemsEvents apLoginPageEvents = new HappyPath_Purchase2ItemsEvents();
        apLoginPageEvents.LoggingIn();
        ReviewOrdersAndMessageEvents reviewAndMsg = new ReviewOrdersAndMessageEvents();
        reviewAndMsg.ReviewOrder();
        //any error screenshot will be present in screenshots folder
        AssertScreenshotEvents assertScreen = new AssertScreenshotEvents();
        assertScreen.assertAndScreenshot();
    }
}
