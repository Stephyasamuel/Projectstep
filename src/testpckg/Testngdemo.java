package testpckg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
//@befoesuite
//@beforetest
//@beforeclass
//@beforemethod
//@test
//@aftermethod
//@afterclass
//@aftertest
//@aftersuite

	
	@BeforeTest                                         //first browseropen
	public void setup1()
	{
		System.out.println("BROWSER OPEN");
	}
     @BeforeMethod                                       
 	public void urlloading()
 	{
 		System.out.println("url loading");
 	}
     @Test  (priority=2, invocationCount=3)                              //to test multiple times             (repeated excution)//EXECUTION FLOW;-test1-aftermthd-beforemthd-test2-aftermthd-beforemthd-test3-aftermthd-aftertest
     public void test1()
  	{
  		System.out.println("test1");
  	}
     @Test(priority=1)
     public void test2()
  	{
  		System.out.println("test2");
  	}
     @Test (priority=3,enabled=false)   //to disable test
     public void test3()
  	{
  		System.out.println("test3");
  	}
     @AfterMethod                                              //report details
     public void aftermethod()
  	{
  		System.out.println("after method");
  	}
     @AfterTest
     public void aftertest()
   	{
   		System.out.println("after test");
   	}
}