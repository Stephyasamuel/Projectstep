package testpckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit {
WebDriver driver;

@BeforeTest
public void beforeTest()
{
	driver=new ChromeDriver();
}
@Test
public void main() throws IOException,Exception
{
	driver.get(" https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("G:\\automation\\autodoc.exe");
	Thread.sleep(3000);
}
}