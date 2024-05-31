package testng;

import org.testng.annotations.Test;

import com.selenium.driver.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TNG2 extends BaseTest{
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  init();
		log.info("Init the properties files...");		
		
		launch("chromebrowser");
		log.info("Opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to application : " + childdrop.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
