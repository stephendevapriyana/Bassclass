package com.baseclass;

import org.apache.poi.poifs.crypt.dsig.TrustCertificateSecurityException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testone {
	
	public static WebDriver driver;
	
	public static  WebDriver brow(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEERASURIYA\\Downloads\\Softwar testing\\Bassclass\\Drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			
			
		}
		
		else if (type.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Bassclass\\Drivers\\chromedriver.exe");

			driver = new InternetExplorerDriver();

		
		
	
		
		
	}
		return driver;
	
	

}
	
     public static void get(String url) {
    	 
    	 driver.get(url);
    	 
     }

    public static void send(WebElement string ,String pass) {
	  
	  
    	string.sendKeys(pass);
	  
  }
    
    
    public static void cick (WebElement strign1) {
    	
    	strign1.click();
    	
    }
    
    
    public static void act(WebElement one,WebElement two,String sss) {
    	
    	Actions a=new Actions(driver);
    	
    	if (sss.equalsIgnoreCase("drong and drop")) {
			
    		a.clickAndHold(one).moveToElement(two).release().build().perform();
    		
		}
    	
    	
    }














}