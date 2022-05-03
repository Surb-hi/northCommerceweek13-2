package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computer extends Utility {
    By pageHeader = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By DesktopLink = By.xpath("//a[@title='Show products in category Desktops' and contains(text(),' Desktops ')]");

    public String getPageHeader() {
        return getTextFromElement(pageHeader);
    }

    public void clickOnDesktop() {
        clickOnElement(DesktopLink);
    }
    public void clickOnComputer() {
        clickOnElement(pageHeader);
    }
}
