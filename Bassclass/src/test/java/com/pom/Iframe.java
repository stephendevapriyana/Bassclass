package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Test;

public class Iframe extends Test  {
	
	public static void main(String[] args) {
		
		browser("chrome");
		geturl("https://letcode.in/frame");
		
		WebElement ifram = driver.findElement(By.name("firstFr"));
		
		frame(ifram);
		
		WebElement web = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input"));
		sendkeys(web,"stephen");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
