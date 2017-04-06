package com.shoestore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by tejeshr on 6/4/17.
 */
public class HomePage extends BasePage {
    @FindBy(how = How.XPATH, using = "//body//h2")
    private WebElement welComeMessage;
    @FindBy(id = "brand")
    private WebElement selectBrandField;
    @FindBy(xpath = "//*[@id='flash']/div")
    private WebElement thankYouMessage;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'january')]")
    private WebElement januaryLink;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'february')]")
    private WebElement februaryLink;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'march')]")
    private WebElement marchLink;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'april')]")
    private WebElement aprilLink;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'may')]")
    private WebElement mayLink;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'june')]")
    private WebElement juneLink;

    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'july')]")
    private WebElement julyLink;

    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'august')]")
    private WebElement augustLink;

    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'september')]")
    private WebElement septemberLink;

    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'october')]")
    private WebElement octoberLink;

    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'november')]")
    private WebElement novemberLink;
    @FindBy(xpath = "//*[@id='header_nav']//a[contains(@href, 'december')]")
    private WebElement decemberLink;

    @FindBy(id = "remind_email_input")
    private WebElement reminderEmailTextField;
    @FindBy(id = "remind_email_submit")
    private WebElement reminderEmailSubmitButton;
    @FindBy(id = "promo_code_input")
    private WebElement promotionalCodeTextField;
    @FindBy(id = "promo_code_submit")
    private WebElement promotionalCodeSubmitButton;


    WebDriver driver = null;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public JanuaryPage clickOnJanLink() {
        waitForElementToBeVisible(februaryLink);
        januaryLink.click();
        return new JanuaryPage(driver);
    }

    public FebruaryPage clickOnFebLink() {
        waitForElementToBeVisible(februaryLink);
        februaryLink.click();
        return new FebruaryPage(driver);
    }

    public MarchPage clickOnMarchLink() {
        waitForElementToBeVisible(marchLink);
        marchLink.click();
        return new MarchPage(driver);
    }

    public AprilPage clickOnAprilLink() {
        waitForElementToBeVisible(aprilLink);
        aprilLink.click();
        return new AprilPage(driver);
    }

    public MayPage clickOnMayLink() {
        waitForElementToBeVisible(mayLink);
        mayLink.click();
        return new MayPage(driver);
    }

    public JunePage clickOnJuneLink() {
        waitForElementToBeVisible(juneLink);
        juneLink.click();
        return new JunePage(driver);
    }

    public JulyPage clickOnJulyLink() {
        waitForElementToBeVisible(julyLink);
        julyLink.click();
        return new JulyPage(driver);
    }

    public AugustPage clickOnAugustLink() {
        waitForElementToBeVisible(augustLink);
        augustLink.click();
        return new AugustPage(driver);
    }

    public SeptemberPage clickOnSeptemberLink() {
        waitForElementToBeVisible(septemberLink);
        septemberLink.click();
        return new SeptemberPage(driver);
    }

    public OctoberPage clickOnOctoberLink() {
        waitForElementToBeVisible(octoberLink);
        octoberLink.click();
        return new OctoberPage(driver);
    }

    public NovemberPage clickOnNovemberLink() {
        waitForElementToBeVisible(novemberLink);
        novemberLink.click();
        return new NovemberPage(driver);
    }

    public DecemberPage clickOnDecemberLink() {
        waitForElementToBeVisible(decemberLink);
        decemberLink.click();
        return new DecemberPage(driver);
    }

    private void captureReminderEmail(String emailIdToRemind) {
        waitForElementToBeVisible(reminderEmailTextField);
        if (reminderEmailTextField.isDisplayed()) {
            reminderEmailTextField.sendKeys(emailIdToRemind);
        }
    }

    public HomePage captureReminderEmailAndClickSubmitButton(String emailIdToRemind) {
        captureReminderEmail(emailIdToRemind);
        waitForElementToBeVisible(reminderEmailSubmitButton);
        if (reminderEmailSubmitButton.isDisplayed()) {
            reminderEmailSubmitButton.click();

        }
        return this;
    }

    public String getFlashMessageText() {
        waitForElementToBeVisible(thankYouMessage);
        if (thankYouMessage.isDisplayed()) {
            return thankYouMessage.getText();
        } else {
            return "";
        }
    }

}
