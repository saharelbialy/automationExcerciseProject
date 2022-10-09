package pages;

import org.checkerframework.common.initializedfields.qual.EnsuresInitializedFields;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
    public WebElement locateElement(By elementLocator) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
        wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        return driver.findElement(elementLocator);

    }
        public void clickElement (By elementLocator) {

        locateElement(elementLocator).click();
        }
        public void typeOnInputField (By elementLocator, String text)
        {

            locateElement(elementLocator).sendKeys(text);
        }

    public boolean isElementDisplayedOnPage (By elementLocator) {

        return locateElement(elementLocator).isDisplayed();
    }
    public String getTextOfWebElement (By elementLocator)
    {

        return locateElement(elementLocator).getText();

    }


     public List<WebElement> locateListOfElements (By elementLocator) {
    wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    wait.until(ExpectedConditions.elementToBeClickable(elementLocator));

    return driver.findElements(elementLocator);

}

}



