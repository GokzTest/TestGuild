package com.billingsoftware.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.SuppliersPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.utilities.PageUtilities;
import com.billingsoftware.utilities.WaitUtility;
import com.obscura.listeners.ExtentReportListeners;
@Listeners(ExtentReportListeners.class)

public class VerifySuppliersPage extends TestBase {
	@Test(priority=17)
	public void supplierPage() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		sup.clickSupplierButton();
		String expectedsuplerhdngtxt = AutomationConstants.getsuplerhdng;
		String actualsuplerhdngtxt = sup.getSupplierPagetxt();
		Assert.assertEquals(actualsuplerhdngtxt, expectedsuplerhdngtxt);

	}

	 @Test(priority=18)
	public void addSupplier() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		sup.clickSupplierButton();
		sup.clickAddSupplierButtn();
		sup.setSupplierName("Rain");
		sup.setSupplierBusiness("Pharmaceuticals");
		sup.setSupplierMobilenum("45678923");
		sup.clickSupplierSaveButtn();
		driver.navigate().refresh();
		sup.setSupplierSearch("Rain");
		String actualsuplernametxt = sup.getsupplierNameChecktxt();
		String expectedsuplernametxt = AutomationConstants.supplierNameCheck;
		Assert.assertEquals(actualsuplernametxt, expectedsuplernametxt);

	}

	//@Test (priority=19)
	public void editSupplier() throws InterruptedException {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		sup.clickSupplierButton();
		sup.clickAddSupplierButtn();
		sup.setSupplierName("HHM");
		sup.setSupplierBusiness("Goods");
		sup.setSupplierMobilenum("466678923");
		sup.clickSupplierSaveButtn();
		driver.navigate().refresh();
		sup.setSupplierSearch("HHM");
		sup.clickSupplierActionButtn();	
		Thread.sleep(3000);
		sup.clickSupplierEditButtn();
		PageUtilities.doubleClick(driver,sup.supplieredit);
		sup.setSupplierName("Mahindra");
		sup.clickSupplierUpdateButtn();
		driver.navigate().refresh();
		sup.setSupplierSearch("Mahindra");
		String actualsuplernametxt = sup.getsupplierNameChecktxt();
		String expectedsuplernametxt = AutomationConstants.supplierNameCheck;
		Assert.assertEquals(actualsuplernametxt, expectedsuplernametxt);

	}
//@Test  (priority=20)
	public void deleteSupplier() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		sup.clickSupplierButton();
		sup.clickAddSupplierButtn();
		sup.setSupplierName("HHM");
		sup.setSupplierBusiness("Goods");
		sup.setSupplierMobilenum("466678923");
		sup.clickSupplierSaveButtn();
		driver.navigate().refresh();
		sup.setSupplierSearch("HHM");
		sup.clickSupplierActionButtn();
		PageUtilities.doubleClick(driver,sup.supplierdelete);
		String actualsuplernametxt = sup.getsupplierNameChecktxt();
		String expectedsuplernametxt = AutomationConstants.supplierNameCheck;
		Assert.assertEquals(actualsuplernametxt, expectedsuplernametxt);
		//sup.clickSupplierDeleteButtn();
		}

}
