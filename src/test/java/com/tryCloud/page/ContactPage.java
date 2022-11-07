package com.tryCloud.page;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBth;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement contactModule;







}
