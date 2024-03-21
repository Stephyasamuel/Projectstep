package junitpackage;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
ChromeDriver driver;
String baseurl="https://www.facebook.com";
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void test()throws InterruptedException

{
	 Thread.sleep(1000);

List<WebElement>linklist= driver.findElements(By.tagName("a"));
System.out.println(linklist.size());
for(WebElement link:linklist)
{
	System.out.println(link.getText()+"---"+ link.getAttribute("href"));
}
driver.quit();
}
}
