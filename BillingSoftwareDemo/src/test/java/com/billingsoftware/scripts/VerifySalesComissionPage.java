package com.billingsoftware.scripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.billingsoftware.constants.AutomationConstants;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.SalesComissionPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.utilities.WaitUtility;
import com.obscura.listeners.ExtentReportListeners;

@Listeners(ExtentReportListeners.class)

public class VerifySalesComissionPage extends TestBase {
	
	
	@Test(priority=13)
	public void verifysalespage() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		sales = new SalesComissionPage(driver);
	    sales.clickSalesButton();
	    String expectedsalesdngtxt = AutomationConstants.SalesHedng;
		String actualsalesdngtxt = sales.getSalesHdng();
		Assert.assertEquals(actualsalesdngtxt, expectedsalesdngtxt);
	}
	
	
	
	
	
	@Test(priority=14)
public void addSalesAgent() {
	login = new LoginPage(driver);
	login.login();
	user = new UsersPage(driver);
	user.ClickEndtour();
	user.clickusermngmnt();
	sales = new SalesComissionPage(driver);
    sales.clickSalesButton();
    sales.clickSalesAddButton();
    sales.setSalesFirstName("Matrix");
    sales.setSalesEmail("matrix@yopmail.com");
    sales.setSalesPrefix("Mr");
    sales.setSalesComission("10");
    sales.clickSalesSave();
    String expectedsalesdngtxt = AutomationConstants.SalesHedng;
	String actualsalesdngtxt = sales.getSalesHdng();
	Assert.assertEquals(actualsalesdngtxt, expectedsalesdngtxt);


}
@Test(priority=15)
	public void editSalesAgent() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		sales = new SalesComissionPage(driver);
	    sales.clickSalesButton();
	    sales.setSalesSearch("Matrix");
	    sales. clickSaleEditButton();
	    sales.clearSalesPrefix();
	    sales.setSalesPrefix("Mrs");
	    sales.clickSalesSave();
	    String expectedsalesdngtxt = AutomationConstants.SalesHedng;
		String actualsalesdngtxt = sales.getSalesHdng();
		Assert.assertEquals(actualsalesdngtxt, expectedsalesdngtxt);


}
	@Test(priority=16)
public void verifySalesAgentDeletion() {
		login = new LoginPage(driver);
		login.login();
		user = new UsersPage(driver);
		user.ClickEndtour();
		user.clickusermngmnt();
		sales = new SalesComissionPage(driver);
	    sales.clickSalesButton();
	    sales.clickSalesAddButton();
	    sales.setSalesFirstName("HitMan");
	    sales.setSalesEmail("hitman@yopmail.com");
	    sales.setSalesPrefix("Mr");
	    sales.setSalesComission("15");
	    sales.clickSalesSave();
	    driver.navigate().refresh();
	    sales.setSalesSearch("HitMan");
	    sales.clickSaleDeleteButton();
	    sales.clickCnfrmSaleDeletn();
	    String expectedsalesdngtxt = AutomationConstants.SalesHedng;
		String actualsalesdngtxt = sales.getSalesHdng();
		Assert.assertEquals(actualsalesdngtxt, expectedsalesdngtxt);

	    }

	}
