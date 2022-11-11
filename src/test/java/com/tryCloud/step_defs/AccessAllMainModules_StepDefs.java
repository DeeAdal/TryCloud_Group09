package com.tryCloud.step_defs;

import com.tryCloud.pages.AccessAllMainModulesPage;
import com.tryCloud.utilis.ConfigurationReader;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccessAllMainModules_StepDefs {

    AccessAllMainModulesPage accessAllMainModulesPage = new AccessAllMainModulesPage();
    @Given("user on the login page")
    public void user_on_the_login_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Thread.sleep(4000);
    }
    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
       accessAllMainModulesPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        accessAllMainModulesPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        accessAllMainModulesPage.loginButton.click();
    }


    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {

        List<WebElement> elems = Driver.getDriver().findElements(By.xpath("//li[@tabindex='-1']//a"));
         List <String> actualModules = new ArrayList<>();
         for (WebElement each : elems) {actualModules.add(each.getAttribute("aria-label"));}

     Assert.assertEquals(expectedModules, actualModules);
       }
    }

