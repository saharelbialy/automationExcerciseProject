package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddToCartTests extends BaseTests {

    @Test
    public void testAddToCart() {

        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.clickOnAddToCart();
        Assert.assertEquals(addToCartPage.itemAdded(), "Added!");
        addToCartPage.continueShopping();
        addToCartPage.addSecondItemToCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickCartButton();
        Assert.assertEquals(shoppingCartPage.getSizeOfAddedProducts(), 2, "The added products should be 2");
        Assert.assertEquals(shoppingCartPage.getFirstProductPrice(), "Rs. 500", "The 1st products price Rs.500");
        Assert.assertEquals(shoppingCartPage.getFirstProductQuantity(), "1", "The 1st product quantity is 1");
        Assert.assertEquals(shoppingCartPage.getFirstProductTotal(), "Rs. 500", "The 1st product quantity is 1");
        Assert.assertEquals(shoppingCartPage.getSecondProductPrice(), "Rs. 400", "The 2nd products price Rs.500");
        Assert.assertEquals(shoppingCartPage.getSecondProductQuantity(), "1", "The 2nd product quantity is 1");
        Assert.assertEquals(shoppingCartPage.getSecondProductTotal(), "Rs. 400", "The 2nd product quantity is 1");


    shoppingCartPage.clickRemoveButton();
    Assert.assertFalse(shoppingCartPage.getFirstProductTitle().isEmpty(), "should be empty");
    }
}

