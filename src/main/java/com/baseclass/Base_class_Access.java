package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Base_class_Access {
	
	public static WebDriver WebDriverdriver;
	public static void getDriver(String value){
		//String value="Hi";
		//Strng Url ="karthick.com 123";
		//if (value.equals(url))
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\DELL\\eclipse-workspace\\cucumberproject\\driver\\chromedriver.exe");
			WebDriverdriver =new ChromeDriver();
			
			 WebDriverdriver.manage().window().maximize();
			
		}
		else if(value.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\DELL\\eclipse-workspace\\cucumberproject\\driver\\geckodriver.exe");
			WebDriverdriver =new FirefoxDriver();
			
			WebDriverdriver.manage().window().maximize();
			
		}
		
		
	}
	
	public static void getUrl(String url) {
		WebDriverdriver.get(url);
    }
	public static void Maximize() {
		WebDriverdriver.manage().window().maximize();
		
	}
	public static void Screenshot(String a) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) WebDriverdriver;
		File s=ts.getScreenshotAs(OutputType.FILE);
		File d =new File("C:\\Users\\DELL\\eclipse-workspace\\cucumberproject\\ScreenShot\\" +a+ ".png");
		FileUtils.copyFile(s, d);

	}
	
	
}
