package com.EU6GR4_AY.stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.LoginPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import com.EU6GR4_AY.utilities.ConfigurationReader;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefs extends BasePage {
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {

        loginPage.login(username, password);

    }
    @Then("the user should be on the home page")
   public void the_user_should_be_on_the_home_page() {
        String expectedTitle = "Portal";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }

    @When("the user enters by using {string} and {string}")
    public void theUserEntersByUsingAnd(String Username, String Password) {
        loginPage.login(Username, Password);
    }

    @Then("the should not be on home page")
    public void theShouldNotBeOnHomePage() {
        String expectedTitle = "Portal";
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        BrowserUtils.waitFor(2);
        Assert.assertFalse(Driver.get().getTitle().contains(expectedTitle));



    }
}



