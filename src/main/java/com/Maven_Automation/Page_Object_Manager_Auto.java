package com.Maven_Automation;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager_Auto {
	
	public WebDriver driver;
	private POM_1 a;
	private POM_2 b;
	private POM_3 c;
	
	public Page_Object_Manager_Auto(WebDriver driver2) {
	this.driver=driver2;
	}
	public POM_1 getInstancePOM_1() {
     if (a==null) {
    	 a=new POM_1(driver);
		
	}return a;
	}
	public POM_2 getInstancePOM_2() {
		if (b==null) {
	    	 b=new POM_2(driver);
			
		}return b;
	}
	public POM_3 getInstancePOM_3() {
		if (c==null) {
	    	 c=new POM_3(driver);
			
		}return c;
	}

}
