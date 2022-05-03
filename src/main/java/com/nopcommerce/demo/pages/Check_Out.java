package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Check_Out extends Utility {
    By VwelcomeToStore = By.xpath("//h2[text()='Welcome to our store']");
    By logOutLink = By.xpath("//a[text()='Log out']");

    public String verifyWelcomeToStore() {
        return getTextFromElement(VwelcomeToStore);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logOutLink);
    }
}