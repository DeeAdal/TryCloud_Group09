package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage {
    public FilesModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement checkBox;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//span[@class='displayname' and text()='New folder']")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement inputFolderName;

    @FindBy(xpath = "//form[@class='filenameform']//input[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//tr[@data-id='45842']//span[@class='innernametext']")
    public WebElement newFolder;




}
