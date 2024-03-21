package junitpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	 ChromeDriver driver;//declaration
	 String baseurl1="https://www.facebook.com";
	 
       @Before                //before test activity
       public void setUp()//browser opening details
       {
     driver=new ChromeDriver();
     driver.get(baseurl1);             //browser open and url load
       }
	
	@Test
		public void test()                 // create test methods for each test
		{
		String exp="facebook";
		String actualtitle=driver.getTitle();
		if(exp.equals(actualtitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		}

	//@Test
	//public void pagesrc()
	//{
		
	//}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
