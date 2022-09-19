package com.amazon.step_definitions;

import com.amazon.pages.OneOcean;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OneOceanSteps {

    OneOcean oneOcean = new OneOcean();

    @When("the user is on the main page")
    public void the_user_on_the_chart_page() {
        Assert.assertEquals("Amazon.com. Spend less. Smile more.", Driver.get().getTitle());
    }

    @When("the user search {string}")
    public void the_user_search(String item) {
        oneOcean.searchItem(item);
        oneOcean.clickSubmitButton();
    }

    @When("the user sorts the result according to {string}")
    public void the_user_sorts_the_result_according_to(String string) {
        Assert.assertEquals("RESULTS", oneOcean.getResultPageTitle());
        oneOcean.clickSortBy();
        oneOcean.clickCustomerReview();
    }
    @When("the user selects the Age range between five to seven years old")
    public void the_user_selects_the_age_range_between_five_to_seven_years_old() {
        oneOcean.clickFiveToSevenYearsOldOption();
    }
    @When("the user adds the first two items in his cart")
    public void the_user_adds_the_first_two_items_in_his_cart() {
        oneOcean.clickFirstTeddyBear();
        oneOcean.clickAddCartButton();
        Assert.assertTrue(oneOcean.getCartPageTittle().contains("Added to Cart"));
        Driver.get().navigate().back();
        Driver.get().navigate().back();
        oneOcean.clickSecondTeddyBear();
        oneOcean.clickAddCartButton();
        Assert.assertTrue(oneOcean.getSecondCartPageTittle().contains("Added to Cart"));
        oneOcean.clickCartButton();
    }
    @Then("the user verifies whether the two items are on the chart.")
    public void the_user_verifies_whether_the_two_items_are_on_the_chart() {
        BrowserUtils.waitFor(4);
        Assert.assertEquals("Amazon.com Shopping Cart", Driver.get().getTitle());
        Assert.assertEquals(2, oneOcean.getNumberOfItems());
    }


}
