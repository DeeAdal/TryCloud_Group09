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
}
