package com.selenium.driver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighLightElement {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
				  
		 ChromeDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.facebook.com");
		  
		  // find element using id attribute
		  WebElement username= driver.findElement(By.id("email"));  
		  
		  
		 // Create the  JavascriptExecutor object
		  JavascriptExecutor js=(JavascriptExecutor)driver; 
		  
		
		 // call the executeScript method
		  js.executeScript("arguments[0].setAttribute('style','background:green; border: solid 2px blue;');",username);
		    File scrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		    FileHandler.copy(scrn, new File("C:\\Users\\Khushi\\OneDrive\\Pictures\\New folder\\facebook.png"));
	}

}
