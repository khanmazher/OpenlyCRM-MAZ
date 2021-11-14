package com.OpenlyMAZ.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "/html/head/title[contains(text(),'Portal')]")
    public WebElement actualTitle;

    public void login(String userName, String passWord) {
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();

    }

}
