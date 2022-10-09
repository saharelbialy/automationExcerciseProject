package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigateBarPage extends BasePage {

    public NavigateBarPage(WebDriver driver) {

        super(driver);
    }

    By cartFromNavBar = By.xpath(("(//ul[@class=\"nav navbar-nav\"]/li[3]/a)"));
    By productsKey = By.xpath(("//ul[@class=\"nav navbar-nav\"]/li[2]/a"));



    public ProductsDetailsPage clickProductsFromNavBar() {

        clickElement(productsKey);

        return new ProductsDetailsPage(driver);
    }
   public ProductsDetailsPage clickCartFromNavBar() {

       clickElement(cartFromNavBar);
       return new ProductsDetailsPage(driver);
    }
}
