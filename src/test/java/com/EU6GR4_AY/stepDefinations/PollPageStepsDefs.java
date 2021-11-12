package com.EU6GR4_AY.stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.LoginPage;
import com.EU6GR4_AY.pages.PollPage;
import com.EU6GR4_AY.utilities.BrowserUtils;
import com.EU6GR4_AY.utilities.ConfigurationReader;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class PollPageStepsDefs extends BasePage {
    PollPage pollPage= new PollPage();

     @When("the user should click the poll button")
    public void theUserShouldClickThePollButton() {
       BrowserUtils.waitFor(2);
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
       BrowserUtils.waitFor(2);
        pollPage.secondUser.click();
    }

    @And("the user clicks the third user")
    public void theUserClicksTheThirdUser() {
        BrowserUtils.waitFor(2);
         pollPage.thirdUser.click();
    }

    @Then("clicked users are seen in the receiver box filed")
    public void clickedUsersAreSeenInTheReceiverBoxFiled() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("pollPage.receiverBox.getText() = " + pollPage.receiverBox.getText());

    }


    @Then("the user clicks the link icon")
    public void theUserClicksTheLinkIcon() {
         pollPage.linkBtn.click();

    }
    @And("the user writes the link url in the Link box")
    public void theUserWritesTheLinkUrlInTheLinkBox() {
        pollPage.linkBox.sendKeys("cybertekschool.com");
    }

    @And("the user writes the link text in the Text box")
    public void theUserWritesTheLinkTextInTheTextBox() {
        BrowserUtils.waitFor(2);
         pollPage.textBox.sendKeys("Hello World");
    }


    @And("the user clicks the Save button")
    public void theUserClicksTheSaveButton() {
         pollPage.saveBtn.click();
    }

    @Then("link text is seen in the message field")
    public void linkTextIsSeenInTheMessageField() {
        BrowserUtils.waitFor(2);
        System.out.println("pollPage.msgBox.getText() = " + pollPage.msgBox.getText());

    }

    @When("the user clicks Add mention icon")
    public void theUserClicksAddMentionIcon() {
         pollPage.AddMenIcon.click();

    }

    @And("the user selects the first user")
    public void theUserSelectsTheFirstUser() {
        pollPage.FirstUser.click();
    }

    @And("the user selects the second user")
    public void theUserSelectsTheSecondUser() {
        BrowserUtils.waitFor(2);
       pollPage.secondUser.click();
    }

    @And("the user selects the third user")
    public void theUserSelectsTheThirdUser() {
         pollPage.ThirdUser.click();
    }

    @Then("selected users are seen in the receiver box filed")
    public void selectedUsersAreSeenInTheReceiverBoxFiled() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("pollPage.receiverBox.getText() = " + pollPage.receiverBox.getText());

    }
}
