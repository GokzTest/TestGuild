package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.WaitUtility;

public class RolesPage extends TestBase {
	WebDriver driver;
	@FindBy(xpath= "/html/body/div[2]/div[1]/section[2]/div/div[1]/div/a")
	public WebElement rolesaddbutton;
	
	@FindBy(xpath= "/html/body/div[2]/aside/section/ul/li[2]/ul/li[2]/a/span")
	public WebElement rolesbutton;
	
	@FindBy(xpath= "//*[@id=\"name\"]")
	public WebElement rolename;
	
	@FindBy(xpath= "//*[@id=\"role_add_form\"]/div[3]/div[2]/div/label/div/ins")
	public WebElement roleselect;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/section[2]/div/div[1]/h3")
	public WebElement roletxt;
	
	@FindBy(xpath="//*[@id=\"role_add_form\"]/div[20]/div/button")
	public WebElement saverole;
	
	@FindBy(xpath="//*[@id=\"roles_table_filter\"]/label/input")
	public WebElement searchrole;

	@FindBy(xpath="//*[@id=\"roles_table\"]/tbody/tr/td[2]/button")
	public WebElement delbutton;
	
	@FindBy(xpath="/html/body/div[4]/div/div[4]/div[2]/button")
	public WebElement cnfrmdelbutton;
	
	@FindBy(xpath="//*[@id=\"roles_table\"]/tbody/tr/td")
	public WebElement roledelcheck;
	
	@FindBy(xpath="//*[@id=\"roles_table\"]/tbody/tr/td[2]/a")
	public WebElement editrole;
	
	@FindBy(xpath="//*[@id=\"role_form\"]/div[20]/div/button")
	public WebElement updaterole;
	
	@FindBy(xpath="//*[@id=\"roles_table\"]/tbody/tr/td[1]")
	public WebElement editrolecheck;

	public String getEditRoleheck() {
		WaitUtility.waitForElementTobeClickable(driver, role.editrolecheck, 3000);

		return editrolecheck.getText();
	}
	
	public void clickUpdateRole(){
		updaterole.click();
	}
	
	public void clickEditRole(){
		WaitUtility.waitForElementTobeClickable(driver, role.editrole, 3000);

		editrole.click();
	}

	public String getRoleDelChecktxt() {
		
		return roledelcheck.getText();
	}
	
	public void clickCnfrmdelbutton(){
		WaitUtility.waitForElementTobeClickable(driver, role.cnfrmdelbutton, 3000);

		cnfrmdelbutton.click();
	}
	
	public void ClickDelButton(){
		WaitUtility.waitForElementTobeClickable(driver, role.delbutton, 3000);

		delbutton.click();
	}
	
	
	public void setSearchRole(String strSearchRole) {
		WaitUtility.waitForElementTobeClickable(driver, role.searchrole, 3000);

		searchrole.sendKeys(strSearchRole);
	}
	
	public void ClickSaveRole() {
		saverole.click();
	}
	
	public String getRolehedngtxt() {
		WaitUtility.waitForElementTobeClickable(driver, role.roletxt, 3000);

		return roletxt.getText();
	}
	public RolesPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	public void clearRoleName() {
		rolename.clear();
	}
	
	public void setRoleName(String strRoleName) {
		rolename.sendKeys(strRoleName);
	}
	public void ClickRolesAddButtn() {
		rolesaddbutton.click();
	}
	
	public void ClickRolesButtn() {
		WaitUtility.waitForElementTobeClickable(driver, role.rolesbutton, 300);

		rolesbutton.click();
	}
	
	public void ClickRoleSelct() {
		roleselect.click();
	}
	
}
