package testpckg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

	ChromeDriver driver;
	String baseurl="https://www.goibibo.com/";
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
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div/p[1]")).click();
	while (true)
	{
		
	WebElement month=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
	String monthtext=month.getText();
	System.out.println(monthtext);
	if(monthtext.equals("August 2024"))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
	}
	}
	List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div"));
	for(WebElement ele: li)
	{
		String date =ele.getText();
		if(date.equals("7"))
		{
			ele.click();
		}
	}
	driver.findElement(By.xpath(" //*[@id=\"root\"]/div[3]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
	
	}
}
	
	
