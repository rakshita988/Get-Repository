package com.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		////System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khushi\\Downloads\\chromedriver_win32\"");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver1 = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("https://flipkart.in");

	}

}
