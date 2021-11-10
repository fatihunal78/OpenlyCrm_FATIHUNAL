package com.EU6GR4_AY.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage {


    @FindBy(css = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(id = "bx-destination-tag")
    public WebElement AddMoreBtn;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement EmpDepBtn;

    @FindBy(xpath = "//div[text()=\"new department's name\"]")
    public   WebElement NewDepBtn;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[6]/a/span/div[2]")
    public WebElement AllDepAndSubDepEmplBtn;

    @FindBy(xpath = "//div[.='hr76@cybertekschool.com']")
    public WebElement hr76;

    @FindBy(id = "feed-add-post-destination-item")
    public WebElement receiverBox;

}
