package com.EU6GR4_AY.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage {


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

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[5]")
    public WebElement firstUSer;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[3]")
    public WebElement secondUser;

    @FindBy(xpath = "(//a[@class='bx-finder-company-department-employee  bx-finder-element'])[6]")
    public WebElement thirdUser;


    @FindBy(id = "feed-add-post-destination-item")
    public WebElement receiverBox;

}
