package test;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
     import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
    import page.Fbcreatepage;
	@Test
	public class Fbcreatetest extends Baseclass
	{
		
	public void test2()
	{
		Fbcreatepage ob= new Fbcreatepage(driver);
		ob.createpageclick();
		String actualtitle= ob.titleverification();
		Assert.assertEquals(actualtitle, "Facebook");
		ob.signupclick();
	}
	}