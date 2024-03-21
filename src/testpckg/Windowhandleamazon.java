package testpckg;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandleamazon {
	ChromeDriver driver;//declaration
	 String baseurl1="https://www.amazon.in/";
	
	 @BeforeTest
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void amazon() throws InterruptedException
	 {
	 Thread.sleep(3000);
       WebElement d=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
       d.sendKeys("mobile phones");
       d.submit();
       String exp="Amazon.in : mobile phones";
       String actualtitle=driver.getTitle();
       if(exp.equals(actualtitle))
       {
       System.out.println("TITLE IS VERIFIED");
       }
       else
       {
       	System.out.println("TITLE NOT VEIFIED");
       }
	    String parentWindow=driver.getWindowHandle();    //current window
		System.out.println("Parent Window Title" + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Set<String>allWindowHandles= driver.getWindowHandles();
		for (String handle :allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				driver.switchTo().window(handle);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
				driver.close();
			}	
	 }
		}
			}