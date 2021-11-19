package com.EU6GR4_FATIH.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage{


    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(id = "bx-destination-tag")
    public WebElement AddMoreBtn;

    @FindBy(xpath = "//a[@href='#switchTab'][2]")
    public WebElement EmpDepBtn;

    @FindBy(xpath = "//div[text()=\"new department's name\"]")
    public   WebElement NewDepBtn;

    @FindBy(xpath ="//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[6]/a/span/div[2]" )
    public WebElement AllDepAndSubEmpBtn;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[11]")
    public WebElement firstUSer;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[8]")
    public WebElement secondUser;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[4]")
    public WebElement thirdUser;

    @FindBy(id = "feed-add-post-destination-item")
    public WebElement receiverBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkBtn;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkBox;

    @FindBy(id = "undefined")
    public WebElement saveBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement msgBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement AddMenIcon;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][3]")
    public WebElement FirstUser;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][11]")
    public WebElement SecondUser;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][23]")
    public WebElement ThirdUser;

    @FindBy(id = "blog-submit-button-save")
    public WebElement SendBtn;

   @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner'][1]")
    public WebElement AttachedText;
}

