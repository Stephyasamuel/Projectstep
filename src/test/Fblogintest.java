package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fblogincreatepage;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
@Test
public void testlogin()
{
	Fblogincreatepage ob= new Fblogincreatepage(driver);
	ob.setvalues("ste@gmail.com", "xyz");
	ob.login();
	//fblogincreatepage ob1=new fbceatepage(driver);
}
}
