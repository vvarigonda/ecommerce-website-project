package test.java;

import main.java.PageEvents.HappyPath_Purchase2ItemsEvents;
import main.java.PageEvents.ReviewOrdersAndMessageEvents;
import main.java.Utils.Constants;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class ReviewOrdersAndMessage extends BaseTest{

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
    public void sampleMethod() throws InterruptedException {
        HappyPath_Purchase2ItemsEvents apLoginPageEvents = new HappyPath_Purchase2ItemsEvents();
        apLoginPageEvents.LoggingIn();
        ReviewOrdersAndMessageEvents reviewAndMsg = new ReviewOrdersAndMessageEvents();
        reviewAndMsg.ReviewOrder();
        reviewAndMsg.AddMessageMethod();

    }
}
