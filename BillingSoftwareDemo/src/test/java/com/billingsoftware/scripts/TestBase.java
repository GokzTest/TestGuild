package com.billingsoftware.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.billingsoftware.pages.BrandsPage;
import com.billingsoftware.pages.CustomerGroupsPage;
import com.billingsoftware.pages.LoginPage;
import com.billingsoftware.pages.RolesPage;
import com.billingsoftware.pages.SalesComissionPage;
import com.billingsoftware.pages.SuppliersPage;
import com.billingsoftware.pages.UsersPage;
import com.billingsoftware.pages.VariationsPage;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop = null;
	public static Logger logger;
	public static LoginPage login;
	public static UsersPage user;
	public static RolesPage role;
	public static SuppliersPage sup;
	public static CustomerGroupsPage cgp;
	public static BrandsPage bsp;
	public static VariationsPage vp;

public static SalesComissionPage sales;
	public static void loadConfig() {
		try {
			// Below line creates an object of Properties called 'prop'
			prop = new Properties();
			// Below line creates an object of FileInputStream called 'ip'.
			// Give the path of the properties file which you have created
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources" + "/config.properties");
			// Below line of code will load the property file
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Parameters("browser")
	public void firstcall(String browser) {
		launchApp(browser);
		login = new LoginPage(driver);
		user = new UsersPage(driver);
        role = new RolesPage(driver);
    	sales = new SalesComissionPage(driver);
    	sup = new SuppliersPage(driver);
    	cgp = new CustomerGroupsPage(driver);
    	bsp = new BrandsPage(driver);
    	vp = new VariationsPage(driver);

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	private void launchApp(String browser) {
		// TODO Auto-generated method stub

	}

	//@BeforeClass
	/*
	 * public void BeforeSuite() { ExtentReport.setExtent();
	 * DOMConfigurator.configure("log4j.xml"); }
	 */

	// @BeforeTest(alwaysRun = true)
	
	@Parameters("browser")
	@BeforeMethod
	public void onSetup(String browserName) {
		loadConfig();
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\selenium webdriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		logger = Logger.getLogger("BillingSoftwareDemo");
		DOMConfigurator.configure("log4j.xml");

		driver.get(prop.getProperty("url"));

	}

	@AfterMethod
	public void tearDown(ITestResult iTestResult) throws IOException {
		if (ITestResult.FAILURE == iTestResult.getStatus()) {
			takeScreenshot(iTestResult.getName());
		}
	}

	public String takeScreenshot(String name) throws IOException {

		/*
		 * Step 1) Convert web driver object to TakesScreenshot Step 2) Call
		 * getScreenshotAs method to create image file Step 3) Copy file to Desired
		 * Location
		 */

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		// Take the screenshot
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "\\target\\" + name + dateName + ".png";

		File finalDestination = new File(destination);

		FileUtils.copyFile(source, finalDestination);// or FileUtils.copyFile import org.apache.commons.io.FileUtils;
		return destination;
	}

	@DataProvider(name = "InvalidLogin")
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "uname";
		data[0][1] = "password";
		data[1][0] = "admin";
		data[1][1] = "pwrod";
		data[2][0] = "login";
		data[2][1] = "pasword";

		return data;
	}


}
