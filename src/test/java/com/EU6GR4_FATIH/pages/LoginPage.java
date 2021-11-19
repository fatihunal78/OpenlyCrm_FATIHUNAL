package com.EU6GR4_FATIH.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[@class='log-popup-header']")
    public WebElement authorization;

    public void login(String userName,String passWord){
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();



    }

}