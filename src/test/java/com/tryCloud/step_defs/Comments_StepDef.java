package com.tryCloud.step_defs;

import com.tryCloud.pages.CommentsPage;
import com.tryCloud.utilis.BrowserUtils;
import com.tryCloud.utilis.ConfigurationReader;
import com.tryCloud.utilis.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Comments_StepDef {
    CommentsPage commentsPage = new CommentsPage();









        @When("user click action-icon  from any file on the page")
        public void user_click_action_icon_from_any_file_on_the_page () {
            BrowserUtils.sleep(3);
            commentsPage.actionIcon.click();
            BrowserUtils.hover(commentsPage.detailsOption);
            commentsPage.detailsOption.click();
            BrowserUtils.sleep(2);

        }

        @When("user write a comment inside the input box")
        public void user_write_a_comment_inside_the_input_box () {
        commentsPage.commentButton.click();
            BrowserUtils.sleep(2);
        commentsPage.commentBox.sendKeys("good job");
            BrowserUtils.sleep(2);

        }
        @When("user click the submit button to post it")
        public void user_click_the_submit_button_to_post_it () {
            commentsPage.submitButton.click();

        }
        @Then("Verify the comment is displayed in the comment section.")
        public void verify_the_comment_is_displayed_in_the_comment_section () {

            Assert.assertTrue(commentsPage.postMessage.getText().contains("good job"));



        }

    }
