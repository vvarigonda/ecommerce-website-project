package main.java.PageObjects;

public interface HappyPath_Purchase2ItemsElements {
 String signinBtn = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a";
 String email ="//*[@id=\"email\"]";
 String userEmail="george@gmail.com";
 String password="//*[@id=\"passwd\"]";
 String userPassword = "BJSSTest";
 String SubmitLogin = "//*[@id=\"SubmitLogin\"]";


 String dressesLink = "//*[@id=\"block_top_menu\"]/ul/li[2]/a";
 String dress1Price = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[1]/span";
 String dress2Price = "//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[1]/span[1]";
 String dress1 ="//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img";
 String quickViewLink = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[2]/span";

 String QVFrame = "/html/body/div[2]/div/div/div/div/iframe";
 String sizeDD ="//*[@id=\"group_1\"]";

 String addToBasket = "//*[@id=\"add_to_cart\"]/button";
 String continueShoppingFrame = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]";
 String continueShoppingBtn = ".//span[contains(@title,'Continue shopping')]";
 String proceedToCheckout = ".//a[contains(@title,'Proceed to checkout')]";

 String dress2 ="//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img";
 String QVLink2= "//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[2]/span";

 String actualDress1SizeAndColor="Color : Beige, Size : M";
 String actualDress2SizeAndColor ="Color : Yellow, Size : S";
 String dress1SizeAndColor = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]/small[2]/a";
 String dress2SizeAndColor = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[2]/small[2]/a";

 String cartDress1Price = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[1]/td[4]/span/span";
 String cartDress2Price = "/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr[2]/td[4]/span/span[1]";

 String productTotal = "//*[@id=\"total_product\"]";

 String totalShipping = "//*[@id=\"total_shipping\"]";

 String totalTotalStr = "//*[@id=\"total_price_without_tax\"]";

 String proceedToCheckoutBtn = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span";
 String addressSubmit ="/html/body/div/div[2]/div/div[3]/div/form/p/button";

 String TOSChk = "//*[@id=\"cgv\"]";
 String processCarrier = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button";
 String Wire = ".//a[contains(@title,'Pay by bank wire')]";
 String confirmOrder = "//*[@id=\"cart_navigation\"]/button";
}
