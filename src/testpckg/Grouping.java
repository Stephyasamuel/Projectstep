package testpckg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	 ChromeDriver driver1;
	 String baseurl1="https://register.rediff.com/register/register.php?FormName=user_details";
	 
	 @BeforeTest (alwaysRun=true)
	 public void setup1()
		{
		 driver1=new ChromeDriver();
		 System.out.println("BROWSER OPEN");
		}
	 @BeforeMethod(alwaysRun=true)
	 public void urlloadig()
		{
		 driver1.get(baseurl1);
		 System.out.println("url loading");
		}
	 @Test(groups= {"sanity"})
	 public void title()
		{
			String exp="Rediffmail";
			String actualtitle=driver1.getTitle();
			if(exp.equals(actualtitle))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("FAIL");
			}
		}
	 @Test(groups= {"smoke"})
     public void logoverification()
  	{
	  boolean logo	= driver1.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		
		 if (logo )
			{
				System.out.println("logo is present");
			}
			else
			{
				System.out.println("logo not present");
			}
	  	}
		
  		@Test(groups= {"sanity","smoke"})
  		 public void contentverify()
  	  	{
  			String src=driver1.getPageSource();
  			if (src.contains("Full Name"))
  			{
  				System.out.println("content is present");
  			}
  			else
  			{
  				System.out.println("content not present");
  			}
  	  	}
  		@Test(groups= {"smoke"})
  		 public void buttonverify()
  	  	{
  			
  			driver1.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isEnabled();
  			boolean p = false;
			if (p)
  			{
  				System.out.println("male radio button is selected");
  			}
  			else
  			{
  				System.out.println("male radio button  not selected");
  			
  	  	}
  	  	}
  		@Test(groups= {"sanity","regression"})
  		 public void buttontextverify()
  	  	{
  			 String buttontext=driver1.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
  			 if(buttontext.equals("Create my account"))
  			{
  				System.out.println("Pass");
  			}
  			else
  			{
  				System.out.println("FAIL");
  			}
  	  	}
  		@AfterTest
  		public void browserclose()
  		{
  			driver1.quit();
  		}
}
  		
  	    