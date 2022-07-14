package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allBurgerMenu;

    public void clickAllBurgerMenu(){
        BrowserUtils.waitForClickablility(allBurgerMenu,3);
        allBurgerMenu.click();
    }

    public  void clickMainMenu(String mainProductName ) {
        WebElement mainMenu = Driver.get().findElement(By.xpath("//*[text()='shop by department']//following::*[text()='"+ mainProductName +"']"));
        BrowserUtils.waitFor(4);
        BrowserUtils.waitForClickablility(mainMenu,3);
        mainMenu.click();
    }

    public void  clickGeneralProductsNames(String productsName){
        WebElement productsElement = Driver.get().findElement(By.xpath("//*[text()='electronics']//following::*[text()='"+ productsName +"']"));
        BrowserUtils.waitForClickablility(productsElement,3);
        productsElement.click();

    }
}
