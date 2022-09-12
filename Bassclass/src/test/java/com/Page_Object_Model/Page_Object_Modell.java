package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Test;


public class Page_Object_Modell extends Test {
	
	public static WebDriver driver1=Test.browser("chrome");
	
	public static Pojo p=new Pojo(driver1);
	
    
      
	
	public static void main(String[] args) {
		
        	
		
		geturl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		enterEmailadress(p.getUsername(),"stephendevapriyan24@gmail.com");
		
		enterEmailadress(p.getPasswd(),"Stephen@1234");
		
		clickssingin(p.getSigin());
		
		
	}



}
