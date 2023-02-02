package com.billingsoftware.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.billingsoftware.scripts.TestBase;
import com.billingsoftware.utilities.WaitUtility;

public class VariationsPage extends TestBase {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"tour_step5\"]/ul/li[4]/a/span")
	public WebElement variationsbutton;

	@FindBy(xpath = "//body/div[2]/div[1]/section[2]/div[1]/div[1]/div[1]/button[1]")
	public WebElement variationaddbutton;

	@FindBy(xpath = "//*[@id=\"name\"]")
	public WebElement variationname;

	@FindBy(xpath = "//*[@id=\"variation_add_form\"]/div[2]/div[2]/div[1]/input")
	public WebElement variationvalue;

	@FindBy(xpath = "//*[@id=\"add_variation_values\"]")
	public WebElement variationvalueplus;

	@FindBy(xpath = "//*[@id=\"variation_values\"]/div/div[1]/input")
	public WebElement variationvaluetwo;

	@FindBy(xpath = "//*[@id=\"variation_add_form\"]/div[3]/button[1]")
	public WebElement variationsave;

	@FindBy(xpath = "//*[@id=\"variation_table_filter\"]/label/input")
	public WebElement variationsearch;

	@FindBy(xpath = "//h3[contains(text(),'All variations')]")
	public WebElement variationhdng;
	
	@FindBy(xpath = "//*[@id=\"variation_table\"]/tbody/tr[1]/td[3]/button[1]")
	public WebElement variationedit;
	
	@FindBy(xpath = "//*[@id=\"variation_edit_form\"]/div[3]/button[1]")
	public WebElement variationupdate;

	@FindBy(xpath = "//*[@id=\"variation_table\"]/tbody/tr[1]/td[3]/button[2]")
	public WebElement variationdelete;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[4]/div[2]/button")
	public WebElement variationcnfrmdelete;
	
	
	public void clickVariationsCnfrmDeleteButton() {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationcnfrmdelete, 3000);

		variationcnfrmdelete.click();
	}
	
	
	public void clickVariationsDeleteButton() {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationdelete, 3000);

		variationdelete.click();
	}
	
	
	public void clickVariationsButton() {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationsbutton, 3000);

		variationsbutton.click();
	}
	
	public void clearVariationNameButton() {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationname, 3000);

		variationname.clear();;
	}
	
	
	public void clickVariationUpdateButton() {
		variationupdate.click();
	}
	
	public void clickVariationEditButton() {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationedit, 3000);

		variationedit.click();
	}
	
	public void clickVariationSaveButton() {
		variationsave.click();
	}

	public void clickVariationAddButton() {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationaddbutton, 3000);

		variationaddbutton.click();
	}

	public void clickVariationValuePlus() {
		variationvalueplus.click();
	}

	public void setVariationName(String strVariationName) {
		WaitUtility.waitForElementTobeClickable(driver, vp.variationname, 3000);

		variationname.sendKeys(strVariationName);
	}

	public void setVariationValue(String strVariationValue) {

		variationvalue.sendKeys(strVariationValue);
	}

	public void setVariationValueTwo(String strVariationValueTwo) {

		variationvaluetwo.sendKeys(strVariationValueTwo);
	}

	public void setVariationSearch(String strVariationSearch) {
		
	driver.navigate().refresh();
	WaitUtility.waitForElementTobeClickable(driver, vp.variationsearch, 3000);
		variationsearch.sendKeys(strVariationSearch);
	}

	public String getariationHdngChecktxt() {

		return variationhdng.getText();
	}
	public VariationsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	

}
