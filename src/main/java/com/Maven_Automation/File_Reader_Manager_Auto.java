package com.Maven_Automation;

public class File_Reader_Manager_Auto {
	private File_Reader_Manager_Auto() {
		//to restrict the object creation
	}
	public static File_Reader_Manager_Auto getInstanceFRMA() {
		File_Reader_Manager_Auto reader=new File_Reader_Manager_Auto();
		return reader;
		
		}
	public Configuration_Reader_Auto getInstanceCRA() throws Throwable {
		Configuration_Reader_Auto c_reader=new Configuration_Reader_Auto();
		return c_reader;
	}
}
