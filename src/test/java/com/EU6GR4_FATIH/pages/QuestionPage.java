package com.EU6GR4_FATIH.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionPage extends BasePage{

    @FindBy(id = "question_0")
    public WebElement QuesBox1;

    @FindBy(id="answer_0__0_")
    public WebElement Answr1;

    @FindBy(id = "answer_0__1_")
    public WebElement Answr2;

    @FindBy(id = "answer_0__2_")
    public WebElement Answr3;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestBtn;

    @FindBy(id = "question_1")
    public WebElement QuesBox2;

    @FindBy(id = "answer_1__0_")
    public WebElement NewAnswr1;

    @FindBy(id = "answer_1__1_")
    public WebElement NewAnswr2;

    @FindBy(id = "answer_1__2_")
    public WebElement NewAnswr3;

    @FindBy(xpath ="//body[@contenteditable='true'] ")
    public WebElement MsgBox;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement MsgBoxiframe;

    @FindBy(id = "multi_0 ")
    public WebElement AllwBtn1;

    @FindBy(id = "multi_1 ")
    public WebElement AllwBtn2;

    @FindBy(xpath = "(//ol[@class='bx-vote-question-list'])[1]")
    public WebElement QuesAndAnsw;



}
