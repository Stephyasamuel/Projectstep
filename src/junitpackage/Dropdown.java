package junitpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;//declaration
	 String baseurl1="https://register.rediff.com/register/register.php?FormName=user_details";
	
	 @Before
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl1);
	 }
	 @Test
	 public void Dropdown1()
	 {
	
    WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));//day element locate and store
    Select daydetails=new Select(day);
    daydetails.selectByValue("22");
    WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
    Select monthdetails=new Select(month);
    monthdetails.selectByValue("09");
    WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
    Select yeardetails=new Select(year);
    yeardetails.selectByValue("1997");
 boolean logo =driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();//display(element display ano)true or false//is enabled(button enable or disable )//is selected(selected or not)
if(logo)
	 {
	System.out.println("logo IS DISPLAYED");
	 }
else
{
	System.out.println("logo not DISPLAYED");
}
	 boolean p =driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isEnabled();
	if (p)
		{
			System.out.println("male radio button is selected");
		}
		else
		{
			System.out.println("male  not selected");
		
		}
}
}