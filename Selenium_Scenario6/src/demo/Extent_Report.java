package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report {

	WebDriver wd;
	static ExtentTest test;
	static ExtentReports report;

	@Before
	public void setUp() throws Exception {
		report = new ExtentReports("D:\\Eclipse Project\\ExtentReportResults.html",true);
		test = report.startTest("Extent Demo");
	}

	@Test
	public void test() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.google.co.in");
		if (wd.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	@After
	public void tearDown() throws Exception {
		report.endTest(test);
		report.flush();
		wd.quit();
	}

}
