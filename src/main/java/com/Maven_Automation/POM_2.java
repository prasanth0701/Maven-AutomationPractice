package com.Maven_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_2 {
	public static WebDriver driver;
	public POM_2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Women")
	private WebElement women;
	
	@FindBy(xpath="//img[@title='Blouse']")
	private WebElement blouse;
	
	@FindBy(xpath="//input[@id='quantity_wanted']")
	private WebElement quantity;
	
	@FindBy(css="select#group_1")
	private WebElement size;
	
	@FindBy(css="button.exclusive")
	private WebElement addtocart;
	
	@FindBy(css="[title='Proceed to checkout']")
	private WebElement checkout;
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getBlouse() {
		return blouse;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
}
