package com.billingsoftware.scripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.RolesPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.utilities.WaitUtility;
import com.obscura.listeners.ExtentReportListeners;

@Listeners(ExtentReportListeners.class)

public class VerifyRolesPage extends TestBase {
	@Test(priority=9,groups = { "UI Test" })
	public void clickrole() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		role = new RolesPage(driver);
		role.ClickRolesButtn();
		String expectedrolehdngtxt = AutomationConstants.getrolehdng;
		String actualrolehdngtxt = role.getRolehedngtxt();
		Assert.assertEquals(actualrolehdngtxt, expectedrolehdngtxt);
	}

	 @Test(priority=10)
	public void verifyAddingNewRole() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		role = new RolesPage(driver);
		role.ClickRolesButtn();
		role.ClickRolesAddButtn();
		role.setRoleName("Investigator");
		role.ClickRoleSelct();
		role.ClickSaveRole();
		String expectedrolehdngtxt = AutomationConstants.getrolehdng;
		String actualrolehdngtxt = role.getRolehedngtxt();
		Assert.assertEquals(actualrolehdngtxt, expectedrolehdngtxt);
	}

	@Test(priority=11)
	public void editRole() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		role = new RolesPage(driver);
		role.ClickRolesButtn();
		role.setSearchRole("Investigator");
		role.clickEditRole();
		role.clearRoleName();
		role.setRoleName("Investigatorss");
		role.clickUpdateRole();
		role.setSearchRole("Investigatorss");
		String expectededithdngtxt = AutomationConstants.editrolecheck;
		String actualedithdngtxt = role.getEditRoleheck();
		Assert.assertEquals(actualedithdngtxt, expectededithdngtxt);

	}

	@Test(priority=12)
	public void deletRole() throws InterruptedException {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		role = new RolesPage(driver);
		role.ClickRolesButtn();
		role.ClickRolesAddButtn();
		role.setRoleName("Doctor");
		role.ClickRoleSelct();
		role.ClickSaveRole();
		role.setSearchRole("Doctor");
		role.ClickDelButton();
		role.clickCnfrmdelbutton();
		System.out.println(role.getRoleDelChecktxt());
		String expectedroledelchectxt = AutomationConstants.roledlcheck;
		String actualroledelcheckxt = role.getRoleDelChecktxt();
		Assert.assertEquals(actualroledelcheckxt, expectedroledelchectxt);

	}
	

}
