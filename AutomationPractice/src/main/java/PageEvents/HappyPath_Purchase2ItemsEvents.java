package main.java.PageEvents;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import main.java.PageObjects.HappyPath_Purchase2ItemsElements;
import main.java.PageObjects.ReviewOrdersAndMessageElements;
import main.java.Utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import test.java.BaseTest;
import test.java.HappyPath_Purchase2Items;

public class HappyPath_Purchase2ItemsEvents extends BaseTest {

    public void LoggingIn() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();

        BaseTest.logger.info("Signing into AutomationPractice");
//        Change user id and password from PageElements page
        elementFetch.getWebElement("XPATH", HappyPath_Purchase2ItemsElements.signinBtn).click();
        elementFetch.getWebElement("XPATH", HappyPath_Purchase2ItemsElements.email).sendKeys(HappyPath_Purchase2ItemsElements.userEmail);
        elementFetch.getWebElement("XPATH", HappyPath_Purchase2ItemsElements.password).sendKeys(HappyPath_Purchase2ItemsElements.userPassword);
        elementFetch.getWebElement("XPATH", HappyPath_Purchase2ItemsElements.SubmitLogin).click();
        Thread.sleep(5000);

    }

    public void QuickView() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();

        BaseTest.logger.info("Quick view items");
        elementFetch.getWebElement("XPATH", HappyPath_Purchase2ItemsElements.dressesLink).click();
        String shoppingPgExpectedPrice1 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress1Price).getText();
        String shoppingPgExpectedPrice2 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress2Price).getText();

        Actions action = new Actions(driver);
        WebElement we = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress1);
        action.moveToElement(we).moveToElement(elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.quickViewLink)).click().build().perform();
        Thread.sleep(5000);
        driver.switchTo().frame(elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.QVFrame));
        Select dropdown = new Select(elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.sizeDD));
        dropdown.selectByIndex(1);

        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.addToBasket).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.continueShoppingBtn).click();
        Thread.sleep(5000);

        Actions action2 = new Actions(driver);
        WebElement we2 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress2);
        action.moveToElement(we2).moveToElement(elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.QVLink2)).click().build().perform();
        Thread.sleep(5000);
        driver.switchTo().frame(elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.QVFrame));
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.addToBasket).click();
        Thread.sleep(5000);

        driver.switchTo().defaultContent();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.proceedToCheckout).click();
        Thread.sleep(5000);

        BaseTest.logger.info("view and assert basket items");
//        confirm that the items are of the size you selected
        String expectedMessage1 = HappyPath_Purchase2ItemsElements.actualDress1SizeAndColor;
        String expectedMessage2 = HappyPath_Purchase2ItemsElements.actualDress2SizeAndColor;
        String message1 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress1SizeAndColor).getText();
        String message2 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress2SizeAndColor).getText();
        Assert.assertEquals(message1, expectedMessage1);
        Assert.assertEquals(message2, expectedMessage2);
//        their prices are correct
//        String shoppingPgExpectedPrice1 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress1Price).getText();
//        String shoppingPgExpectedPrice2 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.dress2Price).getText();
        String Price1 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.cartDress1Price).getText();
        String Price2 = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.cartDress2Price).getText();
        Assert.assertEquals(Price1, shoppingPgExpectedPrice1);
        Assert.assertEquals(Price2, shoppingPgExpectedPrice2);
        System.out.println("Asserted Prices of dresses");

//        Total Products is the sum of the two items
        float dress1PriceFloat = Float.parseFloat(Price1.substring(1));
        float dress2PriceFloat = Float.parseFloat(Price2.substring(1));
        float sumOfDressPrices = dress1PriceFloat+dress2PriceFloat;
        String productTotal = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.productTotal).getText();
        float productTotalFloat = Float.parseFloat(productTotal.substring(1));
        Assert.assertEquals(sumOfDressPrices,productTotalFloat);
        System.out.println("Asserted sum of Prices ");
//        ‘Total’ equals the Total Products + Shipping

        String shippingTotal = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.totalShipping).getText();
        String totalWTStr = elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.totalTotalStr).getText();
        float shippingTotalFloat = Float.parseFloat(shippingTotal.substring(1));
        float totalWTFloat = Float.parseFloat(totalWTStr.substring(1));
        float Totaltotal= productTotalFloat+shippingTotalFloat;

        Assert.assertEquals(totalWTFloat,Totaltotal);
        System.out.println("Asserted total of Prices of dresses");
//Proceed to checkout
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.proceedToCheckoutBtn).click();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.addressSubmit).click();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.TOSChk).click();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.processCarrier).click();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.Wire).click();
        elementFetch.getWebElement("XPATH",HappyPath_Purchase2ItemsElements.confirmOrder).click();

        elementFetch.getWebElement("XPATH",ReviewOrdersAndMessageElements.signOutBtn).click();

    }

}
