package junitpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkValidation
{
	String baseurl="https://www.google.com";
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkvalidation()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));// will get link details (list name li aro indexilum we element store avvum)
		System.out.println("total link count ="+li.size());
		for (WebElement ele:li)                   //web elementinu one by one value edukan anu for each loop (from aray)
		{
			String link=ele.getAttribute("href");  // elementinte href anu link ollath so to take href details (first iteratonil adhyathe link details kiti eni ath verify cheyanam)
			verify (link);	                       //  aa linkinte response code kandupidikan separate  mthd create cheyanam(mthd call)
		}
		
	}
	private void verify(String link) {                        //link validation so pass to url class
		try
		{
		URL u =new URL(link);
		HttpURLConnection con =(HttpURLConnection)u.openConnection(); //url connection details litu(u.opencoonection)...namuku venda respons details hhtp url connectonilmanu so caste)
		con.connect();
		if (con.getResponseCode()==200)
		{
			System.out.println("response code is 200--successful");
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("response code is 404-broken link");
		}
		else
		{
			System.out.println("Not expected");
		}
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
		
		
		