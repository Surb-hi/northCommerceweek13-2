package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Desktop extends Utility {
    By desktopLink = By.xpath("//a[@title='Show products in category Desktops' and contains(text(),' Desktops ')]");
    By priceOrderOriginal = By.xpath("//span[@class='price actual-price']");
    By sortByLowToHigh = By.xpath("//select[@id='products-orderby']");
    By sortHighToLow = By.xpath("//select[@id='products-orderby']");
    By addToCard = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By bulidYourOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public void clickOnDestop() {
        clickOnElement(desktopLink);
    }
    public void selectSortBy(String sortby){
        selectByVisibleTextFromDropDown(sortByLowToHigh, sortby);
    }

    //getting list of items
    public List<WebElement> fetchItemsList(){
        return listOfWebElementsList(priceOrderOriginal);
    }

    public void sortByLowToHighPrice(String sortBy) {
        selectByVisibleTextFromDropDown(sortByLowToHigh, sortBy);
    }

    public void sortLowToHigh(String price) {
        selectByContainsTextFromDropDown(sortByLowToHigh, price);
    }

    public void setSortByLowToHigh(String price1) {
        selectByVisibleTextFromDropDown(sortHighToLow, price1);
    }

    public void clickOnaddTocard() {
        clickOnElement(addToCard);
    }

    public String verifyBulidYourOwnComputer() {
        return getTextFromElement(bulidYourOwnComputer);
    }

}

