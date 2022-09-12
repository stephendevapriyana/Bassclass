package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Test;

public class Javascriptext extends Test {
	
	public static void main(String[] args) {
		
		
		browser("chrome");
		geturl("https://www.amazon.in/");
		
		WebElement scrolenter = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/ul/li[1]/a"));
		javascript(scrolenter,"scrollBy");
		javascript(scrolenter,"scrollIntoView");
		
	}

}
