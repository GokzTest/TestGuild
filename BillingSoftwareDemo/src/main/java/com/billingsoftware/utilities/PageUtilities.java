package com.billingsoftware.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.billingsoftware.scripts.TestBase;

public class PageUtilities extends TestBase {
	
  
public static void doubleClick(WebDriver driver, WebElement element) {
        //Retrieve WebElemnt  to perform mouse hover
    	Actions actions = new Actions(driver);
    	actions.doubleClick(element);
    	actions.build().perform();
    }
public void contextClick(WebDriver driver, WebElement element) {
        //Retrieve WebElemnt  to perform mouse hover
    	Actions actions = new Actions(driver);
    	actions.contextClick(element);
    	actions.build().perform();
    }
//drag and drop,shift key,alt key
}
