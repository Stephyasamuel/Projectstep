package junitpackage;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
ChromeDriver driver;
String baseurl1="https://www.facebook.com";

@Before
public void setUp()
{
	 driver=new ChromeDriver();
	 driver.get(baseurl1);
}
@Test
public void screenshot() throws IOException
{
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler .copy(src,new File("G://fbscreenshot1.png"));

WebElement loginbutton=driver.findElement(By.name("login"));
File src1=loginbutton.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src1, new File("./Screenshot/loginbutton.png"));
WebElement createacctbutton= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
File src2=createacctbutton.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src2, new File("./Screenshot/createacctbutton.png"));

}}