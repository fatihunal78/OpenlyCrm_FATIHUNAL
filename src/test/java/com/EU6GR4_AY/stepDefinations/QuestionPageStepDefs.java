package com.EU6GR4_AY.stepDefinations;

import com.EU6GR4_AY.pages.BasePage;
import com.EU6GR4_AY.pages.QuestionPage;
import com.EU6GR4_AY.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionPageStepDefs extends BasePage {

        QuestionPage questionPage=new QuestionPage();

    @When("the user writes a question in the Question box")
    public void theUserWritesAQuestionInTheQuestionBox() {

        questionPage.QuesBox1.sendKeys("Which computer operating systems do you use? ");

    }
    @And("the user writes an answer in the Answer one box")
    public void theUserWritesAnAnswerInTheAnswerOneBox() {

        questionPage.Answr1.sendKeys("Windows");
    }


    @And("the user writes another answer in the Answer two box")
    public void theUserWritesAnotherAnswerInTheAnswerTwoBox() {

        questionPage.Answr2.sendKeys("Linux");
    }

    @And("the user writes another answer in the Answer three box")
    public void theUserWritesAnotherAnswerInTheAnswerThreeBox() {

        questionPage.Answr3.sendKeys("Dos");
    }


    @And("the user clicks the add question button")
    public void theUserClicksTheAddQuestionButton() {

        questionPage.addQuestBtn.click();
    }

    @And("the user writes a question in the second Question box")
    public void theUserWritesAQuestionInTheSecondQuestionBox() {

        questionPage.QuesBox2.sendKeys(" Which computer do you use?");


    }

    @And("the user writes an answer in the new Answer one box")
    public void theUserWritesAnAnswerInTheNewAnswerOneBox() {

        questionPage.NewAnswr1.sendKeys("Laptop/Notebook");


    }

    @And("the user writes another answer in the new Answer two box")
    public void theUserWritesAnotherAnswerInTheNewAnswerTwoBox() {

    questionPage.NewAnswr2.sendKeys("Desktop");
    
    
    }

    @And("the user writes another answer in the new Answer three box")
    public void theUserWritesAnotherAnswerInTheNewAnswerThreeBox() {

        questionPage.NewAnswr3.sendKeys("Gamingbook");
    }

    @And("the user writes a message in the message box")
    public void theUserWritesAMessageInTheMessageBox() {

        Driver.get().switchTo().frame(questionPage.MsgBoxiframe);
        questionPage.MsgBox.sendKeys("Misson Complited");

    }

    @And("the user clicks Allow multiple choice one")
    public void theUserClicksAllowMultipleChoiceOne() {
        
        questionPage.AllwBtn1.click();
    }

    @And("the user clicks Allow multiple choice two")
    public void theUserClicksAllowMultipleChoiceTwo() {
        questionPage.AllwBtn2.click();
    }

    @Then("the user see the questions and answers on the home page")
    public void theUserSeeTheQuestionsAndAnswersOnTheHomePage() {

        System.out.println("questionPage.QuesAndAnsw.getText() = " + questionPage.QuesAndAnsw.getText());
  

        }



}

