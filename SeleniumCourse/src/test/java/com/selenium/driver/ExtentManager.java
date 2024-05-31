package com.selenium.driver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager  extends BaseTest{
		
  public static ExtentHtmlReporter htmlReport;
  public static ExtentReports  report; 
  public static ExtentReports getInstance() {
	  if(htmlReport ==null) {
  
  
    htmlReport = new ExtentHtmlReporter("C:\\Users\\Khushi\\eclipse-workspace -rakshita\\SeleniumCourse\\reports\\report.html");
    htmlReport.config().setDocumentTitle("Automation Test");
    htmlReport.config().setReportName("htmlReport");
    htmlReport.config().setTheme(Theme.STANDARD);
   
   report = new ExtentReports();
   report.attachReporter(htmlReport);
   report.setSystemInfo("OS", "window");
   report.setSystemInfo("TesterName", "Rakshita");
   report.setSystemInfo("Browser", "Chrome");
  }
   return report;
}
}
