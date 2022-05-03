package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia extends Utility {
    By vnokiaLumia = By.xpath("//h1[text()='Nokia Lumia 1020']");
    By vnokiaPrice = By.xpath("//div[@class='product-price']//span[text()=' $349.00 ']");
    By quantity = By.xpath("//input[@aria-label='Enter a quantity']");
    By cartButton = By.xpath("//button[@id='add-to-cart-button-20']");
    By vText = By.xpath("//p[text()='The product has been added to your ']");
    By cross = By.xpath("//span[@class='close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[@class='button-1 cart-button']");

    public String verifyNokiaLumia(){
        return getTextFromElement(vnokiaLumia);
    }
    public String verifyNokiaPriceText(){
        return getTextFromElement(vnokiaPrice);
    }
    public void clickToClearQuantity(){
        sendTextToElement1(quantity);
    }
    public void sendQuantity(String quantity1){
        sendTextToElement(quantity, quantity1);
    }
    public String getText(){
        return getTextFromElement(vText);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }
    public void clickOnCartButton(){
        clickOnElement(cartButton);
    }
    public void clickOnCross(){
        clickOnElement(cross);
    }
}
