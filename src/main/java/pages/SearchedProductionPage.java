package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class SearchedProductionPage extends BasePage {

    public SearchedProductionPage(WebDriver driver) {

        super(driver);
    }

    By searchedProductsTest = By.xpath(("//h2[text()='Searched Products']"));
    private By productTitle = By.cssSelector(".product-title > a");
    private By allProductTitles = By.cssSelector(".productinfo > p");

    public String getFeaturedItemDisplay() {

        return getTextOfWebElement(searchedProductsTest);
    }

    public boolean isFeaturedItemDisplay() {
        return isElementDisplayedOnPage(searchedProductsTest);

    }

    public String getProductTitle() {

        return getTextOfWebElement(productTitle);
    }

    public List<String> getProductTitles() {
        List<WebElement> productTitles = locateListOfElements(allProductTitles);
        List<String> titles = new ArrayList<>();
        for (int i = 0; i < productTitles.size(); i++) {
            String title = productTitles.get(i).getText();
            titles.add(title);
        }
        return titles;
    }

    public boolean isKeywordInProductTitle(String tops) {
        List<String> titles = getProductTitles();
        for (int i = 0; i < titles.size(); i++)
        {

                   if (!titles.contains(tops))
            {

                return false;
            }
        }
        return true;
    }
}

