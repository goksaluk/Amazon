package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public void  clickParticularProduct(String productName){
        WebElement particularProduct = Driver.get().findElement(By.xpath("//*[text()='"+productName+"']"));
        BrowserUtils.waitFor(2);
        //BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(particularProduct,7);
        particularProduct.click();


    }

}
