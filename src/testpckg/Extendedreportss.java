package testpckg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extendedreportss {

	WebDriver driver;
	String baseurl1=" https://www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void beforetest()
	{
		reporter =new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname"," localhost");
		extent.setSystemInfo(" os", " windows11");
		extent.setSystemInfo("Testername","stephy");
		extent.setSystemInfo(" Browsername", "chrome");
		driver= new ChromeDriver();
	}
	@BeforeMethod
	public void setup() {
		
		driver.get(baseurl1);
	}
	
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String Exp=" Facebook log in or sign up";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
	
}
@AfterTest
public void teardown()
{
	extent.flush();
}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "testcase failed is"+ result.getName());
			test.log(Status.FAIL, "testcase failed is"+ result.getThrowable());
			String screenshotpath=screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP," testcase skipped is"+ result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS," testcase passed is"+ result.getName());
	}
	}
	private  static String screenshotMethod(WebDriver driver, String screenshotname)throws IOException
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination ="./Screenshot/"+screenshotname+ ".png";
	File finaldestination=new File(destination);
	FileHandler.copy(src, new File(destination));
		return destination;
	}
}

