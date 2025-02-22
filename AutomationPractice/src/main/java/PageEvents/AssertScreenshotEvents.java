package main.java.PageEvents;

import main.java.PageObjects.AssertScreenshotElements;
import main.java.PageObjects.ReviewOrdersAndMessageElements;
import main.java.Utils.ElementFetch;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import test.java.BaseTest;

import java.io.File;
import java.io.IOException;

public class AssertScreenshotEvents extends BaseTest {

    public void assertAndScreenshot() throws InterruptedException, IOException {
        ElementFetch elementFetch = new ElementFetch();

        BaseTest.logger.info("Asserting a product");


        String expectedProduct = AssertScreenshotElements.expectedProduct;
        String product = elementFetch.getWebElement("XPATH", AssertScreenshotElements.productName).getText();
        Assert.assertEquals(product, expectedProduct);

//        By default this framework takes screenshots on error and save in screenshots folder.
//        If you want to save it as a file you can do that by below code by giving screenshot destination folders

//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        File scFile = screenshot.getScreenshotAs(OutputType.FILE);
//        File output = new File("screenshot destination location");
//        FileUtils.copyFile(scFile, output);

    }

}
