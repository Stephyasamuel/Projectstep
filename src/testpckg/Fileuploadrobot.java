package testpckg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/word_to_pdf";

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void fileuploadmthd() throws Exception
	{
		driver.get(baseurl);
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();  //buttonclick
		
		fileUpload("G:\\STEPHY\\manual testing");
		
	}
	private void fileUpload(String p) throws AWTException
	{
		StringSelection strSelection =new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	   
		Robot robot =new Robot();
		robot .delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
	
 // robot .delay(3000);
	
	}
	
}