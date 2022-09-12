package com.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.Testone;

public class Neww  extends Testone{
	
	
	
	public static void main(String[] args) {
		
		
		brow("chrome");
		get("https://letcode.in/dropable");
		
	
		WebElement findElement = driver.findElement(By.id("draggable"));
		WebElement findElement2 = driver.findElement(By.id("droppable"));
		
		act(findElement,findElement2,"drag and drop");
		
	}
	
	

}
