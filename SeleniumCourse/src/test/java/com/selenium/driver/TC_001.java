package com.selenium.driver;



public class TC_001 extends BaseTest{

	public static void main(String[] args) throws Exception {
		
	launch ("chrome");
	navigateUrl("https://www.amazon.in");
	driver.manage().window().maximize();
     
	//driver.get("url");
	//driver.navigate().forward();
	//String url = driver.getCurrentUrl();
	//System.out.println(url);
	//String title = driver.getTitle();
//	System.out.println(title);

	}

}
