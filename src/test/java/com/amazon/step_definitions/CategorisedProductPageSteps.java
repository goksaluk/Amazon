package com.amazon.step_definitions;

import com.amazon.pages.CategorisedProductPage;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CategorisedProductPageSteps {

    CategorisedProductPage categorisedProductPage = new CategorisedProductPage();

    @When("the user is on the categorised product page with {string}")
    public void the_user_on_the_categorised_product_page_title(String pageTitle) {
        Assert.assertEquals(pageTitle, Driver.get().getTitle());
    }

    @When("the user clicks the {string} which is under the {string} on the categorised product page")
    public void the_user_clicks_the_product_is_under_the_common_on_categorised_the_product_page(String product, String commonName) {
        categorisedProductPage.clickCategorisedProduct(commonName, product);
    }

}
