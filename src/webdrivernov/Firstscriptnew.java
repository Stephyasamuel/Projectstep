package webdrivernov;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscriptnew {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
String baseurl1="https://www.selenium.dev/downloads/";
driver.get(baseurl1);
String exp="selenium";
String actualtitle=driver.getTitle();
if(exp.equals(actualtitle))
{
System.out.println("pass");
}
else
{
	System.out.println("fail");
}
	}

}
