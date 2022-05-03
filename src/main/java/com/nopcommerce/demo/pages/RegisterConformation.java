package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterConformation extends Utility {
    By vregistration = By.xpath("//div[text()='Your registration completed']");
    By continueButton = By.xpath("//a[text()='Continue']");

    public String verifygetRegistration(){
        return getTextFromElement(vregistration);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
