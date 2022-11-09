package com.tryCloud.pages;

import com.tryCloud.utilis.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFileFolderPage {
   public DeleteFileFolderPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

    @FindBy(xpath = "(//a[@class='action action-menu permanent']//span)[1]")
    public WebElement actions;

    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement deleteButton;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//div[@id='rightClickDetector']")
    public WebElement deletedFileInDeletedBin;

    @FindBy(xpath = "//div[@class='ProseMirror']/p")
    public WebElement addNotesListOrLinks;

    public void deletedFilesClick(String s1){
        if (deletedFiles.getText().contains(s1)){
            deletedFiles.click();
        }
    }

    public void deleteButtonClicking(String s2){
        if (deleteButton.getText().contains(s2)){
            deleteButton.click();
        }
    }






}
