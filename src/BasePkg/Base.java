package BasePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base 
{
	public WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void link()
	{
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}
