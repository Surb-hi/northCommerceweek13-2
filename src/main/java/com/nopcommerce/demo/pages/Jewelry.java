package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Jewelry extends Utility {
    By pageHeader=By.xpath("//h1[contains(text(),'Jewelry')]");

    public String getPageHeader(){
        return getTextFromElement(pageHeader);

    }
}
