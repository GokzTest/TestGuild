package com.billingsoftware.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.utilities.ExcelUtilities;
import com.billingsoftware.utilities.WaitUtility;
import com.obscura.listeners.ExtentReportListeners;

@Listeners(ExtentReportListeners.class)


public class VerifyUsersPage extends TestBase {

	@Test(priority=4)
	public void verifywhetheruserabletoseepage() throws IOException, InterruptedException {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.touserspage();
		String expecteduserhdng = AutomationConstants.userheading;
		String actualuserhdng = user.getUserHeading();
		Assert.assertEquals(actualuserhdng, expecteduserhdng);

	}

	// @Test(priority=5)
	public void verifywhetherAbletoEnterDetailsToUserspage() throws IOException, InterruptedException, NullPointerException {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.touserspage();
		user.ClickAddButton();
		user.setPrefix("Mr");
		user.ClickRole();
		user.setFirstname("Gokz");
		user.setEmail("gokzng@yopmail.com");
		user.setPassword("obscurazz");
		user.setCnfrmPassword("obscurazz");
		user.ClickSubmitbtn();
		String expecteduserhdng = AutomationConstants.userheading;
		String actualuserhdng = user.getUserHeading();
		Assert.assertEquals(actualuserhdng, expecteduserhdng);

	}

	@Test(priority=6)
	public void searchuser() throws InterruptedException  {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.touserspage();
		user.setSearch("gokzng@yopmail.com");
		System.out.println(user.getEmailSearchtxt());
		String expectedemailtxt = AutomationConstants.emailtext;
		String actualemailtxt = user.getEmailSearchtxt();	
		Assert.assertEquals(actualemailtxt, expectedemailtxt);
	}
	@Test(priority=7)
	public void edituser() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.touserspage();
		user.setSearch("gokzng@yopmail.com");
		user.ClickEditButton();
		user.ClearPrefix();
		user.setPrefix("Mrs");
		user.ClickUpdateButton();
		user.ClickSearch();
		user.setSearch("gokzng@yopmail.com");
		WaitUtility.waitForElementTobeClickable( driver,user.emailtxt,3000);
		String expectedemailtxt = AutomationConstants.emailtext;
		String actualemailtxt = user.getEmailSearchtxt();	
		Assert.assertEquals(actualemailtxt, expectedemailtxt);
	}
	
	
//@Test(priority=8)
	public void verifyUserCanBeDeleted() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.touserspage();
		user.setSearch("ramz@yopmail.com");
		user.ClickDeleteButton();
		user.ClickDeleteokButton();
		user.ClickSearch();
		user.setSearch("ramz@yopmail.com");
		System.out.println(user.getserdelchecktxt());
		String expecteuserdeltxt = AutomationConstants.userdeltxt;
		String actualuserdeltxt = user.getserdelchecktxt();	
		Assert.assertEquals(actualuserdeltxt, expecteuserdeltxt);
	}
	
	
	
	
}
