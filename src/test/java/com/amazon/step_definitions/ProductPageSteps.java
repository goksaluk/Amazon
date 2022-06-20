package com.amazon.step_definitions;

import com.amazon.pages.ProductPage;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @When("the user is on the product page with {string}")
    public void the_user_on_the_product_page(String pageTitle) {
        Assert.assertEquals(pageTitle, Driver.get().getTitle());
    }

    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the_particular_product(String product) {
        productPage.clickParticularProduct(product);
    }

}
