package com.amazon.step_definitions;

import com.amazon.pages.ProductDescriptionPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class ProductDescriptionPageSteps {

    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();

    @Given("the product description header is visible to the user")
    public void the_product_description_header_is_visible_to_the_user() {
        System.out.println("Description header is: "+productDescriptionPage.getDescriptionHeaderText());
        Assert.assertEquals(" About this item ", productDescriptionPage.getDescriptionHeaderText());
    }

}
