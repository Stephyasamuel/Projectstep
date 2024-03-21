package testpckg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Loginvalidation
{
ChromeDriver driver;
String baseurl="https://automationexercise.com/login";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void Login()
{
	driver.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[2]")).sendKeys("stephyasamuel@gmail.com");
	driver.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/input[3]")).sendKeys("Stephy@00");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	String expected="https://automationexercise.com/";
	String exp=driver.getCurrentUrl();
	if(exp.equals(expected))
	{
	System.out.println("login validated");
	}
	else
	{
		System.out.println("not validated");
	}
		}

	}

