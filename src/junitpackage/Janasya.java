package junitpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya{
	ChromeDriver driver;//declaration
	 String baseurl1="https://www.janasya.com";
	
	 @Before
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
	 }
	 @Test
	 public void Janasya() throws InterruptedException
	 
	 {
		 Thread.sleep(2000);
		 String exp="janasya.com";
			String actualtitle=driver.getTitle();
			if(exp.equals(actualtitle))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
	
     driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li/a/span")).click();
     driver.findElement(By.xpath(" //div[@class='sidebarBlock-headingWrapper']/h3")).click();
     driver.findElement(By.xpath(" //*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a")).click();
  //   WebElement search= driver.findElement(By.xpath(" //input[@id='Search-In-Modal']"));
    // search.sendKeys("kurthi");
    // search.submit();
     
   //  List<WebElement>linklist  =driver.findElements(By.tagName("a"));   //import webelement &linklist
	//	System.out.println(linklist.size());  //to display count 
	//	for (WebElement link: linklist)
	//	{
	//	  	System.out.println(link.getText()+ "-"+ link.getAttribute("href"));  // display text with link
	//	}
		
		}
}