package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuits extends TestBase {
    Computer computer = new Computer();
    Desktop desktop = new Desktop();
    BulidYourOwnComputer bulidYourOwnComputer = new BulidYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    SignIn signIn = new SignIn();
    CheckOutASGuest_BillingDetails checkOutASGuest_billingDetails = new CheckOutASGuest_BillingDetails();
    CheckOut_ShippingMethod checkOut_shippingMethod = new CheckOut_ShippingMethod();
    CheckOut_PaymentMethod checkOut_paymentMethod = new CheckOut_PaymentMethod();
    CheckOut_PaymentInformation checkOut_paymentInformation = new CheckOut_PaymentInformation();
    ConfromOrder confromOrder = new ConfromOrder();

    @Test
    public void Testname() throws InterruptedException {
        computer.clickOnComputer();
        desktop.clickOnDestop();
        List<WebElement> originalList = desktop.fetchItemsList();

        List<Double> expected = new ArrayList<>();

        for (WebElement data:originalList){
            String a = data.getText();
            String b = a.substring(1).replace(",", "");
            Double price = Double.valueOf(b);
            expected.add(price);

        }
        Collections.sort(expected);
        System.out.println(expected);
        Thread.sleep(1000);

        desktop.selectSortBy("Price: Low to High");
        Thread.sleep(2000);
        List<WebElement> actualList = desktop.fetchItemsList();

        List<Double> actual = new ArrayList<>();

        for (WebElement data:actualList) {
            String a = data.getText();
            String b = a.substring(1).replace(",", "");
            Double price = Double.valueOf(b);
            actual.add(price);
        }
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "not sorted");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computer.clickOnComputer();
        desktop.clickOnDestop();
        desktop.setSortByLowToHigh("Price: High to Low");
        Thread.sleep(1500);
        desktop.clickOnaddTocard();
        Thread.sleep(500);
        String expectedMsg = "Build your own computer";
        String actualMsg = desktop.verifyBulidYourOwnComputer();
        Assert.assertEquals(expectedMsg, actualMsg, "");
        bulidYourOwnComputer.clickon2Ghz("2.2 GHz Intel Pentium Dual-Core E2200");
        bulidYourOwnComputer.clickon8GB("8GB [+$60.00]");
        bulidYourOwnComputer.clickOnHDD();
        bulidYourOwnComputer.clickOnVista();
        bulidYourOwnComputer.clickOnTC();
        String expectedMsg1 = "$1,475.00";
        String actualMsg1 = bulidYourOwnComputer.verifyprice();
        Assert.assertEquals(expectedMsg1, actualMsg1, "");
        bulidYourOwnComputer.clickOnaddTocard();
        String expectedMsg2 = "The product has been added to your shopping cart";
        String actualMsg2 = bulidYourOwnComputer.verifyaddMessge();
        Assert.assertEquals(expectedMsg2, actualMsg2, "");
        bulidYourOwnComputer.clickOnCrossButton();
        bulidYourOwnComputer.clickOnshopingCart();
        bulidYourOwnComputer.clickOnGoToCard();
        String expectedMsg3 = "Shopping cart";
        String actualMsg3 = bulidYourOwnComputer.verifyShoppingCart();
        Assert.assertEquals(expectedMsg3, actualMsg3, "");
        shoppingCart.clearQty();
        shoppingCart.changeQty("2");
        shoppingCart.clickOnUpcart();
        String expectedMsg4 = "$2,950.00";
        String actualMsg4 = shoppingCart.verify2950price();
        Assert.assertEquals(expectedMsg2, actualMsg2, "");
        shoppingCart.clickOnmessageBox();
        shoppingCart.clickOnCheckOut();
        signIn.verifywelcome();
        signIn.clickonCheckOut();
        checkOutASGuest_billingDetails.firstname("sur");
        checkOutASGuest_billingDetails.lastname("patel");
        checkOutASGuest_billingDetails.email("surpatel1@gmail.com");
        checkOutASGuest_billingDetails.setcountry("United Kingdom");
        checkOutASGuest_billingDetails.setcity("leicter");
        checkOutASGuest_billingDetails.setAddress("456 lee stret");
        checkOutASGuest_billingDetails.setZipcode("10005");
        checkOutASGuest_billingDetails.setPhonenumber("123456789");
        checkOutASGuest_billingDetails.clickOnCountinue();
        checkOut_shippingMethod.setNextDayAir();
        checkOut_shippingMethod.setCONTINUE();
        checkOut_paymentMethod.setCreditCard();
        checkOut_paymentMethod.setContinue();
        checkOut_paymentInformation.setCardHolderName("mack");
        checkOut_paymentInformation.setCardNumber("5105105105105100");
        checkOut_paymentInformation.setExpairMonth("1");
        checkOut_paymentInformation.setExpaidYear("2028");
        checkOut_paymentInformation.setCode("345");
        checkOut_paymentInformation.setContinue1();
        String expectedresult5 = "Credit Card";
        String actualresult5 = confromOrder.verifycreditCard();
        Assert.assertEquals(actualresult5, expectedresult5);
        String expectedresult6 = "Next Day Air";
        String actualresult6 = confromOrder.verifyNextDayDelivery();
        Assert.assertEquals(actualresult6, expectedresult6);
        String expectedresult7 = "$2,950.00";
        String actualresult7 = confromOrder.veriyFinalPrice();
        Assert.assertEquals(expectedresult7, actualresult7);
        confromOrder.setConform();
        String expectedresult8 = "Thank you";
        String actualresult8 =confromOrder.veriyThankYou();
        Assert.assertEquals(actualresult8, expectedresult8);
        String expectedresult9= "Your order has been successfully processed!";
        String actualresult9 =confromOrder.veriyOrderConformation();
        org.junit.Assert.assertEquals(actualresult9, expectedresult9);
        confromOrder.setContinue4();
        String expectedresult11= "Welcome to our store";
        String actualresult11=confromOrder.veriywelcome();
        Assert.assertEquals(actualresult11, expectedresult11);
    }
}
