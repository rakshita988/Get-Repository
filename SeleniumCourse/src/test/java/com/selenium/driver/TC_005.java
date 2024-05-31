package com.selenium.driver;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;

public class TC_005 extends BaseTest{
	private static final Logger log = Logger.getLogger(TC_004.class);

	public static void main(String[] args)throws Exception {
		
		init();
		test= report.createTest("TC_005");
		test.log(Status.INFO ," Init the properties files...");
			
		
		launch("chromebrowser");
		test.log(Status.PASS, "\"Opened the browser : \" + p.getProperty(\"chromebrowser\")");
		
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to application : \" + childdrop.getProperty(\"amazonurl\")");
		
		
		driver.manage().window().maximize();
		
		
		selectOption("amazonsearchdropbox_id","Books");
		test.log(Status.FAIL, "selected the option Books By using locator : " + subdrop.getProperty("amazonsearchdropbox_id"));
		
		typeText("amazonsearchtext_name","Harry Potter");
		test.log(Status.INFO,"Entered text Harry potter By ung the locator : " +  subdrop.getProperty("amazonsearchtext_name") );
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked the element By uing locator : " +  subdrop.getProperty("amazonsearchbutton_xpath"));
		
		report.flush();
		
	}

}



