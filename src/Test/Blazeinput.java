package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BlazedemoReg;

public class Blazeinput
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.blazedemo.com/register");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() 
	{
		BlazedemoReg ob=new BlazedemoReg(driver);
		ob.setvalues("Gokul","Sunface","gokulnm96@gmail.com","Gokul@1996","Gokul@1996");
		ob.login("gokulnm96@gmail.com","Gokul@1996");

	}

}
