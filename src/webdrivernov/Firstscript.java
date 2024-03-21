package webdrivernov;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver(); //To launch chrome browser(import cheyanam)
		driver.get("https://www.google.com");     // To access url
		String Exp="Google";
		String actualtitle=driver.getTitle();         //return title of the application
		if (Exp.equals(actualtitle))
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
