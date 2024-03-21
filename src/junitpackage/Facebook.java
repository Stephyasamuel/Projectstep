package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;//declaration
	 String baseurl1="https://www.facebook.com";
	 
	 @Before
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
	 }
	 @Test
	 public void fblogin()
	 {
		// driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		// driver.findElement(By.name("pass")).sendKeys("xyz");
		// driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
	     driver.findElement(By.xpath("//button[@name='login']")).click();
	 }
	 
}
