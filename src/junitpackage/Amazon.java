package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon{
	ChromeDriver driver;//declaration
	 String baseurl1="https://www.amazon.in";
	
	 @Before
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
	 }
	 @Test
	 public void amazon()
	 {
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobiles");
     search.submit();
     driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
     driver.findElement(By.xpath(" //div[@id='nav-tools']/a[2]")).click();
     driver.navigate().back();
     
     driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
     driver.findElement(By.xpath("//div[@id='nav-main']/div/a[1]")).click();
	
	 }}