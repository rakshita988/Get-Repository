package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<links.size();i++) {
			 Date dt = new Date();
		String val = dt.toString().replace(':', '_').replace(' ', '_');
		String link = links.get(i).getText();
		links.get(i).click();
		File scrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn, new File("C:\\Users\\Khushi\\OneDrive\\Pictures\\New folder\\"+link+"_"+val+".png"));
		links=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}
	}

}
