package com.shoestore.tests;

import com.shoestore.driver.DriverFactory;
import com.shoestore.utils.ShoestoreTestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by tejeshr on 6/4/17.
 */
public class BaseTest {

    WebDriver driver = null;

    @BeforeMethod
    public void setDriver() {
        this.driver = DriverFactory.getDriver(ShoestoreTestConfig.getInstance().getBrowser());
        driver.get(ShoestoreTestConfig.getInstance().getUrl());
        enableImplicitTimeoutAndMaximzeTheWindow();
    }

    public void enableImplicitTimeoutAndMaximzeTheWindow() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
