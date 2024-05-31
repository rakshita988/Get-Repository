package com.selenium.driver;
import org.apache.log4j.Logger;

public class TC_004 extends BaseTest {
	private static final Logger log = Logger.getLogger(TC_004.class);

	public static void main(String[] args)throws Exception {
		
		init();
		log.info("Init the properties files...");		
		
		launch("chromebrowser");
		log.info("Opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to application : " + childdrop.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		
		selectOption("amazonsearchdropbox_id","Books");
		log.info("selected the option Books By using locator : " + subdrop.getProperty("amazonsearchdropbox_id"));
		typeText("amazonsearchtext_name","Harry Potter");
		log.info("Entered text Harry potter By ung the locator : " +  subdrop.getProperty("amazonsearchtext_name"));
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked the element By uing locator : " +  subdrop.getProperty("amazonsearchbutton_xpath"));
		
	}

}
