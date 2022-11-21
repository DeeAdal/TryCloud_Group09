package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[@class = 'material-design-icon magnify-icon unified-search__trigger']")
    public WebElement searchBtn;

    @FindBy(xpath = "//input[@class = 'unified-search__form-input']")
    public WebElement searchLine;

}
