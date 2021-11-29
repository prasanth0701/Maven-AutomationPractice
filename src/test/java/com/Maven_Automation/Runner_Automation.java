package com.Maven_Automation;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class Runner_Automation extends Base_Class {
	static Logger log=Logger.getLogger(Runner_Automation.class);
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager_Auto pom=new Page_Object_Manager_Auto(driver);
	public static void main(String[] args) throws Throwable {

		maximize();
		getURL("http://automationpractice.com/index.php");
		
		PropertyConfigurator.configure("log4j.properties");
		log.debug("Debug");
		log.info("Info");
		

		// page1

		clickOnElement(pom.getInstancePOM_1().getSignin());

		// page2
		
		//String email = File_Reader_Manager_Auto.getInstanceFRMA().getInstanceCRA().getEmail();
		String email = Particular_Data_From_Excel("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven_Automation\\Excel\\Automation project Test case.xlsx", 2, 5);
		inputValueElement(pom.getInstancePOM_1().getEmail(), email);

		
		//String password = File_Reader_Manager_Auto.getInstanceFRMA().getInstanceCRA().getPassword();
		String password = Particular_Data_From_Excel("C:\\\\Users\\\\Prasanth SP\\\\eclipse-workspace\\\\Maven_Automation\\\\Excel\\\\Automation project Test case.xlsx", 3, 5);
		inputValueElement(pom.getInstancePOM_1().getPassword(), password);
		clickOnElement(pom.getInstancePOM_1().getLoginbutton());
		// page3
		
		clickOnElement(pom.getInstancePOM_2().getWomen());
		explicitWait(pom.getInstancePOM_2().getBlouse(), 10);

		iframe(0);
		String quantity = File_Reader_Manager_Auto.getInstanceFRMA().getInstanceCRA().getQuantity();
		clearAndInput(pom.getInstancePOM_2().getQuantity(), quantity);

		String size = File_Reader_Manager_Auto.getInstanceFRMA().getInstanceCRA().getSize();
		Dropdown("byvisibletext", pom.getInstancePOM_2().getSize(), size);
		clickOnElement(pom.getInstancePOM_2().getAddtocart());
		defaultframe();

		explicitWait(pom.getInstancePOM_2().getCheckout(), 20);

		// page4
		clickOnElement(pom.getInstancePOM_3().getCheckout2());
		// page5
		clickOnElement(pom.getInstancePOM_3().getCheckout3());
		// page6
		clickOnElement(pom.getInstancePOM_3().getClickbox());
		clickOnElement(pom.getInstancePOM_3().getCheckout4());
		clickOnElement(pom.getInstancePOM_3().getBankwire());
		clickOnElement(pom.getInstancePOM_3().getConfirmbutton());
	}

}
