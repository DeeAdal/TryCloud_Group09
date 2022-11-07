package com.tryCloud.step_defs;

import com.tryCloud.page.ContactPage;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Contact_StepDefs {

        ContactPage contactPage = new ContactPage();

    @Given("User on tryCloud login page")
    public void user_on_try_cloud_login_page() throws InterruptedException {
        Driver.getDriver().get("http://qa2.trycloud.net/");
        Thread.sleep(4000);
    }
    @When("user enters {string}")
    public void user_enters(String userName) {
        contactPage.userName.sendKeys(userName);
    }
    @When("user enters User9")
    public void user_enters_User9() {
        contactPage.userName.sendKeys("User9");
    }
    @When("user enters password Userpass123")
    public void user_enters_password_userpass123() {
        contactPage.password.sendKeys("Userpass123");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() throws InterruptedException {
        contactPage.loginBth.click();
        Thread.sleep(4000);
    }
    @When("user clicks Contact module")
    public void user_clicks_contact_module() {
        contactPage.contactModule.click();
    }



    @Then("user sees contact list and contact page title")
    public void user_sees_contact_list_and_contact_page_title() {
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Contacts - Trycloud", actualTitle);
    }
}
