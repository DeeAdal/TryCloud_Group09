package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentsPage {


    public CommentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "(//a[@class='action action-menu permanent open']/span)[1]")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[text()='Details']")
    public WebElement detailsOption;

    @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-comment']")
    public WebElement commentButton;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='commentsTabView']//div/form")
    public WebElement commentBox;

    @FindBy(xpath = "(//div[.='good job'])[1]")
    public WebElement postMessage;


}


