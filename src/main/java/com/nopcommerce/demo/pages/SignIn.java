package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class SignIn extends Utility {
    By vwelcome = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By checkout = By.xpath("//button[@class='button-1 checkout-as-guest-button']");

    public void verifywelcome() {
        clickOnElement(vwelcome);
    }

    public void clickonCheckOut() {
        clickOnElement(checkout);
    }
}
