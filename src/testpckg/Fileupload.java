package testpckg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Fileupload {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	public void fileuploadmthd() throws InterruptedException
	{
		Thread.sleep(5000);
	  WebElement element =driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	    element.sendKeys(" G:/manual testing.pdf");
	    driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	    String buttontext=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
	    if (buttontext.equals("submit File"))
	    {
	    	System.out.println("text present="+buttontext);
	    }
	    else
	    {
	    	System.out.println("text not pesent");
	    }
	}}

