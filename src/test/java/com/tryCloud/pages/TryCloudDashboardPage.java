package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudDashboardPage {

    public TryCloudDashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement filesModule;



}
