package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;
import utils.DriverManager;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverManager.getDriver());

    @Given("that I am in the login page")
    public void that_i_am_in_the_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the shop.")
    public void i_should_see_the_shop() {
        loginPage.verifyHomepageRedirection();
    }
}
