package com.Maven_Automation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader_Auto {
	public static Properties p;
	public Configuration_Reader_Auto() throws Throwable {
		File f=new File("C:\\Users\\Prasanth SP\\eclipse-workspace\\Maven_Automation\\src\\main\\java\\automation.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);



	}
	public String getURL() {
		String url = p.getProperty("url");

		return url;
	}
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getQuantity() {
		String quality = p.getProperty("quantity");
		return quality;
	}
	public String getSize() {
		String size = p.getProperty("size");
		return size;
	}
}
