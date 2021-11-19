package com.EU6GR4_FATIH.pages;

import com.EU6GR4_FATIH.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage()
    {
      PageFactory.initElements(Driver.get(),this);
    }

    public void clickMenuElement(String menuName)
    {
        String xpath = "//a[@title='" + menuName + "']";
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    @FindBy(xpath = "//input[@id='search-textbox-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[contains(@class,'header-search-icon')]")
    public WebElement searchBoxClick;

    @FindBy(xpath = "//a[@id='logo_24_a']")
    public WebElement mainPage;

    @FindBy(xpath = "//div[@class='user-block']")
    public WebElement userMenu;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and text()='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and text()='Edit Profile Settings']")
    public WebElement editProfile;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and text()='Themes']")
    public WebElement themes;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and text()='Configure notifications']")
    public WebElement configure;

    @FindBy(xpath = "//span[@class='menu-popup-item-text' and text()='Log out']")
    public WebElement logout;

}


