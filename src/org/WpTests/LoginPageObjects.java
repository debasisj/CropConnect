package org.WpTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	public WebDriver driver;
	
	//constructor 
public LoginPageObjects(){
	driver  = new FirefoxDriver();
	PageFactory.initElements(driver, this);
	
	}

	
@FindBy(id = "user_login")
public WebElement userID;

@FindBy(id = "user_pass")
public WebElement pdw;

@FindBy(id = "wp-submit")
public WebElement loginBtn;

}
