package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Computer computer = new Computer();
    Electronics electronics = new Electronics();
    Apparel apparel = new Apparel();
    Digitaldownloads digitaldownloads = new Digitaldownloads();
    Books books = new Books();
    Jewelry jewelry = new Jewelry();
    GiftCards giftCards = new GiftCards();

    @Test

    public void verifyPageNavigation() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(computer.getPageHeader(), "Computers", "Not on correct page");

        homePage.selectMenu("Electronics");
        Assert.assertEquals(electronics.getPageHeader(), "Electronics", "Not on correct page");

        homePage.selectMenu("Apparel");
        Assert.assertEquals(apparel.getPageHeader(), "Apparel", "Not on correct page");

        homePage.selectMenu("Digital downloads");
        Assert.assertEquals(digitaldownloads.getPageHeader(), "Digital downloads", "Not on correct page");

        homePage.selectMenu("Books");
        Assert.assertEquals(books.getPageHeader(), "Books", "Not on correct page");

        homePage.selectMenu("Jewelry");
        Assert.assertEquals(jewelry.getPageHeader(), "Jewelry", "Not on correct page");

        homePage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageHeader(), "Gift Cards", "Not on correct page");


    }
}



