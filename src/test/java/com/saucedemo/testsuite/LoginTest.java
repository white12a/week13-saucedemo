package com.saucedemo.testsuite;

import com.saucedemo.Pages.HomePage;
import com.saucedemo.Pages.ProductsPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage= new HomePage();
    ProductsPage productsPage=new ProductsPage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnLoginBtn();
        String actualText=productsPage.verifyProductsTitle();
        String expectedText="PRODUCTS";
        Assert.assertEquals(actualText,expectedText,"Products Text Validation");

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnLoginBtn();
        int actualNum=productsPage.verifyNoOfProducts();
        int expectedNum=6;
        Assert.assertEquals(actualNum,expectedNum,"Numbers of products");
    }

}
