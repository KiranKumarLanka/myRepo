package com.project.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

	static WebDriver driver;
	static Properties prop;
	
	public TestBase() throws IOException{
		prop=new Properties();
		FileInputStream fileIP=new FileInputStream("F:/My Work/Workspace/testProjectCucumber/src/main/java/com/project/qa/properties/config.properties");
		prop.load(fileIP);
	}
	
	public void initialization(){
		String browserName=prop.getProperty("browser");
		
	}	
}
