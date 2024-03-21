package webdrivernov;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesoursenew {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String baseurl="https://www.selenium.dev/downloads/";
       driver.get(baseurl);
	String src=driver.getPageSource();
	if(src.contains("downloads"))
	{
	System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.quit();
	}
	

}
