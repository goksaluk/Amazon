package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends BasePage {


    @FindBy(css = "[id='feature-bullets']>h1")
    public WebElement descriptionHeader;

    public String getDescriptionHeaderText() {

        BrowserUtils.waitForVisibility(descriptionHeader,3);
        return descriptionHeader.getText();
    }

}
