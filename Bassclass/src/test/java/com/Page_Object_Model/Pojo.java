package com.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pojo {
	
	public static WebDriver driver;


	@FindBy(id="email")
	private WebElement username ;

	@FindBy(id="passwd")
	private WebElement passwd;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span/i")
	private WebElement sigin;
	
	
	public WebElement getUsername() {
		return username;
	}


	


	public WebElement getPasswd() {
		return passwd;
	}


	


	public WebElement getSigin() {
		return sigin;
	}


	public Pojo(WebDriver driver1) {
		
		this.driver=driver1;
		
		PageFactory.initElements(driver1, this);
	}


	

	

	

}
