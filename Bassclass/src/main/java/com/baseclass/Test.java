package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static WebDriver driver;

	public static void Screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path+".png");
		FileUtils.copyFile(screenshotAs, destination);
	}

	public static WebDriver browser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERASURIYA\\Downloads\\Softwar testing\\Bassclass\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Bassclass\\Drivers\\chromedriver.exe");

			driver = new InternetExplorerDriver();

		}
		
		return driver;
		
	}

	public static void geturl(String url) {
		driver.get(url);

	}

	public static void enterEmailadress(WebElement webDriver, String email) {

		webDriver.sendKeys(email);
	}

	public static void sendkeys(WebElement webDriver, String pass) {

		webDriver.sendKeys(pass);

	}

	public static void clickssingin(WebElement cl) {
		cl.click();

	}

	public static void dropdown(WebElement ele, String type, String value) {

		Select s = new Select(ele);

		if (type.equalsIgnoreCase("byvalue")) {

			s.selectByValue(value);
		}

		else if (type.equalsIgnoreCase("byindex")) {

			int parseInt = Integer.parseInt("byindex");
			s.selectByIndex(parseInt);

		}

		else if (type.equalsIgnoreCase("byvisible")) {

			s.selectByVisibleText(value);
		}
	}

	public static void alert(String type, String value) {

		if (type.equalsIgnoreCase("Accept")) {

			Alert a = driver.switchTo().alert();

			a.accept();

		}
		if (type.equalsIgnoreCase("dismiss")) {

			Alert a = driver.switchTo().alert();

			a.dismiss();

		}
		if (type.equalsIgnoreCase(value)) {

			Alert a = driver.switchTo().alert();

			a.sendKeys(value);

		}

	}

	public static void mouseAction(WebElement element, WebElement drop, String type) {

		Actions act = new Actions(driver);

		if (type.equalsIgnoreCase("clcik")) {

			act.click(element).build().perform();

		}

		else if (type.equalsIgnoreCase("contextclick")) {

			act.contextClick(element).build().perform();

		}

		else if (type.equalsIgnoreCase("drag and drop")) {

			act.clickAndHold(element).moveToElement(drop).release().build().perform();

		}

	}

	public static void robots(String type) throws AWTException {
		Robot r = new Robot();

		if (type.equalsIgnoreCase("down")) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		else if (type.equalsIgnoreCase("enter")) {

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	public static void javascript(WebElement element, String type) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (type.equalsIgnoreCase("scrollBy")) {

			js.executeScript("window.scrollBy(0,5000)", "");

		}

		else if (type.equalsIgnoreCase("scrollIntoView")) {

			js.executeScript("arguments[0].scrollIntoView[true]", element);
			js.executeScript("arguments[0].click()", element);

		}

	}

	public static void frame(WebElement element) {

		driver.switchTo().frame(element);
	}

	public static void navigateTo(String element) {
		driver.navigate().to(element);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

}
