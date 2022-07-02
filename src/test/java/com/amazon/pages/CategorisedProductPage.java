package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategorisedProductPage extends BasePage {

    public void  clickCategorisedProduct(String commonName, String product){
        WebElement categorisedProduct = Driver.get().findElement(By.xpath("//*[@class='a-list-item']//*[text()='"+commonName+"']//following::*[text()='"+product+"']"));
        BrowserUtils.waitFor(2);
        //BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(categorisedProduct,3);
        categorisedProduct.click();


    }



}
