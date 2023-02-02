package com.billingsoftware.scripts;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.utilities.ExcelUtilities;
import com.obscura.listeners.ExtentReportListeners;

@Listeners(ExtentReportListeners.class)

public class VerifyLoginPage extends TestBase {

	@Parameters({ "usename", "passwrd" })
	@Test(priority = 1)
	public void verifylogin(String usename, String passwrd) throws IOException {
		login = new LoginPage(driver);
		login.Login(usename, passwrd);
		user = new UsersPage(driver);
		user.ClickEndtour();
		String expectedhomepageheadng = AutomationConstants.homepagehdng;
		String actualhomepageheading = login.getHomepagehdng();
		Assert.assertEquals(actualhomepageheading, expectedhomepageheadng);
	}

	@Test(dataProvider = "InvalidLogin",groups = { "UI Test" })	
	public void InvalidLogin(String usename, String passwrd) throws IOException {
		login = new LoginPage(driver);
		login.Login(usename, passwrd);
		String expectedheading = AutomationConstants.loginhedng;
		String actualheading = login.getlogintext();
		Assert.assertEquals(actualheading, expectedheading);
	}

	@Test(priority = 3)
	public void forgetpassword() throws IOException {
		login = new LoginPage(driver);
		login.clickForgtpswrd();
		String exptdfrgtpaswrdtext = AutomationConstants.emailtxt;
		String actlfrgtpaswrdtext = login.getemailtext();
		Assert.assertEquals(actlfrgtpaswrdtext, exptdfrgtpaswrdtext);

	}

}
