package com.EU6GR4_AY.pages;

import com.EU6GR4_AY.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

      PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name = "USER_LOGIN" )
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "/html/head/title[contains(text(),'Portal')]")
    public WebElement actualTitle;

    public void login(String userName,String passWord){
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();


    }
}

