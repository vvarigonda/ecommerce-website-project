package main.java.PageObjects;

public interface ReviewOrdersAndMessageElements {

    String orders = "//*[@id=\"footer\"]/div/section[5]/div/ul/li[1]/a";
    String selectOrder = "//*[@id=\"order-list\"]/tbody/tr/td[1]/a";
    String addAMsgDD ="//*[@id=\"sendOrderMessage\"]/p[2]/select";
    String msgTextbox ="//*[@id=\"sendOrderMessage\"]/p[3]/textarea";
    String message = "size is small";
    String sendBtn = "//*[@id=\"sendOrderMessage\"]/div/button";
    String latestComment = "//*[@id=\"block-order-detail\"]/div[5]/table/tbody/tr[1]/td[2]";
    String signOutBtn = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a";
}
