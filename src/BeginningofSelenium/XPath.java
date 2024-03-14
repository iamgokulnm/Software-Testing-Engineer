package BeginningofSelenium;
//Relative Xpath

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9656298720");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password_@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
