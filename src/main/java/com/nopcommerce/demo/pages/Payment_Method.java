package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Payment_Method extends Utility {
    By creditCardButton = By.xpath("//input[@value='Payments.Manual']");
    By creditCardContinueButton = By.xpath("//button[@onclick='PaymentMethod.save()']");

    public void clickOnCreditCardButton(){
        clickOnElement(creditCardButton);
    }

    public void clickOnCreditCardContinueButton(){
        clickOnElement(creditCardContinueButton);
    }
}
