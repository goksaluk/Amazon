package com.amazon.step_definitions;

import com.amazon.pages.ResultsPage;
import io.cucumber.java.en.When;

public class ResultsPageSteps {

    ResultsPage resultsPage = new ResultsPage();

    @When("the user selects price preference from {string} on the result page")
    public void the_user_clicks_on_the_particular_product(String preference) {
        resultsPage.clickSortByButton();
        resultsPage.selectPricePreference(preference);
    }

    @When("the user clicks the second highest priced product on the results page")
    public void the_user_clicks_the_second_highest_priced_product_on_the_results_page() {
        resultsPage.clickSecondHighestPricedItem();
    }

}
