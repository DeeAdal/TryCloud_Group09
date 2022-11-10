package com.tryCloud.step_defs;

import com.tryCloud.pages.DeleteFileFolderPage;
import com.tryCloud.utilis.BrowserUtils;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteFileFolder_StepDefs {
    DeleteFileFolderPage deleteFileFolderPage = new DeleteFileFolderPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);


    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        wait.until(ExpectedConditions.visibilityOf(deleteFileFolderPage.plusButton));
        BrowserUtils.hover(deleteFileFolderPage.actions);
        deleteFileFolderPage.actions.click();
     wait.until(ExpectedConditions.visibilityOf(deleteFileFolderPage.deleteButton));

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

  //      BrowserUtils.hover(deleteFileFolderPage.deleteButton);
        deleteFileFolderPage.deleteButtonClicking(string);

    }

    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
        wait.until(ExpectedConditions.visibilityOf(deleteFileFolderPage.deletedFiles));
        deleteFileFolderPage.deletedFilesClick(string);
        BrowserUtils.sleep(3);
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        Assert.assertTrue(deleteFileFolderPage.deletedFiles.getText().contains(deleteFileFolderPage.deletedFileInDeletedBin.getText()));
    }
}
