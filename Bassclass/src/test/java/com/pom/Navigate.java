package com.pom;

import com.baseclass.Test;

public class Navigate extends Test  {

	
	public static void main(String[] args) {
		
		
		browser("chrome");
		geturl("https://www.google.com/");
		
		navigateTo("https://www.facebook.com/");
		
		navigateTo("https://www.youtube.com/");
		
		navigateBack();
		
		navigateForward();
		
		navigateRefresh();
	}
	
}
