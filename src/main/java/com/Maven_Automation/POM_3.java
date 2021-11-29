package com.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_3 {
	public static WebDriver driver;
	public POM_3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy (xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkout2;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement checkout3;
	
	@FindBy (css="input#cgv")
	private WebElement clickbox;
	
	@FindBy (xpath="//button[@name='processCarrier']")
	private WebElement checkout4;
	
	@FindBy (css="a.bankwire")
	private WebElement bankwire;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement confirmbutton;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckout2() {
		return checkout2;
	}

	public WebElement getCheckout3() {
		return checkout3;
	}

	public WebElement getClickbox() {
		return clickbox;
	}

	public WebElement getCheckout4() {
		return checkout4;
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getConfirmbutton() {
		return confirmbutton;
	}
	

}
