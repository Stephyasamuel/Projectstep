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
public class Rightclick {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	public void rightclickmthd() throws InterruptedException
	{
		Thread.sleep(5000);
	    WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	    Actions act=new Actions(driver);    
		act.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	    driver.switchTo().alert().accept();
	    WebElement doubleclic =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclic).perform();
		Alert a= driver.switchTo().alert();
		System.out.println("alerttext="+a.getText());
		a.accept();
	}}