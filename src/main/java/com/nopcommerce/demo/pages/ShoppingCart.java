package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By qty=By.xpath("//input[@class='qty-input']");
    By chnageqty=By.xpath("//input[@class='qty-input']");
    By updateCart=By.xpath("//button[@class='button-2 update-cart-button']");
    By v2950=By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");
    By message=By.id("termsofservice");
    By checkout=By.xpath("//button[@id='checkout']");

    public void clearQty(){
        sendTextToElement1(qty);
    }
    public void changeQty(String qty){
        sendTextToElement(chnageqty,qty);
    }
   public void clickOnUpcart() {
       clickOnElement(updateCart);
   }
    public String verify2950price() {
        return getTextFromElement(v2950);
    }
    public void clickOnmessageBox() {
        clickOnElement(message);
    }public void clickOnCheckOut() {
        clickOnElement(checkout);
    }






}
