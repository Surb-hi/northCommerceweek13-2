package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Shipping_Details extends Utility {
    By radioNextDayAir = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
    By continueButtonNextDayAir = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radio2ndDayAir = By.xpath("//input[@value='2nd Day Air___Shipping.FixedByWeightByTotal']");

    public void clickOnRadioNextDayAir(){
        clickOnElement(radioNextDayAir);
    }

    public void clickOnContinueButtonNextDayAir(){
        clickOnElement(continueButtonNextDayAir);
    }

    public void clickOnRadio2ndDayAir(){
        clickOnElement(radio2ndDayAir);
    }
}
