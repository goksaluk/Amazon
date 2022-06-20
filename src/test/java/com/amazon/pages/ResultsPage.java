package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage{

    @FindBy(css = "[class='a-button-text a-declarative']")
    public WebElement sortByButton;

    //second highest price
    @FindBy(xpath = "(//*[@class='a-section a-spacing-base'])[2]//div")
    public WebElement secondHighestPricedItem;


    public void clickSortByButton(){
        BrowserUtils.waitForVisibility(sortByButton,5);
        BrowserUtils.waitForClickablility(sortByButton,3);
        sortByButton.click();
    }

    public void selectPricePreference(String preference) {
        WebElement pricePreference = Driver.get().findElement(By.xpath("//*[@role='listbox']//*[text()='"+preference+"']"));
        BrowserUtils.waitForClickablility(pricePreference,3);
        pricePreference.click();
    }

    public void clickSecondHighestPricedItem(){
        //BrowserUtils.waitForVisibility(secondHighestPricedItem,5);
        BrowserUtils.waitForClickablility(secondHighestPricedItem,3);
        secondHighestPricedItem.click();
    }


}