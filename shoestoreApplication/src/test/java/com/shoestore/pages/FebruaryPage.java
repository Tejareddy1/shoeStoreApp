package com.shoestore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by tejeshr on 5/4/17.
 */
public class FebruaryPage extends BasePage {

    @FindBy(xpath = "//h2[contains(text(),'February')]")
    WebElement februaryShoesPage;
    @FindBy(xpath = "//ul[@id='shoe_list']//img")
    private List<WebElement> listOfImagesInPage;
    @FindBy(xpath = "//ul[@id='shoe_list']//li")
    private List<WebElement> listOfShoes;
    @FindBy(xpath = "//ul[@id='shoe_list']//td[contains(@class,'shoe_price')]")
    private List<WebElement> listOfShoePrices;
    @FindBy(xpath = "//ul[@id='shoe_list']//td[contains(@class,'shoe_description')]")
    private List<WebElement> listOfShoeDescriptions;


    WebDriver driver = null;

    public FebruaryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int getShoeCount(){
        waitForElementsToBeVisible(listOfShoes);
        return listOfShoes.size();
    }

    public int getNumberOfShoePricesCount(){
        waitForElementsToBeVisible(listOfShoePrices);
        return listOfShoePrices.size();
    }
    public int getNumberOfShoeDescriptionsCount(){
        waitForElementsToBeVisible(listOfShoeDescriptions);
        return listOfShoeDescriptions.size();
    }

    public int getNumberOfShoeImagesCount(){
        waitForElementsToBeVisible(listOfImagesInPage);
        return listOfImagesInPage.size();
    }
    public boolean verifyFebruaryPageDetails() {
        waitForElementToBeVisible(februaryShoesPage);
        if (februaryShoesPage.isDisplayed()) {
            int shoeCount = getShoeCount();
            if (shoeCount == getNumberOfShoeDescriptionsCount() &&
                    shoeCount == getNumberOfShoeImagesCount() &&
                    shoeCount == getNumberOfShoeDescriptionsCount()) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}
