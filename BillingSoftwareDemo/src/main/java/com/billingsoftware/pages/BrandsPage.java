package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.WaitUtility;

public class BrandsPage extends TestBase {
	WebDriver driver;


	@FindBy(xpath = "//*[@id=\"tour_step5_menu\"]")
	public WebElement productspage;

	@FindBy(xpath = "//*[@id=\"tour_step5\"]/ul/li[10]/a")
	public WebElement brandsbutton;

	@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/h3")
	public WebElement brandshdng;

	@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button/i")
	public WebElement brandsaddbutton;

	@FindBy(xpath = "//*[@id=\"name\"]")
	public WebElement brandsname;

	@FindBy(xpath = "//*[@id=\"description\"]")
	public WebElement brandsdescrptn;

	@FindBy(xpath = "//*[@id=\"brand_add_form\"]/div[3]/button[1]")
	public WebElement brandsavebutton;

	@FindBy(xpath = "//*[@id=\"brands_table_filter\"]/label/input")
	public WebElement brandsearch;

	@FindBy(xpath = "//*[@id=\"brands_table\"]/tbody/tr[1]/td[3]/button[1]")
	public WebElement brandsedit;

	@FindBy(xpath = "//*[@id=\"brand_edit_form\"]/div[3]/button[1]")
	public WebElement brandsupdate;

	@FindBy(xpath = "//*[@id=\"brands_table\"]/tbody/tr[1]/td[3]/button[2]/i")
	public WebElement brandsdelete;

	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[2]/button")
	public WebElement brandscnfrmdelete;

	
	public BrandsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void clickProductsPage() {
		productspage.click();
	}

	public void clickBrandsButton() {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsbutton, 300);

		brandsbutton.click();
	}

	public String getBrandsHdngChecktxt() {

		return brandshdng.getText();
	}

	public void clickBrandsAddButton() {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsaddbutton, 3000);

		brandsaddbutton.click();
	}

	public void setBrandName(String strBrandName) {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsname, 3000);

		brandsname.sendKeys(strBrandName);
	}

	public void clearBrandsDescrptn() {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsdescrptn, 3000);

		brandsdescrptn.clear();
	}
	
	
	public void setBrandDescrptn(String strBrandDescrptn) {
		
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsdescrptn, 3000);

		brandsdescrptn.sendKeys(strBrandDescrptn);
	}

	public void clickBrandSaveButton() {
		brandsavebutton.click();
	}

	public void setBrandSearch(String strBrandSearch) {
		driver.navigate().refresh();
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsearch, 3000);

		brandsearch.sendKeys(strBrandSearch);
	}

	public void clickBrandsEditButton() {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsedit, 3000);

		brandsedit.click();
	}

	public void clickBrandUpdate() {
		brandsupdate.click();
	}

	public void clickBrandsDelete() {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandsdelete, 3000);

		brandsdelete.click();
	}

	public void clickBrandsCnfrmDelete() {
		WaitUtility.waitForElementTobeClickable(driver, bsp.brandscnfrmdelete, 3000);

		brandscnfrmdelete.click();
	}

}
