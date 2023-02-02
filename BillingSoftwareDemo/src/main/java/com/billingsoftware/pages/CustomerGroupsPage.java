package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.WaitUtility;

public class CustomerGroupsPage extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"tour_step4\"]/ul/li[3]/a")
	 public WebElement customergroup;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
	 public WebElement customergroupadd;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	 public WebElement groupname;
	
	@FindBy(xpath = "//*[@id=\"amount\"]")
	 public WebElement grouppercentage;
	
	@FindBy(xpath = "//*[@id=\"customer_group_add_form\"]/div[3]/button[1]")
	 public WebElement custmrgrpsave;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/h3")
	 public WebElement custmrgrpghdng;
	
	@FindBy(xpath = "//*[@id=\"customer_groups_table_filter\"]/label/input")
	 public WebElement custmrgrpsearch;
	
	@FindBy(xpath = "//*[@id=\"customer_groups_table\"]/tbody/tr/td[1]")
	 public WebElement custmrgrpnamecheck;
	
	@FindBy(xpath = "//*[@id=\"customer_groups_table\"]/tbody/tr/td[3]/button[1]")
	 public WebElement custmrgrpedit;
	
	@FindBy(xpath = "//*[@id=\"customer_group_edit_form\"]/div[3]/button[1]")
	 public WebElement custmrgrpupdate;
	
	@FindBy(xpath = "//*[@id=\"customer_groups_table\"]/tbody/tr/td[3]/button[2]")
	 public WebElement custmrgrpdelete;
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[2]/button")
	 public WebElement custmrgrpcnfrmdelete;
	
	
	public void clickCustmrGrpCnfrmUpdate(){
		WaitUtility.waitForElementTobeClickable(driver, cgp.custmrgrpcnfrmdelete, 3000);

		custmrgrpcnfrmdelete.click();
	}
	
	public void clickCustmrGrpDelete(){
		WaitUtility.waitForElementTobeClickable(driver, cgp.custmrgrpdelete, 3000);

		custmrgrpdelete.click();
	}
	
	public void clearGroupame(){
		WaitUtility.waitForElementTobeClickable(driver, cgp.groupname, 3000);

		groupname.clear();
	}
	
	
	public void clickCustmrGrpUpdate(){
		custmrgrpupdate.click();
	}
	
	public void clickCustmrgrpEditname(){
		WaitUtility.waitForElementTobeClickable(driver, cgp.custmrgrpedit, 3000);

		custmrgrpedit.click();
	}
	
	
	public String getCustmrGrpNameChecktxt() {
		return custmrgrpnamecheck.getText();
	}
	
	public void setCustmrGrpSearch(String strtCustmrGrpSearch) {
		WaitUtility.waitForElementTobeClickable(driver, cgp.custmrgrpsearch, 3000);

		custmrgrpsearch.sendKeys(strtCustmrGrpSearch);
	}
	
	public void clickCustmrGrpSave(){
		custmrgrpsave.click();
	}
	
	public String getCustmrGrpgHdngtxt() {
		return custmrgrpghdng.getText();
	}
	public void setGroupPercentage(String strtGroupPercentage) {
		grouppercentage.sendKeys(strtGroupPercentage);
	}
	
	
	public void setGroupName(String strGroupName) {
		WaitUtility.waitForElementTobeClickable(driver, cgp.groupname, 3000);

		groupname.sendKeys(strGroupName);
	}
	
	
	public void clickCustomergroupAddButton(){
		customergroupadd.click();
	}
	public void clickCustomergroupPage(){
		WaitUtility.waitForElementTobeClickable(driver, cgp.customergroup, 3000);

		customergroup.click();
	}
	
	
	public CustomerGroupsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);	
				
	}
}
