package org.example;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//create new class my step defs (all feature files)
public class MyStepDefs {
    //create objects for relevant class
    HomePage homePg = new HomePage();
    RegistrationPage registrationPg = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopResult desktopResult = new DesktopResult();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    ReferProductToFriendResultPage referProductToFriendResultPage = new ReferProductToFriendResultPage();
    NewsCommentResult newsCommentResult = new NewsCommentResult();


    //Register feature
    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePg.clickOnTheRegister();
    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPg.userEntersRegistrationDetails();
    }

    @When("click on register submit button")
    public void click_on_register_submit_button() {
        registrationPg.clickOnRegisterButton();
    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationResultPage.verifyUserRegisterSuccessfully();
    }

    //Refer a product to friend feature
    @Given("Valid registered user is on homepage on nopcommerce website")
    public void validRegisteredUserIsOnHomepageOnNopcommerceWebsite() {
        homePg.clickOnTheRegister();
        registrationPg.userEntersRegistrationDetails();
        registrationPg.clickOnRegisterButton();
    }
    //News Comment feature
    @Given("user is on homepage on nopcommerce website")
    public void user_is_on_homepage_on_nopcommerce_website() {
    }
    @When("user clicks on details under new store open under news option")
    public void user_clicks_on_details_under_new_store_open_under_news_option() {
       homePg.clickOnTheNewsComment();
    }
    @And("user enters required details")
    public void userEntersRequiredDetails() {
        newsCommentPage.userShouldBeAbleToAddCommentSuccessfully();
    }
    @Then("user should be able to submit comment successfully")
    public void user_should_be_able_to_submit_comment_successfully() {
        newsCommentResult.userShouldBeAbleToAddNewsComment();
    }

    //Navigate to desktop page
    @When("user clicks on computers category")
    public void user_clicks_on_computers_category() {
       homePg.clickOnElementComputers();
    }
    @When("user clicks on desktop category")
    public void user_clicks_on_desktop_category() {
        computersPage.clickOnTheDesktopButton();
    }
    @Then("user should be navigate to desktop page successfully")
    public void user_should_be_navigate_to_desktop_page_successfully() {
        desktopResult.verifyUserNavigatesToDeskTopPage();
    }

    //Refer a product to friend
    @When("user clicks on Build your own computer category")
    public void user_clicks_on_build_your_own_computer_category() {
        desktopResult.clickOnBuildYourOwnComputer();
    }
    @When("user clicks on email a friend button")
    public void user_clicks_on_email_a_friend_button() {
        desktopResult.clickOnSendEmail();

    }
    @When("user enters required details on email a friend")
    public void user_enters_required_details_on_email_a_friend() {
        emailAFriendPage.detailsToAddForReferProduct();

    }
    @When("user clicks on send email button")
    public void user_clicks_on_send_email_button() {
        emailAFriendPage.clickOnEmailButton();

    }
    @Then("user should be able to refer a product to a friend successfully")
    public void user_should_be_able_to_refer_a_product_to_a_friend_successfully() {
      referProductToFriendResultPage.userShouldBeAbleToSendEmailToFriendSuccessfully();
    }

}
