package com.nopcommerce.demo.testsuits;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsOrder extends TestBase {
    HomePage homePage=new HomePage();
    CellPhone cellPhone=new CellPhone();
    NokiaLumia nokiaLumia=new NokiaLumia();
    Shopping_Cart shoppingcart=new Shopping_Cart();
    Check_Out check_out=new Check_Out();
    CheckOutAsGuest checkOutAsGuest=new CheckOutAsGuest();
    Register register=new Register();
    RegisterConformation registerConformation=new RegisterConformation();
    Payment payment=new Payment();
    Shipping_Details shippingDetails=new Shipping_Details();
    Payment_Details payment_details=new Payment_Details();
    Payment_Method payment_method=new Payment_Method();
    Order_Conformation order_conformation=new Order_Conformation();
@Test
    public void textVerified(){
        homePage.mouseHoverOnElectronics();
        homePage.mouseHoverClickOnCellPhones();
        homePage.clickOnCellPhone();
        String expectedresult= "Cell phones";
        String actualresult=cellPhone.getCellPhone();
        Assert.assertEquals(actualresult, expectedresult);   }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        textVerified();
        cellPhone.clickOnList();
        cellPhone.clickOnNokia();

        String expectedresult= "Nokia Lumia 1020";
        String actualresult=nokiaLumia.verifyNokiaLumia() ;
        Assert.assertEquals(actualresult, expectedresult);

        String expectedresult1= "$349.00";
        String actualresult1=nokiaLumia.verifyNokiaPriceText();
        Assert.assertEquals(actualresult1, expectedresult1);

        cellPhone.clickOnList();
        Thread.sleep(1000);
        cellPhone.clickOnNokia();

        nokiaLumia.clickToClearQuantity();
        nokiaLumia.sendQuantity("2");
        nokiaLumia.clickOnCartButton();

        String expectedresult2= "The product has been added to your shopping cart";
        String actualresult2=nokiaLumia.getText();
        Assert.assertEquals(actualresult2, expectedresult2);

        nokiaLumia.clickOnCross();
        nokiaLumia.mouseHoverOnShoppingCart();
        nokiaLumia.clickOnGoToCart();

        String expectedresult3= "Shopping cart";
        String actualresult3=shoppingcart.verifygetShoppingCart() ;
        Assert.assertEquals(actualresult3, expectedresult3);

        String expectedresult4= "2";
        String actualresult4=shoppingcart.sendAttributeQuantity("2");
        Assert.assertEquals(expectedresult4,actualresult4);

        String expectedresult5= "$698.00";
        String actualresult5=shoppingcart.verifyTotalAmount();
        Assert.assertEquals(actualresult5, expectedresult5);

        shoppingcart.clickOnCheckBoxTerms();
        shoppingcart.clickOnCheckOutButtonTotal();

        String expectedresult6= "Welcome, Please Sign In!";
        String actualresult6=checkOutAsGuest.verifyWelcome();
        Assert.assertEquals(actualresult6, expectedresult6);

        checkOutAsGuest.clickOnRegisterTab();

        String expectedresult7= "Register";
        String actualresult7=register.verifyRegisterText();
        Assert.assertEquals(actualresult7, expectedresult7);
        register.sendFname("prime");
        register.sendLname("patel");
        register.sendEmailFill("prime123@gmail.com");
        register.sendPassFill("123456");
        register.sendConfirmPassFill("123456");
        register.clickOnRegisterButton();

        String expectedresult8= "Your registration completed";
        String actualresult8=registerConformation.verifygetRegistration();
        Assert.assertEquals(actualresult8, expectedresult8);

        registerConformation.clickOnContinueButton();

        String expectedresult9= "Shopping cart";
        String actualresult9=shoppingcart.verifygetShoppingCart();
        Assert.assertEquals(actualresult9, expectedresult9);

        shoppingcart.clickOnCheckBoxTerms();
        shoppingcart.clickOnCheckOutButtonTotal();

        payment.enterFirstName("prime");
        payment.enterLastName("patel");
        payment.enterEmail("prime123@gmail.com");
        payment.selectCountry("United Kingdom");
        payment.enterCityName("Rom");
        payment.enterAddress("12, B");
        payment.enterZipCode("110");
        payment.enterPhoneNumbers("0000000000");
        payment.clickOnContinueButton();

        shippingDetails.clickOnRadio2ndDayAir();
        shippingDetails.clickOnContinueButtonNextDayAir();

        payment_method.clickOnCreditCardButton();
        payment_method.clickOnCreditCardContinueButton();
        payment_details.selectCreditCardDropDown("Visa");
        payment_details.sendCardHolderName("ram j");
        payment_details.sendCardNumber("4111111111111111");
        payment_details.selectExpireMonth("05");
        payment_details.selectExpireYear("2023");
        payment_details.sendCvvNumber("412");
        payment_details.clickOnContinueButtonPayment();

        String expectedresult10= "Credit Card";
        String actualresult10= order_conformation.verifyCredit();
        Assert.assertEquals(actualresult10, expectedresult10);

        String expectedresult11= "2nd Day Air";
        String actualresult11= order_conformation.verifySecondDay();
        Assert.assertEquals(actualresult11, expectedresult11);

        String expectedresult12= "$698.00";
        String actualresult12= order_conformation.verifyTotal();
        Assert.assertEquals(actualresult12, expectedresult12);

        order_conformation.clickOnConfirmButton();

        String expectedresult13= "Thank you";
        String actualresult13=order_conformation.verifyThankYou();
        Assert.assertEquals(actualresult13, expectedresult13);

        String expectedresult14= "Your order has been successfully processed!";
        String actualresult14=order_conformation.verifyOrderSuccessFull();
        Assert.assertEquals(actualresult14, expectedresult14);

        order_conformation.clickOnContinueButtonFinal();

        String expectedresult15= "Welcome to our store";
        String actualresult15= check_out.verifyWelcomeToStore();
        Assert.assertEquals(actualresult15, expectedresult15);

        check_out.clickOnLogoutLink();

        String expectedresult17= "https://demo.nopcommerce.com/";
        String actualresult17=driver.getCurrentUrl();
        Assert.assertEquals(actualresult15, expectedresult15);

    }
}
