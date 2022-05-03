package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOut_PaymentInformation extends Utility {
    By Mastercard = By.xpath("//select[@id='CreditCardType']");
    By CardHolderName = By.xpath("//input[@name='CardholderName']");
    By CardNumber = By.xpath("//input[@name='CardNumber']");
    By expairMonth = By.xpath("//select[@name='ExpireMonth']");
    By expaidYear = By.xpath("//select[@name='ExpireYear']");
    By code = By.xpath("//input[@name='CardCode']");
    By continue1 = By.xpath("//button[@onclick='PaymentInfo.save()']");

    public void setMastercard(String mastercard) {
        selectByVisibleTextFromDropDown(Mastercard, mastercard);
    }

    public void setCardHolderName(String textname) {
        sendTextToElement(CardHolderName, textname);
    }

    public void setCardNumber(String cardNumber) {
        sendTextToElement(CardNumber, cardNumber);
    }

    public void setExpairMonth(String month) {
        sendTextToElement(expairMonth, month);
    }

    public void setExpaidYear(String year) {
        sendTextToElement(expaidYear, year);
    }

    public void setCode(String Code) {
        sendTextToElement(code, Code);
    }

    public void setContinue1() {
        clickOnElement(continue1);
    }

}
