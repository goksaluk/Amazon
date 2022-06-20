package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//This abstract class contains common locators and methods of all pages
public abstract class BasePage {
    public BasePage() { PageFactory.initElements(Driver.get(), this);
    }

//    @FindBy(tagName = "title")
//    public WebElement title;
//
//    public String getPageTitle(){
//        BrowserUtils.waitForVisibility(title, 5);
//        return title.getAttribute("outerText");
//    }


}
