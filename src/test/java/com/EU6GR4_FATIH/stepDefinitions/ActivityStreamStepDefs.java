package com.EU6GR4_FATIH.stepDefinitions;

import com.EU6GR4_FATIH.pages.ActivityStreamPage;
import com.EU6GR4_FATIH.pages.BasePage;
import com.EU6GR4_FATIH.utilities.BrowserUtils;
import com.EU6GR4_FATIH.utilities.Driver;
import io.cucumber.java.en.Then;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ActivityStreamStepDefs extends BasePage
{
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Then("the user should click the {string} button")
    public void the_user_should_click_the_button(String string)
    {
        activityStreamPage.clickMenuElement("Activity Stream");
    }

    @Then("the user should click the Message button")
    public void the_user_should_click_the_Message_button()
    {
        activityStreamPage.messageLink.click();
    }

    @Then("the user enters {string} message")
    public void the_user_enters_message(String string)
    {
        Driver.get().switchTo().frame(activityStreamPage.msgBoxFrame);
        activityStreamPage.messageForm.sendKeys(string);
        Driver.get().switchTo().defaultContent();
    }

    @Then("the user sees {string} message on the page")
    public void the_user_sees_message_on_the_page(String string)
    {
        Assert.assertTrue("Message is NOT displayed",Driver.get().findElement(By.xpath("//*[text()='" + string + "']")).isDisplayed());
    }

}
