package com.shoestore.driver;

import com.shoestore.utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.shoestore.utils.Constants.*;


/**
 * Created by Tejesh on 15/03/16.
 */
public class DriverFactory {


    public static WebDriver getDriver(String browser) {
        WebDriver webDriver = null;
        if ((BROWSER_FF).equalsIgnoreCase(browser)) {
            webDriver = new FirefoxDriver();

        } else if ((BROWSER_IE).equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capabilities.setJavascriptEnabled(true);
            webDriver = new InternetExplorerDriver(capabilities);

        } else if ((BROWSER_CHROME).equalsIgnoreCase(browser)) {
            DesiredCapabilities capability = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            if (Util.isWindows()) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            } else if (Util.isLinux()) {
                options.addArguments("--test-type");
                options.addArguments("--kiosk");
                capability.setCapability(ChromeOptions.CAPABILITY, options);
            } else if (Util.isMac()) {
                options.addArguments("--test-type");
                options.addArguments("--kiosk");
                capability.setCapability(ChromeOptions.CAPABILITY, options);
            }
            webDriver = new ChromeDriver(capability);
        }
        return webDriver;
    }

}
