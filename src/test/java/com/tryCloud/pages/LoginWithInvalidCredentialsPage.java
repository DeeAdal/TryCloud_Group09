package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithInvalidCredentialsPage {

    public LoginWithInvalidCredentialsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement failedMsg;
}

