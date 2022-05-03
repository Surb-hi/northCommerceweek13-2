package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BulidYourOwnComputer extends Utility {
    By select22GHZ = By.xpath("//select[@id='product_attribute_1']");
    By select8GB = By.xpath("//select[@name='product_attribute_2']");
    By clickHdd800 = By.xpath("//input[@id='product_attribute_3_7']");
    By vista = By.xpath("//input[@id='product_attribute_4_9']");
    By TC5 = By.xpath("//input[@id='product_attribute_5_12']");
    By v1475 = By.xpath("//div[@class='product-price']//span[text()='$1,475.00']");
    By vMessage = By.xpath("//p[@class='content']");
    By addToCard = By.xpath("//button[@id='add-to-cart-button-1']");
    By clickcrossbutton = By.xpath("//span[@class='close']");
    By shopingcard=By.xpath("//span[@class='cart-label']");
    By gotocart=By.xpath("//button[contains(text(),'Go to cart')]");
    By vshppingCart=By.xpath("//h1[contains(text(),'Shopping cart')]");

    public void clickon2Ghz(String GHZ) {
        selectByVisibleTextFromDropDown(select22GHZ, GHZ);
    }

    public void clickon8GB(String GB) {
        selectByVisibleTextFromDropDown(select8GB, GB);
    }

    public void clickOnHDD() {
        clickOnElement(clickHdd800);
    }

    public void clickOnVista() {
        clickOnElement(vista);
    }

    public void clickOnTC() {
        clickOnElement(TC5);
    }

    public String verifyprice() {
        return getTextFromElement(v1475);
    }

    public String verifyaddMessge() {
        return getTextFromElement(vMessage);
    }

    public void clickOnaddTocard() {
        clickOnElement(addToCard);
    }

    public void clickOnCrossButton() {
        clickOnElement(clickcrossbutton);
    }
    public void clickOnshopingCart() {
        mouseHoverToElement(shopingcard);
    }
    public void clickOnGoToCard() {
        clickOnElement(gotocart);
    }
    public String verifyShoppingCart() {
        return getTextFromElement(vshppingCart);
    }


}
