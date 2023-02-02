package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.scripts.TestBase;

public class LoginPage extends TestBase {
	WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	public WebElement login;
	@FindBy(linkText = "Forgot Your Password?")
	public WebElement forgtpswrd;
	@FindBy(xpath = "/html/body/div[2]/header/nav/div/ul/li[2]/a")
	public WebElement profile;
	@FindBy(xpath = "//p[contains(text(),'Aju Mathew')]")
	public WebElement name;
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/form/div[1]/label")
	public WebElement emailtext;
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[1]")
	public WebElement logintext;
	@FindBy(xpath="/html/body/div[2]/div[1]/section[1]/h1")
	public WebElement homepagehdng;

	public String getHomepagehdng() {
		return  homepagehdng.getText();
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public void Login(String usename, String passwrd) {
		username.sendKeys(usename);
		password.sendKeys(passwrd);
		login.click();

	}

	public String getlogintext() {
		return logintext.getText();
	}

	public String getemailtext() {
		return emailtext.getText();
	}

	public void namecheck() {
		profile.click();
		name.click();
	}

	public boolean Namecheck() {
		profile.click();
		String result = name.getText();
		boolean status = false;
		if (result.equalsIgnoreCase("Aju Mathew")) {
			status = true;
		}
		return status;

	}

	public void setUserName(String strUserName) {
		username.sendKeys(strUserName);
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}

	public void clickForgtpswrd() {
		forgtpswrd.click();
	}
	

	// Click on login button
	public void clickLogin() {
		login.click();
	}
	public void login() {

		username.sendKeys(AutomationConstants.Username);
		password.sendKeys(AutomationConstants.Password);
		login.click();
	}

	public void teardown() {
		driver.close();
	}

}
