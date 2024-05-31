package com.selenium.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		
		String monthYear="September 2024";
		String date= "29";
		
	while(true) {
		String month=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		if(month.equals(monthYear)) { 
			break;
		}
			else {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				
			}
	}
	List<WebElement> ele = driver.findElements(By.xpath("//div[@class='DayPicker-Week']/div"));
		
	for(WebElement alldates:ele) {
		String dt = alldates.getText();
		
		if(dt.equals(date)) {
			alldates.click();
			break;
			
			
		}
	}
	
	}
}	
	
	


