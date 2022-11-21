package com.tryCloud.step_defs;

import com.tryCloud.pages.LoginWithInvalidCredentialsPage;
import com.tryCloud.utilis.ConfigurationReader;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithInvalidCredentials_StepDef {
    LoginWithInvalidCredentialsPage loginWithInvalidCredentialsPage = new LoginWithInvalidCredentialsPage();

    @Given("user on the TryCloud login page")
    public void user_on_the_try_cloud_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters {string} and enters {string}")
    public void user_enters_and_enters(String string, String string2) {
        loginWithInvalidCredentialsPage.username.sendKeys(string);
        loginWithInvalidCredentialsPage.password.sendKeys(string2);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
    loginWithInvalidCredentialsPage.loginBtn.click();
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
    Assert.assertEquals(string, loginWithInvalidCredentialsPage.failedMsg.getText());
    }

}
