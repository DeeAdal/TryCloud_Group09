package com.tryCloud.step_defs;

import com.tryCloud.pages.CommentsPage;
import com.tryCloud.utilis.BrowserUtils;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Comments_StepDef {

    CommentsPage commentsPage = new CommentsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        wait.until(ExpectedConditions.visibilityOf(commentsPage.fileSummary));
        BrowserUtils.hover(Driver.getDriver().findElement(By.xpath("(//a[@class='action action-menu permanent'])[1]")));
        commentsPage.actionIcon.click();

    }

   /* @And("user choose the {string} option")
   public void userChooseTheOption(String arg) {
        BrowserUtils.sleep(2);
        commentsPage.detailsOption.click();

    }

    */


    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        wait.until(ExpectedConditions.visibilityOf(commentsPage.commentButton));
        commentsPage.commentButton.click();
        wait.until(ExpectedConditions.visibilityOf(commentsPage.newComment));
        commentsPage.newComment.click();
        commentsPage.newComment.sendKeys("good job");


    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        commentsPage.submitButton.click();

    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

        System.out.println("commentsPage.newComment.isDisplayed() = " + commentsPage.newComment.isDisplayed());


    }


}



