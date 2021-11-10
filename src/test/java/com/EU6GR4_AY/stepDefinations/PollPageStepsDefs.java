package com.EU6GR4_AY.stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.LoginPage;
import com.EU6GR4_AY.pages.PollPage;
import com.EU6GR4_AY.utilities.ConfigurationReader;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PollPageStepsDefs extends BasePage {
    PollPage pollPage= new PollPage();

 //   @Given("the user should be on the home page")
  //  public void theUserShouldBeOnTheHomePage() {
  //      String url = ConfigurationReader.get("url");
  //      Driver.get().get(url);

//    }

    @When("the user should click the poll button")
    public void theUserShouldClickThePollButton() {
        pollPage.pollBtn.click();
    }

    @Then("the user clicks the Add More button")
    public void theUserClicksTheAddMoreButton() {
    pollPage.AddMoreBtn.click();

    }
    @And("the user clicks the Employees and departments")
    public void theUserClicksTheEmployeesAndDepartments() {
        pollPage.EmpDepBtn.click();
    }

    @And("the user clicks the new department's name")
    public void theUserClicksTheNewDepartmentSName() {
        pollPage.NewDepBtn.click();
    }

    @And("the user clicks the all department employees")
    public void theUserClicksTheAllDepartmentEmployees() {
        pollPage.AllDepAndSubDepEmplBtn.click();

    }


    @And("the user clicks the hr{int}@cybertekschool.com")
    public void theUserClicksTheHrCybertekschoolCom(int arg0) {
        pollPage.hr76.click();

    }

    @Then("clicked users are seen in the receiver box filed")
    public void clickedUsersAreSeenInTheReceiverBoxFiled() {
        pollPage.receiverBox.getText();

    }


}
