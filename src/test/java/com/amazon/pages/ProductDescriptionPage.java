package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage {

    //second highest price
    @FindBy(xpath = "//*[@data-feature-name='featurebullets']//h1")
    //@FindBy(css = "[id='featurebullets_feature_div'] h1")
    public WebElement descriptionHeader;

    public String getDescriptionHeaderText() {
        BrowserUtils.waitForVisibility(descriptionHeader,3);
        return descriptionHeader.getText();
    }

}
