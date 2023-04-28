/**
 * 
 */
package com.qa.base;

/**
 * @author mahendar
 *
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.qa.utility.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite
	
	public static void lauchApp() {
		
		
			ExtentManager.setExtent();
			DOMConfigurator.configure("log4j.xml");
			
			try {
				prop = new Properties();
				System.out.println("super constructor invoked");
			FileInputStream fis = new  FileInputStream(System.getProperty("user.dir") + "\\configuration\\config.properties");
				prop.load(fis);
				System.out.println("driver:" + driver);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
			e.printStackTrace();
			}
		
		//WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			
		} else if(browserName.equalsIgnoreCase("ff")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
//		Action act = new Action();
//		act.implicitWait(driver, 10);
//		act.pageLoadTimeOut(driver, 20);
	

		driver.get(prop.getProperty("url"));
	}
	

@AfterSuite
	public void tearDown() {
	   ExtentManager.endReport();
		driver.close();
		System.out.println("teardown succesfull");
	}
}
