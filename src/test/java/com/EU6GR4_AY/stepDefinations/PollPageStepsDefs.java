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

import java.util.concurrent.TimeUnit;

public class PollPageStepsDefs extends BasePage {
    PollPage pollPage= new PollPage();

     @When("the user should click the poll button")
    public void theUserShouldClickThePollButton() {
        pollPage.pollBtn.click();
    }

    @Then("the user clicks the Add More button")
    public void theUserClicksTheAddMoreButton() {
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         pollPage.AddMoreBtn.click();

    }
    @And("the user clicks the Employees and departments")
    public void theUserClicksTheEmployeesAndDepartments() throws InterruptedException {
        Thread.sleep(2000);
         pollPage.EmpDepBtn.click();
    }

    @And("the user clicks the new department's name")
    public void theUserClicksTheNewDepartmentSName() throws InterruptedException {
        Thread.sleep(2000);
        pollPage.NewDepBtn.click();
    }

    @And("the user clicks the All department and subdepartment employees")
    public void theUserClicksTheAllDepartmentAndSubdepartmentEmployees() {


    }

    @And("the user clicks the first user")
    public void theUserClicksTheFirstUser() {
        pollPage.firstUSer.click();

    }

    @And("the user clicks the second user")
    public void theUserClicksTheSecondUser() {
        pollPage.secondUser.click();
    }

    @And("the user clicks the third user")
    public void theUserClicksTheThirdUser() {
        pollPage.thirdUser.click();
    }

    @Then("clicked users are seen in the receiver box filed")
    public void clickedUsersAreSeenInTheReceiverBoxFiled() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("pollPage.receiverBox.getText() = " + pollPage.receiverBox.getText());

    }



}
