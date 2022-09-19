package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class OneOcean extends BasePage{

    @FindBy(css = "[id=\"twotabsearchtextbox\"]")
    public WebElement searchBox;

    @FindBy(css = "[id=\"nav-search-submit-button\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='RESULTS']")
    public WebElement title;

    @FindBy(xpath = "//*[@class='a-dropdown-prompt']")
    public WebElement sortBy;

    @FindBy(xpath = "(//*[text()='Avg. Customer Review'])[2]")
    public WebElement customerReview;

    @FindBy(xpath = "//*[text()='5 to 7 Years']")
    public WebElement fiveToSevenYears;

    @FindBy(xpath = "(//*[@class='a-link-normal s-no-outline'])[1]")
    public WebElement firstTeddyBear;

    @FindBy(xpath = "(//*[@class='a-link-normal s-no-outline'])[2]")
    public WebElement secondTeddyBear;

    @FindBy(css = "[id='add-to-cart-button']")
    public WebElement addCartButton;

    @FindBy(xpath = "//*[contains(text(),'Added to Cart')]")
    public WebElement cartPageTittle;

    @FindBy(xpath = "(//*[@class='a-alert-heading'])[5]")
    public WebElement cartSecondPageTittle;

    @FindBy(css = "[id='attach-sidesheet-view-cart-button']")
    public WebElement cartButton;

    @FindBy(css = "[data-name='Active Items'] [class='sc-list-item-content']")
    public List<WebElement> cartItems;


    public void searchItem(String item) {
        BrowserUtils.waitForVisibility(searchBox, 4);
        searchBox.sendKeys(item);
    }

    public void clickSubmitButton() {
        BrowserUtils.waitForClickablility(submitButton, 3);
        submitButton.click();
    }

    public String getResultPageTitle() {
        BrowserUtils.waitForVisibility(title,5);
        return title.getText();
    }

    public void clickSortBy() {
        BrowserUtils.waitForClickablility(sortBy,5);
        sortBy.click();
    }

    public void clickCustomerReview() {
        BrowserUtils.waitForClickablility(customerReview,5);
        customerReview.click();
    }

    public void clickFiveToSevenYearsOldOption() {
        BrowserUtils.waitForClickablility(fiveToSevenYears,5);
        fiveToSevenYears.click();
    }

    public void clickFirstTeddyBear() {
        BrowserUtils.waitForClickablility(firstTeddyBear,5);
        firstTeddyBear.click();
    }

    public void clickAddCartButton() {
        BrowserUtils.waitForClickablility(addCartButton,5);
        addCartButton.click();
    }

    public String getCartPageTittle() {
        BrowserUtils.waitForVisibility(cartPageTittle,5);
        return cartPageTittle.getText();
    }

    public String getSecondCartPageTittle() {
        BrowserUtils.waitForVisibility(cartSecondPageTittle,5);
        return cartSecondPageTittle.getText();
    }

    public void clickSecondTeddyBear() {
        BrowserUtils.waitForClickablility(secondTeddyBear,5);
        secondTeddyBear.click();
    }

    public void clickCartButton() {
        BrowserUtils.waitForClickablility(cartButton,5);
        cartButton.click();
    }

    public int getNumberOfItems() {
        List<WebElement> teddlerBearItems = new ArrayList<>();
        for (WebElement item: cartItems) {
            teddlerBearItems.add(item);
        }

        return teddlerBearItems.size();
    }
}
