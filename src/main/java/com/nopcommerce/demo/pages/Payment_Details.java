package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Payment_Details extends Utility {
    By creditCardDropDown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expireMonth = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = By.xpath("//select[@id='ExpireYear']");
    By cvvNumber = By.xpath("//input[@id='CardCode']");
    By continueButtonPayment = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void selectCreditCardDropDown(String dropdown){
        selectByVisibleTextFromDropDown(creditCardDropDown, dropdown);
    }
    public void sendCardHolderName(String cadholdername){
        sendTextToElement(cardHolderName,cadholdername);
    }
    public void sendCardNumber(String cadNumber){
        sendTextToElement(cardNumber,cadNumber);
    }
    public void selectExpireMonth(String month){
        selectByVisibleTextFromDropDown(expireMonth, month);
    }
    public void selectExpireYear(String year){
        selectByVisibleTextFromDropDown(expireYear, year);
    }
    public void sendCvvNumber(String cvv){
        sendTextToElement(cvvNumber,cvv);
    }
    public void clickOnContinueButtonPayment(){
        clickOnElement(continueButtonPayment);
    }


}
