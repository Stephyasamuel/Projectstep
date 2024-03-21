package junitpackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
String link= "https://www.google.com";
	@Test
	public void test()
	{
		try {
			URL u= new URL(link);                                  //url object creat cheythu
			    HttpURLConnection con =(HttpURLConnection)u.openConnection()   ;             //aa object vech open connection koduth (in url class )ath return cheyunath url connection classinte details anu but aa classil ala http respond code kandupidikan olla methid ollath ath ollath http classil anu (so ath caste/change cheyanam)       
			int code=con.getResponseCode();    // to get response code
			System.out.println(code);
			
			if (code==200)
			{
				System.out.println("response code is 200-successfull");
			}
			else
			{
				System.out.println("not expected");
			}
			//float f=4.567f
			// double d1= (double)f;
			                               
			
		} 
		catch (Exception e) 
		{
			
		System.out.println(e.getMessage());	
		}
	}
	
	
}
