package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Payment extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCodeNumber = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumbers = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']");

    public void enterFirstName(String fn){
        sendTextToElement(firstName, fn);
    }
    public void enterLastName(String ln){
        sendTextToElement(lastName, ln);
    }
    public void enterEmail(String mail){
        sendTextToElement(emailField, mail);
    }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(countryDropdown, country);
    }
    public void enterCityName(String cityName){
        sendTextToElement(city, cityName);
    }
    public void enterAddress(String addressName){
        sendTextToElement(address, addressName);
    }
    public void enterZipCode(String zip){
        sendTextToElement(zipCodeNumber, zip);
    }
    public void enterPhoneNumbers(String pn){
        sendTextToElement(phoneNumbers, pn);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
