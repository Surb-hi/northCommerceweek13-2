package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOut_ShippingMethod extends Utility {
    By NextDayAir=By.xpath("//input[@id='shippingoption_1']");
    By CONTINUE=By.xpath("//button[@onclick='ShippingMethod.save()']");
    public void setNextDayAir(){
        clickOnElement(NextDayAir);
    }
    public void setCONTINUE(){
        clickOnElement(CONTINUE);
    }
}
