package javascriptexcecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('identifierId').value='rakshitagulshette'");
	String title = js.executeScript("return document.title").toString();
	System.out.println(title);
	js.executeScript("document.getElementsByName('identifier')[0].value='rakshita'");
	js.executeScript("document.getElementsByClassName('whsOnd zHQkBf')[0]");
	js.executeScript("document.getElementsByTagName('input')[0]");
	js.executeScript("document.querySelector('#identifierId')");
	js.executeScript("document.evaluate(\"//input[@id='identifierId']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue");
	js.executeScript("window.scrollBy (0,200)");
	js.executeScript("window.scrollBy (0,document.body.scrollHeight)");
	//js.executeScript("window.history.back()");
	
	}

}
