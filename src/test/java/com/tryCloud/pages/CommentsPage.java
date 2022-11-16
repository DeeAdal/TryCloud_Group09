package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommentsPage {


    public CommentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//tr[@class='summary']")
    public WebElement fileSummary;

    @FindBy (xpath  ="//a[@class='action action-menu permanent']")
    public WebElement actionIcon;


    @FindBy(xpath = "//span[.='Details']")
    public WebElement detailsOption;


    @FindBy(xpath = "//a[normalize-space()='Comments']")
    public WebElement commentButton;


    @FindBy(xpath ="//div[@data-placeholder='New comment …']")
    public WebElement newComment;


    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement submitButton;




}


