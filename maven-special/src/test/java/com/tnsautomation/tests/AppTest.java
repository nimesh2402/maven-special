package com.tnsautomation.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

private WebDriver driver;


@BeforeTest
@Parameters("browser")
public void setup(String broser)
{
	if(broser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		
	}
	else if(broser.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		//comments
	}
	else if(broser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}

	@Test
	public void setupSelenium(){
        //Start the browser (firefox for now)
        //driver = new FirefoxDriver();
         driver.navigate().to("http://google.com");
         driver.get("http://google.com");
         System.out.println("test");
        //This adds implicit timeouts to the driver (instead of clickAndWait())
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
 
	@AfterTest
	public void shutdown()
	{
		driver.close();
	}
}
