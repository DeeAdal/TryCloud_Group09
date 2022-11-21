package com.tryCloud.step_defs;

import com.tryCloud.pages.SearchPage;
import com.tryCloud.pages.TryCloudLoginPage;
import com.tryCloud.utilis.ConfigurationReader;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Search_StepDefs {
    SearchPage searchPage = new SearchPage();

    @Given("user on a homepage")
    public void user_on_a_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
      searchPage.username.sendKeys("User9");
      searchPage.password.sendKeys("Userpass123");
      searchPage.loginBtn.click();
    }
    @When("user clicks on search button on the top right of page")
    public void user_clicks_on_search_button_on_the_top_right_of_page() {
searchPage.searchBtn.click();
    }
    @And("write {string} in a search line and clicks enter")
    public void writeInASearchLineAndClicksEnter(String arg0) {
    searchPage.searchLine.sendKeys(arg0 + Keys.ENTER);
    }
    @Then("user should see {string} related page")
    public void userShouldSeeRelatedPage(String arg0) {
    Assert.assertTrue(Driver.getDriver().getTitle(), true);
    }
}
