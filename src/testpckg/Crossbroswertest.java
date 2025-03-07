package testpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbroswertest {
WebDriver driver;
String baseurl1="http://www.facebook.com";
@Parameters({"browser"})
@BeforeTest
public void setup(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
	driver=new ChromeDriver();
}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
	}
@Test
public void test()
{
	driver.get(baseurl1);
}
}
