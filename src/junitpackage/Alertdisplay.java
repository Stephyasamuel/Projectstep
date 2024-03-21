package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdisplay {
	ChromeDriver driver;//declaration
	 String baseurl1="C:/Users/steph/Desktop/alert.html";
	 
	 @Before
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
	 }
	 @Test
	 public void Alertdisplay() throws InterruptedException
	 
	 {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@value='display alert box']")).click();
	    	Alert a= driver.switchTo().alert();
	     String alerttext =a.getText();
	     System.out.println("alerttext="+alerttext);
	   	a.accept();
	  // 	a.dismiss()//to cancel alert
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Stephy");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Samuel");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 }
}
