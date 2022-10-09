package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class ProductDetailsTests extends BaseTests{
//ProductsDetailsPage productsDetailsPage;
//NavigateBarPage navigateBarPage;
 //   @BeforeMethod
 //           public void preRequest() {
 //       NavigateBarPage navigateBarPage = new NavigateBarPage(driver);
 //       ProductsDetailsPage productsDetailsPage = navigateBarPage.clickProductsFromNavBar();
 //   }

    @Test (priority = 0)
    public void testProductsDetails() {
        NavigateBarPage navigateBarPage = new NavigateBarPage(driver);
        ProductsDetailsPage productsDetailsPage = navigateBarPage.clickProductsFromNavBar();

        String productToSearchFor = "Top" ;
        SearchedProductionPage searchedProductionPage = productsDetailsPage.productType(productToSearchFor);
    Assert.assertEquals(searchedProductionPage.getFeaturedItemDisplay(),"SEARCHED PRODUCTS" );
    Assert.assertTrue(searchedProductionPage.isFeaturedItemDisplay());
    Assert.assertFalse(searchedProductionPage.isKeywordInProductTitle("Top"), "not displayed");


    }
    @Test (priority = 1)
    public void testNoResultForProduct() {
       NavigateBarPage navigateBarPage = new NavigateBarPage(driver);
       ProductsDetailsPage productsDetailsPage = navigateBarPage.clickProductsFromNavBar();
        String productToSearchFor = "Hats";
        SearchedProductionPage searchedProductionPage = productsDetailsPage.productType(productToSearchFor);
        String title = "There is no results related to this search keyword";
       if(driver.getPageSource().contains("There is no result")) {
           System.out.println("Text: " + title + " is present.");
       }else{
           System.out.println("Text: " + title + " is not present.");

       }
    }
    }


