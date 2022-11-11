package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessAllMainModulesPage {

    public AccessAllMainModulesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id ="user")
    public static WebElement username;

    @FindBy ( id = "password")
    public static WebElement password;

    @FindBy(id = "submit-form")
    public static WebElement loginButton;


}
