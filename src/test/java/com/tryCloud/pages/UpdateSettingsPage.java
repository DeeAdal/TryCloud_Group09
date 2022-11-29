package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpdateSettingsPage {

    public UpdateSettingsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "user")
    public WebElement usernameBox;

    @FindBy (id = "password")
    public WebElement passwordBox;

    @FindBy (id = "submit-form")
    public WebElement loginBtn;

    @FindBy (xpath = "//ul[@id='appmenu']//li[2]/a[@aria-label='Files']")
    public WebElement filesBtn;

    @FindBy (xpath = "//div[@id='app-settings-header']//button[@class = 'settings-button']")
    public WebElement settingsBtn;

    @FindBy (xpath = "//div[@id='files-setting-richworkspace']/label")
    public WebElement settingsOptions1;

    @FindBy (xpath = "//div[@id='recommendations-setting-enabled']/label")
    public WebElement settingsOptions2;

    @FindBy (xpath = "//div[@id='files-setting-showhidden']/label")
    public WebElement settingsOptions3;

    @FindBy (xpath = "//a[@class='icon-quota svg']/p")
    public WebElement storageUsage;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusSign;

    @FindBy(xpath = "//span[@class='svg icon icon-upload']")
    public WebElement uploadBtn;

    @FindBy (css = " input[type=file]")
    public WebElement uploadFileOption ;







}
