package main.java.PageObjects;

public interface AssertScreenshotElements {

    String productName = "//*[@id=\"order-detail-content\"]/table/tbody/tr[1]/td[2]/label";
    // failing assertion be sending color incorrect
    String expectedProduct = "Printed Dress - Color : Blue, Size : S";

}
