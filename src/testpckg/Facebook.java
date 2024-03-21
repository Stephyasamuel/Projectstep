package testpckg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
  ChromeDriver driver;
  String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Parameters({"Email","Password"})
	@Test
	public void test(String Email, String Password)
	{
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
