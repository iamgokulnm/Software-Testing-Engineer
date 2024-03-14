package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FBdatas;

public class FBlogin 
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void links()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		FBdatas ob=new FBdatas(driver);
		ob.input("gokulnm96@gmail.com","gokul@1996");
		ob.click();
		
	}

}
