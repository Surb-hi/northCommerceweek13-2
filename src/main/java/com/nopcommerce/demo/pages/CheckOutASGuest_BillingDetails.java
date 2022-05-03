package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutASGuest_BillingDetails extends Utility {
    By firstname1 = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    By lastName1 = By.xpath("//input[@name='BillingNewAddress.LastName']");
    By email1 = By.xpath("//input[@name='BillingNewAddress.Email']");
    By Country = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    By zipcode = By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']");
    By phonenumber = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    By Continue = By.xpath("//button[@onclick='Billing.save()']");

    public void firstname(String textusername) {
        sendTextToElement(firstname1, textusername);
    }

    public void lastname(String textlastname) {
        sendTextToElement(lastName1, textlastname);
    }

    public void email(String textemail) {
        sendTextToElement(email1, textemail);
    }

    public void setcountry(String country) {
        selectByContainsTextFromDropDown(Country, country);
    }

    public void setcity(String city1) {
        sendTextToElement(city, city1);
    }

    public void setAddress(String address1) {
        sendTextToElement(address, address1);
    }

    public void setZipcode(String zipcode1) {
        sendTextToElement(zipcode, zipcode1);
    }

    public void setPhonenumber(String phonenumber1) {
        sendTextToElement(phonenumber, phonenumber1);
    }

    public void clickOnCountinue() {
        clickOnElement(Continue);
    }
}
