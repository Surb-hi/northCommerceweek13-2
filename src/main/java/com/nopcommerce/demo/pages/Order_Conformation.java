package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Order_Conformation extends Utility {
    By vcredit = By.xpath("//span[contains(text(),'Credit Card')]");
    By vnextDay = By.xpath("//li[@class='shipping-method']//span[contains(text(),'Next Day Air')]");
    By vsecondDay = By.xpath("//li[@class='shipping-method']//span[contains(text(),'2nd Day Air')]");
    By vtotal = By.xpath("//td[@class='cart-total-right']//span[@class='value-summary']//strong");
    By confirmButton = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By vthankYou = By.xpath("//h1[text()='Thank you']");
    By vorderSuccessFull = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By continueButtonFinal = By.xpath("//button[@class='button-1 order-completed-continue-button']");


    public String verifyCredit(){
        return getTextFromElement(vcredit);
    }
    public String verifyNextDay(){
        return getTextFromElement(vnextDay);
    }
    public String verifySecondDay(){
        return getTextFromElement(vsecondDay);
    }
    public String verifyTotal(){
        return getTextFromElement(vtotal);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String verifyThankYou(){
        return getTextFromElement(vthankYou);
    }
    public String verifyOrderSuccessFull(){
        return getTextFromElement(vorderSuccessFull);
    }
    public void clickOnContinueButtonFinal(){
        clickOnElement(continueButtonFinal);
    }


}
