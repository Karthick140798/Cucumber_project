package com.November_baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;

import com.baseclass.Base_class_Access;

public class Base_class_November extends Base_class_Access{
	public static void main(String[] args) throws IOException {
		getDriver("firefox");
		getUrl("https://www.facebook.com/");
		//getUrl("https://www.Amazon.com/");
		Maximize();
		Screenshot("KarthickSC");
		
		
		
	}

}
