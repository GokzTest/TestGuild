package com.billingsoftware.scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.BrandsPage;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.pages.VariationsPage;
import com.obscura.listeners.ExtentReportListeners;

@Listeners(ExtentReportListeners.class)
public class VerifyVariationsPage extends TestBase {
	
	@Test(priority=29)
	public void verifyWhetherVariationPageDisplayed() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		bsp = new BrandsPage(driver);
		bsp.clickProductsPage();
		vp = new VariationsPage(driver);
		vp.clickVariationsButton();
		String expectedVariationHdngChecktxt = AutomationConstants.VariationHdngCheck;
		String actualVariationHdngChecktxt  = vp.getariationHdngChecktxt();
		AssertJUnit.assertEquals(actualVariationHdngChecktxt, expectedVariationHdngChecktxt);

}
	
	
	@Test(priority=30)
	public void  verifyaAbleToAddTheVariationName() {	
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		bsp = new BrandsPage(driver);
		bsp.clickProductsPage();
		vp = new VariationsPage(driver);
		vp.clickVariationsButton();
		vp.clickVariationAddButton();
		vp.setVariationName("War");
		vp.setVariationValue("abg");
		vp.clickVariationValuePlus();
		vp.setVariationValueTwo("def");
		vp.clickVariationSaveButton();
		vp.setVariationSearch("War");
		String expectedVariationHdngChecktxt = AutomationConstants.VariationHdngCheck;
		String actualVariationHdngChecktxt  = vp.getariationHdngChecktxt();
		AssertJUnit.assertEquals(actualVariationHdngChecktxt, expectedVariationHdngChecktxt);

		
	
	}
	@Test(priority=19)
	public void  verifyaAbleToEditTheVariationName() {
	login = new LoginPage(driver);
	login.login();
	user = new UsersPage(driver);
	user.ClickEndtour();
	bsp = new BrandsPage(driver);
	bsp.clickProductsPage();
	vp = new VariationsPage(driver);
	vp.clickVariationsButton();
	vp.clickVariationAddButton();
	vp.setVariationName("War");
	vp.setVariationValue("abg");
	vp.clickVariationValuePlus();
	vp.setVariationValueTwo("def");
	vp.clickVariationSaveButton();
	vp.setVariationSearch("War");
	vp.clickVariationEditButton();
	vp.clearVariationNameButton();
	vp.setVariationName("More");
	vp.clickVariationUpdateButton();
	vp.setVariationSearch("More");
	String expectedVariationHdngChecktxt = AutomationConstants.VariationHdngCheck;
	String actualVariationHdngChecktxt  = vp.getariationHdngChecktxt();
	AssertJUnit.assertEquals(actualVariationHdngChecktxt, expectedVariationHdngChecktxt);

	}
	
	@Test(priority=20)
	public void  verifyaAbleToDeleteTheVariationName() {
	login = new LoginPage(driver);
	login.login();
	user = new UsersPage(driver);
	user.ClickEndtour();
	bsp = new BrandsPage(driver);
	bsp.clickProductsPage();
	vp = new VariationsPage(driver);
	vp.clickVariationsButton();
	vp.clickVariationAddButton();
	vp.setVariationName("Big");
	vp.setVariationValue("abg");
	vp.clickVariationValuePlus();
	vp.setVariationValueTwo("def");
	vp.clickVariationSaveButton();
	vp.setVariationSearch("Big");
	vp.clickVariationsDeleteButton();
	vp.clickVariationsCnfrmDeleteButton();
	vp.setVariationSearch("Big");
	String expectedVariationHdngChecktxt = AutomationConstants.VariationHdngCheck;
	String actualVariationHdngChecktxt  = vp.getariationHdngChecktxt();
	AssertJUnit.assertEquals(actualVariationHdngChecktxt, expectedVariationHdngChecktxt);
	}

	
	
}
