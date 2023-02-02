package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.WaitUtility;

public class UsersPage extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")
	public WebElement users;

	@FindBy(xpath = "//*[@id=\"step-0\"]/div[3]/button[3]")
	public WebElement endtour;

	@FindBy(xpath = "/html/body/div[2]/aside/section/ul/li[2]/a")
	public WebElement usermngmnt;

	@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/h3")
	public WebElement userheading;

	@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/a/i")
	public WebElement addbutton;

	@FindBy(xpath = "//input[@id='surname']")
	public WebElement prefix;

	@FindBy(xpath = "//input[@id='first_name']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;

	@FindBy(xpath = "//span[@id='select2-role-container']")
	public WebElement role;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='confirm_password']")
	public WebElement cnfrmpassword;

	@FindBy(xpath = "//button[@id='submit_user_button']")
	public WebElement submitbtn;
	
	@FindBy(xpath = "//*[@id=\"users_table\"]/tbody/tr/td[4]")
	public WebElement emailtxt;
	
	@FindBy(xpath = "//body/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/label[1]/input[1]")
	public WebElement search;
	
	@FindBy(xpath = "//*[@id=\"users_table\"]/tbody/tr/td[5]/a[1]/i")
	public WebElement editbutton;
	
	@FindBy(xpath="//*[@id=\"submit_user_button\"]")
	public WebElement updatebutton;
	
	@FindBy(xpath="//*[@id=\"users_table\"]/tbody/tr/td[5]/button")
	public WebElement deletebutton;
	
	@FindBy(xpath="/html/body/div[4]/div/div[4]/div[2]/button")
	public WebElement deleteokbutton;
	
	@FindBy(xpath="//*[@id=\"users_table\"]/tbody/tr/td")
	public WebElement userdelcheck;
	
	public String getserdelchecktxt() {
		return userdelcheck.getText();
	}
	
	public void ClickDeleteokButton() {
		WaitUtility.waitForElementTobeClickable(driver,user.deleteokbutton,3000);
		deleteokbutton.click();
	}
	
	public void ClickDeleteButton() {
		deletebutton.click();
	}
	
	

	public void ClickUpdateButton() {
		updatebutton.click();
	}
	public void ClickEditButton() {
		WaitUtility.waitForElementTobeClickable( driver,user.editbutton,300);
		editbutton.click();
	}
	public String getEmailSearchtxt() {
		WaitUtility.waitForElementTobeClickable( driver,user.emailtxt,300);

		return emailtxt.getText();
	}
	public void setSearch(String strSearch) {
		search.sendKeys(strSearch);
	}
	public void ClickSearch() {
		WaitUtility.waitForElementTobeClickable( driver,user.search,3000);
		search.click();
		
	}
	
	public void ClearPrefix() {
		prefix.clear();
	}
	public void ClickAddButton() {
		addbutton.click();
	}

	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}

	public void setCnfrmPassword(String CnfrmPassword) {
		cnfrmpassword.sendKeys(CnfrmPassword);
	}

	public void ClickSubmitbtn() {
		submitbtn.click();
	}

	public void ClickRole() {
		role.click();
	}

	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}

	public void setFirstname(String strFirstname) {
		firstname.sendKeys(strFirstname);
	}

	public void setPrefix(String strPrefix) {
		prefix.sendKeys(strPrefix);
	}

	public String getUserHeading() {
		return userheading.getText();
	}

	public void ClickEndtour() {
		endtour.click();
	}

	public UsersPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public void clickusermngmnt() {
		usermngmnt.click();
	}

	public void ClickUsers() {
		users.click();
	}
	
	

	public void touserspage() {
		endtour.click();
		usermngmnt.click();
		users.click();

	}
}
