package com.EU6GR4_FATIH.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageLink;

    @FindBy(xpath ="//body[@contenteditable='true']")
    public WebElement messageForm;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement msgBoxFrame;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileOrPhoto;

    @FindBy(xpath = "//span[@id='bx-b-link-blogPostForm']")
    public WebElement addLink;

    @FindBy(xpath = "//span[@id='bx-b-video-blogPostForm']")
    public WebElement addVideo;

    @FindBy(xpath = "//div[@id='bx-b-quote-blogPostForm']")
    public WebElement addQuote;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement saveButton;

}

