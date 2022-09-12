package com.pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Test;

public class Testrunner extends Test {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Bassclass\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	
	WebElement email = driver.findElement(By.id("email"));
	
	enterEmailadress(email,"stephendevapriyan24@gmail.com");
	
	WebElement password = driver.findElement(By.id("passwd"));
	
	sendkeys(password, "Stephen@123");
	
	WebElement cls = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	
	clickssingin(cls);
	
	
	

	}


	
	

	
}
