package com.amazon.step_definitions;

import com.amazon.pages.BasePage;
import com.amazon.pages.MainPage;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @When("the user is on the main page")
    public void the_user_on_the_chart_page() {
        Assert.assertEquals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items", Driver.get().getTitle());
    }

    @When("the user clicks on burger menu for all products")
    public void the_user_clicks_to_burger_menu_for_all_products() {
        mainPage.clickAllBurgerMenu();
    }

    @When("the user clicks {string} on the main page")
    public void the_user_clicks_products_on_the_main_page(String mainProducts) {
        mainPage.clickMainMenu(mainProducts);
    }

    @When("the user clicks the {string} on the main page")
    public void the_user_clicks_products( String productsName) {
        mainPage.clickGeneralProductsNames(productsName);
    }



}
