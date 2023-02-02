package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.WaitUtility;

public class SalesComissionPage extends TestBase {
	WebDriver driver;

@FindBy(xpath= "/html/body/div[2]/aside/section/ul/li[2]/ul/li[3]/a/span")
public WebElement salesbutton;

@FindBy(xpath= "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
public WebElement salesaddbutton;

@FindBy(xpath= "//*[@id=\"surname\"]")
public WebElement salesprefix;

@FindBy(xpath= "//*[@id=\"first_name\"]")
public WebElement salesfirstname;

@FindBy(xpath= "//*[@id=\"email\"]")
public WebElement salesemail;

@FindBy(xpath= "//*[@id=\"cmmsn_percent\"]")
public WebElement salescomission;

@FindBy(xpath= "//*[@id=\"sale_commission_agent_form\"]/div[3]/button[1]")
public WebElement salesave;

@FindBy(xpath= "/html/body/div[2]/div[1]/section[1]/h1")
public WebElement saleshdng;

@FindBy(xpath= "//*[@id=\"sales_commission_agent_table_filter\"]/label/input")
public WebElement salessearch;

@FindBy(xpath= "//*[@id=\"sales_commission_agent_table\"]/tbody/tr/td[6]/button[1]")
public WebElement saleseditbutton;

@FindBy(xpath= "//*[@id=\"sales_commission_agent_table\"]/tbody/tr/td[6]/button[2]")
public WebElement saledeletebutton;

@FindBy(xpath= "/html/body/div[4]/div/div[3]/div[2]/button")
public WebElement cnfrmsaledeletn;


public void  clickCnfrmSaleDeletn() {
	cnfrmsaledeletn.click();

}
public void  clickSaleDeleteButton() {
    WaitUtility.waitForElementTobeClickable(driver, sales.saledeletebutton, 3000);

	saledeletebutton.click();

}

public void  clearSalesPrefix() {
	WaitUtility.waitForElementTobeClickable(driver, sales.salesprefix, 3000);

	salesprefix.clear();
}

public void  clickSaleEditButton() {
	WaitUtility.waitForElementTobeClickable(driver, sales.saleseditbutton, 3000);

	saleseditbutton.click();
}

public void setSalesSearch(String strSSalesSearch) {
	WaitUtility.waitForElementTobeClickable(driver, sales.salessearch, 3000);

	salessearch.sendKeys(strSSalesSearch);
}

public void setSalesComission(String strSalesSearch) {
	salescomission.sendKeys(strSalesSearch);
}
public void setSalesEmail(String strSalesEmail) {
	salesemail.sendKeys(strSalesEmail);
}

public void setSalesFirstName(String strSSalesFirstName) {
	WaitUtility.waitForElementTobeClickable(driver, sales.salesfirstname, 3000);

	salesfirstname.sendKeys(strSSalesFirstName);
}

public void setSalesPrefix(String strSalesPrefix) {
	WaitUtility.waitForElementTobeClickable(driver, sales.salesprefix, 3000);

	salesprefix.sendKeys(strSalesPrefix);
}

public String getSalesHdng() {
	return saleshdng.getText();
}


public void  clickSalesSave() {
	salesave.click();
}

public void  clickSalesAddButton() {
	salesaddbutton.click();
}
public SalesComissionPage(WebDriver driver) {
	this.driver = driver;
	// This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
}
public void clickSalesButton(){
	WaitUtility.waitForElementTobeClickable(driver, sales.salesbutton, 3000);

	salesbutton.click();
}

}
