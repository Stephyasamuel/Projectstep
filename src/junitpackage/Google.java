package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;//declaration
	 String baseurl1="https://www.google.com";
	 
	 @Before
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
	 }
	 @Test
	 public void test()
	 {
		//driver.findElement(By.name("q")).sendKeys("mobile");
		//driver.findElement(By.name("btnk")).click();
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("mobile");
	         search.submit();
	 }
	 
}
