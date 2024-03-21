package webdrivernov;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titledemo1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String baseurl=" https://www.google.com";
		driver.get(baseurl);

		String src=driver.getPageSource();
		if(src.contains("google"))
		{
			System.out.println("GOOGLE IS PRESENT");
		}
		else
		{
			System.out.println("NOT PRESENT");
		}
	driver.quit();
}
}