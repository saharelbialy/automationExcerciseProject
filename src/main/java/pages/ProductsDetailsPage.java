package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsDetailsPage extends BasePage {

 public ProductsDetailsPage(WebDriver driver) {
     super(driver);
    }
    By searchField = By.id("search_product");
    By clickButton = By.id("submit_search");

        public SearchedProductionPage productType (String productName){
        typeOnInputField(searchField, productName);
        clickElement(clickButton);
        return new SearchedProductionPage(driver);
    }


}

