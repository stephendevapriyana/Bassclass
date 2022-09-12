package com.pom;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Test;

public class Robott extends Test{

	
	
	public static void main(String[] args) throws AWTException {
		
		
		browser("chrome");
		geturl("https://www.google.com/");
		
		WebElement cont = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a"));
		
		mouseAction(cont,cont, "contextclick");
		
		robots("down");
		robots("enter");
		
	}
}
