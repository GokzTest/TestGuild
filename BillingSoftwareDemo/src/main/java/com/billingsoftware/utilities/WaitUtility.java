package com.billingsoftware.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.billingsoftware.scripts.TestBase;

public class WaitUtility extends TestBase {
	public  WebElement waitForElementTobeVisible(WebDriver driver, WebElement elementToBeLoaded, int Time)
	{
        WebDriverWait wait = new WebDriverWait(driver, Time);//new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
        return element;
    }
public static WebElement waitForElementTobeClickable(WebDriver driver, WebElement elementToBeClickable, int Time) {
        WebDriverWait wait = new WebDriverWait(driver, Time);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeClickable));
        return element;
}
}
