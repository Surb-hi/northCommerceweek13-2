package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfromOrder extends Utility {
By vcreditCard=By.xpath("//span[contains(text(),'Credit Card')]");
By vNextDayDelivery=By.xpath("//li[@class='shipping-method']//span[contains(text(),'Next Day Air')]");
By vprice=By.xpath("//span[@class='value-summary' and text()='$2,950.00']");
By conform=By.xpath("//button[contains(text(),'Confirm')]");
By ThankYouMessgae=By.xpath("//h1[text()='Thank you']");
By orderconformation=By.xpath("//strong[text()='Your order has been successfully processed!']");
By continue4=By.xpath("//button[contains(text(),'Continue')]");
By vwelcome=By.xpath("//h2[text()='Welcome to our store']");
public String verifycreditCard() {
        return getTextFromElement(vcreditCard);
    }public String verifyNextDayDelivery() {
        return getTextFromElement(vNextDayDelivery);
    }public String veriyFinalPrice() {
        return getTextFromElement(vprice);
    }
    public void setConform() {
        clickOnElement(conform);
    }
    public String veriyThankYou() {
        return getTextFromElement(ThankYouMessgae);
    }
    public String veriyOrderConformation() {
        return getTextFromElement(orderconformation);
    }
    public void setContinue4() {
        clickOnElement(continue4);
    }
    public String veriywelcome() {
        return getTextFromElement(vwelcome);
    }
}
