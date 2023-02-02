package com.billingsoftware.scripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.CustomerGroupsPage;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.SuppliersPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.utilities.WaitUtility;
import com.obscura.listeners.ExtentReportListeners;


@Listeners(ExtentReportListeners.class)

public class VerifyCustomerGroupsPage extends TestBase {

	@Test (priority=21)
	public void verifyCustomerGroupPageDisplay() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		cgp = new CustomerGroupsPage(driver);
		cgp.clickCustomergroupPage();
		String actualsuplernametxt = cgp.getCustmrGrpgHdngtxt();
		String expectedsuplernametxt = AutomationConstants.CustmrGrpgHdngtxt;
		Assert.assertEquals(actualsuplernametxt, expectedsuplernametxt);
	}
	 @Test (priority=22)
	public void verifyCustomerGroupAdding() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		cgp = new CustomerGroupsPage(driver);
		cgp.clickCustomergroupPage();
		cgp.clickCustomergroupAddButton();
		cgp.setGroupName("MaxLabs");
		cgp.setGroupPercentage("10");
		cgp.clickCustmrGrpSave();
		driver.navigate().refresh();
		cgp.setCustmrGrpSearch("MaxLabs");
		WaitUtility.waitForElementTobeClickable(driver, cgp.custmrgrpnamecheck, 3000);
		String actualCustmrGrpNametxt = cgp.getCustmrGrpNameChecktxt();
		String expectedsCustmrGrpNametxt = AutomationConstants.CustmrGrpNameChecktxt;
		Assert.assertEquals(actualCustmrGrpNametxt, expectedsCustmrGrpNametxt);

	}

	@Test (priority=23)
	public void verifyCustomerGroupEditOption() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		cgp = new CustomerGroupsPage(driver);
		cgp.clickCustomergroupPage();
		cgp.clickCustomergroupAddButton();
		cgp.setGroupName("MaxLabs");
		cgp.setGroupPercentage("10");
		cgp.clickCustmrGrpSave();
		driver.navigate().refresh();
		cgp.setCustmrGrpSearch("MaxLabs");
		cgp.clickCustmrgrpEditname();
		cgp.clearGroupame();
		cgp.setGroupName("MaxPayne");
		cgp.clickCustmrGrpUpdate();
		driver.navigate().refresh();
		cgp.setCustmrGrpSearch("MaxPayne");
		String actualsuplernametxt = cgp.getCustmrGrpgHdngtxt();
		String expectedsuplernametxt = AutomationConstants.CustmrGrpgHdngtxt;
		Assert.assertEquals(actualsuplernametxt, expectedsuplernametxt);

	}

	@Test (priority=24)
	public void verifyCustomerGroupDeleteOption() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		sup = new SuppliersPage(driver);
		sup.clickContactsButton();
		cgp = new CustomerGroupsPage(driver);
		cgp.clickCustomergroupPage();
		cgp.setCustmrGrpSearch("MaxPayne");
		cgp.clickCustmrGrpDelete();
		cgp.clickCustmrGrpCnfrmUpdate();
		String actualsuplernametxt = cgp.getCustmrGrpgHdngtxt();
		String expectedsuplernametxt = AutomationConstants.CustmrGrpgHdngtxt;
		Assert.assertEquals(actualsuplernametxt, expectedsuplernametxt);

	}
}
