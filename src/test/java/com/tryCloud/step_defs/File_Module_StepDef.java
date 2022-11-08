package com.tryCloud.step_defs;

import com.tryCloud.pages.FilesModulePage;
import com.tryCloud.pages.TryCloudDashboardPage;
import com.tryCloud.pages.TryCloudLoginPage;
import com.tryCloud.utilis.ConfigurationReader;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class File_Module_StepDef {

    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();

    TryCloudDashboardPage tryCloudDashboardPage = new TryCloudDashboardPage();

    FilesModulePage filesModulePage = new FilesModulePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        tryCloudLoginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
        Thread.sleep(4000);

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        tryCloudDashboardPage.filesModule.click();

    }
    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {

        String expectedTitle = "Files - Trycloud";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title verification is failed!",expectedTitle,actualTitle);


    }



    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() throws InterruptedException {
Thread.sleep(3000);
        filesModulePage.checkBox.click();

    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {

        filesModulePage.checkBox.isSelected();

    }


}

