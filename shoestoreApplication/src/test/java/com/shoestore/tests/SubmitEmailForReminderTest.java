package com.shoestore.tests;

import com.shoestore.pages.HomePage;
import com.shoestore.utils.ShoestoreTestConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by tejeshr on 6/4/17.
 */
public class SubmitEmailForReminderTest extends BaseTest{
    @Test
    public void captureInvalidEmailId(){
        String emailIdToCapture=ShoestoreTestConfig.getInstance().getInValidMailId();
        HomePage homePage= new HomePage(driver);
        homePage.captureReminderEmailAndClickSubmitButton(emailIdToCapture);
        Assert.assertNotEquals("Thanks! We will notify you of our new shoes at this email: "+emailIdToCapture ,homePage.getFlashMessageText());
    }
    @Test
    public void captureInvalidEmailIdFormat(){
        String emailIdToCapture=ShoestoreTestConfig.getInstance().getInValidMailIdFormat();
        HomePage homePage= new HomePage(driver);
        homePage.captureReminderEmailAndClickSubmitButton(emailIdToCapture);
        Assert.assertNotEquals("Thanks! We will notify you of our new shoes at this email: "+emailIdToCapture ,homePage.getFlashMessageText());
        Assert.assertEquals("Invalid email format. Ex. name@example.com",homePage.getFlashMessageText());
    }
    @Test
    public void capturevalidEmailId(){
        String emailIdToCapture=ShoestoreTestConfig.getInstance().getValidMailId();
        HomePage homePage= new HomePage(driver);
        homePage.captureReminderEmailAndClickSubmitButton(emailIdToCapture);
        Assert.assertEquals("Thanks! We will notify you of our new shoes at this email: "+emailIdToCapture ,homePage.getFlashMessageText());
    }
}
