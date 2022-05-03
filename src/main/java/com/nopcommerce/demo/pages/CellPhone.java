package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {
    By vcellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By list = By.xpath("//a[@title='List']");
    By nokiaLumia = By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]");

    public String getCellPhone() {
        return getTextFromElement(vcellPhone);
    }

    public void clickOnList() {
        clickOnElement(list);
    }

    public void clickOnNokia() {
        clickOnElement(nokiaLumia);
    }

}
