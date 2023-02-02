package com.billingsoftware.scripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.BrandsPage;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.UsersPage;
import com.obscura.listeners.ExtentReportListeners;

@Listeners(ExtentReportListeners.class)
public class VerifyBrandsPage extends TestBase {

	@Test(priority=25)
	public void verifyWhetherBrandsPageDisplayed() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		bsp = new BrandsPage(driver);
		bsp.clickProductsPage();
		bsp.clickBrandsButton();
		String expectedBrandsHdngtxt = AutomationConstants.BrandsHdngCheck;
		String actualBrandsHdngtxt = bsp.getBrandsHdngChecktxt();
		Assert.assertEquals(actualBrandsHdngtxt, expectedBrandsHdngtxt);
	}

	@Test(priority=26)
	public void verifyaAbleToAddTheBrands() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		bsp = new BrandsPage(driver);
		bsp.clickProductsPage();
		bsp.clickBrandsButton();
		bsp.clickBrandsAddButton();
		bsp.setBrandName("Mizuno");
		bsp.setBrandDescrptn("Badminton Products");
		bsp.clickBrandSaveButton();
		bsp.setBrandSearch("Mizuno");
		String expectedBrandsHdngtxt = AutomationConstants.BrandsHdngCheck;
		String actualBrandsHdngtxt = bsp.getBrandsHdngChecktxt();
		Assert.assertEquals(actualBrandsHdngtxt, expectedBrandsHdngtxt);
	}

	@Test(priority=27)
	public void verifyaAbleToEditTheBrands() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		bsp = new BrandsPage(driver);
		bsp.clickProductsPage();
		bsp.clickBrandsButton();
		bsp.clickBrandsAddButton();
		bsp.setBrandName("Air Asia");
		bsp.setBrandDescrptn("Airline");
		bsp.clickBrandSaveButton();
		bsp.setBrandSearch("Air Asia");
	bsp.clickBrandsEditButton();
	bsp.clearBrandsDescrptn();
	bsp.setBrandDescrptn("Cargo");
	bsp.clickBrandUpdate();
	bsp.setBrandSearch("Air Asia");
	String expectedBrandsHdngtxt = AutomationConstants.BrandsHdngCheck;
	String actualBrandsHdngtxt = bsp.getBrandsHdngChecktxt();
	Assert.assertEquals(actualBrandsHdngtxt, expectedBrandsHdngtxt);
	}
@Test(priority=28)
	public void verifyAbleToDelteTheBrands() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		bsp = new BrandsPage(driver);
		bsp.clickProductsPage();
		bsp.clickBrandsButton();
		bsp.clickBrandsAddButton();
		bsp.setBrandName("Blaunkpaut");
		bsp.setBrandDescrptn("Speakers");
		bsp.clickBrandSaveButton();
		bsp.setBrandSearch("Blaunkpaut");
		bsp.clickBrandsDelete();
		bsp.clickBrandsCnfrmDelete();
		bsp.setBrandSearch("Blaunkpaut");
		String expectedBrandsHdngtxt = AutomationConstants.BrandsHdngCheck;
		String actualBrandsHdngtxt = bsp.getBrandsHdngChecktxt();
		Assert.assertEquals(actualBrandsHdngtxt, expectedBrandsHdngtxt);
	}


}
