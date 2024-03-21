package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount 
{
		ChromeDriver driver;//declaration
		 String baseurl1 ="https://www.facebook.com";
	       @Before                //before test activity
	       public void setUp() //browser opening details
	       {
	     driver=new ChromeDriver();
	     driver.get(baseurl1);             //browser open and url load
	       }
		
		@Test
			public void linkcount()                 // create test methods for each test
			{
			List<WebElement>linklist  =driver.findElements(By.tagName("a"));   //import webelement &linklist
			System.out.println(linklist.size());  //to display count 
			for (WebElement link: linklist)
			{
			  	System.out.println(link.getText()+ "----"+ link.getAttribute("href"));  // display text with link
			}
			driver.quit();
			}}

