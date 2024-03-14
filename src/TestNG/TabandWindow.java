package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabandWindow
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
	}

}
