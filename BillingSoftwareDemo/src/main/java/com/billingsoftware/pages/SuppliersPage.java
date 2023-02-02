package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.GenericUtility;
import com.billingsoftware.utilities.WaitUtility;

public class SuppliersPage extends TestBase {
	
	WebDriver driver;
	
	@FindBy(xpath= "//*[@id=\"tour_step4\"]/ul/li[1]/a")
	public WebElement supplierbutton;
	
	@FindBy(xpath= "//*[@id=\"tour_step4_menu\"]")
	public WebElement contacts;
	
	@FindBy(xpath= "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/h3")
	public WebElement supplierpage;
	
	@FindBy(xpath= "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
	public WebElement addsupplier;
	
	@FindBy(xpath= "//*[@id=\"name\"]")
	public WebElement suppliername;
	
	@FindBy(xpath= "//*[@id=\"supplier_business_name\"]")
 public WebElement supplierbusiness;
	
	@FindBy(xpath= "//*[@id=\"mobile\"]")
	 public WebElement suppliermobilenum;
	
	@FindBy(xpath= "//*[@id=\"contact_add_form\"]/div[3]/button[1]")
	 public WebElement suppliersavebuttn;
		
	@FindBy(xpath= "//body/div[2]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/label[1]/input[1]")
	 public WebElement suppliersearch;
	
	@FindBy(xpath = "//*[@id=\"contact_table\"]/tbody/tr/td[3]")
	 public WebElement suppliernamecheck;
	
	@FindBy(xpath = "//*[@id=\"contact_table\"]/tbody/tr[1]/td[7]/div/button")
	 public WebElement supplieraction;
	
	@FindBy(css="body.skin-red.sidebar-mini.pace-done:nth-child(2) div.wrapper:nth-child(2) div.content-wrapper:nth-child(4) section.content:nth-child(9) div.box.box-primary:nth-child(2) div.box-body div.table-responsive div.dataTables_wrapper.form-inline.dt-bootstrap table.table.table-bordered.table-striped.dataTable tr.odd:nth-child(1) td:nth-child(7) div.btn-group.open ul.dropdown-menu.dropdown-menu-right li:nth-child(3) > a.edit_contact_button")
	 public WebElement supplieredit;
	
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/ul[1]/li[4]/a[1]")
	 public WebElement supplierdelete;
	
	
	@FindBy(xpath = "//*[@id=\"contact_table\"]/tbody/tr[1]/td[7]/div/ul/li[3]/a")
	 public WebElement supplierupdate;
	
	public void clickSupplierDeleteButtn(){
		supplierdelete.click();
	}
	
	public void clickSupplierEditButtn(){
		WaitUtility.waitForElementTobeClickable(driver, sup.supplieredit, 3000);

		supplieredit.click();
	}
	
	public void clickSupplierUpdateButtn(){
		supplierupdate.click();
	}
	
	public void clickSupplierActionButtn(){
		WaitUtility.waitForElementTobeClickable(driver, sup.supplieraction, 3000);

		supplieraction.click();
	}
	
	public String getsupplierNameChecktxt() {
		WaitUtility.waitForElementTobeClickable(driver, sup.suppliernamecheck, 3000);

		return suppliernamecheck.getText();
	}
	
	public void setSupplierSearch(String strSupplierSearch) {
		WaitUtility.waitForElementTobeClickable(driver, sup.suppliersearch, 3000);

		suppliersearch.sendKeys(strSupplierSearch);
	}	
	public void clickAddSupplierButtn(){
		addsupplier.click();
	}
	
	public void clickSupplierSaveButtn(){
		suppliersavebuttn.click();
	}
	
	public void setSupplierMobilenum(String strSupplierMobilenum) {
		suppliermobilenum.sendKeys(strSupplierMobilenum);
	}
	
	public void setSupplierBusiness(String strSupplierBusiness) {
		supplierbusiness.sendKeys(strSupplierBusiness);
	}
	
	public void setSupplierName(String strSupplierName) {
		
		WaitUtility.waitForElementTobeClickable(driver, sup.suppliername, 3000);

		suppliername.sendKeys(strSupplierName);
	}
	
	public void clickAddSupplierButton(){
		addsupplier.click();
	}
	
	public SuppliersPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);	
				
	}
	
	public String getSupplierPagetxt() {
		return supplierpage.getText();
	}
	public void clickContactsButton(){
		WaitUtility.waitForElementTobeClickable(driver, sup.contacts, 3000);
		contacts.click();
	}
	
	public void clickSupplierButton(){
		WaitUtility.waitForElementTobeClickable(driver, sup.supplierbutton, 3000);

		supplierbutton.click();
	}

}
