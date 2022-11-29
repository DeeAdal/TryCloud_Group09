package com.tryCloud.step_defs;

import com.tryCloud.pages.UpdateSettingsPage;
import com.tryCloud.utilis.ConfigurationReader;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateSettings_Steps {


    UpdateSettingsPage updateSettingsPage = new UpdateSettingsPage();

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page(){
        Driver.getDriver().get("http://qa2.trycloud.net/");

    }

    @When("user enters {string} and password")
    public void user_enters_and_password(String string) {
      updateSettingsPage.usernameBox.sendKeys(string);
      updateSettingsPage.passwordBox.sendKeys("Userpass123");
 }


   // @When("user enters username and password")
   //public void user_enters_username_and_password() {
   //updateSettingsPage.usernameBox.sendKeys("User99");
   //updateSettingsPage.passwordBox.sendKeys("Userpass123");
   //}

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        updateSettingsPage.loginBtn.click();
    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {

        updateSettingsPage.filesBtn.click();
    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

        updateSettingsPage.settingsBtn.click();
    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        updateSettingsPage.settingsOptions1.click();
        updateSettingsPage.settingsOptions2.click();
        updateSettingsPage.settingsOptions3.click();

    }

    @And("user checks the current storage usage")
    public void userChecksTheCurrentStorageUsage() {
        System.out.println("updateSettingsPage.storageUsage.getText() = " + updateSettingsPage.storageUsage.getText());

    }

    @And("user uploads file with the upload file option")
    public void userUploadsFileWithTheUploadFileOption() throws InterruptedException {
        updateSettingsPage.plusSign.click();

        updateSettingsPage.uploadBtn.click();
        Thread.sleep(5000);
        updateSettingsPage.uploadFileOption.sendKeys("/Users/chrystelehosty/Downloads/vytrackTestfile.docx");
        Thread.sleep(5000);
    }

    @And("user refresh the page")
    public void userRefreshThePage() {
        Driver.getDriver().navigate().refresh();

    }

    @Then("the user should be able to see storage usage is increased")
    public void theUserShouldBeAbleToSeeStorageUsageIsIncreased() {
        System.out.println("updateSettingsPage.storageUsage.getText() = " + updateSettingsPage.storageUsage.getText());
    }
}
