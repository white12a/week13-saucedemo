package com.saucedemo.Pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends Utility {
    By products = By.xpath("//div[@class='header_secondary_container']/span");
    By totalClass=By.xpath("//div[@class='inventory_item']");


    public String verifyProductsTitle() {
        return getTextFromElement(products);
    }
    public int verifyNoOfProducts() {
        List<WebElement> numOfProducts = driver.findElements(totalClass);
        int actNumber = numOfProducts.size();
        return actNumber;

    }
}
