package com.selenium.driver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static  WebDriver driver;
	public static Properties p;
	public static Properties maindrop;
	public static Properties childdrop;
	public static Properties subdrop;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public static void init() throws Exception {
	File f = new File("C:\\Users\\Khushi\\eclipse-workspace -rakshita\\SeleniumCourse\\src\\test\\resources\\data.properties");
		FileInputStream fis = new FileInputStream(f);
        p = new Properties();
		p.load(fis);
		String val = p.getProperty("chromebrowser");
		//System.out.println(val);
		
		fis = new FileInputStream("C:\\Users\\Khushi\\eclipse-workspace -rakshita\\SeleniumCourse\\src\\test\\resources\\environment.properties");
	maindrop = new Properties();
	maindrop.load(fis);
	String a = maindrop.getProperty("env");
	System.out.println(a);
	
	 
	fis = new FileInputStream("C:\\\\Users\\\\Khushi\\\\eclipse-workspace -rakshita\\\\SeleniumCourse\\\\src\\\\test\\\\resources\\\\"+a+".properties");
	childdrop = new Properties();
	childdrop.load(fis);
	String e = childdrop.getProperty("amazonurl");
	System.out.println(e);
	
	fis = new FileInputStream("C:\\Users\\Khushi\\eclipse-workspace -rakshita\\SeleniumCourse\\src\\test\\resources\\or.properties");
	subdrop = new Properties();
	subdrop.load(fis);
	
	fis = new FileInputStream("C:\\Users\\Khushi\\eclipse-workspace -rakshita\\SeleniumCourse\\src\\test\\resources\\log4j.properties");
	PropertyConfigurator.configure(fis);
	
	 report = ExtentManager.getInstance();
	
	}
	
		
		public static void launch(String browserType) {
			if(p.getProperty(browserType).equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(p.getProperty(browserType).equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();	
			}else if (p.getProperty(browserType).equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			
			
		}
		
		public static void navigateUrl(String url) {
			//driver.get(url);
			driver.navigate().to(childdrop.getProperty(url));
			
		}
		public static void clickElement(String locatorKey) {
			  //driver.findElement(By.xpath(subdrop.getProperty(locatorkey))).click();
			getElement(locatorKey).click();
		}

		public static void typeText(String locatorKey, String text) {
			//driver.findElement(By.name(subdrop.getProperty(locatorkey))).sendKeys(option);
			getElement(locatorKey).sendKeys(text);
		}

		public static void selectOption(String locatorKey, String option) {
			//driver.findElement(By.id(subdrop.getProperty(locatorkey))).sendKeys(option);
			getElement(locatorKey).sendKeys(option);
		}


		public static WebElement getElement(String locatorKey) {
			
			WebElement ele = null;
			if(!isElementPresence(locatorKey)) 
				System.out.println("Element is not present:" + locatorKey);
			ele = driver.findElement(getLocator(locatorKey));
				
			/*if(locatorkey.endsWith("_id")) {
				ele = driver.findElement(By.id(subdrop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_name")) {
				ele= driver.findElement(By.name(subdrop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_className")) {
			ele =driver.findElement(By.className(subdrop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_xpath")) {
				ele= driver.findElement(By.xpath(subdrop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_cssSelector")) {
				ele= driver.findElement(By.cssSelector(subdrop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_linkText")) {
				ele= driver.findElement(By.linkText(subdrop.getProperty(locatorkey)));
			}
			else if(locatorkey.endsWith("_partialLinkText")) {
				ele= driver.findElement(By.partialLinkText(subdrop.getProperty(locatorkey)));
			}*/
			
			return ele;
		}


		public static boolean isElementPresence(String locatorKey) {
			System.out.println("checking for element presence:" + locatorKey);
			
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
				return true;
			}
			catch (Exception e) {
				
				e.printStackTrace();
				return false;
			}
			
			/*if(locatorkey.endsWith("_id")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(subdrop.getProperty(locatorkey))));
			}else if(locatorkey.endsWith("_name")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(subdrop.getProperty(locatorkey))));
			}
			else if(locatorkey.endsWith("_className")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.className(subdrop.getProperty(locatorkey))));
			}
			else if(locatorkey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(subdrop.getProperty(locatorkey))));
			}
			else if(locatorkey.endsWith("_cssSelector")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(subdrop.getProperty(locatorkey))));
			}
			else if(locatorkey.endsWith("_linkText")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(subdrop.getProperty(locatorkey))));
			}
			else if(locatorkey.endsWith("_partialLinkText")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(subdrop.getProperty(locatorkey))));
			}*/
			
		}


		public static By getLocator (String locatorKey) {
			By by = null;
			if(locatorKey.endsWith("_id")) {
				by=By.id(subdrop.getProperty(locatorKey));
			} 
			else if(locatorKey.endsWith("_name")) {
				by=By.name(subdrop.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_classname")) {
				by=By.className(subdrop.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_xpath")) {
				by=By.xpath(subdrop.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_cssselector")) {
				by=By.cssSelector(subdrop.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_linktext")) {
				by=By.linkText(subdrop.getProperty(locatorKey));
			}
			else if(locatorKey.endsWith("_partiallinktext")) {
				by=By.partialLinkText(subdrop.getProperty(subdrop.getProperty(locatorKey)));
			}
			return by;
		}	
			
		}

	


