package testpckg;


	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.devtools.idealized.Javascript;
    import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

     	public class Scrollamazon {
		ChromeDriver driver;//declaration
		 String baseurl1="https://www.amazon.in/";
		
		 @BeforeTest
		 public void setUp()
		 {
			 driver=new ChromeDriver();
			 driver.get(baseurl1);
			 driver.manage().window().maximize();
		 }
		 @Test
		 public void amazon() 
		 {
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			//	jse.executeScript("window.scrollBy(0,250)");
		  //  jse.executeScript("aguments[0].scrollIntoView();",By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a"));
		    jse.executeScript("arguments[0].scrollIntoView(true);",By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a"));
			// jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	         driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
	      
}
     	}
