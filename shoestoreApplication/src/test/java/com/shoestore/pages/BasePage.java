package com.shoestore.pages;

import com.shoestore.utils.ElementNotFoundOnPageException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by tejeshr on 5/4/17.
 */
public class BasePage {

    WebDriver driver=null;

    BasePage(WebDriver driver){
        this.driver=driver;
    }

    protected void waitForElementToBeVisible(WebElement element){
        try{
        WebDriverWait wait = new WebDriverWait(this.driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }catch (NoSuchElementException |StaleElementReferenceException | TimeoutException e){
            throw new ElementNotFoundOnPageException(e);
        }

    }

    protected void waitForElementsToBeVisible(List<WebElement> elements){
       try {
           WebDriverWait wait = new WebDriverWait(this.driver, 5);
           wait.until(ExpectedConditions.visibilityOfAllElements(elements));
       }catch (NoSuchElementException |StaleElementReferenceException | TimeoutException e){
          throw new ElementNotFoundOnPageException(e);
    }

}

}
