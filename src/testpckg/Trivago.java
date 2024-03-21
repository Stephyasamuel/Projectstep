package testpckg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
	ChromeDriver driver;
	String baseurl="https://www.trivago.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
     	driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[1]")).click();
	
   while (true)
	{
		
	WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3"));
	String monthtext=month.getText();
	System.out.println(monthtext);
	if(monthtext.equals("April 2024"))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
	}
	}
  try
  {
	List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement ele: li)
	{
		String date =ele.getText();
		if(date.equals("18"))
		{
			ele.click();
		}
	}
	
	}
 catch(Exception e)
  {
	   driver.navigate().refresh();
 }
	}
}