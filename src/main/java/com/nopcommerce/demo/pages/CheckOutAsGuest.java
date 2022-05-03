package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utility {
    By vwelcome = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By checkOutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    By registerTab = By.xpath("//button[@class='button-1 register-button']");

    public String verifyWelcome() {
        return getTextFromElement(vwelcome);
    }

    public void clickOncheckOutAsGuest() {
        clickOnElement(checkOutAsGuest);
    }

    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }

}
