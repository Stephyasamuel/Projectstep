package testpckg;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Draganddrop {
		ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/drag_drop.html";
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void draganddropmthd()
		{
	    WebElement account =driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	    WebElement amount =driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	    WebElement bank =driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	    WebElement amount1 =driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement accountcredit =driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        WebElement amountcredit =driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
        WebElement sales =driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	    WebElement amount2 =driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    Actions act =new Actions(driver);
	    act.dragAndDrop(bank, account);
	    act.dragAndDrop(amount1, amount);
	    act.dragAndDrop(sales, accountcredit);
	    act.dragAndDrop(amount2, amountcredit);
	    act.perform();
	   String   src=driver.getPageSource();
	    String expected="Perfect";
	    if (src.contains("Perfect"))
	    {
	    	System.out.println("PERFECT IS DISPLAYED");
	    }
	    else
	    {
	    	System.out.println("Pefect is not displayed");
	    }
	}}

