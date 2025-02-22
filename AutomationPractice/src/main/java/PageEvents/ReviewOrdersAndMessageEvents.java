package main.java.PageEvents;

import main.java.PageObjects.HappyPath_Purchase2ItemsElements;
import main.java.PageObjects.ReviewOrdersAndMessageElements;
import main.java.Utils.ElementFetch;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import test.java.BaseTest;

public class ReviewOrdersAndMessageEvents extends BaseTest{

    public void ReviewOrder() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();

        BaseTest.logger.info("Adding a message");
        elementFetch.getWebElement("XPATH", ReviewOrdersAndMessageElements.orders).click();
        elementFetch.getWebElement("XPATH", ReviewOrdersAndMessageElements.selectOrder).click();
    }

        public void AddMessageMethod() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Select dropdown = new Select(elementFetch.getWebElement("XPATH",ReviewOrdersAndMessageElements.addAMsgDD));
        dropdown.selectByIndex(1);
        elementFetch.getWebElement("XPATH",ReviewOrdersAndMessageElements.msgTextbox).sendKeys(ReviewOrdersAndMessageElements.message);
        elementFetch.getWebElement("XPATH",ReviewOrdersAndMessageElements.sendBtn).click();
        String expectedMessage = ReviewOrdersAndMessageElements.message;
        String message = elementFetch.getWebElement("XPATH",ReviewOrdersAndMessageElements.latestComment).getText();
        Assert.assertEquals(message, expectedMessage);

        elementFetch.getWebElement("XPATH",ReviewOrdersAndMessageElements.signOutBtn).click();
    }
}
