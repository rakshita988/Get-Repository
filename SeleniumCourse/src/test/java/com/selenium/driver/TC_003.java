package com.selenium.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_003 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		Thread.sleep(3000);
		driver.findElement(By.name("field-keywords")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("LG");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		driver.findElement(By.linkText("Best Sellers")).click();
		driver.findElement(By.partialLinkText("Best Sell")).click();*/
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty()) {
			String link = links.get(i).getText();
			System.out.println(link);
			}
			
		}
		
	}

}
