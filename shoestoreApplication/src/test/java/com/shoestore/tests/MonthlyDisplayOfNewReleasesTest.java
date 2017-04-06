package com.shoestore.tests;

import com.shoestore.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by tejeshr on 5/4/17.
 */
public class MonthlyDisplayOfNewReleasesTest extends BaseTest {

    @Test
    public void verifyDecemberPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnDecemberLink().verifyDecemberPageDetails());
    }

    @Test
    public void verifyNovemberPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnNovemberLink().verifyNovemberPageDetails());
    }

    @Test
    public void verifyOctoberPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnOctoberLink().verifyOctoberPageDetails());
    }

    @Test
    public void verifySeptemberPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnSeptemberLink().verifySeptemberPageDetails());
    }

    @Test
    public void verifyAugustPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnAugustLink().verifyAugustPageDetails());
    }

    @Test
    public void verifyJulyPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnJulyLink().verifyJulyPageDetails());
    }

    @Test
    public void verifyJunePage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnJuneLink().verifyJunePageDetails());
    }

    @Test
    public void verifyMayPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnMayLink().verifyMayPageDetails());
    }

    @Test
    public void verifyAprilPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnAprilLink().verifyAprilPageDetails());
    }

    @Test
    public void verifyMarchPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnMarchLink().verifyMarchPageDetails());
    }

    @Test
    public void verifyFebruaryPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnFebLink().verifyFebruaryPageDetails());
    }

    @Test
    public void verifyJanuaryPage() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickOnJanLink().verifyJanuaryPageDetails());
    }

}