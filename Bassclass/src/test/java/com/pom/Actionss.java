package com.pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Test;

public class Actionss extends Test {
	
	
	public static void main(String[] args) throws IOException {
		
		
		browser("chrome");
		geturl("https://letcode.in/dropable");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		mouseAction(drag, drop,"drag and drop");	
		
		Screenshot("stephen");
	}
	
	
	

}
