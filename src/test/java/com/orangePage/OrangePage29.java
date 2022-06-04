package com.orangePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangePage29 {
	WebDriver driver;
	
	public OrangePage29(WebDriver driver) {
		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(how = How.ID, using = "txtUsername")
private WebElement username;

public WebElement getUsername() {
	return username;
}

public void setUsername(WebElement username) {
	this.username = username;
}


@FindBy(how = How.ID, using = "txtPassword")
private WebElement passward;

public WebElement getPassward() {
	return passward;
}

public void setPassward(WebElement passward) {
	this.passward = passward;
}


@FindBy(how = How.ID, using = "btnLogin")
private WebElement loginBtn;
public WebElement getLoginBtn() {
	return loginBtn;
}

public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}

@FindBy(how = How.ID, using = "welcome")
private WebElement wecomeText;
public WebElement getWecomeText() {
	return wecomeText;
}

public void setWecomeText(WebElement wecomeText) {
	this.wecomeText = wecomeText;
}
}
