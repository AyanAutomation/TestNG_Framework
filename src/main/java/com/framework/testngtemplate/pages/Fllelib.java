package com.framework.testngtemplate.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fllelib {
	
	
	   public String Data_reader(String key) throws IOException {
		   
		   FileInputStream fds = new FileInputStream("H:\\Selenium Projects\\TestNG FrameWork Template\\src\\main\\java\\Data\\data.properties");
		   
		   Properties prop = new Properties();
		   prop.load(fds);
	    /* String value = prop.getProperty(key);
		   return value; */
		   return prop.getProperty(key);
		   
		   
	   }
	
	

}
